package com.jmj.entity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeAddPub2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeAddPub2Example() {
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

        public Criteria andAddPubIdIsNull() {
            addCriterion("ADD_PUB_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddPubIdIsNotNull() {
            addCriterion("ADD_PUB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddPubIdEqualTo(String value) {
            addCriterion("ADD_PUB_ID =", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdNotEqualTo(String value) {
            addCriterion("ADD_PUB_ID <>", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdGreaterThan(String value) {
            addCriterion("ADD_PUB_ID >", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_PUB_ID >=", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdLessThan(String value) {
            addCriterion("ADD_PUB_ID <", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdLessThanOrEqualTo(String value) {
            addCriterion("ADD_PUB_ID <=", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdLike(String value) {
            addCriterion("ADD_PUB_ID like", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdNotLike(String value) {
            addCriterion("ADD_PUB_ID not like", value, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdIn(List<String> values) {
            addCriterion("ADD_PUB_ID in", values, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdNotIn(List<String> values) {
            addCriterion("ADD_PUB_ID not in", values, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdBetween(String value1, String value2) {
            addCriterion("ADD_PUB_ID between", value1, value2, "addPubId");
            return (Criteria) this;
        }

        public Criteria andAddPubIdNotBetween(String value1, String value2) {
            addCriterion("ADD_PUB_ID not between", value1, value2, "addPubId");
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

        public Criteria andAdditionalDateIsNull() {
            addCriterion("ADDITIONAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateIsNotNull() {
            addCriterion("ADDITIONAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateEqualTo(Date value) {
            addCriterion("ADDITIONAL_DATE =", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotEqualTo(Date value) {
            addCriterion("ADDITIONAL_DATE <>", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateGreaterThan(Date value) {
            addCriterion("ADDITIONAL_DATE >", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADDITIONAL_DATE >=", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateLessThan(Date value) {
            addCriterion("ADDITIONAL_DATE <", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateLessThanOrEqualTo(Date value) {
            addCriterion("ADDITIONAL_DATE <=", value, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateIn(List<Date> values) {
            addCriterion("ADDITIONAL_DATE in", values, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotIn(List<Date> values) {
            addCriterion("ADDITIONAL_DATE not in", values, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateBetween(Date value1, Date value2) {
            addCriterion("ADDITIONAL_DATE between", value1, value2, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalDateNotBetween(Date value1, Date value2) {
            addCriterion("ADDITIONAL_DATE not between", value1, value2, "additionalDate");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeIsNull() {
            addCriterion("ADDITIONAL_CONTENT_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeIsNotNull() {
            addCriterion("ADDITIONAL_CONTENT_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE =", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeNotEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE <>", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeGreaterThan(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE >", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE >=", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeLessThan(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE <", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeLessThanOrEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE <=", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeLike(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE like", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeNotLike(String value) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE not like", value, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeIn(List<String> values) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE in", values, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeNotIn(List<String> values) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE not in", values, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeBetween(String value1, String value2) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE between", value1, value2, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentBeforeNotBetween(String value1, String value2) {
            addCriterion("ADDITIONAL_CONTENT_BEFORE not between", value1, value2, "additionalContentBefore");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterIsNull() {
            addCriterion("ADDITIONAL_CONTENT_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterIsNotNull() {
            addCriterion("ADDITIONAL_CONTENT_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER =", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterNotEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER <>", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterGreaterThan(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER >", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterGreaterThanOrEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER >=", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterLessThan(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER <", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterLessThanOrEqualTo(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER <=", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterLike(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER like", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterNotLike(String value) {
            addCriterion("ADDITIONAL_CONTENT_AFTER not like", value, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterIn(List<String> values) {
            addCriterion("ADDITIONAL_CONTENT_AFTER in", values, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterNotIn(List<String> values) {
            addCriterion("ADDITIONAL_CONTENT_AFTER not in", values, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterBetween(String value1, String value2) {
            addCriterion("ADDITIONAL_CONTENT_AFTER between", value1, value2, "additionalContentAfter");
            return (Criteria) this;
        }

        public Criteria andAdditionalContentAfterNotBetween(String value1, String value2) {
            addCriterion("ADDITIONAL_CONTENT_AFTER not between", value1, value2, "additionalContentAfter");
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