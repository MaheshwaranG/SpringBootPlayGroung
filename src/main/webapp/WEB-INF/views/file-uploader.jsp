<html>

<head>
<title>First Web Application</title>
</head>

<body>
    <h1>Welcome</h1>
    <font color="red">${errorMessage}</font>
    <form method="post" action = "/rest/upload"  enctype="multipart/form-data">
        Upload : <input type = "file" name="file" id="file-uploader" />
        <input type="submit" value="Submit"/>
    </form>
</body>

</html>