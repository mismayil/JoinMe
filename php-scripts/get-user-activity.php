<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  if (isset($_GET["userid"])) {
	  $query = "SELECT * FROM useractivity WHERE userid = ".$_GET["userid"];
  } elseif (isset($_GET["activityid"])) {
	  $query = "SELECT * FROM useractivity WHERE activityid = ".$_GET["activityid"];
  } else {
	  $query = "SELECT * FROM useractivity";
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
