<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $query = "INSERT INTO action (actionid, description)
            VALUES (%s, %s)";
  $query = sprintf($query, $_GET["actionid"], $_GET["description"]);
  if (!run_query($query)) { // Unsuccessful query?
    $array = array(
      "Status" => "Failure",
      "Message" => "Action could not be added.",
    );
  } else {
    $array = array(
      "Status" => "Success",
      "Message" => "Action has been successfully added.",
    );
  }
  echo json_encode($array);

  close_db($connection);
?>
