package com.jmj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeHolder {
    private String holderId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionName;

    private String projectType;

    private Integer holderNo;

    private String holderName;

    private BigDecimal holdingRatio;

    private BigDecimal finalRatio;

    private String proTransId;

    private String projectId;

    private String tradInstitutionId;

    private String businessStatus;

    private String projectClassifyCode;

    private String holderType;

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId == null ? null : holderId.trim();
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

    public Integer getHolderNo() {
        return holderNo;
    }

    public void setHolderNo(Integer holderNo) {
        this.holderNo = holderNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
    }

    public BigDecimal getHoldingRatio() {
        return holdingRatio;
    }

    public void setHoldingRatio(BigDecimal holdingRatio) {
        this.holdingRatio = holdingRatio;
    }

    public BigDecimal getFinalRatio() {
        return finalRatio;
    }

    public void setFinalRatio(BigDecimal finalRatio) {
        this.finalRatio = finalRatio;
    }

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

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType == null ? null : holderType.trim();
    }
}