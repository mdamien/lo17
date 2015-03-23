import functools, math

tfidfs = {}
for line in open('out/tfidf.tsv'):
	f, w, tf, idf, tfidf = line.split('\t')
	if w not in tfidfs:
		tfidfs[w] = []
	tfidfs[w].append(float(tfidf))

def stat(func, name):
	tab = []
	for word, scores in tfidfs.items():
		tab.append([word, func(scores)])
	tab.sort(key=lambda x:-x[1])
	with open('out/stats/%s' % name,'w') as f:
		for line in tab:
			f.write('{:>30}       {:<30}\n'.format(line[0], line[1]*1000))

stat(lambda x:max(x),'max')
stat(lambda x:min(x),'min')
stat(lambda x:sum(x)/len(x),'mean')

def percentile(N, percent):
    N.sort()
    if not N:
        return None
    k = (len(N)-1) * percent
    f = math.floor(k)
    c = math.ceil(k)
    if f == c:
        return N[int(k)]
    d0 = N[int(f)] * (c-k)
    d1 = N[int(c)] * (k-f)
    return d0+d1

median = functools.partial(percentile, percent=0.5)

stat(median,'median')
stat(lambda x: percentile(x,0.25), 'first_quartile')