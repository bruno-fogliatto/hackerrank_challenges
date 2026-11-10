<?php

function solveMeFirst(int $a, int $b): int
{
    return $a + $b;
}

$handle = fopen("php://stdin", "r");
echo "Enter the first number:\n";
$_a     = fgets($handle);
echo "Enter the second number:\n";
$_b     = fgets($handle);
$sum    = solveMeFirst((int)$_a, (int)$_b);
echo "Result: " . $sum . "\n";
fclose($handle);
