#!/usr/bin/perl

while (<>) {
    if (/<rubrique>(.*)<\/rubrique)
    {
    $rub{$1} = 1;
    }
@rub = keys(%rub);
print @rub;
}