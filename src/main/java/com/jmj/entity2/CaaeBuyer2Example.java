package com.jmj.entity2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeBuyer2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeBuyer2Example() {
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

        public Criteria andBuyerIdIsNull() {
            addCriterion("BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("BUYER_ID =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("BUYER_ID like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("BUYER_ID not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("BUYER_ID in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("BUYER_ID not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("BUYER_ID between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_ID not between", value1, value2, "buyerId");
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

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentIsNull() {
            addCriterion("BUYER_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentIsNotNull() {
            addCriterion("BUYER_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentEqualTo(BigDecimal value) {
            addCriterion("BUYER_PERCENT =", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentNotEqualTo(BigDecimal value) {
            addCriterion("BUYER_PERCENT <>", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentGreaterThan(BigDecimal value) {
            addCriterion("BUYER_PERCENT >", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUYER_PERCENT >=", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentLessThan(BigDecimal value) {
            addCriterion("BUYER_PERCENT <", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUYER_PERCENT <=", value, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentIn(List<BigDecimal> values) {
            addCriterion("BUYER_PERCENT in", values, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentNotIn(List<BigDecimal> values) {
            addCriterion("BUYER_PERCENT not in", values, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUYER_PERCENT between", value1, value2, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUYER_PERCENT not between", value1, value2, "buyerPercent");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIsNull() {
            addCriterion("BUYER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIsNotNull() {
            addCriterion("BUYER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeEqualTo(String value) {
            addCriterion("BUYER_CODE =", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotEqualTo(String value) {
            addCriterion("BUYER_CODE <>", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeGreaterThan(String value) {
            addCriterion("BUYER_CODE >", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CODE >=", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLessThan(String value) {
            addCriterion("BUYER_CODE <", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CODE <=", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeLike(String value) {
            addCriterion("BUYER_CODE like", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotLike(String value) {
            addCriterion("BUYER_CODE not like", value, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeIn(List<String> values) {
            addCriterion("BUYER_CODE in", values, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotIn(List<String> values) {
            addCriterion("BUYER_CODE not in", values, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeBetween(String value1, String value2) {
            addCriterion("BUYER_CODE between", value1, value2, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerCodeNotBetween(String value1, String value2) {
            addCriterion("BUYER_CODE not between", value1, value2, "buyerCode");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIsNull() {
            addCriterion("BUYER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIsNotNull() {
            addCriterion("BUYER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeEqualTo(String value) {
            addCriterion("BUYER_TYPE =", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotEqualTo(String value) {
            addCriterion("BUYER_TYPE <>", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThan(String value) {
            addCriterion("BUYER_TYPE >", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_TYPE >=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThan(String value) {
            addCriterion("BUYER_TYPE <", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_TYPE <=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLike(String value) {
            addCriterion("BUYER_TYPE like", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotLike(String value) {
            addCriterion("BUYER_TYPE not like", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIn(List<String> values) {
            addCriterion("BUYER_TYPE in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotIn(List<String> values) {
            addCriterion("BUYER_TYPE not in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeBetween(String value1, String value2) {
            addCriterion("BUYER_TYPE between", value1, value2, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotBetween(String value1, String value2) {
            addCriterion("BUYER_TYPE not between", value1, value2, "buyerType");
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

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("BUYER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("BUYER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("BUYER_PHONE =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("BUYER_PHONE <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("BUYER_PHONE >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("BUYER_PHONE <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("BUYER_PHONE <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("BUYER_PHONE like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("BUYER_PHONE not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("BUYER_PHONE in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("BUYER_PHONE not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("BUYER_PHONE not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("BUYER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("BUYER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("BUYER_ADDRESS =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("BUYER_ADDRESS >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("BUYER_ADDRESS <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("BUYER_ADDRESS like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("BUYER_ADDRESS not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("BUYER_ADDRESS in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("BUYER_ADDRESS not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNull() {
            addCriterion("BUYER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNotNull() {
            addCriterion("BUYER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailEqualTo(String value) {
            addCriterion("BUYER_EMAIL =", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotEqualTo(String value) {
            addCriterion("BUYER_EMAIL <>", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThan(String value) {
            addCriterion("BUYER_EMAIL >", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL >=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThan(String value) {
            addCriterion("BUYER_EMAIL <", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL <=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLike(String value) {
            addCriterion("BUYER_EMAIL like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotLike(String value) {
            addCriterion("BUYER_EMAIL not like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIn(List<String> values) {
            addCriterion("BUYER_EMAIL in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotIn(List<String> values) {
            addCriterion("BUYER_EMAIL not in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL not between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andIsUnionIsNull() {
            addCriterion("IS_UNION is null");
            return (Criteria) this;
        }

        public Criteria andIsUnionIsNotNull() {
            addCriterion("IS_UNION is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnionEqualTo(String value) {
            addCriterion("IS_UNION =", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionNotEqualTo(String value) {
            addCriterion("IS_UNION <>", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionGreaterThan(String value) {
            addCriterion("IS_UNION >", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UNION >=", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionLessThan(String value) {
            addCriterion("IS_UNION <", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionLessThanOrEqualTo(String value) {
            addCriterion("IS_UNION <=", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionLike(String value) {
            addCriterion("IS_UNION like", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionNotLike(String value) {
            addCriterion("IS_UNION not like", value, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionIn(List<String> values) {
            addCriterion("IS_UNION in", values, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionNotIn(List<String> values) {
            addCriterion("IS_UNION not in", values, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionBetween(String value1, String value2) {
            addCriterion("IS_UNION between", value1, value2, "isUnion");
            return (Criteria) this;
        }

        public Criteria andIsUnionNotBetween(String value1, String value2) {
            addCriterion("IS_UNION not between", value1, value2, "isUnion");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerIsNull() {
            addCriterion("BUYER_BROKER is null");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerIsNotNull() {
            addCriterion("BUYER_BROKER is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerEqualTo(String value) {
            addCriterion("BUYER_BROKER =", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerNotEqualTo(String value) {
            addCriterion("BUYER_BROKER <>", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerGreaterThan(String value) {
            addCriterion("BUYER_BROKER >", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_BROKER >=", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerLessThan(String value) {
            addCriterion("BUYER_BROKER <", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerLessThanOrEqualTo(String value) {
            addCriterion("BUYER_BROKER <=", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerLike(String value) {
            addCriterion("BUYER_BROKER like", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerNotLike(String value) {
            addCriterion("BUYER_BROKER not like", value, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerIn(List<String> values) {
            addCriterion("BUYER_BROKER in", values, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerNotIn(List<String> values) {
            addCriterion("BUYER_BROKER not in", values, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerBetween(String value1, String value2) {
            addCriterion("BUYER_BROKER between", value1, value2, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andBuyerBrokerNotBetween(String value1, String value2) {
            addCriterion("BUYER_BROKER not between", value1, value2, "buyerBroker");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentIsNull() {
            addCriterion("WANT_BUY_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentIsNotNull() {
            addCriterion("WANT_BUY_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentEqualTo(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT =", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentNotEqualTo(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT <>", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentGreaterThan(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT >", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT >=", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentLessThan(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT <", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WANT_BUY_PERCENT <=", value, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentIn(List<BigDecimal> values) {
            addCriterion("WANT_BUY_PERCENT in", values, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentNotIn(List<BigDecimal> values) {
            addCriterion("WANT_BUY_PERCENT not in", values, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WANT_BUY_PERCENT between", value1, value2, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andWantBuyPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WANT_BUY_PERCENT not between", value1, value2, "wantBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentIsNull() {
            addCriterion("FINAL_BUY_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentIsNotNull() {
            addCriterion("FINAL_BUY_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentEqualTo(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT =", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentNotEqualTo(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT <>", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentGreaterThan(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT >", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT >=", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentLessThan(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT <", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINAL_BUY_PERCENT <=", value, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentIn(List<BigDecimal> values) {
            addCriterion("FINAL_BUY_PERCENT in", values, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentNotIn(List<BigDecimal> values) {
            addCriterion("FINAL_BUY_PERCENT not in", values, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINAL_BUY_PERCENT between", value1, value2, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andFinalBuyPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINAL_BUY_PERCENT not between", value1, value2, "finalBuyPercent");
            return (Criteria) this;
        }

        public Criteria andHasPriorityIsNull() {
            addCriterion("HAS_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andHasPriorityIsNotNull() {
            addCriterion("HAS_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andHasPriorityEqualTo(String value) {
            addCriterion("HAS_PRIORITY =", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityNotEqualTo(String value) {
            addCriterion("HAS_PRIORITY <>", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityGreaterThan(String value) {
            addCriterion("HAS_PRIORITY >", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_PRIORITY >=", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityLessThan(String value) {
            addCriterion("HAS_PRIORITY <", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityLessThanOrEqualTo(String value) {
            addCriterion("HAS_PRIORITY <=", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityLike(String value) {
            addCriterion("HAS_PRIORITY like", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityNotLike(String value) {
            addCriterion("HAS_PRIORITY not like", value, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityIn(List<String> values) {
            addCriterion("HAS_PRIORITY in", values, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityNotIn(List<String> values) {
            addCriterion("HAS_PRIORITY not in", values, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityBetween(String value1, String value2) {
            addCriterion("HAS_PRIORITY between", value1, value2, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andHasPriorityNotBetween(String value1, String value2) {
            addCriterion("HAS_PRIORITY not between", value1, value2, "hasPriority");
            return (Criteria) this;
        }

        public Criteria andInvestPercentIsNull() {
            addCriterion("INVEST_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andInvestPercentIsNotNull() {
            addCriterion("INVEST_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestPercentEqualTo(String value) {
            addCriterion("INVEST_PERCENT =", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentNotEqualTo(String value) {
            addCriterion("INVEST_PERCENT <>", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentGreaterThan(String value) {
            addCriterion("INVEST_PERCENT >", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_PERCENT >=", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentLessThan(String value) {
            addCriterion("INVEST_PERCENT <", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentLessThanOrEqualTo(String value) {
            addCriterion("INVEST_PERCENT <=", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentLike(String value) {
            addCriterion("INVEST_PERCENT like", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentNotLike(String value) {
            addCriterion("INVEST_PERCENT not like", value, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentIn(List<String> values) {
            addCriterion("INVEST_PERCENT in", values, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentNotIn(List<String> values) {
            addCriterion("INVEST_PERCENT not in", values, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentBetween(String value1, String value2) {
            addCriterion("INVEST_PERCENT between", value1, value2, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestPercentNotBetween(String value1, String value2) {
            addCriterion("INVEST_PERCENT not between", value1, value2, "investPercent");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIsNull() {
            addCriterion("INVEST_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIsNotNull() {
            addCriterion("INVEST_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestAmountEqualTo(String value) {
            addCriterion("INVEST_AMOUNT =", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotEqualTo(String value) {
            addCriterion("INVEST_AMOUNT <>", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountGreaterThan(String value) {
            addCriterion("INVEST_AMOUNT >", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_AMOUNT >=", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountLessThan(String value) {
            addCriterion("INVEST_AMOUNT <", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountLessThanOrEqualTo(String value) {
            addCriterion("INVEST_AMOUNT <=", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountLike(String value) {
            addCriterion("INVEST_AMOUNT like", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotLike(String value) {
            addCriterion("INVEST_AMOUNT not like", value, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountIn(List<String> values) {
            addCriterion("INVEST_AMOUNT in", values, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotIn(List<String> values) {
            addCriterion("INVEST_AMOUNT not in", values, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountBetween(String value1, String value2) {
            addCriterion("INVEST_AMOUNT between", value1, value2, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestAmountNotBetween(String value1, String value2) {
            addCriterion("INVEST_AMOUNT not between", value1, value2, "investAmount");
            return (Criteria) this;
        }

        public Criteria andInvestPriceIsNull() {
            addCriterion("INVEST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andInvestPriceIsNotNull() {
            addCriterion("INVEST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestPriceEqualTo(String value) {
            addCriterion("INVEST_PRICE =", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceNotEqualTo(String value) {
            addCriterion("INVEST_PRICE <>", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceGreaterThan(String value) {
            addCriterion("INVEST_PRICE >", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_PRICE >=", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceLessThan(String value) {
            addCriterion("INVEST_PRICE <", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceLessThanOrEqualTo(String value) {
            addCriterion("INVEST_PRICE <=", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceLike(String value) {
            addCriterion("INVEST_PRICE like", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceNotLike(String value) {
            addCriterion("INVEST_PRICE not like", value, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceIn(List<String> values) {
            addCriterion("INVEST_PRICE in", values, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceNotIn(List<String> values) {
            addCriterion("INVEST_PRICE not in", values, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceBetween(String value1, String value2) {
            addCriterion("INVEST_PRICE between", value1, value2, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestPriceNotBetween(String value1, String value2) {
            addCriterion("INVEST_PRICE not between", value1, value2, "investPrice");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkIsNull() {
            addCriterion("INVEST_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkIsNotNull() {
            addCriterion("INVEST_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkEqualTo(String value) {
            addCriterion("INVEST_REMARK =", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkNotEqualTo(String value) {
            addCriterion("INVEST_REMARK <>", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkGreaterThan(String value) {
            addCriterion("INVEST_REMARK >", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_REMARK >=", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkLessThan(String value) {
            addCriterion("INVEST_REMARK <", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkLessThanOrEqualTo(String value) {
            addCriterion("INVEST_REMARK <=", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkLike(String value) {
            addCriterion("INVEST_REMARK like", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkNotLike(String value) {
            addCriterion("INVEST_REMARK not like", value, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkIn(List<String> values) {
            addCriterion("INVEST_REMARK in", values, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkNotIn(List<String> values) {
            addCriterion("INVEST_REMARK not in", values, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkBetween(String value1, String value2) {
            addCriterion("INVEST_REMARK between", value1, value2, "investRemark");
            return (Criteria) this;
        }

        public Criteria andInvestRemarkNotBetween(String value1, String value2) {
            addCriterion("INVEST_REMARK not between", value1, value2, "investRemark");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerIsNull() {
            addCriterion("IS_MANAGER_LAYER is null");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerIsNotNull() {
            addCriterion("IS_MANAGER_LAYER is not null");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerEqualTo(String value) {
            addCriterion("IS_MANAGER_LAYER =", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerNotEqualTo(String value) {
            addCriterion("IS_MANAGER_LAYER <>", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerGreaterThan(String value) {
            addCriterion("IS_MANAGER_LAYER >", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MANAGER_LAYER >=", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerLessThan(String value) {
            addCriterion("IS_MANAGER_LAYER <", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerLessThanOrEqualTo(String value) {
            addCriterion("IS_MANAGER_LAYER <=", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerLike(String value) {
            addCriterion("IS_MANAGER_LAYER like", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerNotLike(String value) {
            addCriterion("IS_MANAGER_LAYER not like", value, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerIn(List<String> values) {
            addCriterion("IS_MANAGER_LAYER in", values, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerNotIn(List<String> values) {
            addCriterion("IS_MANAGER_LAYER not in", values, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerBetween(String value1, String value2) {
            addCriterion("IS_MANAGER_LAYER between", value1, value2, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andIsManagerLayerNotBetween(String value1, String value2) {
            addCriterion("IS_MANAGER_LAYER not between", value1, value2, "isManagerLayer");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleIsNull() {
            addCriterion("BUYER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleIsNotNull() {
            addCriterion("BUYER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleEqualTo(String value) {
            addCriterion("BUYER_ROLE =", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleNotEqualTo(String value) {
            addCriterion("BUYER_ROLE <>", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleGreaterThan(String value) {
            addCriterion("BUYER_ROLE >", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ROLE >=", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleLessThan(String value) {
            addCriterion("BUYER_ROLE <", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ROLE <=", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleLike(String value) {
            addCriterion("BUYER_ROLE like", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleNotLike(String value) {
            addCriterion("BUYER_ROLE not like", value, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleIn(List<String> values) {
            addCriterion("BUYER_ROLE in", values, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleNotIn(List<String> values) {
            addCriterion("BUYER_ROLE not in", values, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleBetween(String value1, String value2) {
            addCriterion("BUYER_ROLE between", value1, value2, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andBuyerRoleNotBetween(String value1, String value2) {
            addCriterion("BUYER_ROLE not between", value1, value2, "buyerRole");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("REGISTER_DATE =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("REGISTER_DATE <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("REGISTER_DATE >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("REGISTER_DATE <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("REGISTER_DATE in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("REGISTER_DATE not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIsNull() {
            addCriterion("ACCEPT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIsNotNull() {
            addCriterion("ACCEPT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptResultEqualTo(String value) {
            addCriterion("ACCEPT_RESULT =", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotEqualTo(String value) {
            addCriterion("ACCEPT_RESULT <>", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultGreaterThan(String value) {
            addCriterion("ACCEPT_RESULT >", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPT_RESULT >=", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultLessThan(String value) {
            addCriterion("ACCEPT_RESULT <", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultLessThanOrEqualTo(String value) {
            addCriterion("ACCEPT_RESULT <=", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultLike(String value) {
            addCriterion("ACCEPT_RESULT like", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotLike(String value) {
            addCriterion("ACCEPT_RESULT not like", value, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultIn(List<String> values) {
            addCriterion("ACCEPT_RESULT in", values, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotIn(List<String> values) {
            addCriterion("ACCEPT_RESULT not in", values, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultBetween(String value1, String value2) {
            addCriterion("ACCEPT_RESULT between", value1, value2, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptResultNotBetween(String value1, String value2) {
            addCriterion("ACCEPT_RESULT not between", value1, value2, "acceptResult");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("ACCEPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("ACCEPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterion("ACCEPT_DATE =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterion("ACCEPT_DATE <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterion("ACCEPT_DATE >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_DATE >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterion("ACCEPT_DATE <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_DATE <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterion("ACCEPT_DATE in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterion("ACCEPT_DATE not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_DATE between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_DATE not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonIsNull() {
            addCriterion("NO_ACCEPT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonIsNotNull() {
            addCriterion("NO_ACCEPT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonEqualTo(String value) {
            addCriterion("NO_ACCEPT_REASON =", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonNotEqualTo(String value) {
            addCriterion("NO_ACCEPT_REASON <>", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonGreaterThan(String value) {
            addCriterion("NO_ACCEPT_REASON >", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonGreaterThanOrEqualTo(String value) {
            addCriterion("NO_ACCEPT_REASON >=", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonLessThan(String value) {
            addCriterion("NO_ACCEPT_REASON <", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonLessThanOrEqualTo(String value) {
            addCriterion("NO_ACCEPT_REASON <=", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonLike(String value) {
            addCriterion("NO_ACCEPT_REASON like", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonNotLike(String value) {
            addCriterion("NO_ACCEPT_REASON not like", value, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonIn(List<String> values) {
            addCriterion("NO_ACCEPT_REASON in", values, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonNotIn(List<String> values) {
            addCriterion("NO_ACCEPT_REASON not in", values, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonBetween(String value1, String value2) {
            addCriterion("NO_ACCEPT_REASON between", value1, value2, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andNoAcceptReasonNotBetween(String value1, String value2) {
            addCriterion("NO_ACCEPT_REASON not between", value1, value2, "noAcceptReason");
            return (Criteria) this;
        }

        public Criteria andConfirmResultIsNull() {
            addCriterion("CONFIRM_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmResultIsNotNull() {
            addCriterion("CONFIRM_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmResultEqualTo(String value) {
            addCriterion("CONFIRM_RESULT =", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultNotEqualTo(String value) {
            addCriterion("CONFIRM_RESULT <>", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultGreaterThan(String value) {
            addCriterion("CONFIRM_RESULT >", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_RESULT >=", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultLessThan(String value) {
            addCriterion("CONFIRM_RESULT <", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_RESULT <=", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultLike(String value) {
            addCriterion("CONFIRM_RESULT like", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultNotLike(String value) {
            addCriterion("CONFIRM_RESULT not like", value, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultIn(List<String> values) {
            addCriterion("CONFIRM_RESULT in", values, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultNotIn(List<String> values) {
            addCriterion("CONFIRM_RESULT not in", values, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultBetween(String value1, String value2) {
            addCriterion("CONFIRM_RESULT between", value1, value2, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmResultNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_RESULT not between", value1, value2, "confirmResult");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNull() {
            addCriterion("CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNotNull() {
            addCriterion("CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateEqualTo(Date value) {
            addCriterion("CONFIRM_DATE =", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotEqualTo(Date value) {
            addCriterion("CONFIRM_DATE <>", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThan(Date value) {
            addCriterion("CONFIRM_DATE >", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_DATE >=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThan(Date value) {
            addCriterion("CONFIRM_DATE <", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_DATE <=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIn(List<Date> values) {
            addCriterion("CONFIRM_DATE in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotIn(List<Date> values) {
            addCriterion("CONFIRM_DATE not in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_DATE between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_DATE not between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonIsNull() {
            addCriterion("NO_CONFIRM_REASON is null");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonIsNotNull() {
            addCriterion("NO_CONFIRM_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonEqualTo(String value) {
            addCriterion("NO_CONFIRM_REASON =", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonNotEqualTo(String value) {
            addCriterion("NO_CONFIRM_REASON <>", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonGreaterThan(String value) {
            addCriterion("NO_CONFIRM_REASON >", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonGreaterThanOrEqualTo(String value) {
            addCriterion("NO_CONFIRM_REASON >=", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonLessThan(String value) {
            addCriterion("NO_CONFIRM_REASON <", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonLessThanOrEqualTo(String value) {
            addCriterion("NO_CONFIRM_REASON <=", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonLike(String value) {
            addCriterion("NO_CONFIRM_REASON like", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonNotLike(String value) {
            addCriterion("NO_CONFIRM_REASON not like", value, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonIn(List<String> values) {
            addCriterion("NO_CONFIRM_REASON in", values, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonNotIn(List<String> values) {
            addCriterion("NO_CONFIRM_REASON not in", values, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonBetween(String value1, String value2) {
            addCriterion("NO_CONFIRM_REASON between", value1, value2, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andNoConfirmReasonNotBetween(String value1, String value2) {
            addCriterion("NO_CONFIRM_REASON not between", value1, value2, "noConfirmReason");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNull() {
            addCriterion("QUIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQuitDateIsNotNull() {
            addCriterion("QUIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQuitDateEqualTo(Date value) {
            addCriterion("QUIT_DATE =", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotEqualTo(Date value) {
            addCriterion("QUIT_DATE <>", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThan(Date value) {
            addCriterion("QUIT_DATE >", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE >=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThan(Date value) {
            addCriterion("QUIT_DATE <", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateLessThanOrEqualTo(Date value) {
            addCriterion("QUIT_DATE <=", value, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateIn(List<Date> values) {
            addCriterion("QUIT_DATE in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotIn(List<Date> values) {
            addCriterion("QUIT_DATE not in", values, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitDateNotBetween(Date value1, Date value2) {
            addCriterion("QUIT_DATE not between", value1, value2, "quitDate");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNull() {
            addCriterion("QUIT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIsNotNull() {
            addCriterion("QUIT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andQuitReasonEqualTo(String value) {
            addCriterion("QUIT_REASON =", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotEqualTo(String value) {
            addCriterion("QUIT_REASON <>", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThan(String value) {
            addCriterion("QUIT_REASON >", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON >=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThan(String value) {
            addCriterion("QUIT_REASON <", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLessThanOrEqualTo(String value) {
            addCriterion("QUIT_REASON <=", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonLike(String value) {
            addCriterion("QUIT_REASON like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotLike(String value) {
            addCriterion("QUIT_REASON not like", value, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonIn(List<String> values) {
            addCriterion("QUIT_REASON in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotIn(List<String> values) {
            addCriterion("QUIT_REASON not in", values, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonBetween(String value1, String value2) {
            addCriterion("QUIT_REASON between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andQuitReasonNotBetween(String value1, String value2) {
            addCriterion("QUIT_REASON not between", value1, value2, "quitReason");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andHasAuditIsNull() {
            addCriterion("HAS_AUDIT is null");
            return (Criteria) this;
        }

        public Criteria andHasAuditIsNotNull() {
            addCriterion("HAS_AUDIT is not null");
            return (Criteria) this;
        }

        public Criteria andHasAuditEqualTo(String value) {
            addCriterion("HAS_AUDIT =", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditNotEqualTo(String value) {
            addCriterion("HAS_AUDIT <>", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditGreaterThan(String value) {
            addCriterion("HAS_AUDIT >", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_AUDIT >=", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditLessThan(String value) {
            addCriterion("HAS_AUDIT <", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditLessThanOrEqualTo(String value) {
            addCriterion("HAS_AUDIT <=", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditLike(String value) {
            addCriterion("HAS_AUDIT like", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditNotLike(String value) {
            addCriterion("HAS_AUDIT not like", value, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditIn(List<String> values) {
            addCriterion("HAS_AUDIT in", values, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditNotIn(List<String> values) {
            addCriterion("HAS_AUDIT not in", values, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditBetween(String value1, String value2) {
            addCriterion("HAS_AUDIT between", value1, value2, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andHasAuditNotBetween(String value1, String value2) {
            addCriterion("HAS_AUDIT not between", value1, value2, "hasAudit");
            return (Criteria) this;
        }

        public Criteria andExaminResultIsNull() {
            addCriterion("EXAMIN_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andExaminResultIsNotNull() {
            addCriterion("EXAMIN_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andExaminResultEqualTo(String value) {
            addCriterion("EXAMIN_RESULT =", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultNotEqualTo(String value) {
            addCriterion("EXAMIN_RESULT <>", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultGreaterThan(String value) {
            addCriterion("EXAMIN_RESULT >", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMIN_RESULT >=", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultLessThan(String value) {
            addCriterion("EXAMIN_RESULT <", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultLessThanOrEqualTo(String value) {
            addCriterion("EXAMIN_RESULT <=", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultLike(String value) {
            addCriterion("EXAMIN_RESULT like", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultNotLike(String value) {
            addCriterion("EXAMIN_RESULT not like", value, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultIn(List<String> values) {
            addCriterion("EXAMIN_RESULT in", values, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultNotIn(List<String> values) {
            addCriterion("EXAMIN_RESULT not in", values, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultBetween(String value1, String value2) {
            addCriterion("EXAMIN_RESULT between", value1, value2, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminResultNotBetween(String value1, String value2) {
            addCriterion("EXAMIN_RESULT not between", value1, value2, "examinResult");
            return (Criteria) this;
        }

        public Criteria andExaminDateIsNull() {
            addCriterion("EXAMIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExaminDateIsNotNull() {
            addCriterion("EXAMIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExaminDateEqualTo(Date value) {
            addCriterion("EXAMIN_DATE =", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateNotEqualTo(Date value) {
            addCriterion("EXAMIN_DATE <>", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateGreaterThan(Date value) {
            addCriterion("EXAMIN_DATE >", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXAMIN_DATE >=", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateLessThan(Date value) {
            addCriterion("EXAMIN_DATE <", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateLessThanOrEqualTo(Date value) {
            addCriterion("EXAMIN_DATE <=", value, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateIn(List<Date> values) {
            addCriterion("EXAMIN_DATE in", values, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateNotIn(List<Date> values) {
            addCriterion("EXAMIN_DATE not in", values, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateBetween(Date value1, Date value2) {
            addCriterion("EXAMIN_DATE between", value1, value2, "examinDate");
            return (Criteria) this;
        }

        public Criteria andExaminDateNotBetween(Date value1, Date value2) {
            addCriterion("EXAMIN_DATE not between", value1, value2, "examinDate");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonIsNull() {
            addCriterion("NO_EXAMIN_REASON is null");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonIsNotNull() {
            addCriterion("NO_EXAMIN_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonEqualTo(String value) {
            addCriterion("NO_EXAMIN_REASON =", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonNotEqualTo(String value) {
            addCriterion("NO_EXAMIN_REASON <>", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonGreaterThan(String value) {
            addCriterion("NO_EXAMIN_REASON >", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonGreaterThanOrEqualTo(String value) {
            addCriterion("NO_EXAMIN_REASON >=", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonLessThan(String value) {
            addCriterion("NO_EXAMIN_REASON <", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonLessThanOrEqualTo(String value) {
            addCriterion("NO_EXAMIN_REASON <=", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonLike(String value) {
            addCriterion("NO_EXAMIN_REASON like", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonNotLike(String value) {
            addCriterion("NO_EXAMIN_REASON not like", value, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonIn(List<String> values) {
            addCriterion("NO_EXAMIN_REASON in", values, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonNotIn(List<String> values) {
            addCriterion("NO_EXAMIN_REASON not in", values, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonBetween(String value1, String value2) {
            addCriterion("NO_EXAMIN_REASON between", value1, value2, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andNoExaminReasonNotBetween(String value1, String value2) {
            addCriterion("NO_EXAMIN_REASON not between", value1, value2, "noExaminReason");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdIsNull() {
            addCriterion("BUYER_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdIsNotNull() {
            addCriterion("BUYER_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdEqualTo(String value) {
            addCriterion("BUYER_UNIT_ID =", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdNotEqualTo(String value) {
            addCriterion("BUYER_UNIT_ID <>", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdGreaterThan(String value) {
            addCriterion("BUYER_UNIT_ID >", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_UNIT_ID >=", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdLessThan(String value) {
            addCriterion("BUYER_UNIT_ID <", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_UNIT_ID <=", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdLike(String value) {
            addCriterion("BUYER_UNIT_ID like", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdNotLike(String value) {
            addCriterion("BUYER_UNIT_ID not like", value, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdIn(List<String> values) {
            addCriterion("BUYER_UNIT_ID in", values, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdNotIn(List<String> values) {
            addCriterion("BUYER_UNIT_ID not in", values, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdBetween(String value1, String value2) {
            addCriterion("BUYER_UNIT_ID between", value1, value2, "buyerUnitId");
            return (Criteria) this;
        }

        public Criteria andBuyerUnitIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_UNIT_ID not between", value1, value2, "buyerUnitId");
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