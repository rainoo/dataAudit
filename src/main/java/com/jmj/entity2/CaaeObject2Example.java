package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CaaeObject2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeObject2Example() {
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

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(String value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(String value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(String value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(String value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLike(String value) {
            addCriterion("OBJECT_ID like", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotLike(String value) {
            addCriterion("OBJECT_ID not like", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<String> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<String> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(String value1, String value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(String value1, String value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
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

        public Criteria andCreateTimeEqualTo(Object value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Object value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Object value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Object value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Object value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Object> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Object> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Object value1, Object value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Object value1, Object value2) {
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

        public Criteria andLastUpdateTimeEqualTo(Object value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Object value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Object value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Object value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Object value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Object value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Object> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Object> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Object value1, Object value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Object value1, Object value2) {
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

        public Criteria andSubjectCompanyNameIsNull() {
            addCriterion("SUBJECT_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameIsNotNull() {
            addCriterion("SUBJECT_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_NAME =", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameNotEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_NAME <>", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameGreaterThan(String value) {
            addCriterion("SUBJECT_COMPANY_NAME >", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_NAME >=", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameLessThan(String value) {
            addCriterion("SUBJECT_COMPANY_NAME <", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_NAME <=", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameLike(String value) {
            addCriterion("SUBJECT_COMPANY_NAME like", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameNotLike(String value) {
            addCriterion("SUBJECT_COMPANY_NAME not like", value, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameIn(List<String> values) {
            addCriterion("SUBJECT_COMPANY_NAME in", values, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameNotIn(List<String> values) {
            addCriterion("SUBJECT_COMPANY_NAME not in", values, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameBetween(String value1, String value2) {
            addCriterion("SUBJECT_COMPANY_NAME between", value1, value2, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyNameNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_COMPANY_NAME not between", value1, value2, "subjectCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeIsNull() {
            addCriterion("SUBJECT_COMPANY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeIsNotNull() {
            addCriterion("SUBJECT_COMPANY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_CODE =", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeNotEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_CODE <>", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeGreaterThan(String value) {
            addCriterion("SUBJECT_COMPANY_CODE >", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_CODE >=", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeLessThan(String value) {
            addCriterion("SUBJECT_COMPANY_CODE <", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_COMPANY_CODE <=", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeLike(String value) {
            addCriterion("SUBJECT_COMPANY_CODE like", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeNotLike(String value) {
            addCriterion("SUBJECT_COMPANY_CODE not like", value, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeIn(List<String> values) {
            addCriterion("SUBJECT_COMPANY_CODE in", values, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeNotIn(List<String> values) {
            addCriterion("SUBJECT_COMPANY_CODE not in", values, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeBetween(String value1, String value2) {
            addCriterion("SUBJECT_COMPANY_CODE between", value1, value2, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubjectCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_COMPANY_CODE not between", value1, value2, "subjectCompanyCode");
            return (Criteria) this;
        }

        public Criteria andManagerScaleIsNull() {
            addCriterion("MANAGER_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andManagerScaleIsNotNull() {
            addCriterion("MANAGER_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andManagerScaleEqualTo(String value) {
            addCriterion("MANAGER_SCALE =", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleNotEqualTo(String value) {
            addCriterion("MANAGER_SCALE <>", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleGreaterThan(String value) {
            addCriterion("MANAGER_SCALE >", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER_SCALE >=", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleLessThan(String value) {
            addCriterion("MANAGER_SCALE <", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleLessThanOrEqualTo(String value) {
            addCriterion("MANAGER_SCALE <=", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleLike(String value) {
            addCriterion("MANAGER_SCALE like", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleNotLike(String value) {
            addCriterion("MANAGER_SCALE not like", value, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleIn(List<String> values) {
            addCriterion("MANAGER_SCALE in", values, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleNotIn(List<String> values) {
            addCriterion("MANAGER_SCALE not in", values, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleBetween(String value1, String value2) {
            addCriterion("MANAGER_SCALE between", value1, value2, "managerScale");
            return (Criteria) this;
        }

        public Criteria andManagerScaleNotBetween(String value1, String value2) {
            addCriterion("MANAGER_SCALE not between", value1, value2, "managerScale");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("ZONE is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("ZONE =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("ZONE <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("ZONE >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("ZONE >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("ZONE <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("ZONE <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("ZONE like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("ZONE not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("ZONE in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("ZONE not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("ZONE between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("ZONE not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNull() {
            addCriterion("INDUSTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("INDUSTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(String value) {
            addCriterion("INDUSTRY_CODE =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(String value) {
            addCriterion("INDUSTRY_CODE <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(String value) {
            addCriterion("INDUSTRY_CODE >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CODE >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(String value) {
            addCriterion("INDUSTRY_CODE <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_CODE <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLike(String value) {
            addCriterion("INDUSTRY_CODE like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotLike(String value) {
            addCriterion("INDUSTRY_CODE not like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<String> values) {
            addCriterion("INDUSTRY_CODE in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<String> values) {
            addCriterion("INDUSTRY_CODE not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CODE between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_CODE not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIsNull() {
            addCriterion("ECONOMY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIsNotNull() {
            addCriterion("ECONOMY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeEqualTo(String value) {
            addCriterion("ECONOMY_TYPE =", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotEqualTo(String value) {
            addCriterion("ECONOMY_TYPE <>", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeGreaterThan(String value) {
            addCriterion("ECONOMY_TYPE >", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMY_TYPE >=", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLessThan(String value) {
            addCriterion("ECONOMY_TYPE <", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLessThanOrEqualTo(String value) {
            addCriterion("ECONOMY_TYPE <=", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLike(String value) {
            addCriterion("ECONOMY_TYPE like", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotLike(String value) {
            addCriterion("ECONOMY_TYPE not like", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIn(List<String> values) {
            addCriterion("ECONOMY_TYPE in", values, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotIn(List<String> values) {
            addCriterion("ECONOMY_TYPE not in", values, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeBetween(String value1, String value2) {
            addCriterion("ECONOMY_TYPE between", value1, value2, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotBetween(String value1, String value2) {
            addCriterion("ECONOMY_TYPE not between", value1, value2, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureIsNull() {
            addCriterion("ECONOMY_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureIsNotNull() {
            addCriterion("ECONOMY_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureEqualTo(String value) {
            addCriterion("ECONOMY_NATURE =", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureNotEqualTo(String value) {
            addCriterion("ECONOMY_NATURE <>", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureGreaterThan(String value) {
            addCriterion("ECONOMY_NATURE >", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMY_NATURE >=", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureLessThan(String value) {
            addCriterion("ECONOMY_NATURE <", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureLessThanOrEqualTo(String value) {
            addCriterion("ECONOMY_NATURE <=", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureLike(String value) {
            addCriterion("ECONOMY_NATURE like", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureNotLike(String value) {
            addCriterion("ECONOMY_NATURE not like", value, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureIn(List<String> values) {
            addCriterion("ECONOMY_NATURE in", values, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureNotIn(List<String> values) {
            addCriterion("ECONOMY_NATURE not in", values, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureBetween(String value1, String value2) {
            addCriterion("ECONOMY_NATURE between", value1, value2, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEconomyNatureNotBetween(String value1, String value2) {
            addCriterion("ECONOMY_NATURE not between", value1, value2, "economyNature");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityIsNull() {
            addCriterion("EMPLOYEE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityIsNotNull() {
            addCriterion("EMPLOYEE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityEqualTo(String value) {
            addCriterion("EMPLOYEE_QUANTITY =", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotEqualTo(String value) {
            addCriterion("EMPLOYEE_QUANTITY <>", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityGreaterThan(String value) {
            addCriterion("EMPLOYEE_QUANTITY >", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_QUANTITY >=", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityLessThan(String value) {
            addCriterion("EMPLOYEE_QUANTITY <", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_QUANTITY <=", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityLike(String value) {
            addCriterion("EMPLOYEE_QUANTITY like", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotLike(String value) {
            addCriterion("EMPLOYEE_QUANTITY not like", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityIn(List<String> values) {
            addCriterion("EMPLOYEE_QUANTITY in", values, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotIn(List<String> values) {
            addCriterion("EMPLOYEE_QUANTITY not in", values, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_QUANTITY between", value1, value2, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_QUANTITY not between", value1, value2, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundIsNull() {
            addCriterion("HAS_CONTAIL_GROUND is null");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundIsNotNull() {
            addCriterion("HAS_CONTAIL_GROUND is not null");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundEqualTo(String value) {
            addCriterion("HAS_CONTAIL_GROUND =", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundNotEqualTo(String value) {
            addCriterion("HAS_CONTAIL_GROUND <>", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundGreaterThan(String value) {
            addCriterion("HAS_CONTAIL_GROUND >", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_CONTAIL_GROUND >=", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundLessThan(String value) {
            addCriterion("HAS_CONTAIL_GROUND <", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundLessThanOrEqualTo(String value) {
            addCriterion("HAS_CONTAIL_GROUND <=", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundLike(String value) {
            addCriterion("HAS_CONTAIL_GROUND like", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundNotLike(String value) {
            addCriterion("HAS_CONTAIL_GROUND not like", value, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundIn(List<String> values) {
            addCriterion("HAS_CONTAIL_GROUND in", values, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundNotIn(List<String> values) {
            addCriterion("HAS_CONTAIL_GROUND not in", values, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundBetween(String value1, String value2) {
            addCriterion("HAS_CONTAIL_GROUND between", value1, value2, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andHasContailGroundNotBetween(String value1, String value2) {
            addCriterion("HAS_CONTAIL_GROUND not between", value1, value2, "hasContailGround");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("BUSINESS_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("BUSINESS_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("BUSINESS_SCOPE >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("BUSINESS_SCOPE <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_SCOPE <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("BUSINESS_SCOPE like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("BUSINESS_SCOPE not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("BUSINESS_SCOPE not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_SCOPE not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("REGISTERED_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("REGISTERED_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("REGISTERED_ADDRESS >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("REGISTERED_ADDRESS <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_ADDRESS <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("REGISTERED_ADDRESS like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("REGISTERED_ADDRESS not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("REGISTERED_ADDRESS in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("REGISTERED_ADDRESS not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("REGISTERED_ADDRESS between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_ADDRESS not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andSellPercentIsNull() {
            addCriterion("SELL_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andSellPercentIsNotNull() {
            addCriterion("SELL_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andSellPercentEqualTo(BigDecimal value) {
            addCriterion("SELL_PERCENT =", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentNotEqualTo(BigDecimal value) {
            addCriterion("SELL_PERCENT <>", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentGreaterThan(BigDecimal value) {
            addCriterion("SELL_PERCENT >", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELL_PERCENT >=", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentLessThan(BigDecimal value) {
            addCriterion("SELL_PERCENT <", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELL_PERCENT <=", value, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentIn(List<BigDecimal> values) {
            addCriterion("SELL_PERCENT in", values, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentNotIn(List<BigDecimal> values) {
            addCriterion("SELL_PERCENT not in", values, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELL_PERCENT between", value1, value2, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andSellPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELL_PERCENT not between", value1, value2, "sellPercent");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalIsNull() {
            addCriterion("TOTAL_STOCK_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalIsNotNull() {
            addCriterion("TOTAL_STOCK_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalEqualTo(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL =", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalNotEqualTo(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL <>", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalGreaterThan(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL >", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL >=", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalLessThan(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL <", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL <=", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalLike(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL like", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalNotLike(String value) {
            addCriterion("TOTAL_STOCK_CAPITAL not like", value, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalIn(List<String> values) {
            addCriterion("TOTAL_STOCK_CAPITAL in", values, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalNotIn(List<String> values) {
            addCriterion("TOTAL_STOCK_CAPITAL not in", values, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalBetween(String value1, String value2) {
            addCriterion("TOTAL_STOCK_CAPITAL between", value1, value2, "totalStockCapital");
            return (Criteria) this;
        }

        public Criteria andTotalStockCapitalNotBetween(String value1, String value2) {
            addCriterion("TOTAL_STOCK_CAPITAL not between", value1, value2, "totalStockCapital");
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

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("REGISTERED_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("REGISTERED_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("REGISTERED_CAPITAL >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("REGISTERED_CAPITAL <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("REGISTERED_CAPITAL <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("REGISTERED_CAPITAL like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("REGISTERED_CAPITAL not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("REGISTERED_CAPITAL in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("REGISTERED_CAPITAL not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("REGISTERED_CAPITAL between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("REGISTERED_CAPITAL not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeIsNull() {
            addCriterion("DECISION_FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeIsNotNull() {
            addCriterion("DECISION_FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeEqualTo(String value) {
            addCriterion("DECISION_FILE_TYPE =", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeNotEqualTo(String value) {
            addCriterion("DECISION_FILE_TYPE <>", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeGreaterThan(String value) {
            addCriterion("DECISION_FILE_TYPE >", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DECISION_FILE_TYPE >=", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeLessThan(String value) {
            addCriterion("DECISION_FILE_TYPE <", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeLessThanOrEqualTo(String value) {
            addCriterion("DECISION_FILE_TYPE <=", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeLike(String value) {
            addCriterion("DECISION_FILE_TYPE like", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeNotLike(String value) {
            addCriterion("DECISION_FILE_TYPE not like", value, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeIn(List<String> values) {
            addCriterion("DECISION_FILE_TYPE in", values, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeNotIn(List<String> values) {
            addCriterion("DECISION_FILE_TYPE not in", values, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeBetween(String value1, String value2) {
            addCriterion("DECISION_FILE_TYPE between", value1, value2, "decisionFileType");
            return (Criteria) this;
        }

        public Criteria andDecisionFileTypeNotBetween(String value1, String value2) {
            addCriterion("DECISION_FILE_TYPE not between", value1, value2, "decisionFileType");
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