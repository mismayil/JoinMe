<?php
  include 'config.php';

  // Opens connection to database.
  function connect_to_db() {
    global $username, $password;
    // Creates connection to database.
    $connection = mysql_connect(localhost, $username, $password);
    if (!$connection) { // Null connection?
      die('Unable to connect to database: ' . mysql_error());
    }
    return $connection;
  }

  // Selects database.
  function select_db() {
    global $database;
    $selection = mysql_select_db($database);
    if (!$selection) { // Null selection?
      die('Unable to select database: ' . mysql_error());
    }
  }

  // Runs a query in database.
  function run_query($query) {
    return mysql_query($query);
  }

  // Closes connection to database.
  function close_db($connection) {
    mysql_close($connection);
  }
?>
