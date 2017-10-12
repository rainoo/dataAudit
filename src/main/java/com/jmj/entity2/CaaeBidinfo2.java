package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.Date;

public class CaaeBidinfo2 {
    private String bidInfoId;

    private String proTransId;

    private Date createTime;

    private Date lastUpdateTime;

    private String platformId;

    private String platformName;

    private String tradInstitutionId;

    private String tradInstitutionName;

    private String projectType;

    private String bidder;

    private BigDecimal bidNo;

    private BigDecimal bidPrice;

    private BigDecimal bidPercent;

    private Short bidAmount;

    public String getBidInfoId() {
        return bidInfoId;
    }

    public void setBidInfoId(String bidInfoId) {
        this.bidInfoId = bidInfoId == null ? null : bidInfoId.trim();
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

    public String getBidder() {
        return bidder;
    }

    public void setBidder(String bidder) {
        this.bidder = bidder == null ? null : bidder.trim();
    }

    public BigDecimal getBidNo() {
        return bidNo;
    }

    public void setBidNo(BigDecimal bidNo) {
        this.bidNo = bidNo;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    public BigDecimal getBidPercent() {
        return bidPercent;
    }

    public void setBidPercent(BigDecimal bidPercent) {
        this.bidPercent = bidPercent;
    }

    public Short getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Short bidAmount) {
        this.bidAmount = bidAmount;
    }
}