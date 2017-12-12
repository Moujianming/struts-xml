<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" %>
  <%-- <%@ taglib prefix="s" uri="/struts-tags" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addProduct</title>
</head>
<body>
<form action="addProduct">
<input type="text" name="product.name" value="${param.name }"> 
<br>
<input type="submit" value="submit">
</form>
<%-- <s:form action="addProduct">
<s:textfield name="product.name" label="product name" value="${param.name}"></s:textfield>
<s:submit value="submit"></s:submit>
</s:form> --%>

</body>
</html>