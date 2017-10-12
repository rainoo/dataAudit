package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeSellerExample() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("SELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("SELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("SELLER_ID =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("SELLER_ID <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("SELLER_ID >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ID >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("SELLER_ID <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ID <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("SELLER_ID like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("SELLER_ID not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("SELLER_ID in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("SELLER_ID not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("SELLER_ID between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_ID not between", value1, value2, "sellerId");
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

        public Criteria andSellerNameIsNull() {
            addCriterion("SELLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("SELLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("SELLER_NAME =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("SELLER_NAME <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("SELLER_NAME >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("SELLER_NAME <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("SELLER_NAME like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("SELLER_NAME not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("SELLER_NAME in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("SELLER_NAME not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("SELLER_NAME between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("SELLER_NAME not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNull() {
            addCriterion("SELLER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNotNull() {
            addCriterion("SELLER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeEqualTo(String value) {
            addCriterion("SELLER_TYPE =", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotEqualTo(String value) {
            addCriterion("SELLER_TYPE <>", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThan(String value) {
            addCriterion("SELLER_TYPE >", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_TYPE >=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThan(String value) {
            addCriterion("SELLER_TYPE <", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThanOrEqualTo(String value) {
            addCriterion("SELLER_TYPE <=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLike(String value) {
            addCriterion("SELLER_TYPE like", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotLike(String value) {
            addCriterion("SELLER_TYPE not like", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIn(List<String> values) {
            addCriterion("SELLER_TYPE in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotIn(List<String> values) {
            addCriterion("SELLER_TYPE not in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeBetween(String value1, String value2) {
            addCriterion("SELLER_TYPE between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotBetween(String value1, String value2) {
            addCriterion("SELLER_TYPE not between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNull() {
            addCriterion("SELLER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIsNotNull() {
            addCriterion("SELLER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCodeEqualTo(String value) {
            addCriterion("SELLER_CODE =", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotEqualTo(String value) {
            addCriterion("SELLER_CODE <>", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThan(String value) {
            addCriterion("SELLER_CODE >", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_CODE >=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThan(String value) {
            addCriterion("SELLER_CODE <", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLessThanOrEqualTo(String value) {
            addCriterion("SELLER_CODE <=", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeLike(String value) {
            addCriterion("SELLER_CODE like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotLike(String value) {
            addCriterion("SELLER_CODE not like", value, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeIn(List<String> values) {
            addCriterion("SELLER_CODE in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotIn(List<String> values) {
            addCriterion("SELLER_CODE not in", values, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeBetween(String value1, String value2) {
            addCriterion("SELLER_CODE between", value1, value2, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andSellerCodeNotBetween(String value1, String value2) {
            addCriterion("SELLER_CODE not between", value1, value2, "sellerCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeIsNull() {
            addCriterion("HQ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHqCodeIsNotNull() {
            addCriterion("HQ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHqCodeEqualTo(String value) {
            addCriterion("HQ_CODE =", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeNotEqualTo(String value) {
            addCriterion("HQ_CODE <>", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeGreaterThan(String value) {
            addCriterion("HQ_CODE >", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HQ_CODE >=", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeLessThan(String value) {
            addCriterion("HQ_CODE <", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeLessThanOrEqualTo(String value) {
            addCriterion("HQ_CODE <=", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeLike(String value) {
            addCriterion("HQ_CODE like", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeNotLike(String value) {
            addCriterion("HQ_CODE not like", value, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeIn(List<String> values) {
            addCriterion("HQ_CODE in", values, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeNotIn(List<String> values) {
            addCriterion("HQ_CODE not in", values, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeBetween(String value1, String value2) {
            addCriterion("HQ_CODE between", value1, value2, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqCodeNotBetween(String value1, String value2) {
            addCriterion("HQ_CODE not between", value1, value2, "hqCode");
            return (Criteria) this;
        }

        public Criteria andHqNameIsNull() {
            addCriterion("HQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHqNameIsNotNull() {
            addCriterion("HQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHqNameEqualTo(String value) {
            addCriterion("HQ_NAME =", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameNotEqualTo(String value) {
            addCriterion("HQ_NAME <>", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameGreaterThan(String value) {
            addCriterion("HQ_NAME >", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameGreaterThanOrEqualTo(String value) {
            addCriterion("HQ_NAME >=", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameLessThan(String value) {
            addCriterion("HQ_NAME <", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameLessThanOrEqualTo(String value) {
            addCriterion("HQ_NAME <=", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameLike(String value) {
            addCriterion("HQ_NAME like", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameNotLike(String value) {
            addCriterion("HQ_NAME not like", value, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameIn(List<String> values) {
            addCriterion("HQ_NAME in", values, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameNotIn(List<String> values) {
            addCriterion("HQ_NAME not in", values, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameBetween(String value1, String value2) {
            addCriterion("HQ_NAME between", value1, value2, "hqName");
            return (Criteria) this;
        }

        public Criteria andHqNameNotBetween(String value1, String value2) {
            addCriterion("HQ_NAME not between", value1, value2, "hqName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNull() {
            addCriterion("MONITOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNotNull() {
            addCriterion("MONITOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameEqualTo(String value) {
            addCriterion("MONITOR_NAME =", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotEqualTo(String value) {
            addCriterion("MONITOR_NAME <>", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThan(String value) {
            addCriterion("MONITOR_NAME >", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("MONITOR_NAME >=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThan(String value) {
            addCriterion("MONITOR_NAME <", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThanOrEqualTo(String value) {
            addCriterion("MONITOR_NAME <=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLike(String value) {
            addCriterion("MONITOR_NAME like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotLike(String value) {
            addCriterion("MONITOR_NAME not like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIn(List<String> values) {
            addCriterion("MONITOR_NAME in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotIn(List<String> values) {
            addCriterion("MONITOR_NAME not in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameBetween(String value1, String value2) {
            addCriterion("MONITOR_NAME between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotBetween(String value1, String value2) {
            addCriterion("MONITOR_NAME not between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIsNull() {
            addCriterion("MONITOR_AREA is null");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIsNotNull() {
            addCriterion("MONITOR_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaEqualTo(String value) {
            addCriterion("MONITOR_AREA =", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotEqualTo(String value) {
            addCriterion("MONITOR_AREA <>", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaGreaterThan(String value) {
            addCriterion("MONITOR_AREA >", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaGreaterThanOrEqualTo(String value) {
            addCriterion("MONITOR_AREA >=", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLessThan(String value) {
            addCriterion("MONITOR_AREA <", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLessThanOrEqualTo(String value) {
            addCriterion("MONITOR_AREA <=", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLike(String value) {
            addCriterion("MONITOR_AREA like", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotLike(String value) {
            addCriterion("MONITOR_AREA not like", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIn(List<String> values) {
            addCriterion("MONITOR_AREA in", values, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotIn(List<String> values) {
            addCriterion("MONITOR_AREA not in", values, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaBetween(String value1, String value2) {
            addCriterion("MONITOR_AREA between", value1, value2, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotBetween(String value1, String value2) {
            addCriterion("MONITOR_AREA not between", value1, value2, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeIsNull() {
            addCriterion("INDUSTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeIsNotNull() {
            addCriterion("INDUSTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeEqualTo(String value) {
            addCriterion("INDUSTY_CODE =", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeNotEqualTo(String value) {
            addCriterion("INDUSTY_CODE <>", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeGreaterThan(String value) {
            addCriterion("INDUSTY_CODE >", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTY_CODE >=", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeLessThan(String value) {
            addCriterion("INDUSTY_CODE <", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTY_CODE <=", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeLike(String value) {
            addCriterion("INDUSTY_CODE like", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeNotLike(String value) {
            addCriterion("INDUSTY_CODE not like", value, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeIn(List<String> values) {
            addCriterion("INDUSTY_CODE in", values, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeNotIn(List<String> values) {
            addCriterion("INDUSTY_CODE not in", values, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeBetween(String value1, String value2) {
            addCriterion("INDUSTY_CODE between", value1, value2, "industyCode");
            return (Criteria) this;
        }

        public Criteria andIndustyCodeNotBetween(String value1, String value2) {
            addCriterion("INDUSTY_CODE not between", value1, value2, "industyCode");
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

        public Criteria andSellerHoldPercentIsNull() {
            addCriterion("SELLER_HOLD_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentIsNotNull() {
            addCriterion("SELLER_HOLD_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentEqualTo(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT =", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentNotEqualTo(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT <>", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentGreaterThan(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT >", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT >=", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentLessThan(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT <", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLER_HOLD_PERCENT <=", value, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentIn(List<BigDecimal> values) {
            addCriterion("SELLER_HOLD_PERCENT in", values, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentNotIn(List<BigDecimal> values) {
            addCriterion("SELLER_HOLD_PERCENT not in", values, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLER_HOLD_PERCENT between", value1, value2, "sellerHoldPercent");
            return (Criteria) this;
        }

        public Criteria andSellerHoldPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLER_HOLD_PERCENT not between", value1, value2, "sellerHoldPercent");
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

        public Criteria andAuthorizeUnitIsNull() {
            addCriterion("AUTHORIZE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitIsNotNull() {
            addCriterion("AUTHORIZE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitEqualTo(String value) {
            addCriterion("AUTHORIZE_UNIT =", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitNotEqualTo(String value) {
            addCriterion("AUTHORIZE_UNIT <>", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitGreaterThan(String value) {
            addCriterion("AUTHORIZE_UNIT >", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_UNIT >=", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitLessThan(String value) {
            addCriterion("AUTHORIZE_UNIT <", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_UNIT <=", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitLike(String value) {
            addCriterion("AUTHORIZE_UNIT like", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitNotLike(String value) {
            addCriterion("AUTHORIZE_UNIT not like", value, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitIn(List<String> values) {
            addCriterion("AUTHORIZE_UNIT in", values, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitNotIn(List<String> values) {
            addCriterion("AUTHORIZE_UNIT not in", values, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_UNIT between", value1, value2, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeUnitNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_UNIT not between", value1, value2, "authorizeUnit");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeIsNull() {
            addCriterion("AUTHORIZE_FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeIsNotNull() {
            addCriterion("AUTHORIZE_FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE =", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeNotEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE <>", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeGreaterThan(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE >", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE >=", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeLessThan(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE <", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE <=", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeLike(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE like", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeNotLike(String value) {
            addCriterion("AUTHORIZE_FILE_TYPE not like", value, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeIn(List<String> values) {
            addCriterion("AUTHORIZE_FILE_TYPE in", values, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeNotIn(List<String> values) {
            addCriterion("AUTHORIZE_FILE_TYPE not in", values, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_FILE_TYPE between", value1, value2, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileTypeNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_FILE_TYPE not between", value1, value2, "authorizeFileType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameIsNull() {
            addCriterion("AUTHORIZE_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameIsNotNull() {
            addCriterion("AUTHORIZE_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_NAME =", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameNotEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_NAME <>", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameGreaterThan(String value) {
            addCriterion("AUTHORIZE_FILE_NAME >", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_NAME >=", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameLessThan(String value) {
            addCriterion("AUTHORIZE_FILE_NAME <", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_FILE_NAME <=", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameLike(String value) {
            addCriterion("AUTHORIZE_FILE_NAME like", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameNotLike(String value) {
            addCriterion("AUTHORIZE_FILE_NAME not like", value, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameIn(List<String> values) {
            addCriterion("AUTHORIZE_FILE_NAME in", values, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameNotIn(List<String> values) {
            addCriterion("AUTHORIZE_FILE_NAME not in", values, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_FILE_NAME between", value1, value2, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorizeFileNameNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_FILE_NAME not between", value1, value2, "authorizeFileName");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateIsNull() {
            addCriterion("AUTHORZE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateIsNotNull() {
            addCriterion("AUTHORZE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateEqualTo(Date value) {
            addCriterion("AUTHORZE_DATE =", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateNotEqualTo(Date value) {
            addCriterion("AUTHORZE_DATE <>", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateGreaterThan(Date value) {
            addCriterion("AUTHORZE_DATE >", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUTHORZE_DATE >=", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateLessThan(Date value) {
            addCriterion("AUTHORZE_DATE <", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateLessThanOrEqualTo(Date value) {
            addCriterion("AUTHORZE_DATE <=", value, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateIn(List<Date> values) {
            addCriterion("AUTHORZE_DATE in", values, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateNotIn(List<Date> values) {
            addCriterion("AUTHORZE_DATE not in", values, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateBetween(Date value1, Date value2) {
            addCriterion("AUTHORZE_DATE between", value1, value2, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andAuthorzeDateNotBetween(Date value1, Date value2) {
            addCriterion("AUTHORZE_DATE not between", value1, value2, "authorzeDate");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNull() {
            addCriterion("SELLER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIsNotNull() {
            addCriterion("SELLER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneEqualTo(String value) {
            addCriterion("SELLER_PHONE =", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotEqualTo(String value) {
            addCriterion("SELLER_PHONE <>", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThan(String value) {
            addCriterion("SELLER_PHONE >", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_PHONE >=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThan(String value) {
            addCriterion("SELLER_PHONE <", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLessThanOrEqualTo(String value) {
            addCriterion("SELLER_PHONE <=", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneLike(String value) {
            addCriterion("SELLER_PHONE like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotLike(String value) {
            addCriterion("SELLER_PHONE not like", value, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneIn(List<String> values) {
            addCriterion("SELLER_PHONE in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotIn(List<String> values) {
            addCriterion("SELLER_PHONE not in", values, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneBetween(String value1, String value2) {
            addCriterion("SELLER_PHONE between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerPhoneNotBetween(String value1, String value2) {
            addCriterion("SELLER_PHONE not between", value1, value2, "sellerPhone");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNull() {
            addCriterion("SELLER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNotNull() {
            addCriterion("SELLER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressEqualTo(String value) {
            addCriterion("SELLER_ADDRESS =", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotEqualTo(String value) {
            addCriterion("SELLER_ADDRESS <>", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThan(String value) {
            addCriterion("SELLER_ADDRESS >", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ADDRESS >=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThan(String value) {
            addCriterion("SELLER_ADDRESS <", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ADDRESS <=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLike(String value) {
            addCriterion("SELLER_ADDRESS like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotLike(String value) {
            addCriterion("SELLER_ADDRESS not like", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIn(List<String> values) {
            addCriterion("SELLER_ADDRESS in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotIn(List<String> values) {
            addCriterion("SELLER_ADDRESS not in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressBetween(String value1, String value2) {
            addCriterion("SELLER_ADDRESS between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotBetween(String value1, String value2) {
            addCriterion("SELLER_ADDRESS not between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNull() {
            addCriterion("SELLER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNotNull() {
            addCriterion("SELLER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailEqualTo(String value) {
            addCriterion("SELLER_EMAIL =", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotEqualTo(String value) {
            addCriterion("SELLER_EMAIL <>", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThan(String value) {
            addCriterion("SELLER_EMAIL >", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_EMAIL >=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThan(String value) {
            addCriterion("SELLER_EMAIL <", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThanOrEqualTo(String value) {
            addCriterion("SELLER_EMAIL <=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLike(String value) {
            addCriterion("SELLER_EMAIL like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotLike(String value) {
            addCriterion("SELLER_EMAIL not like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIn(List<String> values) {
            addCriterion("SELLER_EMAIL in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotIn(List<String> values) {
            addCriterion("SELLER_EMAIL not in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailBetween(String value1, String value2) {
            addCriterion("SELLER_EMAIL between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotBetween(String value1, String value2) {
            addCriterion("SELLER_EMAIL not between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerRoleIsNull() {
            addCriterion("SELLER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andSellerRoleIsNotNull() {
            addCriterion("SELLER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRoleEqualTo(String value) {
            addCriterion("SELLER_ROLE =", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleNotEqualTo(String value) {
            addCriterion("SELLER_ROLE <>", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleGreaterThan(String value) {
            addCriterion("SELLER_ROLE >", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_ROLE >=", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleLessThan(String value) {
            addCriterion("SELLER_ROLE <", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleLessThanOrEqualTo(String value) {
            addCriterion("SELLER_ROLE <=", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleLike(String value) {
            addCriterion("SELLER_ROLE like", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleNotLike(String value) {
            addCriterion("SELLER_ROLE not like", value, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleIn(List<String> values) {
            addCriterion("SELLER_ROLE in", values, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleNotIn(List<String> values) {
            addCriterion("SELLER_ROLE not in", values, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleBetween(String value1, String value2) {
            addCriterion("SELLER_ROLE between", value1, value2, "sellerRole");
            return (Criteria) this;
        }

        public Criteria andSellerRoleNotBetween(String value1, String value2) {
            addCriterion("SELLER_ROLE not between", value1, value2, "sellerRole");
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