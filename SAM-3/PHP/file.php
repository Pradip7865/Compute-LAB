<?php
$myfile = fopen("text.text","r");
if($myfile){
    echo "file open\n";
    while(!feof($myfile)){
        $text = fgets($myfile);
        echo $text;
    }
    fclose($myfile);
}
else{
    echo "unable to open file";
}

?>