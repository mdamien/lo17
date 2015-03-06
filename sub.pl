#!/usr/bin/perl

# En-tête
use strict;
use warnings;



# Corps du programme
## Déclarations
my $cheminDuFichier = "regroupement.xml";
my $fichier;
my $FILEHANDLE;
my @tableau;

## Traitement
open ($FILEHANDLE, '>', $cheminDuFichier);
print $FILEHANDLE '<?xml version="1.0" encoding="UTF-8">';
@tableau = print `ls BULLETINS/BULLETINS *.htm`;
while ($fichier = each @tableau) {
	print $fichier;
}
close $FILEHANDLE;
