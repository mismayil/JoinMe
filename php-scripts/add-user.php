<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $query = "INSERT INTO user (userid, name, gender)
            VALUES ('%s', '%s', '%s')";
  $name = $_GET["firstname"].' '.$_GET["lastname"];
  if ($_GET["gender"] == "male") {
    $gender = "M";
  } else {
    $gender = "F";
  }
  $query = sprintf($query, $_GET["userid"], $name, $gender);
  if(!run_query($query)) { // Unsuccessful query?
    $array = array(
      "Status" => "Failure",
      "Message" => "Account could not be created.",
    );
  } else {
    $array = array(
      "Status" => "Success",
      "Message" => "Account has been successfully created.",
    );
  }
  echo json_encode($array);

  close_db($connection);
?>
