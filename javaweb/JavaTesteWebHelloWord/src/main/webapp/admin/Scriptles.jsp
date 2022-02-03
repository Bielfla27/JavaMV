<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%! 
	String[] nomes = {"Gabriel", "Jessica" , "Ivoneide" , "Antonio"};
%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Nome: </h1>	
	<%
		for(int i = 0; i < nomes.length; i++){
	%>
	<table>
		<tr>
			<td>
				<%= nomes[i] %>
			</td>
		</tr>
		<%}%>
	</table>
</body>
</html>