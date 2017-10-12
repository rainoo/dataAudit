package com.jmj.entity2;

import java.util.Date;

public class CaaeAddPub2 {
    private String addPubId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

    private String tradInstitutionName;

    private String projectType;

    private Date additionalDate;

    private String additionalContentBefore;

    private String additionalContentAfter;

    private String proTransId;

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
}