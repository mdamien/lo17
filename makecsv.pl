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
open (FIN, "+<", "out/mots.tsv") or die "Failed opening input file";
open (FOUT, ">", "out/newmots.csv") or die "Failed opening output file";
while (<$FIN>) {
	my @line = split (" ", $_);
	pop(@line);
	my $newline = join (",", @line);
	print $FOUT "$newline\n";
}
