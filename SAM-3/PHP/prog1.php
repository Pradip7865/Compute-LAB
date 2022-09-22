<?php
 $x= 15;
 $y= 12;
 echo "Addition",$x+$y."\n";
 echo "Subtraction",$x-$y."\n";
 echo "multi",$x*$y."\n";
 echo "div",$x/$y."\n";
 echo "modulus",$x%$y."\n";
 echo "power",$x**$y."\n";

$y=7;
$x=5;

$z=$y++;
$y=$x++;
$x=$z++;
echo $x,$y,$z,"\n";
$z=++$y;
$y=++$x;
$x=++$z;
echo $x,$y,$z;

?>

