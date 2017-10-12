package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeAssess2 {
    private String assessId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

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

    private String proTransId;

    private BigDecimal objectEvaluateValue;

    private String lawFirm;

    public String getAssessId() {
        return assessId;
    }

    public void setAssessId(String assessId) {
        this.assessId = assessId == null ? null : assessId.trim();
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

    public String getProTransId() {
        return proTransId;
    }

    public void setProTransId(String proTransId) {
        this.proTransId = proTransId == null ? null : proTransId.trim();
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
}