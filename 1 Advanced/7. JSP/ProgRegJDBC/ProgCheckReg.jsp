<html> 
	<%@ page language="java" import="java.sql.*" %>
	
	<body>
<%		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");  
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select * from JSP.tables");
		ResultSetMetaData rsmd=rs.getMetaData();
		String s="";
%>
		<table border=3>
			<tr>
<%
		for(int i=1 ; i<=rsmd.getColumnCount() ; i++) {
			s="";
			s=s+rsmd.getColumnName(i);
%>
				<th><%= s %></th>
<%
		}
%>
			</tr>
			<tr>
<%
		while(rs.next()) {
			for(int i=1 ; i<=rsmd.getColumnCount() ; i++) {
				s="";
				s=s+rs.getString(i);
%>
				<td><%= s %></td>
<%
			}
%>
			</tr>
<%
		}
%>
				
	</body>
</html>
