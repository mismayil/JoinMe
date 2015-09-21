<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  if (isset($_GET["userid"])) {
	  $query = "SELECT * FROM user WHERE userid = ".$_GET["userid"];
  } else {
	  $query = "SELECT * FROM user";
  }
  $result = run_query($query);

  // Pushes each entry of result into an array and converts it to JSON.
  $array = array();
  while ($row = mysql_fetch_assoc($result)) {
    array_push($array, $row);
  }
  echo json_encode($array);

  close_db($connection);
?>
