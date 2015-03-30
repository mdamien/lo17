#!/usr/bin/perl
#****************************************************************************************#
#*                			LO17 - successeurs.pl					*#
#*											*#
#* date   : 27/09/2014									*#
#*											*#
#* Ce script permet de gÈnÈrer la liste des successeurs pour chaque lettre des		*#
#* mots d'une liste de mots.								*#
#* Le corpus doit avoir ÈtÈ prÈalablement triÈ et sans doublon (sort -u nom_fichier)	*#
#*											*#
#****************************************************************************************#

#$t1 = time;
binmode(STDIN, ":utf8");
binmode(STDOUT, ":utf8");

@mots=<>;							# Lecture des mots du corpus
$size = @mots;							# Nombre de mots du corpus
$begin_mot = 0;							# initialisation de l'index de début des mots du corpus à analyser
foreach $m (@mots)						# Pour chaque mots du corpus (= mot analysÈ)
{								#
	$m =~ s/\n/ /;						# Remplacement du retour chariot par un espace
	$m =~ tr/A-Z/a-z/;					# normalisation en minuscules
	@lettre=split(//,$m);					# Extraction des lettres du mot dans une table
#    for($i=0;$i<length($m);$i++)
#    {
#    $lettres[i]=substr ($m,$i,1);
#    print ("$lettres[i]\n");
#    }
	$rac="";						# Initialisation de la racine du mot ‡ vide (racine = lecture du mot jusqu'à une certaine lettre)
	$begin=$begin_mot;					# Initialisation de l'index de dÈbut des mots du corpus qui seront comparés au mot analysé
	$find=0;						# Initialisation du boolÈen qui permettra de savoir qu'un premier mot avec un successeur différent a été trouvé
	foreach (@lettre)					# Pour chaque lettre du mot analysÈ (= lettre courante)
	{							#
#	print("lettre $_\n"); 
    unless($_ eq ' ') {					# à moins qu'on ait lu toutes les lettres
		$rac=$rac.$_;					# Ajout de la lettre courante ‡ la racine du mot
		%nb_succ=();					# Initialisation d'un tableau associatif qui contiendra les lettres successeurs (clé)
		$nb_succ=0;					# Initialisation de la variable qui contiendra le nombre de successeurs d'une lettre
        $i=$begin;					# Initialisation de la recherche ‡ l'index du premier mot du corpus à comparer au mot à analyser
		while (($i<$size) && ($nb_succ<9))		# Pour chaque mots du corpus (á partir de begin)
		{						#	
			$elt = @mots[$i];			# mot du corpus à comparer = mot courant
			$elt =~ s/\n/ /;			#
			$elt =~ tr/A-Z/a-z/;			# normalisation en minuscules
			if ($elt =~ /^$rac(.)/ || $rac =~/^$elt/)			# Si le mot courant lu jusqu'‡ la lettre courante est identique au mot analysÈ lu jusqu'‡ la lettre courante
			{					#
				 if (!exists($nb_succ{$1}))	# Si une lettre successeur différente de la lettre courante du mot courant n'a pas encore ÈtÈ rencontrÈe
				{				#
					$nb_succ{$1}++;		# crÈation d'une clÈ = lettre successeur de la lettre courante et d'une valeur associÈe
					@nb_succ = keys(%nb_succ); # tableau des différentes lettres successeurs de la lettre courante
					$nb_succ =@nb_succ;	# nombre de clÈs (= le nombre de lettres successeurs diffÈrentes trouvÈes)
					if ($nb_succ == 1)	# si c'est la première lettre successeur trouvée
					{			#
						if ($find == 0) # si c'est la première fois qu'on trouve cette lettre successeur de la lettre courante
						{		*
							$begin_mot=$i; # ce sera nécessairement le prochain mot du corpus à analyser qui servira à initialiser le $begin correspondant
							 $find++;	# et on bloque cet indice pour la prochaine analyse 
						}		#
						$begin=$i;	# on incréments l'indice du prochain mot courant à analyser
					}			#
				}				#
			}					#
			elsif ($nb_succ >=1)		# Sinon (le mot courant lu jusqu'‡ la lettre courante) si on avait déjà trouvé au moins une lettre successeur différente
			{					#
				$i = $size;			# inutile de continuer à chercher dans la liste
			}					#
			$i++;					# incrémentation du compteur du while sur la liste des mots
		}						#
		@nb_succ = keys(%nb_succ);			# on met à jour la table des clÈs de %nb_succ
		$nb_succ = @nb_succ;				# juste pour compter le nombre de clÈs (= le nombre de lettres successeurs diffÈrentes trouvÈes)
		print ("$nb_succ");				# on imprime le nombre de successeurs de la lettre courante du mot analysé
	}							# fin du unless : inutile de continuer à explorer la liste
	}							# fin de foreach lettre
    $m =~ s/ //;                # on supprime l'espace qu'on avait mis au début
	print "0\t$m\n";					# on imprime le mot précédé d'un nombre de successeurs = 0 marque la fin du mot
}								#

# $t2 = time;
# print "RÈsultat retournÈ en ".($t2-$t1)." s\n";