
<%@ page
	language="java"
	import="java.util.*"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link
	rel="stylesheet"
	type="text/css"
	href="plugins/vue/assets/css/iview.css">
<script
	type="text/javascript"
	src="plugins/jquery/jquery-2.1.1.min.js"></script>
<script
	type="text/javascript"
	src="plugins/vue/assets/js/vue.min.js"></script>
<script
	type="text/javascript"
	src="plugins/vue/assets/js/iview.min.js"></script>
<!-- import Vue.js -->
<style>
@import url("//unpkg.com/iview/dist/styles/iview.css");

#app {
	padding: 0px;
}

.layout {
	border: 1px solid #d7dde4;
	background: #f5f7f9;
	position: relative;
	border-radius: 4px;
	overflow: hidden;
}

.layout-logo {
	width: 100px;
	height: 30px;
	background: #5b6270;
	border-radius: 3px;
	float: left;
	position: relative;
	top: 15px;
	left: 20px;
}

.layout-nav {
	width: 420px;
	margin: 0 auto;
	margin-right: 20px;
}

.layout-footer-center {
	text-align: center;
}
</style>
</head>
<body>
	<script src="//unpkg.com/vue/dist/vue.js"></script>
	<script src="//unpkg.com/iview/dist/iview.min.js"></script>
	<div id="app">
		<div class="layout">
			<layout> <i-header> <i-menu
				mode="horizontal"
				theme="dark"
				active-name="1">
			<div class="layout-logo"></div>
			<div class="layout-nav">
				</menu-item>
				<menu-item name="3"> <icon type="ios-analytics"></icon>
				登陆 </menu-item>
				<menu-item name="4"> <icon type="ios-paper"></icon> 注册 </menu-item>
			</div>
			</i-menu> </i-header> <layout :style="{padding: '0 50px'}"> <i-content
				:style="{ minHeight: '280px',padding:'20px 0', background: '#fff'}">
			<layout> <sider
				hide-trigger
				:style="{background: '#fff'}">
			<div id="app">
				<i-menu
					:theme="theme3"
					active-name="1"> <menu-group title="内容管理"> <menu-item
					name="1"> <icon type="document-text"></icon> 文章管理 </menu-item> <menu-item
					name="2"> <icon type="chatbubbles"></icon> 评论管理 </menu-item> </menu-group> <menu-group
					title="统计分析"> <menu-item name="3"> <icon
					type="heart"></icon> 用户留存 </menu-item> <menu-item name="4"> <icon
					type="heart-broken"></icon> 流失用户 </menu-item> </menu-group> </i-menu>
				<br>
			</div>
			</sider> <i-content
				:style="{padding: '24px', minHeight: '600px', background: '#fff'}">
			<div id="app">
				<tabs
					type="card"
					closable @on-tab-remove="handleTabRemove"> <tab-pane
					label="标签一"
					v-if="tab0">标签一的内容</tab-pane> <tab-pane
					label="标签二"
					v-if="tab1">标签二的内容</tab-pane> <tab-pane
					label="标签三"
					v-if="tab2">标签三的内容</tab-pane> </tabs>
			</div>
			</i-content> </layout> </i-content> </layout> <i-footer class="layout-footer-center">2011-2016
			&copy; XXX</i-footer> </layout>
		</div>
	</div>
	</div>
	<script>
		var Main = {

		}

		var Component = Vue.extend(Main)
		new Component().$mount('#app')
	</script>
</body>
</html>
