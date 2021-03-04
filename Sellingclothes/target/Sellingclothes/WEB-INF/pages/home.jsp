<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  
<style>
* {
  box-sizing: border-box;
}
body  {
  background-color: skyblue;
  margin: 0;
  font-family: Arial, Helvetica, Times New Roman;
  
}

.topnav {
  overflow: hidden;
 background-color: grey;
}
.topnav a {
  float: right;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 14px;
}

.topnav a:hover {
  background-color: yellow;
  color: black;
}

.column {
  float: left;
  width: 33%;
  padding: 5px;
}

.columntext {
  width: 50%
  text-align: center;
  padding: 10px;  
 font-size: 14px;

   }
</style>
</head>
 <body>
 <div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="login">Login</a>
  <a href="#about">About</a>
  <a href="#contact">Contact</a>
</div>
<div class="bgv">
<div class="row">
  <div class="column">
  <img src="<c:url value='/resources/images/image1.jpg'/>" height="100px"  width="100px">
   
   <div class="columntext">
   <pre>
Name:Dress1
Price:500Rs
Type:pink
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>
 </div>

<div class="column">
    <img src="<c:url value='/resources/images/image2.jpg'/>" height="100px" width="100px">
   <div class="columntext">
   <pre>
Name:Dress2
Price:600Rs
Type:Cotton Long
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>



<div class="column">
    <img src="<c:url value='/resources/images/image3.jpg'/>" height="100px" width="100px">
    <div class="columntext">
   <pre>
Name:Dress3
Price:600Rs
Type: Kurta Sets
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>


<div class="row">
<div class="column">
<img src="<c:url value='/resources/images/image4.jpg'/>" height="100px" width="100px">
   <div class="columntext">
   <pre>
Name:Dress4
Price:500Rs
Type:Silk Saree
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>


<div class="column">
    <img src="<c:url value='/resources/image/img5.jpg'/>" height="400px" width="400px">
  <div class="columntext">
   <pre>
Name:product5
Price:800Rs
Type: Eye cream
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>


<div class="column">
   <img src="<c:url value='/resources/image/img6.jpg'/>" height="400px" width="400px">
  <div class="columntext">
   <pre>
Name:product6
Price:900Rs
Type: Hair oil
<a href="">ClickHere</a> to Buy
</pre>
  
 </div>
 </div>


 </body>
</html>