<%
	String 		userId	= (String)session.getAttribute("sessionUserId");
	
	if(userId == null)
	{
%>
		<script language="javascript">
			alert('sessionOut!!');
			parent.parent.parent.parent.location.href="/admin/user/login.do";
		</script>
<%
	}
%>
