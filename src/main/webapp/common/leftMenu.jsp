<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-md-2">
	<ul id="main-nav" class="main-nav nav nav-tabs nav-stacked" style="">
		<li><a href="#systemSetting" class="nav-header collapsed"
			data-toggle="collapse"> 项目品类 <span
				class="pull-right glyphicon glyphicon-chevron-toggle"></span> </a>
			<ul id="systemSetting" class="nav nav-list secondmenu collapse in"
				style="height: 0px;">
				<c:choose>
					<c:when test="${type =='C01'}">
						<li class="active"><a href="${ctx }/process/index?type=C01">&nbsp;实物资产</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=C01">&nbsp;实物资产</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='C02'}">
						<li class="active"><a href="${ctx }/process/index?type=C02">&nbsp;产股权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=C02">&nbsp;产股权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='C03'}">
						<li class="active"><a href="${ctx }/process/index?type=C03">&nbsp;增资扩股</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=C03">&nbsp;增资扩股</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='FINANCIAL_ASSETS'}">
						<li class="active"><a href="${ctx }/process/index?type=FINANCIAL_ASSETS">&nbsp;金融资产</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=FINANCIAL_ASSETS">&nbsp;金融资产</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='LITIGATION_ASSETS'}">
						<li class="active"><a href="${ctx }/process/index?type=LITIGATION_ASSETS">&nbsp;涉诉资产</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=LITIGATION_ASSETS">&nbsp;涉诉资产</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='ENVIRONMENTAL'}">
						<li class="active"><a href="${ctx }/process/index?type=ENVIRONMENTAL">&nbsp;环境权益</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=ENVIRONMENTAL">&nbsp;环境权益</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='TECHNOLOGICAL'}">
						<li class="active"><a href="${ctx }/process/index?type=TECHNOLOGICAL">&nbsp;技术产权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=TECHNOLOGICAL">&nbsp;技术产权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='FINANCING_SERVER'}">
						<li class="active"><a href="${ctx }/process/index?type=FINANCING_SERVER">&nbsp;融资服务</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=FINANCING_SERVER">&nbsp;融资服务</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='CULTURAL'}">
						<li class="active"><a href="${ctx }/process/index?type=CULTURAL">&nbsp;文化产权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=CULTURAL">&nbsp;文化产权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='FOREST_OWNERSHIP'}">
						<li class="active"><a href="${ctx }/process/index?type=FOREST_OWNERSHIP">&nbsp;林权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=FOREST_OWNERSHIP">&nbsp;林权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='MINERAL_RIGHTS'}">
						<li class="active"><a href="${ctx }/process/index?type=MINERAL_RIGHTS">&nbsp;矿权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=MINERAL_RIGHTS">&nbsp;矿权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='RURAL_PROPERTY'}">
						<li class="active"><a href="${ctx }/process/index?type=RURAL_PROPERTY">&nbsp;农村产权</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/index?type=RURAL_PROPERTY">&nbsp;农村产权</a></li>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${type =='DataParse'}">
						<li class="active"><a href="${ctx }/process/DataParse">&nbsp;统计分析</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="${ctx }/process/DataParse">&nbsp;统计分析</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</li>
	</ul>
</div>