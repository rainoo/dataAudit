package com.jmj.entity;

import java.math.BigDecimal;

public class SwCaaeProject {
    private String uuid;

    private String proTransId;

    private String importantInfo;

    private String buyerPostulate;

    private String hasPriority;

    private String property;

    private String catalog;

    private String description;

    private String transferNotes;

    private String isBind;

    private Integer limitTime;

    private String allowEndPrio;

    private String allowHollPrio;

    private String allowEndBid;

    private String isCommission;

    private BigDecimal comPercent;

    private BigDecimal commission;

    private String incrementGroup;

    private String incrementValue;

    private String projectId;

    private String tradInstitutionId;

    private String businessStatus;

    private String projectClassifyCode;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getProTransId() {
        return proTransId;
    }

    public void setProTransId(String proTransId) {
        this.proTransId = proTransId == null ? null : proTransId.trim();
    }

    public String getImportantInfo() {
        return importantInfo;
    }

    public void setImportantInfo(String importantInfo) {
        this.importantInfo = importantInfo == null ? null : importantInfo.trim();
    }

    public String getBuyerPostulate() {
        return buyerPostulate;
    }

    public void setBuyerPostulate(String buyerPostulate) {
        this.buyerPostulate = buyerPostulate == null ? null : buyerPostulate.trim();
    }

    public String getHasPriority() {
        return hasPriority;
    }

    public void setHasPriority(String hasPriority) {
        this.hasPriority = hasPriority == null ? null : hasPriority.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTransferNotes() {
        return transferNotes;
    }

    public void setTransferNotes(String transferNotes) {
        this.transferNotes = transferNotes == null ? null : transferNotes.trim();
    }

    public String getIsBind() {
        return isBind;
    }

    public void setIsBind(String isBind) {
        this.isBind = isBind == null ? null : isBind.trim();
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public String getAllowEndPrio() {
        return allowEndPrio;
    }

    public void setAllowEndPrio(String allowEndPrio) {
        this.allowEndPrio = allowEndPrio == null ? null : allowEndPrio.trim();
    }

    public String getAllowHollPrio() {
        return allowHollPrio;
    }

    public void setAllowHollPrio(String allowHollPrio) {
        this.allowHollPrio = allowHollPrio == null ? null : allowHollPrio.trim();
    }

    public String getAllowEndBid() {
        return allowEndBid;
    }

    public void setAllowEndBid(String allowEndBid) {
        this.allowEndBid = allowEndBid == null ? null : allowEndBid.trim();
    }

    public String getIsCommission() {
        return isCommission;
    }

    public void setIsCommission(String isCommission) {
        this.isCommission = isCommission == null ? null : isCommission.trim();
    }

    public BigDecimal getComPercent() {
        return comPercent;
    }

    public void setComPercent(BigDecimal comPercent) {
        this.comPercent = comPercent;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getIncrementGroup() {
        return incrementGroup;
    }

    public void setIncrementGroup(String incrementGroup) {
        this.incrementGroup = incrementGroup == null ? null : incrementGroup.trim();
    }

    public String getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(String incrementValue) {
        this.incrementValue = incrementValue == null ? null : incrementValue.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getTradInstitutionId() {
        return tradInstitutionId;
    }

    public void setTradInstitutionId(String tradInstitutionId) {
        this.tradInstitutionId = tradInstitutionId == null ? null : tradInstitutionId.trim();
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
}