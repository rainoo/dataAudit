package com.jmj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeAssess {
    private String assessId;

    private String proTransId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionName;

    private String projectType;

    private String evaluateUnit;

    private String approveUnit;

    private Date approveDate;

    private Date evaluateDate;

    private String evaluateDateAuditor;

    private BigDecimal evaluateAsset;

    private BigDecimal evaluateEquity;

    private BigDecimal evaluateDebt;

    private BigDecimal bookAsset;

    private BigDecimal bookEquity;

    private BigDecimal bookDebt;

    private BigDecimal objectEvaluateValue;

    private String lawFirm;

    private String projectId;

    private String tradInstitutionId;

    private String businessStatus;

    private String projectClassifyCode;

    public String getAssessId() {
        return assessId;
    }

    public void setAssessId(String assessId) {
        this.assessId = assessId == null ? null : assessId.trim();
    }

    public String getProTransId() {
        return proTransId;
    }

    public void setProTransId(String proTransId) {
        this.proTransId = proTransId == null ? null : proTransId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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

    public String getTradInstitutionName() {
        return tradInstitutionName;
    }

    public void setTradInstitutionName(String tradInstitutionName) {
        this.tradInstitutionName = tradInstitutionName == null ? null : tradInstitutionName.trim();
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public String getEvaluateUnit() {
        return evaluateUnit;
    }

    public void setEvaluateUnit(String evaluateUnit) {
        this.evaluateUnit = evaluateUnit == null ? null : evaluateUnit.trim();
    }

    public String getApproveUnit() {
        return approveUnit;
    }

    public void setApproveUnit(String approveUnit) {
        this.approveUnit = approveUnit == null ? null : approveUnit.trim();
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public Date getEvaluateDate() {
        return evaluateDate;
    }

    public void setEvaluateDate(Date evaluateDate) {
        this.evaluateDate = evaluateDate;
    }

    public String getEvaluateDateAuditor() {
        return evaluateDateAuditor;
    }

    public void setEvaluateDateAuditor(String evaluateDateAuditor) {
        this.evaluateDateAuditor = evaluateDateAuditor == null ? null : evaluateDateAuditor.trim();
    }

    public BigDecimal getEvaluateAsset() {
        return evaluateAsset;
    }

    public void setEvaluateAsset(BigDecimal evaluateAsset) {
        this.evaluateAsset = evaluateAsset;
    }

    public BigDecimal getEvaluateEquity() {
        return evaluateEquity;
    }

    public void setEvaluateEquity(BigDecimal evaluateEquity) {
        this.evaluateEquity = evaluateEquity;
    }

    public BigDecimal getEvaluateDebt() {
        return evaluateDebt;
    }

    public void setEvaluateDebt(BigDecimal evaluateDebt) {
        this.evaluateDebt = evaluateDebt;
    }

    public BigDecimal getBookAsset() {
        return bookAsset;
    }

    public void setBookAsset(BigDecimal bookAsset) {
        this.bookAsset = bookAsset;
    }

    public BigDecimal getBookEquity() {
        return bookEquity;
    }

    public void setBookEquity(BigDecimal bookEquity) {
        this.bookEquity = bookEquity;
    }

    public BigDecimal getBookDebt() {
        return bookDebt;
    }

    public void setBookDebt(BigDecimal bookDebt) {
        this.bookDebt = bookDebt;
    }

    public BigDecimal getObjectEvaluateValue() {
        return objectEvaluateValue;
    }

    public void setObjectEvaluateValue(BigDecimal objectEvaluateValue) {
        this.objectEvaluateValue = objectEvaluateValue;
    }

    public String getLawFirm() {
        return lawFirm;
    }

    public void setLawFirm(String lawFirm) {
        this.lawFirm = lawFirm == null ? null : lawFirm.trim();
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