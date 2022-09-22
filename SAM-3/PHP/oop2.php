<?php
class Goodbye{
    const LEAVING_MESSAGE = "thanks for visit ";
    public function byebye(){
        echo self::LEAVING_MESSAGE,"\n";
    }
}
echo Goodbye::LEAVING_MESSAGE."\n";
$goodbye = new Goodbye();
$goodbye->byebye();

?>