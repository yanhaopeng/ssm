
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.5.1.min.js"></script>
<!-- Bootstrap -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=erZqQUOGY52TcYVnyu12irGPuVrhNG4T"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>所有学生课程信息</h1>
			</div>
		</div>
		<!-- <div class="row">
			<div class=".col-xs-6 .col-md-4 col-md-offset-8">
				<button type="button" class="btn btn-success">新增</button>
				<button type="button" class="btn btn-danger">删除</button>
			</div>
		</div> -->
		<div class="row">
			<dir class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>姓名</th>
						<th>性别</th>
						<th>民族</th>
						<th>课程名称</th>
						<th>课程类型</th>
						<th>课程状态</th>
						<th>分数</th>
					</tr>
					<tr>
						<td>${pageInfo.list.get(0).name}</td>
						<td>${pageInfo.list.get(0).sexname}</td>
						<td>${pageInfo.list.get(0).nationname}</td>
						<td>${pageInfo.list.get(0).classname}</td>
						<td>${pageInfo.list.get(0).classtypename}</td>
						<td>${pageInfo.list.get(0).classstatename}</td>
						<td>${pageInfo.list.get(0).score}</td>
					</tr>
					<tr>
						<td>${pageInfo.list.get(1).name}</td>
						<td>${pageInfo.list.get(1).sexname}</td>
						<td>${pageInfo.list.get(1).nationname}</td>
						<td>${pageInfo.list.get(1).classname}</td>
						<td>${pageInfo.list.get(1).classtypename}</td>
						<td>${pageInfo.list.get(1).classstatename}</td>
						<td>${pageInfo.list.get(1).score}</td>
					</tr>
					
				</table>
			</dir>
		</div>
		<div class="row">
			
		</div>
	</div>
	
	<div id="allmap"></div>
</body>
</html>

<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(116.331398,39.897445);
	map.centerAndZoom(point,12);

	var geolocation = new BMap.Geolocation();
	geolocation.getCurrentPosition(function(r){
		if(this.getStatus() == BMAP_STATUS_SUCCESS){
			var mk = new BMap.Marker(r.point);
			map.addOverlay(mk);
			map.panTo(r.point);
			alert('您的位置：'+r.point.lng+','+r.point.lat);
		}
		else {
			alert('failed'+this.getStatus());
		}        
	},{enableHighAccuracy: true})
	//关于状态码
	//BMAP_STATUS_SUCCESS	检索成功。对应数值“0”。
	//BMAP_STATUS_CITY_LIST	城市列表。对应数值“1”。
	//BMAP_STATUS_UNKNOWN_LOCATION	位置结果未知。对应数值“2”。
	//BMAP_STATUS_UNKNOWN_ROUTE	导航结果未知。对应数值“3”。
	//BMAP_STATUS_INVALID_KEY	非法密钥。对应数值“4”。
	//BMAP_STATUS_INVALID_REQUEST	非法请求。对应数值“5”。
	//BMAP_STATUS_PERMISSION_DENIED	没有权限。对应数值“6”。(自 1.1 新增)
	//BMAP_STATUS_SERVICE_UNAVAILABLE	服务不可用。对应数值“7”。(自 1.1 新增)
	//BMAP_STATUS_TIMEOUT	超时。对应数值“8”。(自 1.1 新增)
</script>

