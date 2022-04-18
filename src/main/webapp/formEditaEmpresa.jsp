<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
	<c:url value="/edita-empresa" var="EditaEmpresaServlet"/>
	<meta charset="UTF-8">
	<title>Editar</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Edite a Empresa</h1>
	<form action="${EditaEmpresaServlet}" method="POST">
	
		<label for="nome">Nome: <input type="text" name="nome"
			id="nome" value="${empresa.nome}"></label> 
			
		<label for="data">Data de Criação: <input type="text" name="data" id="data"value="<fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
		</label>
		<input type="hidden" value="${empresa.id}" name="id">
		<button type="submit">Enviar</button>
		
	</form>
</body>
</html>