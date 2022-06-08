
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de departamentos</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        
            
        
 

            <div class="container">
             <div>
            <a class="btn btn-primary" href="DepartamentoServletController?action=add">Agregar departamento</a>
            <a class="btn btn-danger" href="index.jsp">Regresar </a>
            </div>
                <h1>Lista De Departamentos</h1>
                <table class="table">
                    <thead class="table-dark">
                    <th>id</th>
                    <th>Codigo departamento</th>
                    <th>Nombre departamento</th>
                    <th>Fecha creacion</th>
                    <th>Ultima modificacion</th>
                    <th>Acciones</th>
                    </thead>
                    <tbody>
                        <c:forEach var="departamento" items="${listDep}">
                            
                            <tr>
                                <td> <c:out value="${departamento.id}"/> </td>
                                <td><c:out value="${departamento.departamento_codigo}"/></td>
                                <td><c:out value="${departamento.nombre_departamento}"/></td>
                                <td><c:out value="${departamento.fecha_hora_crea}"/></td>
                                <td><c:out value="${departamento.fecha_hora_modifica}"/></td>

                                <td><a class="btn btn-primary" href="DepartamentoServletController?action=edit&id=<c:out value="${departamento.id}"></c:out>">Editar<a/>
                                        <a class="btn btn-danger" href="DepartamentoServletController?action=eliminar&id=<c:out value="${departamento.id}"></c:out>">Eliminar<a/> </td>
                                
                            </tr>
                            </c:forEach>
                            
                    </tbody>
            
        </div>
    </body>
</html>