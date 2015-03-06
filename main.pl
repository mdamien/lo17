#!/usr/bin/perl



# En-tête
use strict;
use warnings;



# Corps du script
my $cheminDuFichierGlobal = "global.xml";
my $cheminDuRepertoire = 'BULLETINS';
## Solutions alternatives pour récupérer les valeurs des variables ci-haut
#my $repertoire = $ARGV[0]; #Le répertoire où chercher les documents
#my $fichierGlobal = $ARGV[1]; #Le fichier global où mettre les fichiers convertis
## Récupération des fichiers à rassembler
my @tableauDesFichiers = `ls -l $cheminDuRepertoire *.htm`;
while (my $fichier = each @tableauDesFichiers) {
	print $fichier;
}
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
close $FILEHANDLEGLOBAL;

#my @tableau = split("\n", `ls $repertoire`);
#`echo '<?xml version="1.0" encoding="UTF-8"?>' > $fichierGlobal`;
#foreach my $element (@tableau) {
#	my $commande = $repertoire . "\/" . $element;
#	`cat $commande >> $fichierGlobal`;
#}
#`echo '</corpus>' >> $fichierGlobal`
