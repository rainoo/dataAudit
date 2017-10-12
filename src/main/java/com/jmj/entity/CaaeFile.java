package com.jmj.entity;

import java.util.Date;

public class CaaeFile {
    private String fileId;

    private String proTransId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionName;

    private String projectType;

    private String fileName;

    private String fileDesc;

    private String fileUrl;

    private String projectId;

    private String tradInstitutionId;

    private String businessStatus;

    private String projectClassifyCode;

    private Object fileType;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc == null ? null : fileDesc.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
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

    public Object getFileType() {
        return fileType;
    }

    public void setFileType(Object fileType) {
        this.fileType = fileType;
    }
}