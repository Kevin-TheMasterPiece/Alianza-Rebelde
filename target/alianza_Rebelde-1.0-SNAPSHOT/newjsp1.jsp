<%-- 
    Document   : newjsp
    Created on : 21/03/2023, 10:20:04 a. m.
    Author     : WORKING
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss2.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
     
        <%@ page import="paquete1.*" %>
        <h1>
        <%     
       String info = "";
        
       double cant_Parsec = Double.parseDouble(request.getParameter("num_Parsec"));
        
        
       Nave n = new Nave(cant_Parsec);
       info+=n.mostrar_info();
       
       int capacidad_ha = Integer.parseInt(request.getParameter("capacidad_h"));
       int consumoHA = Integer.parseInt(request.getParameter("consumoH"));
       int cant_Naves_h = Integer.parseInt(request.getParameter("cant_Naves_h"));

       Halcon_Milenario h = new Halcon_Milenario(capacidad_ha, consumoHA, cant_Naves_h, cant_Parsec);
       info+=h.informacion();
       
       int capacidad_d = Integer.parseInt(request.getParameter("capacidad_d"));
       double consumo_d = Double.parseDouble(request.getParameter("consumo_Litros_d"));
       int cant_Naves_d = Integer.parseInt(request.getParameter("cant_Naves_d"));

       Destructor_Estelar d = new Destructor_Estelar(capacidad_d, consumo_d, cant_Naves_d, cant_Parsec);
       info+=d.informacion();
       
       int capacidad_l = Integer.parseInt(request.getParameter("capacidad_l"));
       double consumo_l = Double.parseDouble(request.getParameter("consumo_Litros_l"));
       int cant_Naves_l = Integer.parseInt(request.getParameter("cant_Naves_l"));
       
       Lanzadera_imperial l = new Lanzadera_imperial(capacidad_l, consumo_l, cant_Naves_l, cant_Parsec);
       info+=l.informacion();
       

       int capacidad_AT = Integer.parseInt(request.getParameter("capacidad_AT"));
       double consumo_AT = Double.parseDouble(request.getParameter("consumo_Litros_AT"));
       int cant_Naves_AT = Integer.parseInt(request.getParameter("cant_Naves_AT"));
       
       At_At at = new At_At(capacidad_AT, consumo_AT, cant_Naves_AT, cant_Parsec);
       info+= at.informacion();



       int capacidadsu = Integer.parseInt(request.getParameter("capacidadSu"));
       
       int navTs = Integer.parseInt(request.getParameter("navt_s"));
       
       double consumoSu = Double.parseDouble(request.getParameter("consumoLitrosd"));
       
       int cantNvSu= Integer.parseInt(request.getParameter("cant_Naves_s"));
       
       Supremacy s = new Supremacy(capacidadsu, consumoSu, cantNvSu, navTs, cant_Parsec);
       info+=s.informacion();
       
       info+="EL TOTAL DE COMBUSTIBLE NECESARIO ES: "+(h.calcular_Combustible_Necesario(consumoHA, cant_Parsec)+
               d.calcular_Combustible_Necesario(consumo_d, cant_Parsec)+l.calcular_Combustible_Necesario(consumo_l, cant_Parsec)+
               at.calcular_Combustible_Necesario(consumo_AT, cant_Parsec)+s.calcular_Combustible_Necesario(consumoSu, cant_Parsec, navTs))+" litros";
       

        %>
        
       
       </h1>
        
        <form class="txt">
            <p><%=info%></p>
        </form>
        
        
        

    </body>
</html>
