<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  if (isset($_GET["actionid"])) {
	  $query = "SELECT * FROM action WHERE actionid = ".$_GET["actionid"];
  } else {
    $query = "SELECT * FROM action";
  }
  $result = run_query($query);

  // Pushes each entry of result into an array and converts it to JSON.
  $array = array();
  while ($row = mysql_fetch_assoc($result)) {
	  $array[$row['actionid']] = $row['description'];
  }
  echo json_encode($array);

  close_db($connection);
?>
