<?php
    $x=2;
    echo"prime number is : "."2"." ";
    $e=2;
    do{
        $y=2;
        $t=0;
        do{
            if($x%$y == 0){
                $t++;
                break;
            }
            $y++;
        }while($y <= $x/2);

        if($t == 0){
            $e=$e+$x;
            echo $x." ";
        }
        $x++;
    }while($x<=100);
    echo "\n";
   
    echo "Sum of prime number is : ".$e;
    echo "\n";



// ?>