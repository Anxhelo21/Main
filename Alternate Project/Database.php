<?php

function Createdb(){
    $servername = "localhost";
    $username = "root";
    $password = "7Anxhelo2000";
    $dbname = "project";

    // create connection
    $con = mysqli_connect($servername, $username, $password, $dbname);

    // Check Connection
    if (!$con) {
        echo "Connection to MySQL Server failed!";
    }

    // create Database
    $sql = "CREATE DATABASE IF NOT EXISTS $dbname";

    if(mysqli_query($con, $sql)){
        $con = mysqli_connect($servername, $username, $password, $dbname);

        $sql = "
                        CREATE TABLE IF NOT EXISTS users(
                            id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
                            Name VARCHAR (45) NOT NULL,
                            Surname VARCHAR (45) NOT NULL ,
                            Email VARCHAR (100) NOT NULL ,
                            Password  VARCHAR(45) NOT NULL 
                        );
        ";

        if(mysqli_query($con, $sql)){
            return $con;
        }else{
            echo "Cannot Create table!";
        }

    }else{
        echo "Error while creating database ". mysqli_error($con);
    }

}
