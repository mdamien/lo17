words = set()
for l in open('out/tfidf.tsv'):
	words.add(l.split('\t')[1])
words = sorted(list(words))
for w in words:
	print(w)