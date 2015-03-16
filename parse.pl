#!/usr/bin/perl

# En-tête
## Flags
use strict;
use warnings;
## Encodage
binmode(STDIN, ":utf8");
binmode(STDOUT, ":utf8"); 

# Fonctions
sub convert {
	my ($textToConvert) = @_;
	$textToConvert =~ s/&nbsp;/ /g;
	$textToConvert =~ s/&ecirc;/ê/g;
	$textToConvert =~ s/&ouml;/ö/g;
	$textToConvert =~ s/&ucirc;/û/g;
	$textToConvert =~ s/&egrave;/è/g;
	$textToConvert =~ s/&icirc;/î/g;
	$textToConvert =~ s/&eacute;/é/g;
	$textToConvert =~ s/&quot;/'/g;
	$textToConvert =~ s/&agrave;/à/g;
	$textToConvert =~ s/&acirc;/â/g;
	$textToConvert =~ s/&iuml;/ï/g;
	$textToConvert =~ s/&ocirc;/ô/g;
	$textToConvert =~ s/&ccedil;/ç/g;
	$textToConvert =~ s/&euml;/ë/g;
	$textToConvert =~ s/&ugrave;/ù/g;
	$textToConvert =~ s/&szlig;/ß/g;
	$textToConvert =~ s/&uuml;/ü/g;
	$textToConvert =~ s/&amp;/et/g;
	$textToConvert =~ s/&deg;/°/g;
	$textToConvert =~ s/&ograve;/ò/g;
	$textToConvert =~ s/&ecirc;/ê/g;
	$textToConvert =~ s/&#338;/Œ/g;
	$textToConvert =~ s/&#8211/—/g;
	$textToConvert =~ s/&#21;/--/g;
	return $textToConvert;
}

# Corps du script
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

	$h{rubrique} =~ s/&nbsp;/ /g;
	$h{rubrique} =~ s/&ecirc;/ê/g;
	$h{rubrique} =~ s/&ouml;/ö/g;
	$h{rubrique} =~ s/&ucirc;/û/g;
	$h{rubrique} =~ s/&egrave;/è/g;
	$h{rubrique} =~ s/&icirc;/î/g;
	$h{rubrique} =~ s/&eacute;/é/g;
	$h{rubrique} =~ s/&quot;/'/g;
	$h{rubrique} =~ s/&agrave;/à/g;
	$h{rubrique} =~ s/&acirc;/â/g;
	$h{rubrique} =~ s/&iuml;/ï/g;
	$h{rubrique} =~ s/&ocirc;/ô/g;
	$h{rubrique} =~ s/&ccedil;/ç/g;
	$h{rubrique} =~ s/&euml;/ë/g;
	$h{rubrique} =~ s/&ugrave;/ù/g;
	$h{rubrique} =~ s/&szlig;/ß/g;
	$h{rubrique} =~ s/&uuml;/ü/g;
	$h{rubrique} =~ s/&amp;/et/g;
	$h{rubrique} =~ s/&deg;/°/g;
	$h{rubrique} =~ s/&ograve;/ò/g;
	$h{rubrique} =~ s/&ecirc;/ê/g;
	$h{rubrique} =~ s/&#338;/Œ/g;
	$h{rubrique} =~ s/&#8211/—/g;
	$h{rubrique} =~ s/&#21;/--/g;

	$h{title} =~ s/&nbsp;/ /g;
	$h{title} =~ s/&ecirc;/ê/g;
	$h{title} =~ s/&ouml;/ö/g;
	$h{title} =~ s/&ucirc;/û/g;
	$h{title} =~ s/&egrave;/è/g;
	$h{title} =~ s/&icirc;/î/g;
	$h{title} =~ s/&eacute;/é/g;
	$h{title} =~ s/&quot;/'/g;
	$h{title} =~ s/&agrave;/à/g;
	$h{title} =~ s/&acirc;/â/g;
	$h{title} =~ s/&iuml;/ï/g;
	$h{title} =~ s/&ocirc;/ô/g;
	$h{title} =~ s/&ccedil;/ç/g;
	$h{title} =~ s/&euml;/ë/g;
	$h{title} =~ s/&ugrave;/ù/g;
	$h{title} =~ s/&szlig;/ß/g;
	$h{title} =~ s/&uuml;/ü/g;
	$h{title} =~ s/&amp;/et/g;
	$h{title} =~ s/&deg;/°/g;
	$h{title} =~ s/&ograve;/ò/g;
	$h{title} =~ s/&ecirc;/ê/g;
	$h{title} =~ s/&#338;/Œ/g;
	$h{title} =~ s/&#8211/—/g;
	$h{title} =~ s/&#21;/--/g;

	$h{contact_name} =~ s/&nbsp;/ /g;
	$h{contact_name} =~ s/&ecirc;/ê/g;
	$h{contact_name} =~ s/&ouml;/ö/g;
	$h{contact_name} =~ s/&ucirc;/û/g;
	$h{contact_name} =~ s/&egrave;/è/g;
	$h{contact_name} =~ s/&icirc;/î/g;
	$h{contact_name} =~ s/&eacute;/é/g;
	$h{contact_name} =~ s/&quot;/'/g;
	$h{contact_name} =~ s/&agrave;/à/g;
	$h{contact_name} =~ s/&acirc;/â/g;
	$h{contact_name} =~ s/&iuml;/ï/g;
	$h{contact_name} =~ s/&ocirc;/ô/g;
	$h{contact_name} =~ s/&ccedil;/ç/g;
	$h{contact_name} =~ s/&euml;/ë/g;
	$h{contact_name} =~ s/&ugrave;/ù/g;
	$h{contact_name} =~ s/&szlig;/ß/g;
	$h{contact_name} =~ s/&uuml;/ü/g;
	$h{contact_name} =~ s/&amp;/et/g;
	$h{contact_name} =~ s/&deg;/°/g;
	$h{contact_name} =~ s/&ograve;/ò/g;
	$h{contact_name} =~ s/&ecirc;/ê/g;
	$h{contact_name} =~ s/&#338;/Œ/g;
	$h{contact_name} =~ s/&#8211/—/g;
	$h{contact_name} =~ s/&#21;/--/g;

	$h{contact_mail} =~ s/&nbsp;/ /g;
	$h{contact_mail} =~ s/&ecirc;/ê/g;
	$h{contact_mail} =~ s/&ouml;/ö/g;
	$h{contact_mail} =~ s/&ucirc;/û/g;
	$h{contact_mail} =~ s/&egrave;/è/g;
	$h{contact_mail} =~ s/&icirc;/î/g;
	$h{contact_mail} =~ s/&eacute;/é/g;
	$h{contact_mail} =~ s/&quot;/'/g;
	$h{contact_mail} =~ s/&agrave;/à/g;
	$h{contact_mail} =~ s/&acirc;/â/g;
	$h{contact_mail} =~ s/&iuml;/ï/g;
	$h{contact_mail} =~ s/&ocirc;/ô/g;
	$h{contact_mail} =~ s/&ccedil;/ç/g;
	$h{contact_mail} =~ s/&euml;/ë/g;
	$h{contact_mail} =~ s/&ugrave;/ù/g;
	$h{contact_mail} =~ s/&szlig;/ß/g;
	$h{contact_mail} =~ s/&uuml;/ü/g;
	$h{contact_mail} =~ s/&amp;/et/g;
	$h{contact_mail} =~ s/&deg;/°/g;
	$h{contact_mail} =~ s/&ograve;/ò/g;
	$h{contact_mail} =~ s/&ecirc;/ê/g;
	$h{contact_mail} =~ s/&#338;/Œ/g;
	$h{contact_mail} =~ s/&#8211/—/g;
	$h{contact_mail} =~ s/&#21;/--/g;
	
	print $fh "<bulletin>\n";
	print $fh "<fichier>$filename</fichier>\n";
	print $fh "<numero>$h{bn_number}</numero>\n";
	print $fh "<date>$h{date}</date>\n";
	print $fh "<rubrique>$h{rubrique}</rubrique>\n";
	print $fh "<titre>$h{title}</titre>\n";
	print $fh "<texte>$h{content}</texte>\n";
	print $fh "<images>\n";
	for(my $i = 0; $i+2 < scalar(@imgs); $i += 3){
		$imgs[$i+2] =~ s/&nbsp;/ /g;
		$imgs[$i+2] =~ s/&ecirc;/ê/g;
		$imgs[$i+2] =~ s/&ouml;/ö/g;
		$imgs[$i+2] =~ s/&ucirc;/û/g;
		$imgs[$i+2] =~ s/&egrave;/è/g;
		$imgs[$i+2] =~ s/&icirc;/î/g;
		$imgs[$i+2] =~ s/&eacute;/é/g;
		$imgs[$i+2] =~ s/&quot;/'/g;
		$imgs[$i+2] =~ s/&agrave;/à/g;
		$imgs[$i+2] =~ s/&acirc;/â/g;
		$imgs[$i+2] =~ s/&iuml;/ï/g;
		$imgs[$i+2] =~ s/&ocirc;/ô/g;
		$imgs[$i+2] =~ s/&ccedil;/ç/g;
		$imgs[$i+2] =~ s/&euml;/ë/g;
		$imgs[$i+2] =~ s/&ugrave;/ù/g;
		$imgs[$i+2] =~ s/&szlig;/ß/g;
		$imgs[$i+2] =~ s/&uuml;/ü/g;
		$imgs[$i+2] =~ s/&amp;/et/g;
		$imgs[$i+2] =~ s/&deg;/°/g;
		$imgs[$i+2] =~ s/&ograve;/ò/g;
		$imgs[$i+2] =~ s/&ecirc;/ê/g;
		$imgs[$i+2] =~ s/&#338;/Œ/g;
		$imgs[$i+2] =~ s/&#8211/—/g;
		$imgs[$i+2] =~ s/&#21;/--/g;		
		print $fh "<image><urlImage>".$imgs[$i]."</urlImage><legendeImage>".$imgs[$i+2]."</legendeImage></image>\n";
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
