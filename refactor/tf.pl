#!/usr/bin/perl

# En-tête
## Modules
## Encodage
binmode(STDIN, ":utf8");
binmode(STDOUT, ":utf8"); 
## Pragma
use strict;
use warnings;

# Classes

# Fonctions

# Corps du script
my %df;
my %tfs;
open (FH, "<", "Dépôt/out/mots.tsv") or die "Failed opening file";
while(my $line = <FH>) {
	my ($word, $f, $n, $rubrique) = split ("\t", $line);
	if (!exists($tfs{$f})) {$tfs{$f} = {};}
	if (!exists($tfs{$f}->{$word})) {
		$tfs{$f}->{$word} = 0;
		if (!exists($df{$word})) {$df{$word} = 0;}
		$df{$word} += 1;
	}
	$tfs{$f}->{$word} += 1;
}
close FH;
my $n = length(keys(%tfs));
print $n;
