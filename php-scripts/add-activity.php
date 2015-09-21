<?php
  include 'config.php';
  include 'db-functions.php';

  $connection = connect_to_db();
  select_db();

  $first_query = "INSERT INTO activity (actionid, longitude, latitude, cheers, blurb)
                  VALUES (%s, %s, %s, %s, %s)";
  $first_query = sprintf($first_query, $_GET["actionid"], $_GET["longitude"],
                         $_GET["latitude"], $_GET["Cheers"], $_GET["blurb"]);
  if (!run_query($first_query)) { // Unsuccessful query?
    $first_array = array(
      "Status" => "Failure",
      "Message" => "Activity could not be added.",
    );
  } else {
    $first_array = array(
      "Status" => "Success",
      "Message" => "Activity has been successfully added.",
    );
  }
  $array = array();
  array_push($first_array, $array);

  $second_query = "INSERT INTO useractivity (userid, activityid)
                   VALUES (%s, %s)";
  $second_query = sprintf($second_query, $_GET["userid"], $_GET["activityid"]);
  if (!run_query($second_query)) { // Unsuccessful query?
    $second_array = array(
      "Status" => "Failure",
      "Message" => "User activity could not be added.",
    );
  } else {
    $second_array = array(
      "Status" => "Success",
      "Message" => "User activity has been successfully added.",
    );
  }
  array_push($second_array, $array);
  echo json_encode($array);

  close_db($connection);
?>
