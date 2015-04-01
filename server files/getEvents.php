 <?php
$client = mysqli_connect("localhost","root","", "stadion");

if (mysqli_connect_errno()) {
	echo "Failed to connect to MySQL: ".mysqli_connect_error();
}

$result = mysqli_query($client, "SELECT * FROM events");

while ($row = mysqli_fetch_assoc($result)) {
	$events[] = $row;
}

echo json_encode($events);

mysqli_close($client);
?>