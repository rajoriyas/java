<html>
<%@	page language="java" import="java.sql.*"	%>
	<body>
<%		String s,t,u;
		s=request.getParameter("T1");
		t=request.getParameter("T2");	
		u=request.getParameter("T3");
		Class.forName("com.mysql.jdbc.Driver");  
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajoriyas","root","root");  
		String sql="insert into JSP.tables values(?,?,?,?)";
		PreparedStatement pst=cn.prepareStatement(sql);

		int n=1;
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select * from JSP.tables");
		if(rs.next()) {
			while(rs.next()) {
				n=rs.getInt(1);	
			}
			n=n+1;
		}
		pst.setInt(1,n);
		pst.setString(2,s);
		pst.setString(3,t);
		pst.setString(4,u);	
		pst.executeUpdate();
%>
		Your Id = <%= n %>
	</body>
</html>
