package com.jmj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeProject {
    private String proTransId;

    private String projectId;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

    private String tradInstitutionName;

    private Date createTime;

    private Date lastUpdate;

    private String projectName;

    private String projectCode;

    private String businessStatus;

    private String projectClassifyCode;

    private String projectType;

    private BigDecimal projectPrice;

    private BigDecimal totalPercent;

    private String proPriceExplain;

    private String totalPercentExplain;

    private Date publishDate;

    private BigDecimal publishDuration;

    private Date expireDate;

    private String preExchangeType;

    private Date selectDate;

    private String zone;

    private String industryCode;

    private Date webBidDateStart;

    private Date webBidDateEnd;

    private String isDeposit;

    private BigDecimal deposit;

    private Date depositDate;

    private Date depositDateEnd;

    private String procontact;

    private String procontactMobile;

    private String procontactEmail;

    private String deptcontact;

    private String deptcontactMobile;

    private String memberOrg;

    private String memberBroker;

    private String memberMobile;

    private String memberEmail;

    private String projectUrl;

    private String webBidUrl;

    private Date terminateDate;

    private String terminateReason;

    private Date pauseDate;

    private String pauseReason;

    private Date resumeDate;

    private String unifiedDealCode;

    private String postPone;

    private String platformCode;

    private String pubServicePlatCode;

    private Date dataTimestamp;

    private String exceptionStatus;

    private String isGz;

    private String imgUrl;

    private String manPostponeReason;

    private Date pickDate;

    private String expireType;

    private String expireCondition;

    private BigDecimal postponeCycle;

    private String reportStatus;

    private Date reportTime;

    private BigDecimal sensitivityStatus;

    private String sensitivityNote;

    private String auditUser;

    private Date auditTime;

    private String auditStatus;

    private String auditOpinion;

    private String relatedprocode;

    private String probroker;

    private String terminateApproval;

    public String getProTransId() {
        return proTransId;
    }

    public void setProTransId(String proTransId) {
        this.proTransId = proTransId == null ? null : proTransId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getTradInstitutionId() {
        return tradInstitutionId;
    }

    public void setTradInstitutionId(String tradInstitutionId) {
        this.tradInstitutionId = tradInstitutionId == null ? null : tradInstitutionId.trim();
    }

    public String getTradInstitutionName() {
        return tradInstitutionName;
    }

    public void setTradInstitutionName(String tradInstitutionName) {
        this.tradInstitutionName = tradInstitutionName == null ? null : tradInstitutionName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus == null ? null : businessStatus.trim();
    }

    public String getProjectClassifyCode() {
        return projectClassifyCode;
    }

    public void setProjectClassifyCode(String projectClassifyCode) {
        this.projectClassifyCode = projectClassifyCode == null ? null : projectClassifyCode.trim();
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public BigDecimal getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(BigDecimal projectPrice) {
        this.projectPrice = projectPrice;
    }

    public BigDecimal getTotalPercent() {
        return totalPercent;
    }

    public void setTotalPercent(BigDecimal totalPercent) {
        this.totalPercent = totalPercent;
    }

    public String getProPriceExplain() {
        return proPriceExplain;
    }

    public void setProPriceExplain(String proPriceExplain) {
        this.proPriceExplain = proPriceExplain == null ? null : proPriceExplain.trim();
    }

    public String getTotalPercentExplain() {
        return totalPercentExplain;
    }

    public void setTotalPercentExplain(String totalPercentExplain) {
        this.totalPercentExplain = totalPercentExplain == null ? null : totalPercentExplain.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public BigDecimal getPublishDuration() {
        return publishDuration;
    }

    public void setPublishDuration(BigDecimal publishDuration) {
        this.publishDuration = publishDuration;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getPreExchangeType() {
        return preExchangeType;
    }

    public void setPreExchangeType(String preExchangeType) {
        this.preExchangeType = preExchangeType == null ? null : preExchangeType.trim();
    }

    public Date getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(Date selectDate) {
        this.selectDate = selectDate;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }

    public Date getWebBidDateStart() {
        return webBidDateStart;
    }

    public void setWebBidDateStart(Date webBidDateStart) {
        this.webBidDateStart = webBidDateStart;
    }

    public Date getWebBidDateEnd() {
        return webBidDateEnd;
    }

    public void setWebBidDateEnd(Date webBidDateEnd) {
        this.webBidDateEnd = webBidDateEnd;
    }

    public String getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(String isDeposit) {
        this.isDeposit = isDeposit == null ? null : isDeposit.trim();
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    public Date getDepositDateEnd() {
        return depositDateEnd;
    }

    public void setDepositDateEnd(Date depositDateEnd) {
        this.depositDateEnd = depositDateEnd;
    }

    public String getProcontact() {
        return procontact;
    }

    public void setProcontact(String procontact) {
        this.procontact = procontact == null ? null : procontact.trim();
    }

    public String getProcontactMobile() {
        return procontactMobile;
    }

    public void setProcontactMobile(String procontactMobile) {
        this.procontactMobile = procontactMobile == null ? null : procontactMobile.trim();
    }

    public String getProcontactEmail() {
        return procontactEmail;
    }

    public void setProcontactEmail(String procontactEmail) {
        this.procontactEmail = procontactEmail == null ? null : procontactEmail.trim();
    }

    public String getDeptcontact() {
        return deptcontact;
    }

    public void setDeptcontact(String deptcontact) {
        this.deptcontact = deptcontact == null ? null : deptcontact.trim();
    }

    public String getDeptcontactMobile() {
        return deptcontactMobile;
    }

    public void setDeptcontactMobile(String deptcontactMobile) {
        this.deptcontactMobile = deptcontactMobile == null ? null : deptcontactMobile.trim();
    }

    public String getMemberOrg() {
        return memberOrg;
    }

    public void setMemberOrg(String memberOrg) {
        this.memberOrg = memberOrg == null ? null : memberOrg.trim();
    }

    public String getMemberBroker() {
        return memberBroker;
    }

    public void setMemberBroker(String memberBroker) {
        this.memberBroker = memberBroker == null ? null : memberBroker.trim();
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile == null ? null : memberMobile.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl == null ? null : projectUrl.trim();
    }

    public String getWebBidUrl() {
        return webBidUrl;
    }

    public void setWebBidUrl(String webBidUrl) {
        this.webBidUrl = webBidUrl == null ? null : webBidUrl.trim();
    }

    public Date getTerminateDate() {
        return terminateDate;
    }

    public void setTerminateDate(Date terminateDate) {
        this.terminateDate = terminateDate;
    }

    public String getTerminateReason() {
        return terminateReason;
    }

    public void setTerminateReason(String terminateReason) {
        this.terminateReason = terminateReason == null ? null : terminateReason.trim();
    }

    public Date getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Date pauseDate) {
        this.pauseDate = pauseDate;
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason == null ? null : pauseReason.trim();
    }

    public Date getResumeDate() {
        return resumeDate;
    }

    public void setResumeDate(Date resumeDate) {
        this.resumeDate = resumeDate;
    }

    public String getUnifiedDealCode() {
        return unifiedDealCode;
    }

    public void setUnifiedDealCode(String unifiedDealCode) {
        this.unifiedDealCode = unifiedDealCode == null ? null : unifiedDealCode.trim();
    }

    public String getPostPone() {
        return postPone;
    }

    public void setPostPone(String postPone) {
        this.postPone = postPone == null ? null : postPone.trim();
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    public String getPubServicePlatCode() {
        return pubServicePlatCode;
    }

    public void setPubServicePlatCode(String pubServicePlatCode) {
        this.pubServicePlatCode = pubServicePlatCode == null ? null : pubServicePlatCode.trim();
    }

    public Date getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(Date dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    public String getExceptionStatus() {
        return exceptionStatus;
    }

    public void setExceptionStatus(String exceptionStatus) {
        this.exceptionStatus = exceptionStatus == null ? null : exceptionStatus.trim();
    }

    public String getIsGz() {
        return isGz;
    }

    public void setIsGz(String isGz) {
        this.isGz = isGz == null ? null : isGz.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getManPostponeReason() {
        return manPostponeReason;
    }

    public void setManPostponeReason(String manPostponeReason) {
        this.manPostponeReason = manPostponeReason == null ? null : manPostponeReason.trim();
    }

    public Date getPickDate() {
        return pickDate;
    }

    public void setPickDate(Date pickDate) {
        this.pickDate = pickDate;
    }

    public String getExpireType() {
        return expireType;
    }

    public void setExpireType(String expireType) {
        this.expireType = expireType == null ? null : expireType.trim();
    }

    public String getExpireCondition() {
        return expireCondition;
    }

    public void setExpireCondition(String expireCondition) {
        this.expireCondition = expireCondition == null ? null : expireCondition.trim();
    }

    public BigDecimal getPostponeCycle() {
        return postponeCycle;
    }

    public void setPostponeCycle(BigDecimal postponeCycle) {
        this.postponeCycle = postponeCycle;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus == null ? null : reportStatus.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public BigDecimal getSensitivityStatus() {
        return sensitivityStatus;
    }

    public void setSensitivityStatus(BigDecimal sensitivityStatus) {
        this.sensitivityStatus = sensitivityStatus;
    }

    public String getSensitivityNote() {
        return sensitivityNote;
    }

    public void setSensitivityNote(String sensitivityNote) {
        this.sensitivityNote = sensitivityNote == null ? null : sensitivityNote.trim();
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    public String getRelatedprocode() {
        return relatedprocode;
    }

    public void setRelatedprocode(String relatedprocode) {
        this.relatedprocode = relatedprocode == null ? null : relatedprocode.trim();
    }

    public String getProbroker() {
        return probroker;
    }

    public void setProbroker(String probroker) {
        this.probroker = probroker == null ? null : probroker.trim();
    }

    public String getTerminateApproval() {
        return terminateApproval;
    }

    public void setTerminateApproval(String terminateApproval) {
        this.terminateApproval = terminateApproval == null ? null : terminateApproval.trim();
    }
}