<%-- 
    Document   : left_frame
    Created on : 20 Oct, 2018, 1:35:41 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>

.button {
	padding: 5px 10px;
	background: #2664cf;
	font-family: Arial, sans-serif;
	color: #ffffff;
	text-align: center;
	display: block;
	cursor: pointer
}
.button {
	border: 1px solid #4cadfc;
	border-radius: 4px;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px
	}
.button {
	background: -webkit-gradient(linear, left top, left bottom, from(#0a8ffe), to(#2b5cc6));
	background: -moz-linear-gradient(top, #0a8ffe, #2b5cc6);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0a8ffe', endColorstr='#2b5cc6')
	}
.login{
    border-radius: 25px;
    background: #A4A4A4;
    width: 300px;
    height: 250px; 
    padding:100px 30px 5px 200px;
}
nav{
    width:600px;
    height:100vh;
    background-color:#eeeeee;
    padding:50px 10px 5px 70px;
}
</style>

<script>
    function func1()
    {
        alert(view);
    }
    function func2()
    {
        alert("Ticket Deleted");
    }
</script>
</head>
<body>
<nav>
<div class="login">

<form action="DeleteTicket" method="post">
    <input type="button" onclick="func1()" name="ticket" value="View">
    <input type="button" onclick="func2()" name="ticket" value="Delete">
</form>


</div>
</nav>
    </body>
</html>
