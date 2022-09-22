<?php
namespace Html;
class Table{
    public $title="";
    public $numRows= 0;

    public function message(){
        echo "table \"{$this->title}\" has {$this->numRows} rows ";
    }
}



class Row{
    public $numCell=0;
    public function message(){
        echo "this row has {$this->numCell} cells.\n";
    }
}
?>