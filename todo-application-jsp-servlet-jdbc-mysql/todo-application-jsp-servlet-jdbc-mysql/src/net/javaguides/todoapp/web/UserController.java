<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
String city_name=request.getParameter("username");
String email=request.getParameter("password");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("C:\\Program Files\\MySQL\\MySQL Workbench 8.0", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into users(fname,lname,username,password)values('"+fname+"','"+lname+"','"+username+"','"+password+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>