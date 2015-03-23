use strict;
use warnings;

my $i = 0;
my @tab;
open (FH, ">", "newcreeFiltreArgument") or die "fuck";
open (FHA, "<", "$ARGV[0]") or die "fuck";
while (<FHA>) {
	my @ligne = split (";", $_);
	$i++;
	if ($i < 14400) {next;}
	push ($ligne[0], @tab);
}
close FHA;
foreach my $el (@tab) {
	if ($el ~= m/[0-9]/) {
		print FH $el . "\n";
	}
}
close FH;
