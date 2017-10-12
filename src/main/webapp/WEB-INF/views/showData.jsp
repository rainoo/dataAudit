<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
var data_openurl_manager={root:'${ctx}'};
</script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/common/title.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${ctx }/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="${ctx }/css/style.css" rel="stylesheet" type="text/css">
<link href="${ctx }/css/jquery.datetimepicker.css" rel="stylesheet"
	type="text/css">
<style type="text/css">
table thead tr th {
	overflow: hidden;
}
</style>
</head>

<body>
	<%@include file="/common/top.jsp"%>

	<div class="container-fluid" style="margin-top: 5px;">
		<div class="row">
			<%@include file="/common/leftMenu.jsp"%>
			<div class="col-md-10" style="margin-top: 10px;">
				<form class="form-horizontal" id="formData">
					<input type="hidden" name="projectClassifyCode" value="${type }"/>
					<div class="form-group">
						<label class="col-sm-2 control-label">项目编号：</label>
						<div class="col-sm-3">
							<input class="form-control" id="projectId" name="projectCode">
						</div>
						<label class="col-sm-2 control-label">项目名称关键字：</label>
						<div class="col-sm-3">
							<input class="form-control" id="projectName" name="projectName">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">资产分类：</label>
						<div class="col-sm-3">
							<select class="form-control" id="isGz" name="isGz">
								<option value="all">所有</option>
								<option value="T">国有</option>
								<option value="F">民营</option>
							</select>
						</div>
						<label class="col-sm-2 control-label">上报日期：</label>
						<div class="col-sm-3">
							<input class="form-control" style="display: inline-block;width: 48%" type="text" id="datetimepicker_mask1" name="time1"/>-
							<input class="form-control" style="display: inline-block;width: 48%" type="text" id="datetimepicker_mask2" name="time2"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">标的行业：</label>
						<div class="col-sm-3">
							<select class="form-control" id="industryCode"
								name="industryCode">
								<option value="all">所有</option>
								<option value="T">农、林、牧、渔业</option>
								<option value="F">采矿业</option>
							</select>
						</div>
						<label class="col-sm-2 control-label">项目标的挂牌价格（元）：</label>
						<div class="col-sm-3">
							<input class="form-control" id="projectPrice" name="projectPrice">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">项目状态：</label>
						<div class="col-sm-3">
							<select class="form-control" id="businessStatus" name="businessStatus">
								<option value="all">所有</option>
								<option value="A01">预挂牌</option>
								<option value="A02">挂牌中</option>
								<option value="A04">挂牌结束摘牌</option>
								<option value="A05">终结挂牌撤牌</option>
								<option value="A03">延长挂牌延牌</option>
								<option value="A06">交易成交</option>
								<option value="A08">交易中止</option>
								<option value="A09">交易恢复</option>
								<option value="A10">交易终结</option>
								<option value="A07">项目交割</option>
							</select>
						</div>
						<label class="col-sm-2 control-label">审核状态：</label>
						<div class="col-sm-3">
							<select class="form-control" id="auditStatus" name="auditStatus">
								<option value="0">所有</option>
								<option value="1">未审核</option>
								<option value="2">未通过</option>
								<option value="3">已过审</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">上报机构：</label>
						<div class="col-sm-3">
							<input class="form-control" id="tradInstitutionName" name="tradInstitutionName">
						</div>
						<label class="col-sm-2 control-label">所在区域：</label>
						<div class="col-sm-3">
							<input class="form-control" id="zone" name="zone">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">错误状态：</label>
						<div class="col-sm-3">
							<input class="form-control" id="sensitivityStatus" name="sensitivityStatus">
						</div>
					</div>
				</form>
				<div style="text-align: center;margin-bottom: 10px;">
					<button class="btn btn-primary" id="selectData"
						onclick="selectDataBy();">查询</button>
				</div>
				<button class="btn btn-default" style="margin-bottom: 10px;" id="batchAudit">批量审核</button>
				<div id="mainContent"></div>
				<div style="text-align: center;">
					<div id="callBackPager"></div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript" src="${ctx }/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${ctx }/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${ctx }/js/extendPagination.js"></script>
	<script type="text/javascript" src="${ctx }/js/colResizable-1.6.min.js"></script>
	<script type="text/javascript"
		src="${ctx }/js/jquery.datetimepicker.full.min.js"></script>
	<script type="text/javascript">
	$.datetimepicker.setLocale('zh');
	$('#datetimepicker_mask1').datetimepicker({format:'Y/m/d',timepicker:false});
	$('#datetimepicker_mask2').datetimepicker({format:'Y/m/d',timepicker:false});
	callBackPagination(${totalCount},10,25);
	function selectDataBy(){
		$.ajax({
			type: "post",
			async:false,
			url:data_openurl_manager.root+'/process/select',
			data:$('#formData').serialize(),
			dataType: "json",
			success:function(data){
				 callBackPagination(data.totalCount,10,25);
			},
			 error: function() {
	                alert("网络异常");
	            }
		});
	}
    function callBackPagination(totalCount1,showCount1,limit) {
        var totalCount = Number(totalCount1) || 0, showCount = showCount1,
                limit = Number(limit) || 10;

        createTable(1, limit, totalCount);

        $('#callBackPager').extendPagination({

            totalCount: totalCount,

            showCount: showCount,

            limit: limit,

            callback: function (curr, limit, totalCount) {

               createTable(curr, limit, totalCount);

            }

        });

    }

    function createTable(currPage, limit, total) {
    
    	if(total==0){
    		 var mainObj = $('#mainContent');
		        mainObj.empty();
		        mainObj.html('<span>无数据！</span>');
    		return null;
    	}
        var html = [], showNum = limit;

        if (total - (currPage * limit) < 0) showNum = total - ((currPage - 1) * limit);

        html.push(' <table class="table table-bordered" style="table-layout:fixed;text-align: center;">');

        html.push('<thead><tr><th style="text-align: center;width:30px;"><input type="checkbox" id="checkAll" name="chk_all"/></th><th style="word-break: keep-all;white-space:nowrap;">项目编号</th><th style="word-break: keep-all;white-space:nowrap;">错误状态</th><th style="word-break: keep-all;white-space:nowrap;">错误提示</th><th style="word-break: keep-all;white-space:nowrap;">审核状态</th><th style="word-break: keep-all;white-space:nowrap;">审核原因</th><th style="word-break: keep-all;white-space:nowrap;">资产分类</th><th style="word-break: keep-all;white-space:nowrap;">上报机构</th><th style="word-break: keep-all;white-space:nowrap;">所在区域</th><th style="word-break: keep-all;white-space:nowrap;">项目标的名称</th><th style="word-break: keep-all;white-space:nowrap;">标的行业</th><th style="word-break: keep-all;white-space:nowrap;">挂牌价格(元)</th><th style="word-break: keep-all;white-space:nowrap;">上报日期</th><th style="word-break: keep-all;white-space:nowrap;">项目状态</th></tr></thead><tbody>');
		$.ajax({
			type: "post",
			async:false,
			url:data_openurl_manager.root+'/process/show?currPage='+currPage+'&limit='+limit,
			data:$('#formData').serialize(),
			dataType: "html",
			success:function(data){
				html.push(data);
			},
			error: function() {
	        	alert("网络异常");
	        }
		});

        html.push('</tbody></table>');

        var mainObj = $('#mainContent');

        mainObj.empty();

        mainObj.html(html.join(''));
        
    }
    $("#checkAll").click(function(){
    	if(this.checked){
    		$("input[name='chk_list']").prop("checked",true);
    	}else{
    		$("input[name='chk_list']").prop("checked",false);
    	}
	});
	$("input[name='chk_list']").click(function(){
		if(!this.checked){
			$("#checkAll").prop("checked",false);
		}
	});
	$("#batchAudit").click(function(){
		var varArr=new Array;
		$("input[name='chk_list']:checkbox").each(function(){
			if(this.checked){
				varArr.push($(this).val());
			}
		});
		var vals=varArr.join(',');
		if(vals.length>0){
			if(confirm("批量审核时，只能将选中的记录设置为已过审状态！")){
				$.ajax({
					type: "post",
					async:false,
					url:data_openurl_manager.root+'/process/audit',
					data:{auditData:vals},
					dataType: "json",
					success:function(data){
						if(data.msg=='T'){
							alert('审核成功');
						}else{
							alert('审核失败');
						}
						window.location=data_openurl_manager.root+"/process/index?type="+'${type}';
					},
					error: function() {
			        	alert("网络异常");
			        	window.location=data_openurl_manager.root+"/process/index?type="+'${type}';
			        }
				});
			}
		}else{
			alert("未选择需要审核的数据！");
		}
	});
    $("table").colResizable();
</script>
</body>
</html>
