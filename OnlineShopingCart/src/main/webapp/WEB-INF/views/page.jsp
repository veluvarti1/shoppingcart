<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath }" />

<spring:url var="css" value="/static/css"></spring:url>
<spring:url var="js" value="/static/js"></spring:url>
<spring:url var="images" value="/static/images"></spring:url>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online shopping  ${title} </title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<script type="text/javascript">
		window.menu= '${title}';
	</script>

</head>

<body>
<div class="wrapper">
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<c:if test="${userClickHome == true }">
	<%@include file="home.jsp"%>
	</c:if>

	<c:if test="${userClickAbout == true }">
	<%@include file="about.jsp"%>
	</c:if>

	<c:if test="${userClickContact == true }">
	<%@include file="contact.jsp"%>
	</c:if>

	<c:if test="${userClickCategory == true or userClickAllProducts == true}">
	<%@include file="listProducts.jsp"%>
	</c:if>
	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>