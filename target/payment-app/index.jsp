<html>
<head>
    <title>Smart Parking System</title>
</head>
<body>

<h2>Book Parking Slot</h2>

<form action="parking" method="post">
    Enter Slot Number (1-10):
    <input type="text" name="slot"><br><br>

    <input type="submit" value="Book Slot">
</form>

<br><br>

<h3>Check Parking Status</h3>
<a href="parking">View All Slots</a>

<br><br>

<h3>Free a Slot</h3>

<form action="parking" method="post">
    <input type="hidden" name="_method" value="delete">
    Enter Slot Number:
    <input type="text" name="slot"><br><br>

    <input type="submit" value="Free Slot">
</form>

</body>
</html>