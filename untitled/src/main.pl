use strict;
use warnings FATAL => 'all';

sub format_text {
    my @lines = @_;

    for my $line (@lines) {
        $line =~ s/^\s*//;
        $line =~ s/\s*$//;
        $line =~ s/\s\s+/ /g;
    }

    my $full_line = join("\n", @lines);
    $full_line =~ s/\n\n+/\n\n/g;
    $full_line =~ s/^\n*//g;
    $full_line =~ s/\n*$//g;

    return $full_line;
}

sub uniq {
    my %seen;
    grep !$seen{$_}++, @_;
}


my @lines = <STDIN>;

my $full_line = join("", @lines);
my @matches = $full_line =~ /<\s*a.*?\shref="(.*?)".*?>/g;
my @answer;

for my $match (@matches) {
    $match =~ s/^(\w.*?:\/\/)?//;
    my @str = ($match =~ /^(\w[^:\?#\/]+)/);
    push(@answer, join("", @str));
}

@answer = sort(uniq(@answer));

for my $line (@answer) {
    print("$line\n") if length($line) != 0;
}

# $full_line = format_text(split("\n", $full_line));
# print($full_line);
# for my $line (@lines) {
#     print("$line\n");
# }

exit;
