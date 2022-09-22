<?php
$myfile = fopen("text.txt","r") or die("unable to open file");
while($char = fgetc($myfile)){
    echo $char;
}


?>