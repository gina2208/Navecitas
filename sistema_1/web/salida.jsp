
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clasesNaves.*"%>
<% 
    Nave halcon = (Nave)session.getAttribute("HM");
    Nave destructor = (Nave)session.getAttribute("DE");
    Nave lanzadera = (Nave)session.getAttribute("LI");
    Supremacy supremacy = (Supremacy)session.getAttribute("SU");
    Atat atat = (Atat)session.getAttribute("AT");
    
    double total = (Double)session.getAttribute("tot");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>HALCON MILENARIO</h1>
        <p>Datos: <%= halcon.mostrarDatos() %></p>
        <h1>DESTRUCTOR ESTELAR</h1>
        <p>Datos: <%= destructor.mostrarDatos() %></p>
        <h1>LANZADERA IMPERIAL</h1>
        <p>Datos: <%= lanzadera.mostrarDatos() %></p>
        <h1>SUPREMACY</h1>
        <p>Datos: <%= supremacy.mostrarDatos() %></p>
        <h1>AT AT</h1>
        <p>Datos: <%= atat.mostrarDatos() %></p>
        <h1>TOTAL DE COMBUSTIBLE</h1>
        <p> Se necesita <%= total%> L de combustible </p>  
    </body>
</html>
