#!/usr/bin/perl

# En-tête
use strict;
use warnings;

# Déclarations
my $cheminDuFichierGlobal = "global.xml";
my $cheminDuRepertoire = 'BULLETINS/BULLETINS/';


# Corps du programme
my @tableauDesFichiers = `ls -l $cheminDuRepertoire`;
open (my $FILEHANDLEGLOBAL, '>', $cheminDuFichierGlobal);
print $FILEHANDLEGLOBAL '<?xml version="1.0" encoding="UTF-8">'."\n";
print $FILEHANDLEGLOBAL '<corpus>'."\n";
while (my $fichier = each @tableauDesFichiers) {
	my @jeanmichel = split ("\n", `cat $cheminDuRepertoire.$fichier`);
	while (my $ligne = each @jeanmichel) {
		print $FILEHANDLEGLOBAL $ligne;
	}
}
print $FILEHANDLEGLOBAL '</corpus>';
