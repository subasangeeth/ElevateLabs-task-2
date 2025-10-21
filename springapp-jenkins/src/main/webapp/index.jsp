<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Spring JSP Version Page</title>
    <meta charset="UTF-8">
    <style>
        body {
          font-family: Arial, sans-serif;
           background-color: #1a38bc;
          color: white;
          text-align: center;
         padding-top: 100px;
 }
     h1 { font-size: 50px; }
    h2 { margin-top: 20px; }
   .version {
          background-color: #ffffff55;
          padding: 10px 30px;
         display: inline-block;
        border-radius: 10px;
        }
    </style>
</head>
<body>
    <h1>Hello Elevate Labs</h1>
    <h2>${message}</h2>
    <div class="version">
        <h2>Version: ${version}</h2>
    </div>
</body>
</html>
