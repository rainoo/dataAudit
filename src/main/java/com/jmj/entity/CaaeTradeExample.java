package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeTradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeTradeExample() {
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

        public Criteria andTradeIdIsNull() {
            addCriterion("TRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("TRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("TRADE_ID =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("TRADE_ID <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("TRADE_ID >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_ID >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("TRADE_ID <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("TRADE_ID <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("TRADE_ID like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("TRADE_ID not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("TRADE_ID in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("TRADE_ID not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("TRADE_ID between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("TRADE_ID not between", value1, value2, "tradeId");
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

        public Criteria andExchangeTypeIsNull() {
            addCriterion("EXCHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("EXCHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(String value) {
            addCriterion("EXCHANGE_TYPE >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(String value) {
            addCriterion("EXCHANGE_TYPE <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLike(String value) {
            addCriterion("EXCHANGE_TYPE like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotLike(String value) {
            addCriterion("EXCHANGE_TYPE not like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE not between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNull() {
            addCriterion("TRANSACTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIsNotNull() {
            addCriterion("TRANSACTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeEqualTo(String value) {
            addCriterion("TRANSACTION_TIME =", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotEqualTo(String value) {
            addCriterion("TRANSACTION_TIME <>", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThan(String value) {
            addCriterion("TRANSACTION_TIME >", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_TIME >=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThan(String value) {
            addCriterion("TRANSACTION_TIME <", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_TIME <=", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeLike(String value) {
            addCriterion("TRANSACTION_TIME like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotLike(String value) {
            addCriterion("TRANSACTION_TIME not like", value, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeIn(List<String> values) {
            addCriterion("TRANSACTION_TIME in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotIn(List<String> values) {
            addCriterion("TRANSACTION_TIME not in", values, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeBetween(String value1, String value2) {
            addCriterion("TRANSACTION_TIME between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTransactionTimeNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_TIME not between", value1, value2, "transactionTime");
            return (Criteria) this;
        }

        public Criteria andTradeValueIsNull() {
            addCriterion("TRADE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andTradeValueIsNotNull() {
            addCriterion("TRADE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeValueEqualTo(BigDecimal value) {
            addCriterion("TRADE_VALUE =", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_VALUE <>", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueGreaterThan(BigDecimal value) {
            addCriterion("TRADE_VALUE >", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_VALUE >=", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueLessThan(BigDecimal value) {
            addCriterion("TRADE_VALUE <", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_VALUE <=", value, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueIn(List<BigDecimal> values) {
            addCriterion("TRADE_VALUE in", values, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_VALUE not in", values, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_VALUE between", value1, value2, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_VALUE not between", value1, value2, "tradeValue");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("TRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("TRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterion("TRADE_DATE =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterion("TRADE_DATE <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterion("TRADE_DATE >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRADE_DATE >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterion("TRADE_DATE <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("TRADE_DATE <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterion("TRADE_DATE in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterion("TRADE_DATE not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterion("TRADE_DATE between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("TRADE_DATE not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradePercentIsNull() {
            addCriterion("TRADE_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andTradePercentIsNotNull() {
            addCriterion("TRADE_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andTradePercentEqualTo(BigDecimal value) {
            addCriterion("TRADE_PERCENT =", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentNotEqualTo(BigDecimal value) {
            addCriterion("TRADE_PERCENT <>", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentGreaterThan(BigDecimal value) {
            addCriterion("TRADE_PERCENT >", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_PERCENT >=", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentLessThan(BigDecimal value) {
            addCriterion("TRADE_PERCENT <", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRADE_PERCENT <=", value, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentIn(List<BigDecimal> values) {
            addCriterion("TRADE_PERCENT in", values, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentNotIn(List<BigDecimal> values) {
            addCriterion("TRADE_PERCENT not in", values, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_PERCENT between", value1, value2, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradePercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRADE_PERCENT not between", value1, value2, "tradePercent");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNull() {
            addCriterion("TRADE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIsNotNull() {
            addCriterion("TRADE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountEqualTo(Short value) {
            addCriterion("TRADE_AMOUNT =", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotEqualTo(Short value) {
            addCriterion("TRADE_AMOUNT <>", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThan(Short value) {
            addCriterion("TRADE_AMOUNT >", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("TRADE_AMOUNT >=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThan(Short value) {
            addCriterion("TRADE_AMOUNT <", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountLessThanOrEqualTo(Short value) {
            addCriterion("TRADE_AMOUNT <=", value, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountIn(List<Short> values) {
            addCriterion("TRADE_AMOUNT in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotIn(List<Short> values) {
            addCriterion("TRADE_AMOUNT not in", values, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountBetween(Short value1, Short value2) {
            addCriterion("TRADE_AMOUNT between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountNotBetween(Short value1, Short value2) {
            addCriterion("TRADE_AMOUNT not between", value1, value2, "tradeAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueIsNull() {
            addCriterion("FIRST_PAY_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueIsNotNull() {
            addCriterion("FIRST_PAY_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE =", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueNotEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE <>", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueGreaterThan(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE >", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE >=", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueLessThan(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE <", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_VALUE <=", value, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueIn(List<BigDecimal> values) {
            addCriterion("FIRST_PAY_VALUE in", values, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueNotIn(List<BigDecimal> values) {
            addCriterion("FIRST_PAY_VALUE not in", values, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_PAY_VALUE between", value1, value2, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_PAY_VALUE not between", value1, value2, "firstPayValue");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentIsNull() {
            addCriterion("FIRST_PAY_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentIsNotNull() {
            addCriterion("FIRST_PAY_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT =", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentNotEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT <>", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentGreaterThan(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT >", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT >=", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentLessThan(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT <", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_PAY_PERCENT <=", value, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentIn(List<BigDecimal> values) {
            addCriterion("FIRST_PAY_PERCENT in", values, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentNotIn(List<BigDecimal> values) {
            addCriterion("FIRST_PAY_PERCENT not in", values, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_PAY_PERCENT between", value1, value2, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andFirstPayPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_PAY_PERCENT not between", value1, value2, "firstPayPercent");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateIsNull() {
            addCriterion("REMAIN_PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateIsNotNull() {
            addCriterion("REMAIN_PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateEqualTo(Date value) {
            addCriterion("REMAIN_PAY_DATE =", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateNotEqualTo(Date value) {
            addCriterion("REMAIN_PAY_DATE <>", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateGreaterThan(Date value) {
            addCriterion("REMAIN_PAY_DATE >", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REMAIN_PAY_DATE >=", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateLessThan(Date value) {
            addCriterion("REMAIN_PAY_DATE <", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateLessThanOrEqualTo(Date value) {
            addCriterion("REMAIN_PAY_DATE <=", value, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateIn(List<Date> values) {
            addCriterion("REMAIN_PAY_DATE in", values, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateNotIn(List<Date> values) {
            addCriterion("REMAIN_PAY_DATE not in", values, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateBetween(Date value1, Date value2) {
            addCriterion("REMAIN_PAY_DATE between", value1, value2, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andRemainPayDateNotBetween(Date value1, Date value2) {
            addCriterion("REMAIN_PAY_DATE not between", value1, value2, "remainPayDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateIsNull() {
            addCriterion("ANNOUNCE_PUB_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateIsNotNull() {
            addCriterion("ANNOUNCE_PUB_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateEqualTo(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE =", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateNotEqualTo(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE <>", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateGreaterThan(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE >", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE >=", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateLessThan(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE <", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateLessThanOrEqualTo(Date value) {
            addCriterion("ANNOUNCE_PUB_DATE <=", value, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateIn(List<Date> values) {
            addCriterion("ANNOUNCE_PUB_DATE in", values, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateNotIn(List<Date> values) {
            addCriterion("ANNOUNCE_PUB_DATE not in", values, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateBetween(Date value1, Date value2) {
            addCriterion("ANNOUNCE_PUB_DATE between", value1, value2, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncePubDateNotBetween(Date value1, Date value2) {
            addCriterion("ANNOUNCE_PUB_DATE not between", value1, value2, "announcePubDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateIsNull() {
            addCriterion("CONTR_SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContrSignDateIsNotNull() {
            addCriterion("CONTR_SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContrSignDateEqualTo(Date value) {
            addCriterion("CONTR_SIGN_DATE =", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateNotEqualTo(Date value) {
            addCriterion("CONTR_SIGN_DATE <>", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateGreaterThan(Date value) {
            addCriterion("CONTR_SIGN_DATE >", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTR_SIGN_DATE >=", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateLessThan(Date value) {
            addCriterion("CONTR_SIGN_DATE <", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateLessThanOrEqualTo(Date value) {
            addCriterion("CONTR_SIGN_DATE <=", value, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateIn(List<Date> values) {
            addCriterion("CONTR_SIGN_DATE in", values, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateNotIn(List<Date> values) {
            addCriterion("CONTR_SIGN_DATE not in", values, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateBetween(Date value1, Date value2) {
            addCriterion("CONTR_SIGN_DATE between", value1, value2, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrSignDateNotBetween(Date value1, Date value2) {
            addCriterion("CONTR_SIGN_DATE not between", value1, value2, "contrSignDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateIsNull() {
            addCriterion("CONTR_EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateIsNotNull() {
            addCriterion("CONTR_EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateEqualTo(Date value) {
            addCriterion("CONTR_EFFECT_DATE =", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateNotEqualTo(Date value) {
            addCriterion("CONTR_EFFECT_DATE <>", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateGreaterThan(Date value) {
            addCriterion("CONTR_EFFECT_DATE >", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTR_EFFECT_DATE >=", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateLessThan(Date value) {
            addCriterion("CONTR_EFFECT_DATE <", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("CONTR_EFFECT_DATE <=", value, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateIn(List<Date> values) {
            addCriterion("CONTR_EFFECT_DATE in", values, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateNotIn(List<Date> values) {
            addCriterion("CONTR_EFFECT_DATE not in", values, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateBetween(Date value1, Date value2) {
            addCriterion("CONTR_EFFECT_DATE between", value1, value2, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContrEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("CONTR_EFFECT_DATE not between", value1, value2, "contrEffectDate");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNull() {
            addCriterion("CONTRACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNotNull() {
            addCriterion("CONTRACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractDateEqualTo(Date value) {
            addCriterion("CONTRACT_DATE =", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotEqualTo(Date value) {
            addCriterion("CONTRACT_DATE <>", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThan(Date value) {
            addCriterion("CONTRACT_DATE >", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTRACT_DATE >=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThan(Date value) {
            addCriterion("CONTRACT_DATE <", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThanOrEqualTo(Date value) {
            addCriterion("CONTRACT_DATE <=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateIn(List<Date> values) {
            addCriterion("CONTRACT_DATE in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotIn(List<Date> values) {
            addCriterion("CONTRACT_DATE not in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateBetween(Date value1, Date value2) {
            addCriterion("CONTRACT_DATE between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotBetween(Date value1, Date value2) {
            addCriterion("CONTRACT_DATE not between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonIsNull() {
            addCriterion("CHANGE_EX_TYPE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonIsNotNull() {
            addCriterion("CHANGE_EX_TYPE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonEqualTo(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON =", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonNotEqualTo(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON <>", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonGreaterThan(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON >", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON >=", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonLessThan(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON <", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON <=", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonLike(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON like", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonNotLike(String value) {
            addCriterion("CHANGE_EX_TYPE_REASON not like", value, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonIn(List<String> values) {
            addCriterion("CHANGE_EX_TYPE_REASON in", values, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonNotIn(List<String> values) {
            addCriterion("CHANGE_EX_TYPE_REASON not in", values, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonBetween(String value1, String value2) {
            addCriterion("CHANGE_EX_TYPE_REASON between", value1, value2, "changeExTypeReason");
            return (Criteria) this;
        }

        public Criteria andChangeExTypeReasonNotBetween(String value1, String value2) {
            addCriterion("CHANGE_EX_TYPE_REASON not between", value1, value2, "changeExTypeReason");
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

        public Criteria andNonMonetaryEstValueIsNull() {
            addCriterion("NON_MONETARY_EST_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueIsNotNull() {
            addCriterion("NON_MONETARY_EST_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueEqualTo(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE =", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueNotEqualTo(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE <>", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueGreaterThan(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE >", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE >=", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueLessThan(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE <", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NON_MONETARY_EST_VALUE <=", value, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueIn(List<BigDecimal> values) {
            addCriterion("NON_MONETARY_EST_VALUE in", values, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueNotIn(List<BigDecimal> values) {
            addCriterion("NON_MONETARY_EST_VALUE not in", values, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NON_MONETARY_EST_VALUE between", value1, value2, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NON_MONETARY_EST_VALUE not between", value1, value2, "nonMonetaryEstValue");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitIsNull() {
            addCriterion("NON_MONETARY_EST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitIsNotNull() {
            addCriterion("NON_MONETARY_EST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_UNIT =", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitNotEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_UNIT <>", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitGreaterThan(String value) {
            addCriterion("NON_MONETARY_EST_UNIT >", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitGreaterThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_UNIT >=", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitLessThan(String value) {
            addCriterion("NON_MONETARY_EST_UNIT <", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitLessThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_UNIT <=", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitLike(String value) {
            addCriterion("NON_MONETARY_EST_UNIT like", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitNotLike(String value) {
            addCriterion("NON_MONETARY_EST_UNIT not like", value, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitIn(List<String> values) {
            addCriterion("NON_MONETARY_EST_UNIT in", values, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitNotIn(List<String> values) {
            addCriterion("NON_MONETARY_EST_UNIT not in", values, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_EST_UNIT between", value1, value2, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstUnitNotBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_EST_UNIT not between", value1, value2, "nonMonetaryEstUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateIsNull() {
            addCriterion("NON_MONETARY_EST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateIsNotNull() {
            addCriterion("NON_MONETARY_EST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_DATE =", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateNotEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_DATE <>", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateGreaterThan(String value) {
            addCriterion("NON_MONETARY_EST_DATE >", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateGreaterThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_DATE >=", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateLessThan(String value) {
            addCriterion("NON_MONETARY_EST_DATE <", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateLessThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_EST_DATE <=", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateLike(String value) {
            addCriterion("NON_MONETARY_EST_DATE like", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateNotLike(String value) {
            addCriterion("NON_MONETARY_EST_DATE not like", value, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateIn(List<String> values) {
            addCriterion("NON_MONETARY_EST_DATE in", values, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateNotIn(List<String> values) {
            addCriterion("NON_MONETARY_EST_DATE not in", values, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_EST_DATE between", value1, value2, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryEstDateNotBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_EST_DATE not between", value1, value2, "nonMonetaryEstDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitIsNull() {
            addCriterion("NON_MONETARY_APPR_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitIsNotNull() {
            addCriterion("NON_MONETARY_APPR_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT =", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitNotEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT <>", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitGreaterThan(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT >", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitGreaterThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT >=", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitLessThan(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT <", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitLessThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT <=", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitLike(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT like", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitNotLike(String value) {
            addCriterion("NON_MONETARY_APPR_UNIT not like", value, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitIn(List<String> values) {
            addCriterion("NON_MONETARY_APPR_UNIT in", values, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitNotIn(List<String> values) {
            addCriterion("NON_MONETARY_APPR_UNIT not in", values, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_APPR_UNIT between", value1, value2, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprUnitNotBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_APPR_UNIT not between", value1, value2, "nonMonetaryApprUnit");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateIsNull() {
            addCriterion("NON_MONETARY_APPR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateIsNotNull() {
            addCriterion("NON_MONETARY_APPR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_DATE =", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateNotEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_DATE <>", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateGreaterThan(String value) {
            addCriterion("NON_MONETARY_APPR_DATE >", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateGreaterThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_DATE >=", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateLessThan(String value) {
            addCriterion("NON_MONETARY_APPR_DATE <", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateLessThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_APPR_DATE <=", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateLike(String value) {
            addCriterion("NON_MONETARY_APPR_DATE like", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateNotLike(String value) {
            addCriterion("NON_MONETARY_APPR_DATE not like", value, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateIn(List<String> values) {
            addCriterion("NON_MONETARY_APPR_DATE in", values, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateNotIn(List<String> values) {
            addCriterion("NON_MONETARY_APPR_DATE not in", values, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_APPR_DATE between", value1, value2, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryApprDateNotBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_APPR_DATE not between", value1, value2, "nonMonetaryApprDate");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkIsNull() {
            addCriterion("NON_MONETARY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkIsNotNull() {
            addCriterion("NON_MONETARY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkEqualTo(String value) {
            addCriterion("NON_MONETARY_REMARK =", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkNotEqualTo(String value) {
            addCriterion("NON_MONETARY_REMARK <>", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkGreaterThan(String value) {
            addCriterion("NON_MONETARY_REMARK >", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_REMARK >=", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkLessThan(String value) {
            addCriterion("NON_MONETARY_REMARK <", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkLessThanOrEqualTo(String value) {
            addCriterion("NON_MONETARY_REMARK <=", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkLike(String value) {
            addCriterion("NON_MONETARY_REMARK like", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkNotLike(String value) {
            addCriterion("NON_MONETARY_REMARK not like", value, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkIn(List<String> values) {
            addCriterion("NON_MONETARY_REMARK in", values, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkNotIn(List<String> values) {
            addCriterion("NON_MONETARY_REMARK not in", values, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_REMARK between", value1, value2, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andNonMonetaryRemarkNotBetween(String value1, String value2) {
            addCriterion("NON_MONETARY_REMARK not between", value1, value2, "nonMonetaryRemark");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordIsNull() {
            addCriterion("COMPLETION_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordIsNotNull() {
            addCriterion("COMPLETION_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordEqualTo(String value) {
            addCriterion("COMPLETION_RECORD =", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordNotEqualTo(String value) {
            addCriterion("COMPLETION_RECORD <>", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordGreaterThan(String value) {
            addCriterion("COMPLETION_RECORD >", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETION_RECORD >=", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordLessThan(String value) {
            addCriterion("COMPLETION_RECORD <", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordLessThanOrEqualTo(String value) {
            addCriterion("COMPLETION_RECORD <=", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordLike(String value) {
            addCriterion("COMPLETION_RECORD like", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordNotLike(String value) {
            addCriterion("COMPLETION_RECORD not like", value, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordIn(List<String> values) {
            addCriterion("COMPLETION_RECORD in", values, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordNotIn(List<String> values) {
            addCriterion("COMPLETION_RECORD not in", values, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordBetween(String value1, String value2) {
            addCriterion("COMPLETION_RECORD between", value1, value2, "completionRecord");
            return (Criteria) this;
        }

        public Criteria andCompletionRecordNotBetween(String value1, String value2) {
            addCriterion("COMPLETION_RECORD not between", value1, value2, "completionRecord");
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

        public Criteria andFinalEconomyTypeIsNull() {
            addCriterion("FINAL_ECONOMY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeIsNotNull() {
            addCriterion("FINAL_ECONOMY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeEqualTo(String value) {
            addCriterion("FINAL_ECONOMY_TYPE =", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeNotEqualTo(String value) {
            addCriterion("FINAL_ECONOMY_TYPE <>", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeGreaterThan(String value) {
            addCriterion("FINAL_ECONOMY_TYPE >", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FINAL_ECONOMY_TYPE >=", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeLessThan(String value) {
            addCriterion("FINAL_ECONOMY_TYPE <", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeLessThanOrEqualTo(String value) {
            addCriterion("FINAL_ECONOMY_TYPE <=", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeLike(String value) {
            addCriterion("FINAL_ECONOMY_TYPE like", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeNotLike(String value) {
            addCriterion("FINAL_ECONOMY_TYPE not like", value, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeIn(List<String> values) {
            addCriterion("FINAL_ECONOMY_TYPE in", values, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeNotIn(List<String> values) {
            addCriterion("FINAL_ECONOMY_TYPE not in", values, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeBetween(String value1, String value2) {
            addCriterion("FINAL_ECONOMY_TYPE between", value1, value2, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andFinalEconomyTypeNotBetween(String value1, String value2) {
            addCriterion("FINAL_ECONOMY_TYPE not between", value1, value2, "finalEconomyType");
            return (Criteria) this;
        }

        public Criteria andInvestWayIsNull() {
            addCriterion("INVEST_WAY is null");
            return (Criteria) this;
        }

        public Criteria andInvestWayIsNotNull() {
            addCriterion("INVEST_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andInvestWayEqualTo(String value) {
            addCriterion("INVEST_WAY =", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayNotEqualTo(String value) {
            addCriterion("INVEST_WAY <>", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayGreaterThan(String value) {
            addCriterion("INVEST_WAY >", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayGreaterThanOrEqualTo(String value) {
            addCriterion("INVEST_WAY >=", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayLessThan(String value) {
            addCriterion("INVEST_WAY <", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayLessThanOrEqualTo(String value) {
            addCriterion("INVEST_WAY <=", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayLike(String value) {
            addCriterion("INVEST_WAY like", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayNotLike(String value) {
            addCriterion("INVEST_WAY not like", value, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayIn(List<String> values) {
            addCriterion("INVEST_WAY in", values, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayNotIn(List<String> values) {
            addCriterion("INVEST_WAY not in", values, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayBetween(String value1, String value2) {
            addCriterion("INVEST_WAY between", value1, value2, "investWay");
            return (Criteria) this;
        }

        public Criteria andInvestWayNotBetween(String value1, String value2) {
            addCriterion("INVEST_WAY not between", value1, value2, "investWay");
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