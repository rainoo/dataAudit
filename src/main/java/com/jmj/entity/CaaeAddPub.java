package com.jmj.entity;

import java.util.Date;

public class CaaeAddPub {
    private String addPubId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionName;

    private String projectType;

    private Date additionalDate;

    private String additionalContentBefore;

    private String additionalContentAfter;

    private String proTransId;

    private String projectId;

    private String tradInstitutionId;

    private String businessStatus;

    private String projectClassifyCode;

    public String getAddPubId() {
        return addPubId;
    }

    public void setAddPubId(String addPubId) {
        this.addPubId = addPubId == null ? null : addPubId.trim();
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

    public Date getAdditionalDate() {
        return additionalDate;
    }

    public void setAdditionalDate(Date additionalDate) {
        this.additionalDate = additionalDate;
    }

    public String getAdditionalContentBefore() {
        return additionalContentBefore;
    }

    public void setAdditionalContentBefore(String additionalContentBefore) {
        this.additionalContentBefore = additionalContentBefore == null ? null : additionalContentBefore.trim();
    }

    public String getAdditionalContentAfter() {
        return additionalContentAfter;
    }

    public void setAdditionalContentAfter(String additionalContentAfter) {
        this.additionalContentAfter = additionalContentAfter == null ? null : additionalContentAfter.trim();
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
}