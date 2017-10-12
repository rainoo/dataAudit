package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeBidinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeBidinfoExample() {
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

        public Criteria andBidInfoIdIsNull() {
            addCriterion("BID_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdIsNotNull() {
            addCriterion("BID_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdEqualTo(String value) {
            addCriterion("BID_INFO_ID =", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotEqualTo(String value) {
            addCriterion("BID_INFO_ID <>", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdGreaterThan(String value) {
            addCriterion("BID_INFO_ID >", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("BID_INFO_ID >=", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdLessThan(String value) {
            addCriterion("BID_INFO_ID <", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdLessThanOrEqualTo(String value) {
            addCriterion("BID_INFO_ID <=", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdLike(String value) {
            addCriterion("BID_INFO_ID like", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotLike(String value) {
            addCriterion("BID_INFO_ID not like", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdIn(List<String> values) {
            addCriterion("BID_INFO_ID in", values, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotIn(List<String> values) {
            addCriterion("BID_INFO_ID not in", values, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdBetween(String value1, String value2) {
            addCriterion("BID_INFO_ID between", value1, value2, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotBetween(String value1, String value2) {
            addCriterion("BID_INFO_ID not between", value1, value2, "bidInfoId");
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

        public Criteria andBidderIsNull() {
            addCriterion("BIDDER is null");
            return (Criteria) this;
        }

        public Criteria andBidderIsNotNull() {
            addCriterion("BIDDER is not null");
            return (Criteria) this;
        }

        public Criteria andBidderEqualTo(String value) {
            addCriterion("BIDDER =", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderNotEqualTo(String value) {
            addCriterion("BIDDER <>", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderGreaterThan(String value) {
            addCriterion("BIDDER >", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderGreaterThanOrEqualTo(String value) {
            addCriterion("BIDDER >=", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderLessThan(String value) {
            addCriterion("BIDDER <", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderLessThanOrEqualTo(String value) {
            addCriterion("BIDDER <=", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderLike(String value) {
            addCriterion("BIDDER like", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderNotLike(String value) {
            addCriterion("BIDDER not like", value, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderIn(List<String> values) {
            addCriterion("BIDDER in", values, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderNotIn(List<String> values) {
            addCriterion("BIDDER not in", values, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderBetween(String value1, String value2) {
            addCriterion("BIDDER between", value1, value2, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidderNotBetween(String value1, String value2) {
            addCriterion("BIDDER not between", value1, value2, "bidder");
            return (Criteria) this;
        }

        public Criteria andBidNoIsNull() {
            addCriterion("BID_NO is null");
            return (Criteria) this;
        }

        public Criteria andBidNoIsNotNull() {
            addCriterion("BID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBidNoEqualTo(Short value) {
            addCriterion("BID_NO =", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotEqualTo(Short value) {
            addCriterion("BID_NO <>", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoGreaterThan(Short value) {
            addCriterion("BID_NO >", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoGreaterThanOrEqualTo(Short value) {
            addCriterion("BID_NO >=", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoLessThan(Short value) {
            addCriterion("BID_NO <", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoLessThanOrEqualTo(Short value) {
            addCriterion("BID_NO <=", value, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoIn(List<Short> values) {
            addCriterion("BID_NO in", values, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotIn(List<Short> values) {
            addCriterion("BID_NO not in", values, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoBetween(Short value1, Short value2) {
            addCriterion("BID_NO between", value1, value2, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidNoNotBetween(Short value1, Short value2) {
            addCriterion("BID_NO not between", value1, value2, "bidNo");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNull() {
            addCriterion("BID_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("BID_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(BigDecimal value) {
            addCriterion("BID_PRICE =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(BigDecimal value) {
            addCriterion("BID_PRICE <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(BigDecimal value) {
            addCriterion("BID_PRICE >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_PRICE >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(BigDecimal value) {
            addCriterion("BID_PRICE <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_PRICE <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<BigDecimal> values) {
            addCriterion("BID_PRICE in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<BigDecimal> values) {
            addCriterion("BID_PRICE not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_PRICE between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_PRICE not between", value1, value2, "bidPrice");
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

        public Criteria andBidPercentIsNull() {
            addCriterion("BID_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andBidPercentIsNotNull() {
            addCriterion("BID_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andBidPercentEqualTo(BigDecimal value) {
            addCriterion("BID_PERCENT =", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentNotEqualTo(BigDecimal value) {
            addCriterion("BID_PERCENT <>", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentGreaterThan(BigDecimal value) {
            addCriterion("BID_PERCENT >", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_PERCENT >=", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentLessThan(BigDecimal value) {
            addCriterion("BID_PERCENT <", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BID_PERCENT <=", value, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentIn(List<BigDecimal> values) {
            addCriterion("BID_PERCENT in", values, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentNotIn(List<BigDecimal> values) {
            addCriterion("BID_PERCENT not in", values, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_PERCENT between", value1, value2, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID_PERCENT not between", value1, value2, "bidPercent");
            return (Criteria) this;
        }

        public Criteria andBidAmountIsNull() {
            addCriterion("BID_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBidAmountIsNotNull() {
            addCriterion("BID_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBidAmountEqualTo(Short value) {
            addCriterion("BID_AMOUNT =", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotEqualTo(Short value) {
            addCriterion("BID_AMOUNT <>", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountGreaterThan(Short value) {
            addCriterion("BID_AMOUNT >", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("BID_AMOUNT >=", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountLessThan(Short value) {
            addCriterion("BID_AMOUNT <", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountLessThanOrEqualTo(Short value) {
            addCriterion("BID_AMOUNT <=", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountIn(List<Short> values) {
            addCriterion("BID_AMOUNT in", values, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotIn(List<Short> values) {
            addCriterion("BID_AMOUNT not in", values, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountBetween(Short value1, Short value2) {
            addCriterion("BID_AMOUNT between", value1, value2, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotBetween(Short value1, Short value2) {
            addCriterion("BID_AMOUNT not between", value1, value2, "bidAmount");
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