<%@page import="model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Productos</title>
<%
	ArrayList<Producto> productos = (ArrayList<Producto>) request.getAttribute("productos");
%>
</head>
<body>
	<%for (Producto p : productos) { %>
		<b>Producto: <%=p.getName()%></b> de color <%=p.getColor()%>. Cantidad: <%=p.getStock()%><br/>
	<%}%>
</body>
</html>