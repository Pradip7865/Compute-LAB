<?php
$myfile = fopen("text.txt","r");
    echo fread($myfile,filesize("text.txt"));
    fclose($myfile);
?>