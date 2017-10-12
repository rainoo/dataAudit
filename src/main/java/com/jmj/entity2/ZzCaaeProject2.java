package com.jmj.entity2;

import java.util.Date;

public class ZzCaaeProject2 {
    private String uuid;

    private String proTransId;

    private String importantInfo;

    private String investPostulate;

    private String dealConditions;

    private String hasInvestIntent;

    private String capitalPlan;

    private String useOfRaisedFunds;

    private String pubSelectionMethods;

    private Object financePercent;

    private Object financeAmount;

    private String lastSelectionMethod;

    private Date lastSelectionDate;

    private String shortlistExplain;

    private String terminateApproval;
    
    private String finalEconomyType;

    public String getFinalEconomyType() {
		return finalEconomyType;
	}

	public void setFinalEconomyType(String finalEconomyType) {
		this.finalEconomyType = finalEconomyType;
	}

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

    public String getInvestPostulate() {
        return investPostulate;
    }

    public void setInvestPostulate(String investPostulate) {
        this.investPostulate = investPostulate == null ? null : investPostulate.trim();
    }

    public String getDealConditions() {
        return dealConditions;
    }

    public void setDealConditions(String dealConditions) {
        this.dealConditions = dealConditions == null ? null : dealConditions.trim();
    }

    public String getHasInvestIntent() {
        return hasInvestIntent;
    }

    public void setHasInvestIntent(String hasInvestIntent) {
        this.hasInvestIntent = hasInvestIntent == null ? null : hasInvestIntent.trim();
    }

    public String getCapitalPlan() {
        return capitalPlan;
    }

    public void setCapitalPlan(String capitalPlan) {
        this.capitalPlan = capitalPlan == null ? null : capitalPlan.trim();
    }

    public String getUseOfRaisedFunds() {
        return useOfRaisedFunds;
    }

    public void setUseOfRaisedFunds(String useOfRaisedFunds) {
        this.useOfRaisedFunds = useOfRaisedFunds == null ? null : useOfRaisedFunds.trim();
    }

    public String getPubSelectionMethods() {
        return pubSelectionMethods;
    }

    public void setPubSelectionMethods(String pubSelectionMethods) {
        this.pubSelectionMethods = pubSelectionMethods == null ? null : pubSelectionMethods.trim();
    }

    public Object getFinancePercent() {
        return financePercent;
    }

    public void setFinancePercent(Object financePercent) {
        this.financePercent = financePercent;
    }

    public Object getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(Object financeAmount) {
        this.financeAmount = financeAmount;
    }

    public String getLastSelectionMethod() {
        return lastSelectionMethod;
    }

    public void setLastSelectionMethod(String lastSelectionMethod) {
        this.lastSelectionMethod = lastSelectionMethod == null ? null : lastSelectionMethod.trim();
    }

    public Date getLastSelectionDate() {
        return lastSelectionDate;
    }

    public void setLastSelectionDate(Date lastSelectionDate) {
        this.lastSelectionDate = lastSelectionDate;
    }

    public String getShortlistExplain() {
        return shortlistExplain;
    }

    public void setShortlistExplain(String shortlistExplain) {
        this.shortlistExplain = shortlistExplain == null ? null : shortlistExplain.trim();
    }

    public String getTerminateApproval() {
        return terminateApproval;
    }

    public void setTerminateApproval(String terminateApproval) {
        this.terminateApproval = terminateApproval == null ? null : terminateApproval.trim();
    }
}