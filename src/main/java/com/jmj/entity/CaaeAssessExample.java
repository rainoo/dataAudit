package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeAssessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeAssessExample() {
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

        public Criteria andAssessIdIsNull() {
            addCriterion("ASSESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAssessIdIsNotNull() {
            addCriterion("ASSESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAssessIdEqualTo(String value) {
            addCriterion("ASSESS_ID =", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotEqualTo(String value) {
            addCriterion("ASSESS_ID <>", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdGreaterThan(String value) {
            addCriterion("ASSESS_ID >", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESS_ID >=", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdLessThan(String value) {
            addCriterion("ASSESS_ID <", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdLessThanOrEqualTo(String value) {
            addCriterion("ASSESS_ID <=", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdLike(String value) {
            addCriterion("ASSESS_ID like", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotLike(String value) {
            addCriterion("ASSESS_ID not like", value, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdIn(List<String> values) {
            addCriterion("ASSESS_ID in", values, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotIn(List<String> values) {
            addCriterion("ASSESS_ID not in", values, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdBetween(String value1, String value2) {
            addCriterion("ASSESS_ID between", value1, value2, "assessId");
            return (Criteria) this;
        }

        public Criteria andAssessIdNotBetween(String value1, String value2) {
            addCriterion("ASSESS_ID not between", value1, value2, "assessId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("PLATFORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("PLATFORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("PLATFORM_ID =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("PLATFORM_ID <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("PLATFORM_ID >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_ID >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("PLATFORM_ID <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_ID <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("PLATFORM_ID like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("PLATFORM_ID not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("PLATFORM_ID in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("PLATFORM_ID not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("PLATFORM_ID between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_ID not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNull() {
            addCriterion("PLATFORM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIsNotNull() {
            addCriterion("PLATFORM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformNameEqualTo(String value) {
            addCriterion("PLATFORM_NAME =", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotEqualTo(String value) {
            addCriterion("PLATFORM_NAME <>", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThan(String value) {
            addCriterion("PLATFORM_NAME >", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_NAME >=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThan(String value) {
            addCriterion("PLATFORM_NAME <", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_NAME <=", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameLike(String value) {
            addCriterion("PLATFORM_NAME like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotLike(String value) {
            addCriterion("PLATFORM_NAME not like", value, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameIn(List<String> values) {
            addCriterion("PLATFORM_NAME in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotIn(List<String> values) {
            addCriterion("PLATFORM_NAME not in", values, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameBetween(String value1, String value2) {
            addCriterion("PLATFORM_NAME between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andPlatformNameNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_NAME not between", value1, value2, "platformName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameIsNull() {
            addCriterion("TRAD_INSTITUTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameIsNotNull() {
            addCriterion("TRAD_INSTITUTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_NAME =", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameNotEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_NAME <>", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameGreaterThan(String value) {
            addCriterion("TRAD_INSTITUTION_NAME >", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_NAME >=", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameLessThan(String value) {
            addCriterion("TRAD_INSTITUTION_NAME <", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_NAME <=", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameLike(String value) {
            addCriterion("TRAD_INSTITUTION_NAME like", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameNotLike(String value) {
            addCriterion("TRAD_INSTITUTION_NAME not like", value, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameIn(List<String> values) {
            addCriterion("TRAD_INSTITUTION_NAME in", values, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameNotIn(List<String> values) {
            addCriterion("TRAD_INSTITUTION_NAME not in", values, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameBetween(String value1, String value2) {
            addCriterion("TRAD_INSTITUTION_NAME between", value1, value2, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("TRAD_INSTITUTION_NAME not between", value1, value2, "tradInstitutionName");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("PROJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("PROJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(String value) {
            addCriterion("PROJECT_TYPE =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(String value) {
            addCriterion("PROJECT_TYPE <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(String value) {
            addCriterion("PROJECT_TYPE >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(String value) {
            addCriterion("PROJECT_TYPE <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_TYPE <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLike(String value) {
            addCriterion("PROJECT_TYPE like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotLike(String value) {
            addCriterion("PROJECT_TYPE not like", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<String> values) {
            addCriterion("PROJECT_TYPE in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<String> values) {
            addCriterion("PROJECT_TYPE not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_TYPE not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitIsNull() {
            addCriterion("EVALUATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitIsNotNull() {
            addCriterion("EVALUATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitEqualTo(String value) {
            addCriterion("EVALUATE_UNIT =", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitNotEqualTo(String value) {
            addCriterion("EVALUATE_UNIT <>", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitGreaterThan(String value) {
            addCriterion("EVALUATE_UNIT >", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATE_UNIT >=", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitLessThan(String value) {
            addCriterion("EVALUATE_UNIT <", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitLessThanOrEqualTo(String value) {
            addCriterion("EVALUATE_UNIT <=", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitLike(String value) {
            addCriterion("EVALUATE_UNIT like", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitNotLike(String value) {
            addCriterion("EVALUATE_UNIT not like", value, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitIn(List<String> values) {
            addCriterion("EVALUATE_UNIT in", values, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitNotIn(List<String> values) {
            addCriterion("EVALUATE_UNIT not in", values, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitBetween(String value1, String value2) {
            addCriterion("EVALUATE_UNIT between", value1, value2, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andEvaluateUnitNotBetween(String value1, String value2) {
            addCriterion("EVALUATE_UNIT not between", value1, value2, "evaluateUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitIsNull() {
            addCriterion("APPROVE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andApproveUnitIsNotNull() {
            addCriterion("APPROVE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andApproveUnitEqualTo(String value) {
            addCriterion("APPROVE_UNIT =", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitNotEqualTo(String value) {
            addCriterion("APPROVE_UNIT <>", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitGreaterThan(String value) {
            addCriterion("APPROVE_UNIT >", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_UNIT >=", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitLessThan(String value) {
            addCriterion("APPROVE_UNIT <", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_UNIT <=", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitLike(String value) {
            addCriterion("APPROVE_UNIT like", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitNotLike(String value) {
            addCriterion("APPROVE_UNIT not like", value, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitIn(List<String> values) {
            addCriterion("APPROVE_UNIT in", values, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitNotIn(List<String> values) {
            addCriterion("APPROVE_UNIT not in", values, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitBetween(String value1, String value2) {
            addCriterion("APPROVE_UNIT between", value1, value2, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveUnitNotBetween(String value1, String value2) {
            addCriterion("APPROVE_UNIT not between", value1, value2, "approveUnit");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNull() {
            addCriterion("APPROVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApproveDateIsNotNull() {
            addCriterion("APPROVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApproveDateEqualTo(Date value) {
            addCriterion("APPROVE_DATE =", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotEqualTo(Date value) {
            addCriterion("APPROVE_DATE <>", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThan(Date value) {
            addCriterion("APPROVE_DATE >", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE_DATE >=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThan(Date value) {
            addCriterion("APPROVE_DATE <", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("APPROVE_DATE <=", value, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateIn(List<Date> values) {
            addCriterion("APPROVE_DATE in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotIn(List<Date> values) {
            addCriterion("APPROVE_DATE not in", values, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateBetween(Date value1, Date value2) {
            addCriterion("APPROVE_DATE between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("APPROVE_DATE not between", value1, value2, "approveDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIsNull() {
            addCriterion("EVALUATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIsNotNull() {
            addCriterion("EVALUATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateEqualTo(Date value) {
            addCriterion("EVALUATE_DATE =", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotEqualTo(Date value) {
            addCriterion("EVALUATE_DATE <>", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateGreaterThan(Date value) {
            addCriterion("EVALUATE_DATE >", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EVALUATE_DATE >=", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateLessThan(Date value) {
            addCriterion("EVALUATE_DATE <", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateLessThanOrEqualTo(Date value) {
            addCriterion("EVALUATE_DATE <=", value, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateIn(List<Date> values) {
            addCriterion("EVALUATE_DATE in", values, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotIn(List<Date> values) {
            addCriterion("EVALUATE_DATE not in", values, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateBetween(Date value1, Date value2) {
            addCriterion("EVALUATE_DATE between", value1, value2, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateNotBetween(Date value1, Date value2) {
            addCriterion("EVALUATE_DATE not between", value1, value2, "evaluateDate");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorIsNull() {
            addCriterion("EVALUATE_DATE_AUDITOR is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorIsNotNull() {
            addCriterion("EVALUATE_DATE_AUDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorEqualTo(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR =", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorNotEqualTo(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR <>", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorGreaterThan(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR >", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR >=", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorLessThan(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR <", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorLessThanOrEqualTo(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR <=", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorLike(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR like", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorNotLike(String value) {
            addCriterion("EVALUATE_DATE_AUDITOR not like", value, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorIn(List<String> values) {
            addCriterion("EVALUATE_DATE_AUDITOR in", values, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorNotIn(List<String> values) {
            addCriterion("EVALUATE_DATE_AUDITOR not in", values, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorBetween(String value1, String value2) {
            addCriterion("EVALUATE_DATE_AUDITOR between", value1, value2, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateDateAuditorNotBetween(String value1, String value2) {
            addCriterion("EVALUATE_DATE_AUDITOR not between", value1, value2, "evaluateDateAuditor");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetIsNull() {
            addCriterion("EVALUATE_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetIsNotNull() {
            addCriterion("EVALUATE_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_ASSET =", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetNotEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_ASSET <>", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetGreaterThan(BigDecimal value) {
            addCriterion("EVALUATE_ASSET >", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_ASSET >=", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetLessThan(BigDecimal value) {
            addCriterion("EVALUATE_ASSET <", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_ASSET <=", value, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_ASSET in", values, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetNotIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_ASSET not in", values, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_ASSET between", value1, value2, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateAssetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_ASSET not between", value1, value2, "evaluateAsset");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityIsNull() {
            addCriterion("EVALUATE_EQUITY is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityIsNotNull() {
            addCriterion("EVALUATE_EQUITY is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY =", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityNotEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY <>", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityGreaterThan(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY >", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY >=", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityLessThan(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY <", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_EQUITY <=", value, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_EQUITY in", values, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityNotIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_EQUITY not in", values, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_EQUITY between", value1, value2, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateEquityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_EQUITY not between", value1, value2, "evaluateEquity");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtIsNull() {
            addCriterion("EVALUATE_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtIsNotNull() {
            addCriterion("EVALUATE_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_DEBT =", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtNotEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_DEBT <>", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtGreaterThan(BigDecimal value) {
            addCriterion("EVALUATE_DEBT >", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_DEBT >=", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtLessThan(BigDecimal value) {
            addCriterion("EVALUATE_DEBT <", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATE_DEBT <=", value, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_DEBT in", values, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtNotIn(List<BigDecimal> values) {
            addCriterion("EVALUATE_DEBT not in", values, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_DEBT between", value1, value2, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andEvaluateDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATE_DEBT not between", value1, value2, "evaluateDebt");
            return (Criteria) this;
        }

        public Criteria andBookAssetIsNull() {
            addCriterion("BOOK_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andBookAssetIsNotNull() {
            addCriterion("BOOK_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andBookAssetEqualTo(BigDecimal value) {
            addCriterion("BOOK_ASSET =", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetNotEqualTo(BigDecimal value) {
            addCriterion("BOOK_ASSET <>", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetGreaterThan(BigDecimal value) {
            addCriterion("BOOK_ASSET >", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_ASSET >=", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetLessThan(BigDecimal value) {
            addCriterion("BOOK_ASSET <", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_ASSET <=", value, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetIn(List<BigDecimal> values) {
            addCriterion("BOOK_ASSET in", values, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetNotIn(List<BigDecimal> values) {
            addCriterion("BOOK_ASSET not in", values, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_ASSET between", value1, value2, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookAssetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_ASSET not between", value1, value2, "bookAsset");
            return (Criteria) this;
        }

        public Criteria andBookEquityIsNull() {
            addCriterion("BOOK_EQUITY is null");
            return (Criteria) this;
        }

        public Criteria andBookEquityIsNotNull() {
            addCriterion("BOOK_EQUITY is not null");
            return (Criteria) this;
        }

        public Criteria andBookEquityEqualTo(BigDecimal value) {
            addCriterion("BOOK_EQUITY =", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityNotEqualTo(BigDecimal value) {
            addCriterion("BOOK_EQUITY <>", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityGreaterThan(BigDecimal value) {
            addCriterion("BOOK_EQUITY >", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_EQUITY >=", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityLessThan(BigDecimal value) {
            addCriterion("BOOK_EQUITY <", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_EQUITY <=", value, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityIn(List<BigDecimal> values) {
            addCriterion("BOOK_EQUITY in", values, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityNotIn(List<BigDecimal> values) {
            addCriterion("BOOK_EQUITY not in", values, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_EQUITY between", value1, value2, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookEquityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_EQUITY not between", value1, value2, "bookEquity");
            return (Criteria) this;
        }

        public Criteria andBookDebtIsNull() {
            addCriterion("BOOK_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andBookDebtIsNotNull() {
            addCriterion("BOOK_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andBookDebtEqualTo(BigDecimal value) {
            addCriterion("BOOK_DEBT =", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtNotEqualTo(BigDecimal value) {
            addCriterion("BOOK_DEBT <>", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtGreaterThan(BigDecimal value) {
            addCriterion("BOOK_DEBT >", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_DEBT >=", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtLessThan(BigDecimal value) {
            addCriterion("BOOK_DEBT <", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOOK_DEBT <=", value, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtIn(List<BigDecimal> values) {
            addCriterion("BOOK_DEBT in", values, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtNotIn(List<BigDecimal> values) {
            addCriterion("BOOK_DEBT not in", values, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_DEBT between", value1, value2, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andBookDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOOK_DEBT not between", value1, value2, "bookDebt");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueIsNull() {
            addCriterion("OBJECT_EVALUATE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueIsNotNull() {
            addCriterion("OBJECT_EVALUATE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueEqualTo(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE =", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueNotEqualTo(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE <>", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueGreaterThan(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE >", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE >=", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueLessThan(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE <", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJECT_EVALUATE_VALUE <=", value, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueIn(List<BigDecimal> values) {
            addCriterion("OBJECT_EVALUATE_VALUE in", values, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueNotIn(List<BigDecimal> values) {
            addCriterion("OBJECT_EVALUATE_VALUE not in", values, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECT_EVALUATE_VALUE between", value1, value2, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andObjectEvaluateValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJECT_EVALUATE_VALUE not between", value1, value2, "objectEvaluateValue");
            return (Criteria) this;
        }

        public Criteria andLawFirmIsNull() {
            addCriterion("LAW_FIRM is null");
            return (Criteria) this;
        }

        public Criteria andLawFirmIsNotNull() {
            addCriterion("LAW_FIRM is not null");
            return (Criteria) this;
        }

        public Criteria andLawFirmEqualTo(String value) {
            addCriterion("LAW_FIRM =", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmNotEqualTo(String value) {
            addCriterion("LAW_FIRM <>", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmGreaterThan(String value) {
            addCriterion("LAW_FIRM >", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_FIRM >=", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmLessThan(String value) {
            addCriterion("LAW_FIRM <", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmLessThanOrEqualTo(String value) {
            addCriterion("LAW_FIRM <=", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmLike(String value) {
            addCriterion("LAW_FIRM like", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmNotLike(String value) {
            addCriterion("LAW_FIRM not like", value, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmIn(List<String> values) {
            addCriterion("LAW_FIRM in", values, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmNotIn(List<String> values) {
            addCriterion("LAW_FIRM not in", values, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmBetween(String value1, String value2) {
            addCriterion("LAW_FIRM between", value1, value2, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andLawFirmNotBetween(String value1, String value2) {
            addCriterion("LAW_FIRM not between", value1, value2, "lawFirm");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdIsNull() {
            addCriterion("TRAD_INSTITUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdIsNotNull() {
            addCriterion("TRAD_INSTITUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_ID =", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdNotEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_ID <>", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdGreaterThan(String value) {
            addCriterion("TRAD_INSTITUTION_ID >", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_ID >=", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdLessThan(String value) {
            addCriterion("TRAD_INSTITUTION_ID <", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdLessThanOrEqualTo(String value) {
            addCriterion("TRAD_INSTITUTION_ID <=", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdLike(String value) {
            addCriterion("TRAD_INSTITUTION_ID like", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdNotLike(String value) {
            addCriterion("TRAD_INSTITUTION_ID not like", value, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdIn(List<String> values) {
            addCriterion("TRAD_INSTITUTION_ID in", values, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdNotIn(List<String> values) {
            addCriterion("TRAD_INSTITUTION_ID not in", values, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdBetween(String value1, String value2) {
            addCriterion("TRAD_INSTITUTION_ID between", value1, value2, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andTradInstitutionIdNotBetween(String value1, String value2) {
            addCriterion("TRAD_INSTITUTION_ID not between", value1, value2, "tradInstitutionId");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNull() {
            addCriterion("BUSINESS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNotNull() {
            addCriterion("BUSINESS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusEqualTo(String value) {
            addCriterion("BUSINESS_STATUS =", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotEqualTo(String value) {
            addCriterion("BUSINESS_STATUS <>", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThan(String value) {
            addCriterion("BUSINESS_STATUS >", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATUS >=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThan(String value) {
            addCriterion("BUSINESS_STATUS <", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_STATUS <=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLike(String value) {
            addCriterion("BUSINESS_STATUS like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotLike(String value) {
            addCriterion("BUSINESS_STATUS not like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIn(List<String> values) {
            addCriterion("BUSINESS_STATUS in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotIn(List<String> values) {
            addCriterion("BUSINESS_STATUS not in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATUS between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_STATUS not between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeIsNull() {
            addCriterion("PROJECT_CLASSIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeIsNotNull() {
            addCriterion("PROJECT_CLASSIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeEqualTo(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE =", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeNotEqualTo(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE <>", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeGreaterThan(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE >", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE >=", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeLessThan(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE <", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE <=", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeLike(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE like", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeNotLike(String value) {
            addCriterion("PROJECT_CLASSIFY_CODE not like", value, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeIn(List<String> values) {
            addCriterion("PROJECT_CLASSIFY_CODE in", values, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeNotIn(List<String> values) {
            addCriterion("PROJECT_CLASSIFY_CODE not in", values, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeBetween(String value1, String value2) {
            addCriterion("PROJECT_CLASSIFY_CODE between", value1, value2, "projectClassifyCode");
            return (Criteria) this;
        }

        public Criteria andProjectClassifyCodeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_CLASSIFY_CODE not between", value1, value2, "projectClassifyCode");
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