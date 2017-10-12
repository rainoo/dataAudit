package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeHolder2 {
    private String holderId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

    private String tradInstitutionName;

    private String projectType;

    private Short holderNo;

    private String holderName;

    private BigDecimal holdingRatio;

    private BigDecimal finalRatio;

    private String proTransId;

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

    public Short getHolderNo() {
        return holderNo;
    }

    public void setHolderNo(Short holderNo) {
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

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType == null ? null : holderType.trim();
    }
}