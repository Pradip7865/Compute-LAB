<?php
        // B.Tech Computer Science and Engineering
        // prasad pradipkumar
        // 202103103510499
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies and Sessions</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body style="background: #eee;">
    <div class="container d-flex flex-column justify-content-center aligin-item-center my-5 p-4" style="background: #fff;border-radius:12px;box-shadow:2px 2px 4px #ccc;">
        <h4>
            <?php 
                session_start();
                echo $_SESSION['name'];
            ?>
        </h4>
        <a href="index.php">Go Back</a>
    </div>
</body>
</html>