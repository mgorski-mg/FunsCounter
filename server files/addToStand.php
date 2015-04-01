 <?php
 $standId = $_POST['standId'];
 
$client = mysqli_connect("localhost","root","", "stadion");

$result = mysqli_query($client, "INSERT INTO `stadion`.`data` (`ID`, `Gate_ID`, `Event_ID`, `Date`) VALUES (NULL, '$standId', '5', CURRENT_TIMESTAMP);");

echo($result);

mysqli_close($client);
?>