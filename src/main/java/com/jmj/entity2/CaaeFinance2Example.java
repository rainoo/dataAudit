package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeFinance2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeFinance2Example() {
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

        public Criteria andFinanceIdIsNull() {
            addCriterion("FINANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIsNotNull() {
            addCriterion("FINANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdEqualTo(String value) {
            addCriterion("FINANCE_ID =", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotEqualTo(String value) {
            addCriterion("FINANCE_ID <>", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThan(String value) {
            addCriterion("FINANCE_ID >", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCE_ID >=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThan(String value) {
            addCriterion("FINANCE_ID <", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThanOrEqualTo(String value) {
            addCriterion("FINANCE_ID <=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLike(String value) {
            addCriterion("FINANCE_ID like", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotLike(String value) {
            addCriterion("FINANCE_ID not like", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIn(List<String> values) {
            addCriterion("FINANCE_ID in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotIn(List<String> values) {
            addCriterion("FINANCE_ID not in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdBetween(String value1, String value2) {
            addCriterion("FINANCE_ID between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotBetween(String value1, String value2) {
            addCriterion("FINANCE_ID not between", value1, value2, "financeId");
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

        public Criteria andAuditYearIsNull() {
            addCriterion("AUDIT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andAuditYearIsNotNull() {
            addCriterion("AUDIT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditYearEqualTo(String value) {
            addCriterion("AUDIT_YEAR =", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearNotEqualTo(String value) {
            addCriterion("AUDIT_YEAR <>", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearGreaterThan(String value) {
            addCriterion("AUDIT_YEAR >", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_YEAR >=", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearLessThan(String value) {
            addCriterion("AUDIT_YEAR <", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_YEAR <=", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearLike(String value) {
            addCriterion("AUDIT_YEAR like", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearNotLike(String value) {
            addCriterion("AUDIT_YEAR not like", value, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearIn(List<String> values) {
            addCriterion("AUDIT_YEAR in", values, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearNotIn(List<String> values) {
            addCriterion("AUDIT_YEAR not in", values, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearBetween(String value1, String value2) {
            addCriterion("AUDIT_YEAR between", value1, value2, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditYearNotBetween(String value1, String value2) {
            addCriterion("AUDIT_YEAR not between", value1, value2, "auditYear");
            return (Criteria) this;
        }

        public Criteria andAuditUnitIsNull() {
            addCriterion("AUDIT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAuditUnitIsNotNull() {
            addCriterion("AUDIT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUnitEqualTo(String value) {
            addCriterion("AUDIT_UNIT =", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitNotEqualTo(String value) {
            addCriterion("AUDIT_UNIT <>", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitGreaterThan(String value) {
            addCriterion("AUDIT_UNIT >", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_UNIT >=", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitLessThan(String value) {
            addCriterion("AUDIT_UNIT <", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_UNIT <=", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitLike(String value) {
            addCriterion("AUDIT_UNIT like", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitNotLike(String value) {
            addCriterion("AUDIT_UNIT not like", value, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitIn(List<String> values) {
            addCriterion("AUDIT_UNIT in", values, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitNotIn(List<String> values) {
            addCriterion("AUDIT_UNIT not in", values, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitBetween(String value1, String value2) {
            addCriterion("AUDIT_UNIT between", value1, value2, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditUnitNotBetween(String value1, String value2) {
            addCriterion("AUDIT_UNIT not between", value1, value2, "auditUnit");
            return (Criteria) this;
        }

        public Criteria andAuditAssetIsNull() {
            addCriterion("AUDIT_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andAuditAssetIsNotNull() {
            addCriterion("AUDIT_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andAuditAssetEqualTo(BigDecimal value) {
            addCriterion("AUDIT_ASSET =", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_ASSET <>", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_ASSET >", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_ASSET >=", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetLessThan(BigDecimal value) {
            addCriterion("AUDIT_ASSET <", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_ASSET <=", value, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetIn(List<BigDecimal> values) {
            addCriterion("AUDIT_ASSET in", values, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_ASSET not in", values, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_ASSET between", value1, value2, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditAssetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_ASSET not between", value1, value2, "auditAsset");
            return (Criteria) this;
        }

        public Criteria andAuditEquityIsNull() {
            addCriterion("AUDIT_EQUITY is null");
            return (Criteria) this;
        }

        public Criteria andAuditEquityIsNotNull() {
            addCriterion("AUDIT_EQUITY is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEquityEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EQUITY =", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EQUITY <>", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_EQUITY >", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EQUITY >=", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityLessThan(BigDecimal value) {
            addCriterion("AUDIT_EQUITY <", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EQUITY <=", value, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityIn(List<BigDecimal> values) {
            addCriterion("AUDIT_EQUITY in", values, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_EQUITY not in", values, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_EQUITY between", value1, value2, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditEquityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_EQUITY not between", value1, value2, "auditEquity");
            return (Criteria) this;
        }

        public Criteria andAuditDebtIsNull() {
            addCriterion("AUDIT_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andAuditDebtIsNotNull() {
            addCriterion("AUDIT_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDebtEqualTo(BigDecimal value) {
            addCriterion("AUDIT_DEBT =", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_DEBT <>", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_DEBT >", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_DEBT >=", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtLessThan(BigDecimal value) {
            addCriterion("AUDIT_DEBT <", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_DEBT <=", value, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtIn(List<BigDecimal> values) {
            addCriterion("AUDIT_DEBT in", values, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_DEBT not in", values, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_DEBT between", value1, value2, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_DEBT not between", value1, value2, "auditDebt");
            return (Criteria) this;
        }

        public Criteria andAuditEarningIsNull() {
            addCriterion("AUDIT_EARNING is null");
            return (Criteria) this;
        }

        public Criteria andAuditEarningIsNotNull() {
            addCriterion("AUDIT_EARNING is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEarningEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EARNING =", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EARNING <>", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_EARNING >", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EARNING >=", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningLessThan(BigDecimal value) {
            addCriterion("AUDIT_EARNING <", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_EARNING <=", value, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningIn(List<BigDecimal> values) {
            addCriterion("AUDIT_EARNING in", values, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_EARNING not in", values, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_EARNING between", value1, value2, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditEarningNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_EARNING not between", value1, value2, "auditEarning");
            return (Criteria) this;
        }

        public Criteria andAuditProfitIsNull() {
            addCriterion("AUDIT_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andAuditProfitIsNotNull() {
            addCriterion("AUDIT_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditProfitEqualTo(BigDecimal value) {
            addCriterion("AUDIT_PROFIT =", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_PROFIT <>", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_PROFIT >", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_PROFIT >=", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitLessThan(BigDecimal value) {
            addCriterion("AUDIT_PROFIT <", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_PROFIT <=", value, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitIn(List<BigDecimal> values) {
            addCriterion("AUDIT_PROFIT in", values, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_PROFIT not in", values, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_PROFIT between", value1, value2, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_PROFIT not between", value1, value2, "auditProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitIsNull() {
            addCriterion("AUDIT_NET_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitIsNotNull() {
            addCriterion("AUDIT_NET_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitEqualTo(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT =", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT <>", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT >", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT >=", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitLessThan(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT <", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_NET_PROFIT <=", value, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitIn(List<BigDecimal> values) {
            addCriterion("AUDIT_NET_PROFIT in", values, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_NET_PROFIT not in", values, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_NET_PROFIT between", value1, value2, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andAuditNetProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_NET_PROFIT not between", value1, value2, "auditNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtDateIsNull() {
            addCriterion("STMT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStmtDateIsNotNull() {
            addCriterion("STMT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStmtDateEqualTo(BigDecimal value) {
            addCriterion("STMT_DATE =", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateNotEqualTo(BigDecimal value) {
            addCriterion("STMT_DATE <>", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateGreaterThan(BigDecimal value) {
            addCriterion("STMT_DATE >", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_DATE >=", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateLessThan(BigDecimal value) {
            addCriterion("STMT_DATE <", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_DATE <=", value, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateIn(List<BigDecimal> values) {
            addCriterion("STMT_DATE in", values, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateNotIn(List<BigDecimal> values) {
            addCriterion("STMT_DATE not in", values, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_DATE between", value1, value2, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_DATE not between", value1, value2, "stmtDate");
            return (Criteria) this;
        }

        public Criteria andStmtTypeIsNull() {
            addCriterion("STMT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStmtTypeIsNotNull() {
            addCriterion("STMT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStmtTypeEqualTo(String value) {
            addCriterion("STMT_TYPE =", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeNotEqualTo(String value) {
            addCriterion("STMT_TYPE <>", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeGreaterThan(String value) {
            addCriterion("STMT_TYPE >", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STMT_TYPE >=", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeLessThan(String value) {
            addCriterion("STMT_TYPE <", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeLessThanOrEqualTo(String value) {
            addCriterion("STMT_TYPE <=", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeLike(String value) {
            addCriterion("STMT_TYPE like", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeNotLike(String value) {
            addCriterion("STMT_TYPE not like", value, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeIn(List<String> values) {
            addCriterion("STMT_TYPE in", values, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeNotIn(List<String> values) {
            addCriterion("STMT_TYPE not in", values, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeBetween(String value1, String value2) {
            addCriterion("STMT_TYPE between", value1, value2, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtTypeNotBetween(String value1, String value2) {
            addCriterion("STMT_TYPE not between", value1, value2, "stmtType");
            return (Criteria) this;
        }

        public Criteria andStmtAssetIsNull() {
            addCriterion("STMT_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andStmtAssetIsNotNull() {
            addCriterion("STMT_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andStmtAssetEqualTo(BigDecimal value) {
            addCriterion("STMT_ASSET =", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetNotEqualTo(BigDecimal value) {
            addCriterion("STMT_ASSET <>", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetGreaterThan(BigDecimal value) {
            addCriterion("STMT_ASSET >", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_ASSET >=", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetLessThan(BigDecimal value) {
            addCriterion("STMT_ASSET <", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_ASSET <=", value, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetIn(List<BigDecimal> values) {
            addCriterion("STMT_ASSET in", values, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetNotIn(List<BigDecimal> values) {
            addCriterion("STMT_ASSET not in", values, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_ASSET between", value1, value2, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtAssetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_ASSET not between", value1, value2, "stmtAsset");
            return (Criteria) this;
        }

        public Criteria andStmtEquityIsNull() {
            addCriterion("STMT_EQUITY is null");
            return (Criteria) this;
        }

        public Criteria andStmtEquityIsNotNull() {
            addCriterion("STMT_EQUITY is not null");
            return (Criteria) this;
        }

        public Criteria andStmtEquityEqualTo(BigDecimal value) {
            addCriterion("STMT_EQUITY =", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityNotEqualTo(BigDecimal value) {
            addCriterion("STMT_EQUITY <>", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityGreaterThan(BigDecimal value) {
            addCriterion("STMT_EQUITY >", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_EQUITY >=", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityLessThan(BigDecimal value) {
            addCriterion("STMT_EQUITY <", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_EQUITY <=", value, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityIn(List<BigDecimal> values) {
            addCriterion("STMT_EQUITY in", values, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityNotIn(List<BigDecimal> values) {
            addCriterion("STMT_EQUITY not in", values, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_EQUITY between", value1, value2, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtEquityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_EQUITY not between", value1, value2, "stmtEquity");
            return (Criteria) this;
        }

        public Criteria andStmtDebtIsNull() {
            addCriterion("STMT_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andStmtDebtIsNotNull() {
            addCriterion("STMT_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andStmtDebtEqualTo(BigDecimal value) {
            addCriterion("STMT_DEBT =", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtNotEqualTo(BigDecimal value) {
            addCriterion("STMT_DEBT <>", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtGreaterThan(BigDecimal value) {
            addCriterion("STMT_DEBT >", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_DEBT >=", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtLessThan(BigDecimal value) {
            addCriterion("STMT_DEBT <", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_DEBT <=", value, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtIn(List<BigDecimal> values) {
            addCriterion("STMT_DEBT in", values, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtNotIn(List<BigDecimal> values) {
            addCriterion("STMT_DEBT not in", values, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_DEBT between", value1, value2, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_DEBT not between", value1, value2, "stmtDebt");
            return (Criteria) this;
        }

        public Criteria andStmtEarningIsNull() {
            addCriterion("STMT_EARNING is null");
            return (Criteria) this;
        }

        public Criteria andStmtEarningIsNotNull() {
            addCriterion("STMT_EARNING is not null");
            return (Criteria) this;
        }

        public Criteria andStmtEarningEqualTo(BigDecimal value) {
            addCriterion("STMT_EARNING =", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningNotEqualTo(BigDecimal value) {
            addCriterion("STMT_EARNING <>", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningGreaterThan(BigDecimal value) {
            addCriterion("STMT_EARNING >", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_EARNING >=", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningLessThan(BigDecimal value) {
            addCriterion("STMT_EARNING <", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_EARNING <=", value, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningIn(List<BigDecimal> values) {
            addCriterion("STMT_EARNING in", values, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningNotIn(List<BigDecimal> values) {
            addCriterion("STMT_EARNING not in", values, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_EARNING between", value1, value2, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtEarningNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_EARNING not between", value1, value2, "stmtEarning");
            return (Criteria) this;
        }

        public Criteria andStmtProfitIsNull() {
            addCriterion("STMT_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andStmtProfitIsNotNull() {
            addCriterion("STMT_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andStmtProfitEqualTo(BigDecimal value) {
            addCriterion("STMT_PROFIT =", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitNotEqualTo(BigDecimal value) {
            addCriterion("STMT_PROFIT <>", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitGreaterThan(BigDecimal value) {
            addCriterion("STMT_PROFIT >", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_PROFIT >=", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitLessThan(BigDecimal value) {
            addCriterion("STMT_PROFIT <", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_PROFIT <=", value, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitIn(List<BigDecimal> values) {
            addCriterion("STMT_PROFIT in", values, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitNotIn(List<BigDecimal> values) {
            addCriterion("STMT_PROFIT not in", values, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_PROFIT between", value1, value2, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_PROFIT not between", value1, value2, "stmtProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitIsNull() {
            addCriterion("STMT_NET_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitIsNotNull() {
            addCriterion("STMT_NET_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitEqualTo(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT =", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitNotEqualTo(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT <>", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitGreaterThan(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT >", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT >=", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitLessThan(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT <", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STMT_NET_PROFIT <=", value, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitIn(List<BigDecimal> values) {
            addCriterion("STMT_NET_PROFIT in", values, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitNotIn(List<BigDecimal> values) {
            addCriterion("STMT_NET_PROFIT not in", values, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_NET_PROFIT between", value1, value2, "stmtNetProfit");
            return (Criteria) this;
        }

        public Criteria andStmtNetProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STMT_NET_PROFIT not between", value1, value2, "stmtNetProfit");
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