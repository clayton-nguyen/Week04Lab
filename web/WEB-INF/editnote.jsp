<%-- 
    Document   : editnote
    Created on : Feb 2, 2021, 8:48:37 AM
    Author     : 809882
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Simple Note Keeper</title>
    </head>
    
    <body>
        
        <h1>Edit Note</h1>
        <h2>View Note</h2>
        
        
        <form method="post" action="NoteServlet">
            
        <p>Title: </p>
        <input type="text" name="titleInputArea" value="${note.title}">
        <br>
        
        <p>Contents: </p>
        <input type="textarea" name="contentInputArea" value="${note.content}">
        <br>
            
        <a href="NoteServlet"><button>Save</button</a>
        </form>
           
    </body>
</html>
