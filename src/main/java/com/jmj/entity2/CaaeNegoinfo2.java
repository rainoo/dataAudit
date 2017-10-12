package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeNegoinfo2 {
    private String negoInfoId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

    private String tradInstitutionName;

    private String projectType;

    private String investor;

    private BigDecimal negoPrice;

    private BigDecimal negoPercent;

    private Short negoAmount;

    private String proTransId;

    private String negoPromise;

    public String getNegoInfoId() {
        return negoInfoId;
    }

    public void setNegoInfoId(String negoInfoId) {
        this.negoInfoId = negoInfoId == null ? null : negoInfoId.trim();
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

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor == null ? null : investor.trim();
    }

    public BigDecimal getNegoPrice() {
        return negoPrice;
    }

    public void setNegoPrice(BigDecimal negoPrice) {
        this.negoPrice = negoPrice;
    }

    public BigDecimal getNegoPercent() {
        return negoPercent;
    }

    public void setNegoPercent(BigDecimal negoPercent) {
        this.negoPercent = negoPercent;
    }

    public Short getNegoAmount() {
        return negoAmount;
    }

    public void setNegoAmount(Short negoAmount) {
        this.negoAmount = negoAmount;
    }

    public String getProTransId() {
        return proTransId;
    }

    public void setProTransId(String proTransId) {
        this.proTransId = proTransId == null ? null : proTransId.trim();
    }

    public String getNegoPromise() {
        return negoPromise;
    }

    public void setNegoPromise(String negoPromise) {
        this.negoPromise = negoPromise == null ? null : negoPromise.trim();
    }
}