<%-- 
    Document   : connection
    Created on : May 31, 2016, 1:34:28 PM
    Author     : vicky
--%>

<%@ page import="java.sql.*" %>
<%!
Connection con;
Statement stat;
ResultSet rs;
ResultSetMetaData md;
%>
<%
//MS Access or SQL Serve
//MySql
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pachore", "root", "");


stat=con.createStatement();
%>
