<%@page import="java.util.ArrayList"%>
<%@page import="br.com.alura.gerenciador.model.Empresa , java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas Cadastradas</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Empresas Cadastradas</h1>
	<ul>
		<c:if test="${not empty empresa}">
			<h2>Empresa ${empresa} cadastrada com sucesso</h2>
		</c:if>
		<c:forEach items="${lista}" var="empresa">
			<li>${empresa.getNome()}- <fmt:formatDate
					value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.getId()}">Editar</a>
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.getId()}">Remover</a>
			</li>
		</c:forEach>
	</ul>
	<a href="/gerenciador/formNovaEmpresa.jsp">Cadastrar nova Empresa</a>
</body>
</html>