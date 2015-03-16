#!/usr/bin/perl

use strict;
use warnings;

my $output_filepath = "global.xml";
my $bulletins_dir = "BULLETINS/";
my @files = `ls $bulletins_dir`;
open(my $fh, '>', $output_filepath);
print $fh '<?xml version="1.0" encoding="UTF-8"?>' . "\n";
print $fh "<corpus>\n";
foreach my $filename (@files) {
	chomp $filename;

	my $fullpath = $bulletins_dir.$filename;

	my %h = ();

    my $html;
    open(my $fh2, '<', $fullpath) or die "cannot open file $fullpath";
    {
        local $/;
        $html = <$fh2>;
    }
    close($fh2);

	$html =~ /(\d\d\d\d\/\d\d\/\d\d)/;
	$h{date} = $1;

	$html =~ /BE_France_(\d+)/;
	$h{bn_number} = $1;

	$html =~ /<p class="style96"><span class="style42">(.*)<br></;
	$h{rubrique} = $1;

	$html =~ /<span class="style17">(.*)<\/span/;
	$h{title} = $1;

	$h{contact_name} = "";
	if($html =~ /<p class="style44"><span class="style85">(.*)- email : /){
		$h{contact_name} = $1;
	}

	$h{contact_mail} = "";
	if($html =~ /email : <a href="mailto:(.*)"\/>/){
		$h{contact_mail} = $1;
	}

	$html =~ s/\n//g;
	$html =~ /<p class="style96"><span class="style95">(.*)<\/span><\/p><\/td>.*<td width=133 valign=top bgcolor="#dae1e8" class="FWExtra2">/;
	$h{content} = $1;

	my @imgs = $h{content} =~ /<img src="([^<"]*)"[^>]*><br \/><span class="style\d\d">(<strong>|)([^<]*)/g;

	#clean the content
	$h{content} =~ s/<div.*?<\/div>//g;
	$h{content} =~ s/<span.*?>//g;
	$h{content} =~ s/<\/span>//g;
	$h{content} =~ s/<strong.*?<\/strong//g;

	#special characters
	$h{content} =~ s/&nbsp;/ /g;
    $h{content} =~ s/&ecirc;/ê/g;
    $h{content} =~ s/&ouml;/ö/g;
    $h{content} =~ s/&ucirc;/û/g;
    $h{content} =~ s/&egrave;/è/g;
    $h{content} =~ s/&icirc;/î/g;
    $h{content} =~ s/&eacute;/é/g;
    $h{content} =~ s/&quot;/'/g;
    $h{content} =~ s/&agrave;/à/g;
    $h{content} =~ s/&acirc;/â/g;
    $h{content} =~ s/&iuml;/ï/g;
    $h{content} =~ s/&ocirc;/ô/g;
    $h{content} =~ s/&ccedil;/ç/g;
    $h{content} =~ s/&euml;/ë/g;
    $h{content} =~ s/&ugrave;/ù/g;
    $h{content} =~ s/&szlig;/ß/g;
    $h{content} =~ s/&uuml;/ü/g;
    $h{content} =~ s/&amp;/et/g;
    $h{content} =~ s/&deg;/°/g;
    $h{content} =~ s/&ograve;/ò/g;
    $h{content} =~ s/&ecirc;/ê/g;
    $h{content} =~ s/&#338;/Œ/g;
    $h{content} =~ s/&#8211/—/g;
    $h{content} =~ s/&#21;/--/g;

	print $fh "<bulletin>\n";
	print $fh "<fichier>$filename</fichier>\n";
	print $fh "<numero>$h{bn_number}</numero>\n";
	print $fh "<date>$h{date}</date>\n";
	print $fh "<rubrique>$h{rubrique}</rubrique>\n";
	print $fh "<titre>$h{title}</titre>\n";
	print $fh "<texte>$h{content}</texte>\n";
	print $fh "<images>\n";
	for(my $i = 0; $i+2 < scalar(@imgs); $i += 3){
		print $fh "<image><urlImage>".$imgs[$i]."</urlImage><legendeImage>".$imgs[$i+2]."</legendeImage></img>\n";
	}
	print $fh "</images>\n";
	print $fh "<contact><a href=\"$h{contact_mail}\">$h{contact_name}</a></contact>\n";
	print $fh "</bulletin>\n";
}
print $fh "</corpus>\n";
close $fh;




#ls -l BULLETINS/ | wc -l
# -> 327 -> 326 files
#cat global.xml | grep "<bulletin>" | wc -l
# -> 326

