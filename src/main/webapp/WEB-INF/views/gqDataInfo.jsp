<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/incloud.jsp" %>
<html>
<%@include file="/common/title.jsp" %>
<script>
	$(function () {
		$('#myTab a:last').tab('show');
	});
	$('#myTab a').click(function (e) {
		e.preventDefault();
		$(this).tab('show');
	});
</script>
<body>
	<%@include file="/common/top.jsp" %>
	<div class="container-fluid" style="margin-top: 5px;">
		<div class="row">
			<%@include file="/common/leftMenu.jsp" %>
			<div class="col-md-10" style="margin-top: 10px;">
			<div class="tab-content">
				<%@include file="/WEB-INF/views/data/top.jsp" %>
			</div>
			<ul class="nav nav-tabs">
				<li><a href="#gqpro" data-toggle="tab">项目详情</a></li>
				<li><a href="#file" data-toggle="tab">图片与附件</a></li>
				<li><a href="#seller" data-toggle="tab">转让方信息</a></li>
				<li><a href="#assess" data-toggle="tab">评估信息</a></li>
				<li><a href="#object" data-toggle="tab">标的企业信息</a></li>
				<li><a href="#finance" data-toggle="tab">标的企业财务信息</a></li>
				<li><a href="#holder" data-toggle="tab">标的企业股东信息</a></li>
				<li><a href="#buyer" data-toggle="tab">受让方信息</a></li>
				<li><a href="#trade" data-toggle="tab">成交信息</a></li>
				<li><a href="#bid" data-toggle="tab">竞价过程信息</a></li>
				<li><a href="#tender" data-toggle="tab">投标记录信息</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="gqpro"><br>
					<%@include file="/WEB-INF/views/data/gqproject.jsp" %>
				</div>
				<div class="tab-pane" id="file"><br>
					<%@include file="/WEB-INF/views/data/fileList.jsp" %>
				</div>
				<div class="tab-pane" id="seller"><br>
					<%@include file="/WEB-INF/views/data/seller.jsp" %>
				</div>
				<div class="tab-pane" id="assess"><br>
					<%@include file="/WEB-INF/views/data/assess.jsp" %>
				</div>
				<div class="tab-pane" id="object"><br>
					<%@include file="/WEB-INF/views/data/object.jsp" %>
				</div>
				<div class="tab-pane" id="finance"><br>
					<%@include file="/WEB-INF/views/data/finance.jsp" %>
				</div>
				<div class="tab-pane" id="holder"><br>
					<%@include file="/WEB-INF/views/data/holderList.jsp" %>
				</div>
				<div class="tab-pane" id="buyer"><br>
					<%@include file="/WEB-INF/views/data/buyerList.jsp" %>
				</div>
				<div class="tab-pane" id="trade"><br>
					<%@include file="/WEB-INF/views/data/tradeList.jsp" %>
				</div>
				<div class="tab-pane" id="bid"><br>
					<%@include file="/WEB-INF/views/data/bidList.jsp" %>
				</div>
				<div class="tab-pane" id="tender"><br>
					<%@include file="/WEB-INF/views/data/tenderList.jsp" %>
				</div>
			</div>
			</div>
		</div>
	</div>
</body>
</html>

