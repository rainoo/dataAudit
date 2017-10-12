<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="<%=!UtilCommon.objectNotNull(caaeProject)%>">
		暂无数据！
	</c:when>
	<c:otherwise>
		<form class="form-horizontal">
		<div class="form-group">
			<label class="col-sm-2 control-label">项目名称：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectName())?caaeProject.getProjectName():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">项目编号：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectCode())?caaeProject.getProjectCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">创建时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getCreateTime(),"3") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">最后更新时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getLastUpdate(),"3") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">统一交易标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getUnifiedDealCode())?caaeProject.getUnifiedDealCode():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">项目分类代码：</label>
			<div class="col-sm-3">
				<input class="form-control" id="projectClassifyCode" value="<%=caaeProject.getProjectClassifyCode() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">转让行为批准单位：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getAuthorizeUnit())?gqCaaeProject.getAuthorizeUnit():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">转让比例：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getTotalPercent())?caaeProject.getTotalPercent():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">资产类别：</label>
			<div class="col-sm-3">
				<input class="form-control" id="projectType" value="<%=caaeProject.getProjectType() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">挂牌价格：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getProjectPrice())?caaeProject.getProjectPrice():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">挂牌起止日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getPublishDate(),"1")%> 至 <%=UtilCommon.dateFormater(caaeProject.getExpireDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">挂牌期间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getPublishDuration())?caaeProject.getPublishDuration():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否自动延期：</label>
			<div class="col-sm-3">
				<input class="form-control" id="postPone" value="<%=caaeProject.getPostPone() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">交易方式：</label>
			<div class="col-sm-3">
				<input class="form-control" id="preExchangeType" value="<%=caaeProject.getPreExchangeType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">管理层是否有收购意向：</label>
			<div class="col-sm-3">
				<input class="form-control" id="managementIntent" value="<%=gqCaaeProject.getManagementIntent() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">标的企业原股东是否放弃行使优先购买权：</label>
			<div class="col-sm-3">
				<input class="form-control" id="giveUpPriority" value="<%=gqCaaeProject.getGiveUpPriority() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否捆绑转让：</label>
			<div class="col-sm-3">
				<input class="form-control" id="managementIntent" value="<%=gqCaaeProject.getIsBind() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">是否实际控制权转移：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=gqCaaeProject.getGetControllingInterest() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构网站链接：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getProjectUrl())?caaeProject.getProjectUrl():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">网络竞价系统的链接：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPreExchangeType())?caaeProject.getPreExchangeType():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易系统标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPlatformCode())?caaeProject.getPlatformCode():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">公共服务平台标识码：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPubServicePlatCode())?caaeProject.getPubServicePlatCode():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">数据时间戳：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDataTimestamp(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">业务状态：</label>
			<div class="col-sm-3">
				<input class="form-control" id="status" value="<%=caaeProject.getBusinessStatus() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">异常状态：</label>
			<div class="col-sm-3">
				<input class="form-control" id="exceptionStatus" value="<%=caaeProject.getExceptionStatus() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">非公开转让项目类型：</label>
			<div class="col-sm-3">
				<input class="form-control" id="goType" value="<%=gqCaaeProject.getGoType() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">撤牌时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getPickDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">选择交易方式日期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getSelectDate(),"1") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">网络竞价开始时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getWebBidDateStart(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">网络竞价结束时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getWebBidDateEnd(),"2") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">延牌条件：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getExpireCondition())?caaeProject.getExpireCondition():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">延牌周期：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getPostponeCycle())?caaeProject.getPostponeCycle():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否交纳保证金：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isDeposit" value="<%=caaeProject.getIsDeposit() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">保证金金额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(caaeProject.getDeposit())?caaeProject.getDeposit():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">保证金交纳开始时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDepositDate(),"2") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">保证金交纳结束时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getDepositDateEnd(),"2") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">恢复时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getResumeDate(),"1") %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">终结时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getTerminateDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">终结原因：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getTerminateReason())?caaeProject.getTerminateReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">中止时间：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.dateFormater(caaeProject.getPauseDate(),"1") %>" readonly>
			</div>
			<label class="col-sm-2 control-label">中止原因：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getPauseReason())?caaeProject.getPauseReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">限时报价期（秒）：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.integerNotNull(gqCaaeProject.getLimitTime())?gqCaaeProject.getLimitTime():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否允许事后行权：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowEndPrio" value="<%=gqCaaeProject.getAllowEndPrio() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">行权方式：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowHollPrio" value="<%=gqCaaeProject.getAllowHollPrio() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">是否允许最高报价人追加报价：</label>
			<div class="col-sm-3">
				<input class="form-control" id="allowEndBid" value="<%=gqCaaeProject.getAllowEndBid() %>" readonly>
			</div>
			<label class="col-sm-2 control-label">是否收取服务费：</label>
			<div class="col-sm-3">
				<input class="form-control" id="isCommission" value="<%=gqCaaeProject.getIsCommission() %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">服务费比例：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(gqCaaeProject.getComPercent())?gqCaaeProject.getComPercent():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">服务费金额：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.bigDecimalNotNull(gqCaaeProject.getCommission())?gqCaaeProject.getCommission():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">加价幅度分组：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getIncrementGroup())?gqCaaeProject.getIncrementGroup():"" %>" readonly>
			</div>
			<label class="col-sm-2 control-label">加价幅度分组值：</label>
			<div class="col-sm-3">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getIncrementValue())?gqCaaeProject.getIncrementValue():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构负责人：</label>
			<div class="col-sm-8">
				<input class="form-control" value="负责人：<%=UtilCommon.strNotNull(caaeProject.getProcontact())?caaeProject.getProcontact():"" %>；联系方式：<%=UtilCommon.strNotNull(caaeProject.getProcontactMobile())?caaeProject.getProcontactMobile():"" %>；邮箱地址：<%=UtilCommon.strNotNull(caaeProject.getProcontactEmail())?caaeProject.getProcontactEmail():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">交易机构部门负责人：</label>
			<div class="col-sm-8">
				<input class="form-control" value="负责人：<%=UtilCommon.strNotNull(caaeProject.getDeptcontact())?caaeProject.getDeptcontact():"" %>；联系方式：<%=UtilCommon.strNotNull(caaeProject.getDeptcontactMobile())?caaeProject.getDeptcontactMobile():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">会员机构名称：</label>
			<div class="col-sm-8">
				<input class="form-control" value="会员机构名称：<%=UtilCommon.strNotNull(caaeProject.getMemberOrg())?caaeProject.getMemberOrg():"" %>；会员经纪人：<%=UtilCommon.strNotNull(caaeProject.getMemberBroker())?caaeProject.getMemberBroker():"" %>；联系方式<%=UtilCommon.strNotNull(caaeProject.getMemberMobile())?caaeProject.getMemberMobile():"" %>；邮箱地址：<%=UtilCommon.strNotNull(caaeProject.getMemberEmail())?caaeProject.getMemberEmail():"" %>；" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">重要信息披露：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getImportantInfo())?gqCaaeProject.getImportantInfo():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">受让方资格条件：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getBuyerPostulate())?gqCaaeProject.getBuyerPostulate():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">与转让相关的其他条件：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(gqCaaeProject.getOtherConditions())?gqCaaeProject.getOtherConditions():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">手动延牌原因：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getManPostponeReason())?caaeProject.getManPostponeReason():"" %>" readonly>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">挂牌期满后如未征集到约定数量的意向投资方的处理方式：</label>
			<div class="col-sm-8">
				<input class="form-control" value="<%=UtilCommon.strNotNull(caaeProject.getExpireType())?caaeProject.getExpireType():"" %>" readonly>
			</div>
		</div>
		</form>
	</c:otherwise>
</c:choose>
<script>
	$("#projectClassifyCode").val(projectClassifyCodeTrans("<%=caaeProject.getProjectClassifyCode() %>"));
	$("#projectType").val(projectTypeTrans("<%=caaeProject.getProjectType() %>"));
	$("#postPone").val(getTOrF("<%=caaeProject.getPostPone() %>"));
	$("#managementIntent").val(getTOrF("<%=gqCaaeProject.getManagementIntent() %>"));
	$("#giveUpPriority").val(getTOrF("<%=gqCaaeProject.getGiveUpPriority() %>"));
	$("#preExchangeType").val(exchangeTypeTrans("<%=caaeProject.getPreExchangeType() %>"));
	$("#status").val(businessStatusTrans("<%=caaeProject.getBusinessStatus() %>"));
	$("#exceptionStatus").val(exceptionStatusTrans("<%=caaeProject.getExceptionStatus() %>"));
	$("#goType").val(goTypeTrans("<%=gqCaaeProject.getGoType() %>"));
	$("#isDeposit").val(getTOrF("<%=caaeProject.getIsDeposit() %>"));
	$("#allowEndPrio").val(getTOrF("<%=gqCaaeProject.getAllowEndPrio() %>"));
	$("#allowHollPrio").val(allowHollPrioTrans("<%=gqCaaeProject.getAllowHollPrio() %>"));
	$("#allowEndBid").val(getTOrF("<%=gqCaaeProject.getAllowEndBid() %>"));
	$("#isCommission").val(getTOrF("<%=gqCaaeProject.getIsCommission() %>"));
	$("#isBind").val(getTOrF("<%=gqCaaeProject.getIsBind() %>"));
</script>