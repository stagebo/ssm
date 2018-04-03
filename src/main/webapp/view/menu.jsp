
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>iview example</title>
<link rel="stylesheet" type="text/css"
	href="plugins/vue/assets/css/iview.css">
<script type="text/javascript" src="plugins/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="plugins/vue/assets/js/vue.min.js"></script>
<script type="text/javascript" src="plugins/vue/assets/js/iview.min.js"></script>
<!-- import Vue.js -->

</head>
<body>
	<div id="app">
		<i-button @click="show">Click me!</i-button>
		<Modal v-model="visible" title="Welcome">Welcome to iView <i-button
			@click="hide">隐藏</i-button> </Modal>
	</div>
	<div id="app1"></div>
	<script>
		var welcome = new Vue({
			el : '#app',
			data : {
				visible : false
			},
			methods : {
				show : function() {
					this.visible = true;
				},
				hide : function() {
					this.visible = false;
				}
			}
		})
	</script>
</body>
</html>
