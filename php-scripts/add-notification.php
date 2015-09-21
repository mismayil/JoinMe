<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $query = "INSERT INTO notification (notificationid, senderid, receiverid, activityid)
            VALUES (%s, %s, %s, %s)";
  $query = sprintf($query, $_GET["notificationid"], $_GET["senderid"], $_GET["receiverid"],
                   $_GET["activityid"]);
  if (!run_query($query)) { // Unsuccessful query?
    $array = array(
      "Status" => "Failure",
      "Message" => "Notification could not be added.",
    );
  } else {
    $array = array(
      "Status" => "Success",
      "Message" => "Notification has been successfully added.",
    );
  }

  close_db($connection);
?>
