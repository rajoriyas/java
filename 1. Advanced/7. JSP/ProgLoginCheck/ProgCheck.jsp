<html>
	<body>
		<%	String s=request.getParameter("T1");
			String t=request.getParameter("T2");
			if(s.equals("admin") && t.equals("admin") ){	%>
				Welcome to YARA
		<%	}
			else {	%>
				Either name or Password is incorrect <tr>	
				<a href="ProgLogin.jsp">Click Here</a>
		<%	}	%>
	</body>
</html>
