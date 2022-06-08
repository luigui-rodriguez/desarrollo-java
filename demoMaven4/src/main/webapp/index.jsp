<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
	<h1 style="margin:10px" >Proyecto Maven  Luigui </h1>
	<div>
		<ul>
			<h1 style="margin:10px" >Empleados</h1>
       
        <a class="btn btn-success" style="margin:10px" href="EmpleadoServletController?action=" type="button">Consultar Empleados</a>
        <a class="btn btn-danger" style="margin:10px" href= "EmpleadoServletController?action=add" type="button">Agregar Empleado</a>
        <h1 style="margin:10px" >Departamentos</h1>
        <a class="btn btn-success" style="margin:10px" href= "DepartamentoServletController?accion=listar" type="button">Consultar Departamentos</a>
        <a class="btn btn-danger" style="margin:10px" href= "DepartamentoServletController?accion=add" type="button" >Agregar Departamentos</a>
		</ul>
	</div>
</body>
</html> 