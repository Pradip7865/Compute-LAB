 <?php
// $text= file_get_contents("text.txt");
// echo $text;

?> 
<?php
// $text=file("hello.txt");
// foreach($text as $number => $line){
//     echo $line;
// }
?>

<?php
// $file=fopen("hello.txt","w");
// echo fwrite($file,"hello world ");
// fclose($file);

?>

<?php
// $file=fopen("hello.txt","a");
// echo fwrite($file,"hello world ");
// fclose($file);

?>

<?php
$fileread=fopen("hello.txt","r");
$filewrite=fopen("test.txt","w");
while(!feof(!$fileread)){
    fwrite($filewrite,fgets($fileread));
}
fclose($fileread);
fclose($filewrite);


?>