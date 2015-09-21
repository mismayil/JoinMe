<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $query = "INSERT INTO cheeredactivity (activityid, userid)
            VALUES (%s, %s)";
  $query = sprintf($query, $_GET["activityid"], $_GET["userid"]);
  if (!run_query($query)) { // Unsuccessful query?
    $array = array(
      "Status" => "Failure",
      "Message" => "Activity could not be cheered.",
    );
  } else {
    $array = array(
      "Status" => "Success",
      "Message" => "Activity has been successfully cheered.",
    );
  }

  close_db($connection);
?>
