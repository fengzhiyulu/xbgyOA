<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
 %>
		  <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/bootstrap.css">
		   <link rel="stylesheet" type="text/css" href="${path}/bootstrap/css/index.css">
    	  <script src="${path}/bootstrap/js/jquery-1.9.1.min.js"></script>
    	  <script src="${path}/bootstrap/js/bootstrap.min.js"></script>
