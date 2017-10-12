<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="${listCaaeBidinfo.isEmpty() || listCaaeBidinfo.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>竞买人</th><th>报价序号</th><th>报价金额</th></tr>
		<c:forEach items="${listCaaeBidinfo}" var="caaeBidinfo">
			<tr>
				<td>
					<c:choose>
						<c:when test="${caaeBidinfo.bidder!=null }">
							${caaeBidinfo.bidder }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeBidinfo.bidNo!=null }">
							${caaeBidinfo.bidNo }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeBidinfo.bidPrice!=null }">
							${caaeBidinfo.bidPrice }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>
