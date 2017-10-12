/**
 * Created by jthao on 2016/11/24.
 * 审核状态
 */
function auditStatusTrans(auditStatus){
	if(auditStatus == '1'){
		return "未审核";
	}else if(auditStatus == '2'){
		return "审核不通过";
	}else if(auditStatus == '3'){
		return "审核通过";
	}else{
		return "";
	}
};
/**
 * 业务状态
 */
function businessStatusTrans(businessStatus){
	if(businessStatus == 'A01'){
		return "预挂牌";
	}else if(businessStatus == 'A01-1'){
		return "预挂牌撤牌";
	}else if(businessStatus == 'A02'){
		return "正式挂牌 ";
	}else if(businessStatus == 'A03'){
		return "延牌";
	}else if(businessStatus == 'A04'){
		return "摘牌";
	}else if(businessStatus == 'A05'){
		return "撤牌";
	}else if(businessStatus == 'A06'){
		return "交易成交";
	}else if(businessStatus == 'A07'){
		return "确认交易凭证";
	}else if(businessStatus == 'A08'){
		return "交易中止";
	}else if(businessStatus == 'A09'){
		return "交易恢复";
	}else if(businessStatus == 'A10'){
		return "交易终结";
	}else{
		return "";
	}
};
/**
 * 异常状态
 */
function exceptionStatusTrans(exceptionStatus){
	if(exceptionStatus == '1'){
		return "手工终结";
	}else if(exceptionStatus == '2'){
		return "中止";
	}else if(exceptionStatus == '3'){
		return "恢复 ";
	}else{
		return "";
	}
};
/**
 * 非公开转让项目类型
 */
function goTypeTrans(goType){
	if(goType == '1'){
		return "批准的协议转让";
	}else if(goType == '2'){
		return "无偿划转";
	}else if(goType == '3'){
		return "主辅分离 ";
	}else{
		return "";
	}
};
/**
 * 行权方式
 */
function allowHollPrioTrans(allowHollPrio){
	if(allowHollPrio == 'T'){
		return "场内";
	}else if(allowHollPrio == 'F'){
		return "场外";
	}else{
		return "";
	}
};
/**
 * 业务类型
 */
function projectClassifyCodeTrans(projectClassifyCode){
	if(projectClassifyCode == 'C01'){
		return "实物资产";
	}else if(projectClassifyCode == 'C02'){
		return "产股权";
	}else if(projectClassifyCode == 'C03'){
		return "增资扩股";
	}else{
		return "";
	}
};
/**
 * 资产类型(实物)
 */
function projectTypeTrans(projectType){
	if(projectType == '1'){
		return "房产";
	}else if(projectType == '2'){
		return "土地使用权";
	}else if(projectType == '3'){
		return "交通运输工具";
	}else if(projectType == '4'){
		return "设备";
	}else if(projectType == '5'){
		return "在建工程";
	}else if(projectType == '99'){
		return "其他资产";
	}else{
		return "";
	}
};
/**
 * 交易方式
 */
function exchangeTypeTrans(exchangeType){
	if(exchangeType == '1'){
		return "网络竞价";
	}else if(exchangeType == '2'){
		return "拍卖";
	}else if(exchangeType == '3'){
		return "招投标";
	}else if(exchangeType == '4'){
		return "协议转让（非竞价）";
	}else if(exchangeType == '99'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 是、否
 */
function getTOrF(type){
	if(type == 'T'){
		return "是";
	}else if(type == 'F'){
		return "否";
	}else{
		return "";
	}
};
/**
 * 转让方类别
 */
function sellerTypeTrans(sellerType){
	if(sellerType == '1'){
		return "自然人";
	}else if(sellerType == '2'){
		return "法人";
	}else if(sellerType == '9'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 转让方角色
 */
function sellerRoleTrans(sellerRole){
	if(sellerRole == '01'){
		return "招标人";
	}else if(sellerRole == '02'){
		return "招标代理机构";
	}else if(sellerRole == '03'){
		return "投标人";
	}else if(sellerRole == '04'){
		return "采购人";
	}else if(sellerRole == '05'){
		return "采购代理机构";
	}else if(sellerRole == '06'){
		return "供应商";
	}else if(sellerRole == '07'){
		return "出让人";
	}else if(sellerRole == '08'){
		return "受让人";
	}else if(sellerRole == '09'){
		return "竞得人";
	}else if(sellerRole == '99'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 经济类型
 */
function economyTypeTrans(economyType){
	if(economyType == '1'){
		return "国资监管机构/政府部门";
	}else if(economyType == '2'){
		return "国有独资公司（企业）";
	}else if(economyType == '3'){
		return "国有控股企业";
	}else if(economyType == '4'){
		return "国有事业单位，国有社团等";
	}else if(economyType == '5'){
		return "国有实际控制企业";
	}else if(economyType == '6'){
		return "国有参股企业";
	}else if(economyType == '7'){
		return "非国有企业";
	}else if(economyType == '8'){
		return "外资企业";
	}else if(economyType == '99'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 监管机构
 */
function monitorNameTrans(monitorName){
	if(monitorName == '1'){
		return "国务院国资委监管";
	}else if(monitorName == '2'){
		return "中央其他部委监管";
	}else if(monitorName == '3'){
		return "省级国资委监管";
	}else if(monitorName == '4'){
		return "省级其他部门监管";
	}else if(monitorName == '5'){
		return "市级国资委监管";
	}else if(monitorName == '6'){
		return "市级其他部门监管";
	}else{
		return "";
	}
};
/**
 * 批准文件类型
 */
function authorizeFileTypeTrans(authorizeFileType){
	if(authorizeFileType == '1'){
		return "文件";
	}else if(authorizeFileType == '2'){
		return "董事会决议";
	}else if(authorizeFileType == '3'){
		return "股东会议决议";
	}else if(authorizeFileType == '4'){
		return "批复";
	}else if(authorizeFileType == '5'){
		return "总经理办公会决议";
	}else if(authorizeFileType == '99'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 经营规模
 */
function managerScaleTrans( managerScale){
	if( managerScale == '1'){
		return "大型";
	}else if( managerScale == '2'){
		return "中型";
	}else if( managerScale == '99'){
		return "小型";
	}else{
		return "";
	}
};
/**
 * 企业类型
 */
function economyNatureTrans( economyNature){
	if( economyNature == '1'){
		return "全民所有制企业";
	}else if( economyNature == '2'){
		return "有限责任公司";
	}else if( economyNature == '3'){
		return "股份有限公司";
	}else if( economyNature == '4'){
		return "集体所有制企业";
	}else if( economyNature == '5'){
		return "合伙企业";
	}else if( economyNature == '99'){
		return "其他";
	}else{
		return "";
	}
};
/**
 * 报表类型
 */
function stmtTypeTrans(stmtType){
	if( stmtType == '1'){
		return "月报";
	}else if( stmtType == '2'){
		return "季报";
	}else if( stmtType == '3'){
		return "年报";
	}else{
		return "";
	}
};
/**
 * 付款方式
 */
function paymentTypeTrans(paymentType){
	if( paymentType == '1'){
		return "一次性付款";
	}else if( paymentType == '2'){
		return "分期付款";
	}else{
		return "";
	}
};
/**
 * 资产属性
 */
function propertyTrans(property){
	if( property == '1'){
		return "企业实物资产";
	}else if( property == '2'){
		return "行政事业单位实物资产";
	}else if( property == '3'){
		return "其他";
	}else{
		return "";
	}
};
