use strict;
use warnings;

my $i = 0;
my @tab;
open (FH, ">", "newcreeFiltreArgument") or die "fuck";
open (FHA, "<", "$ARGV[0]") or die "fuck";
while (<FHA>) {
	my @ligne = split (";", $_);
	if ($i < 14400) {
        if(length($ligne[0]) > 2){
            print FH $ligne[0] . "\n";
        }
    }
    $i++;
}
close FHA;
close FH;

# pour utiliser : perl discri.pl out/stats/median
