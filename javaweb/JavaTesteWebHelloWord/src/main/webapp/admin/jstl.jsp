<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL com JavaBean</title>
</head>
<body>
	
	<jsp:useBean id="pessoaBean" class="br.com.aulajavaweb.bean.PessoaBean"></jsp:useBean>

	<c:set target="${pessoaBean}" property="nome" value ="Marcelo"/>
	<c:set target="${pessoaBean}" property="sobrenome" value ="Soares"/>
	
	<h1>
		Nome: <c:out value="${pessoaBean.nome}"></c:out> <br>
		Sobrenome: <c:out value="${pessoaBean.sobrenome}"></c:out>
	</h1>
</body>
</html>