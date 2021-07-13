/*Modificar.jsp captura de la url el id para modificar a ese usuario*/

<%-- 
    Document   : modificar
    Created on : 6 jul. 2021, 14:54:09
    Author     : servilinea
--%>

<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page import="java.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Alumno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <% 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
String id = request.getParameter ("id"); // Use request para obtener 
int mid;
mid =Integer.parseInt(id);


%> 
<p><%out.println(path);%></p>
        <p><%out.println(basePath);%></p>
        <p><%out.println(id);%></p>
        <p><%out.println(mid);%></p>
        
                      <%
        Alumnos resultado=null;
        AlumnosDAO alumno = new AlumnosDAO();
        resultado = alumno.mostrarALumno(mid);
      %>
        
        

                <h1 class="text-center">Modificar Alumno</h1>
            <div class="container">
                <div class="row">
                    <form class="p-5" method="POST" action="">
                        <div class="mb-3">
                          <label for="id" class="form-label"></label>
                          <input type="hidden" class="form-control" id="id" name="nombre" aria-describedby="emailHelp" value=<% out.print(resultado.getId());%>>
                        </div>
                        <div class="mb-3">
                          <label for="nombre" class="form-label">Nombre</label>
                          <input type="text" class="form-control" id="nombre" name="nombre" aria-describedby="emailHelp" value=<% out.print(resultado.getNombre());%>>
                        </div>
                        <div class="mb-3">
                          <label for="apellido" class="form-label">Apellido</label>
                          <input type="text" class="form-control" id="apellido" name="apellido" aria-describedby="emailHelp" value=<% out.print(resultado.getApellido());%>>
                        </div>
                        <div class="mb-3">
                          <label for="email" class="form-label">Email</label>
                          <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" value=<% out.print(resultado.getEmail());%>>
                        </div>
                      
                        
                        <button type="submit" class="btn btn-primary">Modificar</button>
                    </form>
                </div>
            </div>

    </body>
</html>

/***************************ALUMNOS:JSP*********************************** */

<%-- 
    Document   : alumnos.jsp
    Created on : 6 jul. 2021, 14:53:12
    Author     : servilinea
--%>

<%@page import="modelo.Alumnos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="modelo.AlumnosDAO"%>
<%@page import="config.Conexion"%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>

        <div class="container">
            
            <h1 class="text-center">Alumnos</h1>
            <div class="row">
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">Email</th>
                        </tr>
                    </thead>
                    <tbody>

               <%
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/codoacodo";
        String user = "luis";
        String pass = "123456";
        String consulta = "SELECT * FROM usuarios";
        try{
        Connection mysql = DriverManager.getConnection(url, user, pass);
        Statement mostrar = mysql.createStatement();
        ResultSet resultado = mostrar.executeQuery(consulta);
        
        
        String id="id";
        String nombre="nombre";
        String apellido="apellido";
        String email="email";
        
       while(resultado.next()){
      %>
      <tr>
          <td><%=resultado.getInt(id)%></td>
          <td><%= resultado.getString(nombre)%></td>
          <td><%= resultado.getString(apellido)%></td>
          <td><%= resultado.getString(email)%></td>
       </tr>
       
        
      <%
       }
%>
      
                    </tbody>
                    
                </table>
<%
       
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        %>
            </div>
        </div>        
    </body>
</html>


/*  Alumnos con Dao */
<%-- 
    Document   : hola
    Created on : 10 jul. 2021, 23:58:10
    Author     : servilinea
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.AlumnosDAO"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Email</th>
                </tr>
            </thead>
            <tbody>
                <%/*
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/codoacodo";
        String user = "luis";
        String pass = "123456";
        String consulta = "SELECT * FROM usuarios";
        try{
        Connection mysql = DriverManager.getConnection(url, user, pass);
        Statement mostrar = mysql.createStatement();
        ResultSet resultado = mostrar.executeQuery(consulta);
        
        
        String id="id";
        String nombre="nombre";
        String apellido="apellido";
        String email="email";*/
 
        List<Alumnos> resultado=null;
        AlumnosDAO alumno = new AlumnosDAO();
        resultado = alumno.listarALumnos();
        
      /* while(resultado.){*/
      for(int i=0; i < resultado.size(); i++){
      %>
      <tr>
          <td><%= resultado.get(i).getId() %></td>
          <td><%= resultado.get(i).getNombre() %></td>
          <td><%= resultado.get(i).getApellido()%></td>
          <td><%= resultado.get(i).getEmail()%></td>
          <td></td>
       </tr>
       
        
      <%
       }
%>
</tbody>
        </table>
<%
      /* 
        }catch(SQLException e){
            System.out.println(e.toString());
        }*/
        %>
    </body>
</html>


<%-- 
    Document   : alumnos.jsp
    Created on : 6 jul. 2021, 14:53:12
    Author     : servilinea
--%>

<%@page import="modelo.Alumnos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="modelo.AlumnosDAO"%>
<%@page import="config.Conexion"%>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>

        <div class="container">
            
            <h1 class="text-center">Alumnos</h1>
            <div class="row">
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">Email</th>
                        </tr>
                    </thead>
                    <tbody>

               <%
        List<Alumnos> resultado=null;
        AlumnosDAO alumno = new AlumnosDAO();
        resultado = alumno.listarALumnos();
        
      /* while(resultado.){*/
      for(int i=0; i < resultado.size(); i++){
      %>
      <tr>
          <td><%= resultado.get(i).getId() %></td>
          <td><%= resultado.get(i).getNombre() %></td>
          <td><%= resultado.get(i).getApellido()%></td>
          <td><%= resultado.get(i).getEmail()%></td>
          <td></td>
       </tr>
       
        
      <%
       }
%>
      
                    </tbody>
                    
                </table>

            </div>
        </div>        
    </body>
</html>
