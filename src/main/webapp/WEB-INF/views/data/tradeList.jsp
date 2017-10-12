<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${listCaaeTrade.isEmpty() || listCaaeTrade.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>受让方名称</th><th>成交金额</th><th>成交日期</th><th>交易方式</th><th>组织交易时间</th></tr>
		<c:forEach items="${listCaaeTrade}" var="caaeTrade">
			<tr>
				<td><a href="${ctx }/proinfo/selectTrade?tradeId=${caaeTrade.tradeId }">${caaeTrade.buyerName }</a></td>
				<td>
					<c:choose>
						<c:when test="${caaeTrade.tradeValue!=null }">
							${caaeTrade.tradeValue }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeTrade.tradeDate!=null }">
							${caaeTrade.tradeDate }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeTrade.exchangeType!=null }">
							${caaeTrade.exchangeType }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeTrade.transactionTime!=null }">
							${caaeTrade.transactionTime }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>
