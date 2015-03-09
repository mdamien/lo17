#!/usr/bin/perl

use strict;
use warnings;

my %h = ();

my $html = do { local $/; <> };

$html =~ /(\d\d\d\d\/\d\d\/\d\d)/;
$h{date} = $1;

$html =~ /BE_France_(\d+)/;
$h{bn_number} = $1;

$html =~ /<p class="style96"><span class="style42">(.*)<br></;
$h{rubrique} = $1;

$html =~ /<span class="style17">(.*)<\/span/;
$h{title} = $1;

$html =~ /<p class="style44"><span class="style85">(.*)- email : /;
$h{contact_name} = $1;

$html =~ /email : <a href="mailto:(.*)">/;
$h{contact_mail} = $1;

$html =~ s/\n//g;
$html =~ /<p class="style96"><span class="style95">(.*)<\/span><\/p><\/td>.*<td width=133 valign=top bgcolor="#dae1e8" class="FWExtra2">/;
$h{content} = $1;

my @imgs = $h{content} =~ /<img src="([^<]*)" border/g;
$h{imgs} = join(";",@imgs);

#clean the content
while($h{content} =~ /<\/span>.*<span class="style95">/){
	$h{content} =~ /^(.*)<\/span>.*<span class="style95">(.*)$/;
	$h{content} = $1.$2;
}

print "\n";

print "$_ $h{$_}\n" for (keys %h);

#print "\n";
#$h{content} =~ /<img/;
#print $1;

#for f in BULLETINS/*;do ./td1.pl < $f;done


# xml = "<dssd>"
# for fichier in fichier:
# 	xml += parse(sdsd)
# xml = "</sdsd>"
