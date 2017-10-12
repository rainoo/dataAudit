<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:choose>
	<c:when test="${listCaaeFile.isEmpty() || listCaaeFile.size()<=0}">
		暂无数据！
	</c:when>
	<c:otherwise>
		<table class="table table-bordered">
		<tr><th>附件描述</th><th>附件名称</th><th>附件地址</th><th>附件类型</th></tr>
		<c:forEach items="${listCaaeFile}" var="caaeFile">
			<tr>
				<td>
					<c:choose>
						<c:when test="${caaeFile.fileDesc!=null }">
							${caaeFile.fileDesc }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeFile.fileName!=null }">
							${caaeFile.fileName }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeFile.fileUrl!=null }">
							${caaeFile.fileUrl }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${caaeFile.fileType!=null }">
							${caaeFile.fileType }
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>
