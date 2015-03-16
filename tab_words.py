tfidfs = {}
for line in open('out/tfidf.tsv'):
	f, w, tf, idf, tfidf = line.split('\t')
	if w not in tfidfs:
		tfidfs[w] = []
	tfidfs[w].append(float(tfidf))

def stat(func,name):
	tab = []
	for word, scores in tfidfs.items():
		tab.append([word, func(scores)])
	tab.sort(key=lambda x:-x[1])
	with open('out/stats/%s' % name,'w') as f:
		for line in tab:
			f.write('%s %d\n' % (line[0], int(line[1]*1000)))

stat(lambda x:max(x),'max')
stat(lambda x:min(x),'min')
stat(lambda x:sum(x)/len(x),'mean')

def median(lst):
    lst = sorted(lst)
    if len(lst) < 1:
            return None
    if len(lst) %2 == 1:
            return lst[((len(lst)+1)//2)-1]
    if len(lst) %2 == 0:
            return float(sum(lst[(len(lst)//2)-1:(len(lst)//2)+1]))/2

stat(median,'median')