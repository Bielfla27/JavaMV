<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JavaBean</title>
</head>
<body>

	<jsp:useBean id="pessoaBean" class="br.com.aulajavaweb.bean.PessoaBean"></jsp:useBean>

	<jsp:setProperty property="nome" name="pessoaBean" value="Gabriel" />
	<jsp:setProperty property="sobrenome" name="pessoaBean" value="Felix" />

	Nome: <jsp:getProperty property="nome" name="pessoaBean" /> <p/>
	Sobrenome: <jsp:getProperty property="sobrenome" name="pessoaBean" /> <p/>
</body>
</html>