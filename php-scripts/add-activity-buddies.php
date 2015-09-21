<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $query = "INSERT INTO activitybuddies (activityid, buddyid)
            VALUES (%s, %s)";
  $query = sprintf($query, $_GET["activityid"], $_GET["buddyid"]);
  if (!run_query($query)) { // Unsuccessful query?
    $array = array(
      "Status" => "Failure",
      "Message" => "Activity buddy could not be added.",
    );
  } else {
    $array = array(
      "Status" => "Success",
      "Message" => "Activity buddy has been successfully added.",
    );
  }
  echo json_encode($array);

  close_db($connection);
?>
