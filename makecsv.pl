use strict;
use warnings;

open (my $FH, "+<", "mots.tsv") or die "fuck1";
open (my $Fr, ">", "newmots.csv") or die "fuck2";
while (<$FH>) {
	my @ligne = split (" ", $_);
	pop(@ligne);
	my $caca = join (",", @ligne);
	print $Fr "$caca\n";
}
