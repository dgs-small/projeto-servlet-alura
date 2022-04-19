<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro</title>
	<c:url value="/entrada?acao=NovaEmpresa" var="UnicaEntradaServlet"/>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Cadastro de Empresas</h1>
	<form action="${UnicaEntradaServlet}" method="POST">
		<label for="nome">Nome: <input type="text" name="nome"
			id="nome" placeholder="nome da empresa"></label> 
		<label for="data">
			Data de Criação: <input type="text" name="data"
			id="data" placeholder="dd/MM/yyyy">
		</label>	
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>