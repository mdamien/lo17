import math

tfs = {}
df = {}
for line in open('mots.tsv'):
	word, f, n, rubrique = line.split('\t')
	if f not in tfs:
		tfs[f] = {}
	freqs = tfs[f]
	if word not in freqs:
		freqs[word] = 0
		#first occurence of the word in the file	
		if word not in df: #first occurent
			df[word] = 0
		df[word] += 1
	freqs[word] += 1

N = len(tfs.keys())
idf = {w:math.log(N/df[w])for w in df}

results = []
for f, freqs in tfs.items():
	sum_f = sum(count for count in freqs.values())
	for w, count in freqs.items():
		t = count/sum_f
		results.append([f,w,t,idf[w],t*idf[w]])

results = [['file','word','tf','idf','tfidf']]+sorted(results, key=lambda x:-x[-1]) #sort by tfidf
results = results[:int(len(results)*0.8)] #take the first 80%
for r in results:
	print('\t'.join(str(x) for x in r))
