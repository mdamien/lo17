import math

tfs = {}
df = {}
N = 0
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
	N += 1

idf = {w:math.log(N/df[w])for w in df}

for f, freqs in tfs.items():
	sum_f = sum(count for count in freqs.values())
	for w, count in freqs.items():
		t = count/sum_f
		print(f,w,t,idf[w],t*idf[w],sep="\t")

