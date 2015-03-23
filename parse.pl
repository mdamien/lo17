#!/usr/bin/perl

# En-tête
## Modules
## Encodage
binmode(STDIN, ":utf8");
binmode(STDOUT, ":utf8"); 
## Pragma
use strict;
use warnings;

# Fonctions
sub convert {
	my ($t) = @_;
	$t =~ s/&nbsp;/ /g;
	$t =~ s/&ecirc;/ê/g;
	$t =~ s/&ouml;/ö/g;
	$t =~ s/&ucirc;/û/g;
	$t =~ s/&egrave;/è/g;
	$t =~ s/&icirc;/î/g;
	$t =~ s/&eacute;/é/g;
	$t =~ s/&quot;/'/g;
	$t =~ s/&agrave;/à/g;
	$t =~ s/&acirc;/â/g;
	$t =~ s/&iuml;/ï/g;
	$t =~ s/&ocirc;/ô/g;
	$t =~ s/&ccedil;/ç/g;
	$t =~ s/&euml;/ë/g;
	$t =~ s/&ugrave;/ù/g;
	$t =~ s/&szlig;/ß/g;
	$t =~ s/&uuml;/ü/g;
	$t =~ s/&amp;/et/g;
	$t =~ s/&deg;/°/g;
	$t =~ s/&ograve;/ò/g;
	$t =~ s/&ecirc;/ê/g;
	$t =~ s/&#338;/Œ/g;
	$t =~ s/&#8211/—/g;
	$t =~ s/&#21;/--/g;
	return $t;
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

	# Clean the content
	$h{content} =~ s/<div.*?<\/div>//g;
	$h{content} =~ s/<span.*?>//g;
	$h{content} =~ s/<\/span>//g;
	$h{content} =~ s/<strong.*?<\/strong//g;

	# Special characters
	$h{content} = convert $h{content};
	$h{rubrique} = convert $h{rubrique};
	$h{title} = convert $h{title};
	$h{contact_name} = convert $h{contact_name};
	$h{contact_mail} = convert $h{contact_mail};
	
	print $fh "<bulletin>\n";
	print $fh "<fichier>$filename</fichier>\n";
	print $fh "<numero>$h{bn_number}</numero>\n";
	print $fh "<date>$h{date}</date>\n";
	print $fh "<rubrique>$h{rubrique}</rubrique>\n";
	print $fh "<titre>$h{title}</titre>\n";
	print $fh "<texte>$h{content}</texte>\n";
	print $fh "<images>\n";
	for(my $i = 0; $i+2 < scalar(@imgs); $i += 3){
		$imgs[$i+2] = convert $imgs[$i+2];
		print $fh "<image><urlImage>".$imgs[$i]."</urlImage><legendeImage>".$imgs[$i+2]."</legendeImage></image>\n";
	}
	print $fh "</images>\n";
	print $fh "<contact><a href=\"$h{contact_mail}\">$h{contact_name}</a></contact>\n";
	print $fh "</bulletin>\n";
}
print $fh "</corpus>\n";
close $fh;

# TODO Retirer ce bout de code ?
#ls -l BULLETINS/ | wc -l
# -> 327 -> 326 files
#cat global.xml | grep "<bulletin>" | wc -l
# -> 326