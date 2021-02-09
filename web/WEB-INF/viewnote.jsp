<%-- 
    Document   : viewnote
    Created on : Feb 2, 2021, 8:49:02 AM
    Author     : 809882
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Simple Note Keeper</title>
    </head>
    
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <p>Title: ${note.title}</p>
        <br>
        
        <p>Contents: ${note.content}</p>
        <br>
        <a href="NoteServlet?edit">Edit</a>
    </body>
</html>
