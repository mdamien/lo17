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

	foreach my $qzd (@imgs) {
		my $dzq = $qzd =~ /style21/g;
		print $dzq;
	}

	#clean the content
	while($h{content} =~ /<\/span>.*<span class="style95">/){
		$h{content} =~ /^(.*)<\/span>.*<span class="style95">(.*)$/;
		$h{content} = $1.$2;
	}

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
	print $fh "<contact>TODO SIMPLE</contact>\n";
	print $fh "</bulletin>\n";
}
print $fh "</corpus>\n";
close $fh;



