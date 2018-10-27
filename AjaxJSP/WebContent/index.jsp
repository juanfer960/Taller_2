<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Ajax</title>
	<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('#bttHello').click(function(){
				
				var fullname = $('#fullname').val();
				
				$.ajax({
					url:'ajaxController',
					type:'POST',
					//dataType: 'json',
					data:{fullname : fullname},
					//contentType: 'application/json',
			        //mimeType: 'application/json',
					success: function(result){
						$.each( result.communities, function( key, value ) {
							  alert( key + ": " + value.community);
							});
						//$('#result1').html(result.communities.get("community"));
					},
					error: function (err) {
		                alert(err);
		            }
				});
			});
		});
	</script>
</head>
<body>
	<form>
		Name <input type="text" id="fullname">
		<input type="button" value="hello" id="bttHello">
		<br>
		<span id="result1"></span>
	</form>
	
</body>
</html>