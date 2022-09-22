<?php

namespace Html;
include "Html.php";

$table = new Table();
$table->title = "my table";
$table->numRow = 5;

$row = new Row();
$row->numCells = 3;

?>
<?php $table->message();?>
<?php $row->message();?>