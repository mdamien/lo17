#!/usr/bin/perl

# En-tête
use strict;
use warnings;

# Corps du script
my $cheminDuFichierGlobal = "global.xml";
my $cheminDuRepertoire = "BULLETINS/";
## Solutions alternatives pour récupérer les valeurs des variables ci-haut
#my $cheminDuFichierGlobal = $ARGV[1]; #Le fichier global où mettre les fichiers convertis
#my $cheminDuRepertoire = $ARGV[0]; #Le répertoire où chercher les documents
## Récupération des fichiers à rassembler
my @tableauDesFichiers = `ls $cheminDuRepertoire`;
open(my $FILEHANDLEGLOBAL, '>', $cheminDuFichierGlobal);
print $FILEHANDLEGLOBAL '<?xml version="1.0" encoding="UTF-8">' . "\n";
print $FILEHANDLEGLOBAL '<corpus>' . "\n";
foreach my $fichier (@tableauDesFichiers) {
	my $cheminComplet = $cheminDuRepertoire . $fichier;
	#print $FILEHANDLEGLOBAL `cat $cheminComplet`;
	print $FILEHANDLEGLOBAL `cat $cheminComplet | perl parse.pl`
}
print $FILEHANDLEGLOBAL '</corpus>';
close $FILEHANDLEGLOBAL;
