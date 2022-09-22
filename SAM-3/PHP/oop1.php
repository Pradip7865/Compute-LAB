<?php
    class Person{
        public $name;
        function __constructer($data){
            echo "Constructer".$data,".....\n";
            $this->name = $data;
        }

        function get_mame(){
            return $this->name;
        }
        function __destruct(){
            echo "destructer".$this->name."....\n";
        }
    }

class Friend extends Person{
    public $message;
    function set_msg($msg){
        $this->message = $msg;
    }
    function speak(){
        echo $this->message;
    }
}

$obj1 = new Person ("hello")

?>