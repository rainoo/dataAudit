package com.jmj.entity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZzCaaeProject2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZzCaaeProject2Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andProTransIdIsNull() {
            addCriterion("PRO_TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProTransIdIsNotNull() {
            addCriterion("PRO_TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProTransIdEqualTo(String value) {
            addCriterion("PRO_TRANS_ID =", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdNotEqualTo(String value) {
            addCriterion("PRO_TRANS_ID <>", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdGreaterThan(String value) {
            addCriterion("PRO_TRANS_ID >", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TRANS_ID >=", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdLessThan(String value) {
            addCriterion("PRO_TRANS_ID <", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdLessThanOrEqualTo(String value) {
            addCriterion("PRO_TRANS_ID <=", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdLike(String value) {
            addCriterion("PRO_TRANS_ID like", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdNotLike(String value) {
            addCriterion("PRO_TRANS_ID not like", value, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdIn(List<String> values) {
            addCriterion("PRO_TRANS_ID in", values, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdNotIn(List<String> values) {
            addCriterion("PRO_TRANS_ID not in", values, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdBetween(String value1, String value2) {
            addCriterion("PRO_TRANS_ID between", value1, value2, "proTransId");
            return (Criteria) this;
        }

        public Criteria andProTransIdNotBetween(String value1, String value2) {
            addCriterion("PRO_TRANS_ID not between", value1, value2, "proTransId");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIsNull() {
            addCriterion("IMPORTANT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIsNotNull() {
            addCriterion("IMPORTANT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andImportantInfoEqualTo(String value) {
            addCriterion("IMPORTANT_INFO =", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotEqualTo(String value) {
            addCriterion("IMPORTANT_INFO <>", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoGreaterThan(String value) {
            addCriterion("IMPORTANT_INFO >", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_INFO >=", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLessThan(String value) {
            addCriterion("IMPORTANT_INFO <", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_INFO <=", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLike(String value) {
            addCriterion("IMPORTANT_INFO like", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotLike(String value) {
            addCriterion("IMPORTANT_INFO not like", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIn(List<String> values) {
            addCriterion("IMPORTANT_INFO in", values, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotIn(List<String> values) {
            addCriterion("IMPORTANT_INFO not in", values, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoBetween(String value1, String value2) {
            addCriterion("IMPORTANT_INFO between", value1, value2, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_INFO not between", value1, value2, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateIsNull() {
            addCriterion("INVEST_POSTULATE is null");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateIsNotNull() {
            addCriterion("INVEST_POSTULATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateEqualTo(String value) {
            addCriterion("INVEST_POSTULATE =", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateNotEqualTo(String value) {
            addCriterion("INVEST_POSTULATE <>", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateGreaterThan(String value) {
            addCriterion("INVEST_POSTULATE >", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_POSTULATE >=", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateLessThan(String value) {
            addCriterion("INVEST_POSTULATE <", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateLessThanOrEqualTo(String value) {
            addCriterion("INVEST_POSTULATE <=", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateLike(String value) {
            addCriterion("INVEST_POSTULATE like", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateNotLike(String value) {
            addCriterion("INVEST_POSTULATE not like", value, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateIn(List<String> values) {
            addCriterion("INVEST_POSTULATE in", values, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateNotIn(List<String> values) {
            addCriterion("INVEST_POSTULATE not in", values, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateBetween(String value1, String value2) {
            addCriterion("INVEST_POSTULATE between", value1, value2, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andInvestPostulateNotBetween(String value1, String value2) {
            addCriterion("INVEST_POSTULATE not between", value1, value2, "investPostulate");
            return (Criteria) this;
        }

        public Criteria andDealConditionsIsNull() {
            addCriterion("DEAL_CONDITIONS is null");
            return (Criteria) this;
        }

        public Criteria andDealConditionsIsNotNull() {
            addCriterion("DEAL_CONDITIONS is not null");
            return (Criteria) this;
        }

        public Criteria andDealConditionsEqualTo(String value) {
            addCriterion("DEAL_CONDITIONS =", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsNotEqualTo(String value) {
            addCriterion("DEAL_CONDITIONS <>", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsGreaterThan(String value) {
            addCriterion("DEAL_CONDITIONS >", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_CONDITIONS >=", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsLessThan(String value) {
            addCriterion("DEAL_CONDITIONS <", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsLessThanOrEqualTo(String value) {
            addCriterion("DEAL_CONDITIONS <=", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsLike(String value) {
            addCriterion("DEAL_CONDITIONS like", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsNotLike(String value) {
            addCriterion("DEAL_CONDITIONS not like", value, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsIn(List<String> values) {
            addCriterion("DEAL_CONDITIONS in", values, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsNotIn(List<String> values) {
            addCriterion("DEAL_CONDITIONS not in", values, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsBetween(String value1, String value2) {
            addCriterion("DEAL_CONDITIONS between", value1, value2, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andDealConditionsNotBetween(String value1, String value2) {
            addCriterion("DEAL_CONDITIONS not between", value1, value2, "dealConditions");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentIsNull() {
            addCriterion("HAS_INVEST_INTENT is null");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentIsNotNull() {
            addCriterion("HAS_INVEST_INTENT is not null");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentEqualTo(String value) {
            addCriterion("HAS_INVEST_INTENT =", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentNotEqualTo(String value) {
            addCriterion("HAS_INVEST_INTENT <>", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentGreaterThan(String value) {
            addCriterion("HAS_INVEST_INTENT >", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_INVEST_INTENT >=", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentLessThan(String value) {
            addCriterion("HAS_INVEST_INTENT <", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentLessThanOrEqualTo(String value) {
            addCriterion("HAS_INVEST_INTENT <=", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentLike(String value) {
            addCriterion("HAS_INVEST_INTENT like", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentNotLike(String value) {
            addCriterion("HAS_INVEST_INTENT not like", value, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentIn(List<String> values) {
            addCriterion("HAS_INVEST_INTENT in", values, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentNotIn(List<String> values) {
            addCriterion("HAS_INVEST_INTENT not in", values, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentBetween(String value1, String value2) {
            addCriterion("HAS_INVEST_INTENT between", value1, value2, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andHasInvestIntentNotBetween(String value1, String value2) {
            addCriterion("HAS_INVEST_INTENT not between", value1, value2, "hasInvestIntent");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanIsNull() {
            addCriterion("CAPITAL_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanIsNotNull() {
            addCriterion("CAPITAL_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanEqualTo(String value) {
            addCriterion("CAPITAL_PLAN =", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanNotEqualTo(String value) {
            addCriterion("CAPITAL_PLAN <>", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanGreaterThan(String value) {
            addCriterion("CAPITAL_PLAN >", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL_PLAN >=", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanLessThan(String value) {
            addCriterion("CAPITAL_PLAN <", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL_PLAN <=", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanLike(String value) {
            addCriterion("CAPITAL_PLAN like", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanNotLike(String value) {
            addCriterion("CAPITAL_PLAN not like", value, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanIn(List<String> values) {
            addCriterion("CAPITAL_PLAN in", values, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanNotIn(List<String> values) {
            addCriterion("CAPITAL_PLAN not in", values, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanBetween(String value1, String value2) {
            addCriterion("CAPITAL_PLAN between", value1, value2, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andCapitalPlanNotBetween(String value1, String value2) {
            addCriterion("CAPITAL_PLAN not between", value1, value2, "capitalPlan");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsIsNull() {
            addCriterion("USE_OF_RAISED_FUNDS is null");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsIsNotNull() {
            addCriterion("USE_OF_RAISED_FUNDS is not null");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsEqualTo(String value) {
            addCriterion("USE_OF_RAISED_FUNDS =", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsNotEqualTo(String value) {
            addCriterion("USE_OF_RAISED_FUNDS <>", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsGreaterThan(String value) {
            addCriterion("USE_OF_RAISED_FUNDS >", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsGreaterThanOrEqualTo(String value) {
            addCriterion("USE_OF_RAISED_FUNDS >=", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsLessThan(String value) {
            addCriterion("USE_OF_RAISED_FUNDS <", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsLessThanOrEqualTo(String value) {
            addCriterion("USE_OF_RAISED_FUNDS <=", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsLike(String value) {
            addCriterion("USE_OF_RAISED_FUNDS like", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsNotLike(String value) {
            addCriterion("USE_OF_RAISED_FUNDS not like", value, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsIn(List<String> values) {
            addCriterion("USE_OF_RAISED_FUNDS in", values, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsNotIn(List<String> values) {
            addCriterion("USE_OF_RAISED_FUNDS not in", values, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsBetween(String value1, String value2) {
            addCriterion("USE_OF_RAISED_FUNDS between", value1, value2, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andUseOfRaisedFundsNotBetween(String value1, String value2) {
            addCriterion("USE_OF_RAISED_FUNDS not between", value1, value2, "useOfRaisedFunds");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsIsNull() {
            addCriterion("PUB_SELECTION_METHODS is null");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsIsNotNull() {
            addCriterion("PUB_SELECTION_METHODS is not null");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsEqualTo(String value) {
            addCriterion("PUB_SELECTION_METHODS =", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsNotEqualTo(String value) {
            addCriterion("PUB_SELECTION_METHODS <>", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsGreaterThan(String value) {
            addCriterion("PUB_SELECTION_METHODS >", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsGreaterThanOrEqualTo(String value) {
            addCriterion("PUB_SELECTION_METHODS >=", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsLessThan(String value) {
            addCriterion("PUB_SELECTION_METHODS <", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsLessThanOrEqualTo(String value) {
            addCriterion("PUB_SELECTION_METHODS <=", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsLike(String value) {
            addCriterion("PUB_SELECTION_METHODS like", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsNotLike(String value) {
            addCriterion("PUB_SELECTION_METHODS not like", value, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsIn(List<String> values) {
            addCriterion("PUB_SELECTION_METHODS in", values, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsNotIn(List<String> values) {
            addCriterion("PUB_SELECTION_METHODS not in", values, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsBetween(String value1, String value2) {
            addCriterion("PUB_SELECTION_METHODS between", value1, value2, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andPubSelectionMethodsNotBetween(String value1, String value2) {
            addCriterion("PUB_SELECTION_METHODS not between", value1, value2, "pubSelectionMethods");
            return (Criteria) this;
        }

        public Criteria andFinancePercentIsNull() {
            addCriterion("FINANCE_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andFinancePercentIsNotNull() {
            addCriterion("FINANCE_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andFinancePercentEqualTo(Object value) {
            addCriterion("FINANCE_PERCENT =", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentNotEqualTo(Object value) {
            addCriterion("FINANCE_PERCENT <>", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentGreaterThan(Object value) {
            addCriterion("FINANCE_PERCENT >", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentGreaterThanOrEqualTo(Object value) {
            addCriterion("FINANCE_PERCENT >=", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentLessThan(Object value) {
            addCriterion("FINANCE_PERCENT <", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentLessThanOrEqualTo(Object value) {
            addCriterion("FINANCE_PERCENT <=", value, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentIn(List<Object> values) {
            addCriterion("FINANCE_PERCENT in", values, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentNotIn(List<Object> values) {
            addCriterion("FINANCE_PERCENT not in", values, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentBetween(Object value1, Object value2) {
            addCriterion("FINANCE_PERCENT between", value1, value2, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinancePercentNotBetween(Object value1, Object value2) {
            addCriterion("FINANCE_PERCENT not between", value1, value2, "financePercent");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountIsNull() {
            addCriterion("FINANCE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountIsNotNull() {
            addCriterion("FINANCE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountEqualTo(Object value) {
            addCriterion("FINANCE_AMOUNT =", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotEqualTo(Object value) {
            addCriterion("FINANCE_AMOUNT <>", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountGreaterThan(Object value) {
            addCriterion("FINANCE_AMOUNT >", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountGreaterThanOrEqualTo(Object value) {
            addCriterion("FINANCE_AMOUNT >=", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountLessThan(Object value) {
            addCriterion("FINANCE_AMOUNT <", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountLessThanOrEqualTo(Object value) {
            addCriterion("FINANCE_AMOUNT <=", value, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountIn(List<Object> values) {
            addCriterion("FINANCE_AMOUNT in", values, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotIn(List<Object> values) {
            addCriterion("FINANCE_AMOUNT not in", values, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountBetween(Object value1, Object value2) {
            addCriterion("FINANCE_AMOUNT between", value1, value2, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andFinanceAmountNotBetween(Object value1, Object value2) {
            addCriterion("FINANCE_AMOUNT not between", value1, value2, "financeAmount");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodIsNull() {
            addCriterion("LAST_SELECTION_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodIsNotNull() {
            addCriterion("LAST_SELECTION_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodEqualTo(String value) {
            addCriterion("LAST_SELECTION_METHOD =", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodNotEqualTo(String value) {
            addCriterion("LAST_SELECTION_METHOD <>", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodGreaterThan(String value) {
            addCriterion("LAST_SELECTION_METHOD >", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_SELECTION_METHOD >=", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodLessThan(String value) {
            addCriterion("LAST_SELECTION_METHOD <", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodLessThanOrEqualTo(String value) {
            addCriterion("LAST_SELECTION_METHOD <=", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodLike(String value) {
            addCriterion("LAST_SELECTION_METHOD like", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodNotLike(String value) {
            addCriterion("LAST_SELECTION_METHOD not like", value, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodIn(List<String> values) {
            addCriterion("LAST_SELECTION_METHOD in", values, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodNotIn(List<String> values) {
            addCriterion("LAST_SELECTION_METHOD not in", values, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodBetween(String value1, String value2) {
            addCriterion("LAST_SELECTION_METHOD between", value1, value2, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionMethodNotBetween(String value1, String value2) {
            addCriterion("LAST_SELECTION_METHOD not between", value1, value2, "lastSelectionMethod");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateIsNull() {
            addCriterion("LAST_SELECTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateIsNotNull() {
            addCriterion("LAST_SELECTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateEqualTo(Date value) {
            addCriterion("LAST_SELECTION_DATE =", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateNotEqualTo(Date value) {
            addCriterion("LAST_SELECTION_DATE <>", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateGreaterThan(Date value) {
            addCriterion("LAST_SELECTION_DATE >", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SELECTION_DATE >=", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateLessThan(Date value) {
            addCriterion("LAST_SELECTION_DATE <", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SELECTION_DATE <=", value, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateIn(List<Date> values) {
            addCriterion("LAST_SELECTION_DATE in", values, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateNotIn(List<Date> values) {
            addCriterion("LAST_SELECTION_DATE not in", values, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateBetween(Date value1, Date value2) {
            addCriterion("LAST_SELECTION_DATE between", value1, value2, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andLastSelectionDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SELECTION_DATE not between", value1, value2, "lastSelectionDate");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainIsNull() {
            addCriterion("SHORTLIST_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainIsNotNull() {
            addCriterion("SHORTLIST_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainEqualTo(String value) {
            addCriterion("SHORTLIST_EXPLAIN =", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainNotEqualTo(String value) {
            addCriterion("SHORTLIST_EXPLAIN <>", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainGreaterThan(String value) {
            addCriterion("SHORTLIST_EXPLAIN >", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTLIST_EXPLAIN >=", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainLessThan(String value) {
            addCriterion("SHORTLIST_EXPLAIN <", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainLessThanOrEqualTo(String value) {
            addCriterion("SHORTLIST_EXPLAIN <=", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainLike(String value) {
            addCriterion("SHORTLIST_EXPLAIN like", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainNotLike(String value) {
            addCriterion("SHORTLIST_EXPLAIN not like", value, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainIn(List<String> values) {
            addCriterion("SHORTLIST_EXPLAIN in", values, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainNotIn(List<String> values) {
            addCriterion("SHORTLIST_EXPLAIN not in", values, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainBetween(String value1, String value2) {
            addCriterion("SHORTLIST_EXPLAIN between", value1, value2, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andShortlistExplainNotBetween(String value1, String value2) {
            addCriterion("SHORTLIST_EXPLAIN not between", value1, value2, "shortlistExplain");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalIsNull() {
            addCriterion("TERMINATE_APPROVAL is null");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalIsNotNull() {
            addCriterion("TERMINATE_APPROVAL is not null");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalEqualTo(String value) {
            addCriterion("TERMINATE_APPROVAL =", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalNotEqualTo(String value) {
            addCriterion("TERMINATE_APPROVAL <>", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalGreaterThan(String value) {
            addCriterion("TERMINATE_APPROVAL >", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINATE_APPROVAL >=", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalLessThan(String value) {
            addCriterion("TERMINATE_APPROVAL <", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalLessThanOrEqualTo(String value) {
            addCriterion("TERMINATE_APPROVAL <=", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalLike(String value) {
            addCriterion("TERMINATE_APPROVAL like", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalNotLike(String value) {
            addCriterion("TERMINATE_APPROVAL not like", value, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalIn(List<String> values) {
            addCriterion("TERMINATE_APPROVAL in", values, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalNotIn(List<String> values) {
            addCriterion("TERMINATE_APPROVAL not in", values, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalBetween(String value1, String value2) {
            addCriterion("TERMINATE_APPROVAL between", value1, value2, "terminateApproval");
            return (Criteria) this;
        }

        public Criteria andTerminateApprovalNotBetween(String value1, String value2) {
            addCriterion("TERMINATE_APPROVAL not between", value1, value2, "terminateApproval");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}