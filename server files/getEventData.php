 <?php
$eventID = $_POST['eventID'];
 
$client = mysqli_connect("localhost","root","", "stadion");

if (mysqli_connect_errno()) {
	echo "Failed to connect to MySQL: ".mysqli_connect_error();
}

$resultGate = mysqli_query($client, "SELECT * FROM gates");

while ($gate = mysqli_fetch_assoc($resultGate))
{	
	$gate_id = $gate['Id'];
	$resultData = mysqli_query($client, "SELECT * FROM data WHERE Event_ID=$eventID AND Gate_ID=$gate_id");
	$gate['Amount'] = mysqli_num_rows($resultData);

	$gates[] = $gate;
}

$resultEvent = mysqli_query($client, "SELECT * FROM events WHERE ID=$eventID");

$event = mysqli_fetch_assoc($resultEvent);
$event['Gates'] = $gates;

echo json_encode($event);

mysqli_close($client);
?>