package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeNegoinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeNegoinfoExample() {
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

        public Criteria andNegoInfoIdIsNull() {
            addCriterion("NEGO_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdIsNotNull() {
            addCriterion("NEGO_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdEqualTo(String value) {
            addCriterion("NEGO_INFO_ID =", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdNotEqualTo(String value) {
            addCriterion("NEGO_INFO_ID <>", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdGreaterThan(String value) {
            addCriterion("NEGO_INFO_ID >", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEGO_INFO_ID >=", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdLessThan(String value) {
            addCriterion("NEGO_INFO_ID <", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdLessThanOrEqualTo(String value) {
            addCriterion("NEGO_INFO_ID <=", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdLike(String value) {
            addCriterion("NEGO_INFO_ID like", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdNotLike(String value) {
            addCriterion("NEGO_INFO_ID not like", value, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdIn(List<String> values) {
            addCriterion("NEGO_INFO_ID in", values, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdNotIn(List<String> values) {
            addCriterion("NEGO_INFO_ID not in", values, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdBetween(String value1, String value2) {
            addCriterion("NEGO_INFO_ID between", value1, value2, "negoInfoId");
            return (Criteria) this;
        }

        public Criteria andNegoInfoIdNotBetween(String value1, String value2) {
            addCriterion("NEGO_INFO_ID not between", value1, value2, "negoInfoId");
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

        public Criteria andInvestorIsNull() {
            addCriterion("INVESTOR is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNotNull() {
            addCriterion("INVESTOR is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorEqualTo(String value) {
            addCriterion("INVESTOR =", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotEqualTo(String value) {
            addCriterion("INVESTOR <>", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThan(String value) {
            addCriterion("INVESTOR >", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTOR >=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThan(String value) {
            addCriterion("INVESTOR <", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThanOrEqualTo(String value) {
            addCriterion("INVESTOR <=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLike(String value) {
            addCriterion("INVESTOR like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotLike(String value) {
            addCriterion("INVESTOR not like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorIn(List<String> values) {
            addCriterion("INVESTOR in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotIn(List<String> values) {
            addCriterion("INVESTOR not in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorBetween(String value1, String value2) {
            addCriterion("INVESTOR between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotBetween(String value1, String value2) {
            addCriterion("INVESTOR not between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andNegoPriceIsNull() {
            addCriterion("NEGO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNegoPriceIsNotNull() {
            addCriterion("NEGO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNegoPriceEqualTo(BigDecimal value) {
            addCriterion("NEGO_PRICE =", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceNotEqualTo(BigDecimal value) {
            addCriterion("NEGO_PRICE <>", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceGreaterThan(BigDecimal value) {
            addCriterion("NEGO_PRICE >", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEGO_PRICE >=", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceLessThan(BigDecimal value) {
            addCriterion("NEGO_PRICE <", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEGO_PRICE <=", value, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceIn(List<BigDecimal> values) {
            addCriterion("NEGO_PRICE in", values, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceNotIn(List<BigDecimal> values) {
            addCriterion("NEGO_PRICE not in", values, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEGO_PRICE between", value1, value2, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEGO_PRICE not between", value1, value2, "negoPrice");
            return (Criteria) this;
        }

        public Criteria andNegoPercentIsNull() {
            addCriterion("NEGO_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andNegoPercentIsNotNull() {
            addCriterion("NEGO_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andNegoPercentEqualTo(BigDecimal value) {
            addCriterion("NEGO_PERCENT =", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentNotEqualTo(BigDecimal value) {
            addCriterion("NEGO_PERCENT <>", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentGreaterThan(BigDecimal value) {
            addCriterion("NEGO_PERCENT >", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEGO_PERCENT >=", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentLessThan(BigDecimal value) {
            addCriterion("NEGO_PERCENT <", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEGO_PERCENT <=", value, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentIn(List<BigDecimal> values) {
            addCriterion("NEGO_PERCENT in", values, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentNotIn(List<BigDecimal> values) {
            addCriterion("NEGO_PERCENT not in", values, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEGO_PERCENT between", value1, value2, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEGO_PERCENT not between", value1, value2, "negoPercent");
            return (Criteria) this;
        }

        public Criteria andNegoAmountIsNull() {
            addCriterion("NEGO_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNegoAmountIsNotNull() {
            addCriterion("NEGO_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNegoAmountEqualTo(Short value) {
            addCriterion("NEGO_AMOUNT =", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountNotEqualTo(Short value) {
            addCriterion("NEGO_AMOUNT <>", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountGreaterThan(Short value) {
            addCriterion("NEGO_AMOUNT >", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("NEGO_AMOUNT >=", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountLessThan(Short value) {
            addCriterion("NEGO_AMOUNT <", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountLessThanOrEqualTo(Short value) {
            addCriterion("NEGO_AMOUNT <=", value, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountIn(List<Short> values) {
            addCriterion("NEGO_AMOUNT in", values, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountNotIn(List<Short> values) {
            addCriterion("NEGO_AMOUNT not in", values, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountBetween(Short value1, Short value2) {
            addCriterion("NEGO_AMOUNT between", value1, value2, "negoAmount");
            return (Criteria) this;
        }

        public Criteria andNegoAmountNotBetween(Short value1, Short value2) {
            addCriterion("NEGO_AMOUNT not between", value1, value2, "negoAmount");
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

        public Criteria andNegoPromiseIsNull() {
            addCriterion("NEGO_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseIsNotNull() {
            addCriterion("NEGO_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseEqualTo(String value) {
            addCriterion("NEGO_PROMISE =", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseNotEqualTo(String value) {
            addCriterion("NEGO_PROMISE <>", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseGreaterThan(String value) {
            addCriterion("NEGO_PROMISE >", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("NEGO_PROMISE >=", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseLessThan(String value) {
            addCriterion("NEGO_PROMISE <", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseLessThanOrEqualTo(String value) {
            addCriterion("NEGO_PROMISE <=", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseLike(String value) {
            addCriterion("NEGO_PROMISE like", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseNotLike(String value) {
            addCriterion("NEGO_PROMISE not like", value, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseIn(List<String> values) {
            addCriterion("NEGO_PROMISE in", values, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseNotIn(List<String> values) {
            addCriterion("NEGO_PROMISE not in", values, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseBetween(String value1, String value2) {
            addCriterion("NEGO_PROMISE between", value1, value2, "negoPromise");
            return (Criteria) this;
        }

        public Criteria andNegoPromiseNotBetween(String value1, String value2) {
            addCriterion("NEGO_PROMISE not between", value1, value2, "negoPromise");
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