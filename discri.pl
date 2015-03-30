# Ce fichier dresse la liste des mots à retirer, les enregistre dans le fichier newcreeFiltreArgument. Ce fichier est à utiliser avec
# Ce script prend en entrée un des fichiers de statistiques (en l'occurence, mean)
# pour utiliser : perl discri.pl out/stats/median

use strict;
#use warnings;

my $i = 0;
my @tab;
open (FH, ">", "newcreeFiltreArgument") or die "A fuck happened while trying to open newCreeFiltreArgument";
open (FHA, "<", "$ARGV[0]") or die "A fuck happened while trying to open $ARGV[0]";
while (<FHA>) {
	my @ligne = split (";", $_);
	# Met dans le fichier tous les mots dont le score est le plus faible (premier quartile de tfidf)
	if ($i > 14500) {
		print FH $ligne[0] . "\n";
	}
	# Pour les autres, on retire les chiffres simples et les mots dont la longueur est 1 ou 2
	elsif (length($ligne[0]) <= 2) {
		print FH $ligne[0] . "\n";
	}
	$i++;
}
close FHA;
close FH;
