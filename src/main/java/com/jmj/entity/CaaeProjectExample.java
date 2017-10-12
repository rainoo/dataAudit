package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Integer start;
    
    protected Integer end;
    
    public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public CaaeProjectExample() {
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

        public Criteria andLastUpdateIsNull() {
            addCriterion("LAST_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("LAST_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Object value) {
            addCriterion("LAST_UPDATE =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Object value) {
            addCriterion("LAST_UPDATE <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Object value) {
            addCriterion("LAST_UPDATE >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Object value) {
            addCriterion("LAST_UPDATE >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Object value) {
            addCriterion("LAST_UPDATE <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Object value) {
            addCriterion("LAST_UPDATE <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Object> values) {
            addCriterion("LAST_UPDATE in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Object> values) {
            addCriterion("LAST_UPDATE not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Object value1, Object value2) {
            addCriterion("LAST_UPDATE between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Object value1, Object value2) {
            addCriterion("LAST_UPDATE not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("PROJECT_NAME =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("PROJECT_NAME <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("PROJECT_NAME >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("PROJECT_NAME <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("PROJECT_NAME like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("PROJECT_NAME not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("PROJECT_NAME in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("PROJECT_NAME not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("PROJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("PROJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("PROJECT_CODE =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("PROJECT_CODE <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("PROJECT_CODE >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("PROJECT_CODE <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("PROJECT_CODE like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("PROJECT_CODE not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("PROJECT_CODE in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("PROJECT_CODE not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE not between", value1, value2, "projectCode");
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

        public Criteria andProjectPriceIsNull() {
            addCriterion("PROJECT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProjectPriceIsNotNull() {
            addCriterion("PROJECT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPriceEqualTo(BigDecimal value) {
            addCriterion("PROJECT_PRICE =", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_PRICE <>", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_PRICE >", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_PRICE >=", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceLessThan(BigDecimal value) {
            addCriterion("PROJECT_PRICE <", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_PRICE <=", value, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceIn(List<BigDecimal> values) {
            addCriterion("PROJECT_PRICE in", values, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_PRICE not in", values, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_PRICE between", value1, value2, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andProjectPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_PRICE not between", value1, value2, "projectPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPercentIsNull() {
            addCriterion("TOTAL_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andTotalPercentIsNotNull() {
            addCriterion("TOTAL_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPercentEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PERCENT =", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PERCENT <>", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_PERCENT >", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PERCENT >=", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentLessThan(BigDecimal value) {
            addCriterion("TOTAL_PERCENT <", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PERCENT <=", value, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PERCENT in", values, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PERCENT not in", values, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PERCENT between", value1, value2, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andTotalPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PERCENT not between", value1, value2, "totalPercent");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainIsNull() {
            addCriterion("PRO_PRICE_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainIsNotNull() {
            addCriterion("PRO_PRICE_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainEqualTo(String value) {
            addCriterion("PRO_PRICE_EXPLAIN =", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainNotEqualTo(String value) {
            addCriterion("PRO_PRICE_EXPLAIN <>", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainGreaterThan(String value) {
            addCriterion("PRO_PRICE_EXPLAIN >", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_PRICE_EXPLAIN >=", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainLessThan(String value) {
            addCriterion("PRO_PRICE_EXPLAIN <", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainLessThanOrEqualTo(String value) {
            addCriterion("PRO_PRICE_EXPLAIN <=", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainLike(String value) {
            addCriterion("PRO_PRICE_EXPLAIN like", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainNotLike(String value) {
            addCriterion("PRO_PRICE_EXPLAIN not like", value, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainIn(List<String> values) {
            addCriterion("PRO_PRICE_EXPLAIN in", values, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainNotIn(List<String> values) {
            addCriterion("PRO_PRICE_EXPLAIN not in", values, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainBetween(String value1, String value2) {
            addCriterion("PRO_PRICE_EXPLAIN between", value1, value2, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andProPriceExplainNotBetween(String value1, String value2) {
            addCriterion("PRO_PRICE_EXPLAIN not between", value1, value2, "proPriceExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainIsNull() {
            addCriterion("TOTAL_PERCENT_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainIsNotNull() {
            addCriterion("TOTAL_PERCENT_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainEqualTo(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN =", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainNotEqualTo(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN <>", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainGreaterThan(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN >", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN >=", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainLessThan(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN <", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN <=", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainLike(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN like", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainNotLike(String value) {
            addCriterion("TOTAL_PERCENT_EXPLAIN not like", value, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainIn(List<String> values) {
            addCriterion("TOTAL_PERCENT_EXPLAIN in", values, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainNotIn(List<String> values) {
            addCriterion("TOTAL_PERCENT_EXPLAIN not in", values, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainBetween(String value1, String value2) {
            addCriterion("TOTAL_PERCENT_EXPLAIN between", value1, value2, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andTotalPercentExplainNotBetween(String value1, String value2) {
            addCriterion("TOTAL_PERCENT_EXPLAIN not between", value1, value2, "totalPercentExplain");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("PUBLISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("PUBLISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("PUBLISH_DATE =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("PUBLISH_DATE <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("PUBLISH_DATE >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_DATE >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("PUBLISH_DATE <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISH_DATE <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("PUBLISH_DATE in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("PUBLISH_DATE not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_DATE between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISH_DATE not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDurationIsNull() {
            addCriterion("PUBLISH_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andPublishDurationIsNotNull() {
            addCriterion("PUBLISH_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDurationEqualTo(Short value) {
            addCriterion("PUBLISH_DURATION =", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationNotEqualTo(Short value) {
            addCriterion("PUBLISH_DURATION <>", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationGreaterThan(Short value) {
            addCriterion("PUBLISH_DURATION >", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("PUBLISH_DURATION >=", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationLessThan(Short value) {
            addCriterion("PUBLISH_DURATION <", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationLessThanOrEqualTo(Short value) {
            addCriterion("PUBLISH_DURATION <=", value, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationIn(List<Short> values) {
            addCriterion("PUBLISH_DURATION in", values, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationNotIn(List<Short> values) {
            addCriterion("PUBLISH_DURATION not in", values, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationBetween(Short value1, Short value2) {
            addCriterion("PUBLISH_DURATION between", value1, value2, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andPublishDurationNotBetween(Short value1, Short value2) {
            addCriterion("PUBLISH_DURATION not between", value1, value2, "publishDuration");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("EXPIRE_DATE =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("EXPIRE_DATE >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("EXPIRE_DATE <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRE_DATE <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("EXPIRE_DATE in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("EXPIRE_DATE not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRE_DATE not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeIsNull() {
            addCriterion("PRE_EXCHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeIsNotNull() {
            addCriterion("PRE_EXCHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeEqualTo(String value) {
            addCriterion("PRE_EXCHANGE_TYPE =", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeNotEqualTo(String value) {
            addCriterion("PRE_EXCHANGE_TYPE <>", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeGreaterThan(String value) {
            addCriterion("PRE_EXCHANGE_TYPE >", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_EXCHANGE_TYPE >=", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeLessThan(String value) {
            addCriterion("PRE_EXCHANGE_TYPE <", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeLessThanOrEqualTo(String value) {
            addCriterion("PRE_EXCHANGE_TYPE <=", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeLike(String value) {
            addCriterion("PRE_EXCHANGE_TYPE like", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeNotLike(String value) {
            addCriterion("PRE_EXCHANGE_TYPE not like", value, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeIn(List<String> values) {
            addCriterion("PRE_EXCHANGE_TYPE in", values, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeNotIn(List<String> values) {
            addCriterion("PRE_EXCHANGE_TYPE not in", values, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeBetween(String value1, String value2) {
            addCriterion("PRE_EXCHANGE_TYPE between", value1, value2, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andPreExchangeTypeNotBetween(String value1, String value2) {
            addCriterion("PRE_EXCHANGE_TYPE not between", value1, value2, "preExchangeType");
            return (Criteria) this;
        }

        public Criteria andSelectDateIsNull() {
            addCriterion("SELECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSelectDateIsNotNull() {
            addCriterion("SELECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSelectDateEqualTo(Date value) {
            addCriterion("SELECT_DATE =", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateNotEqualTo(Date value) {
            addCriterion("SELECT_DATE <>", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateGreaterThan(Date value) {
            addCriterion("SELECT_DATE >", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SELECT_DATE >=", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateLessThan(Date value) {
            addCriterion("SELECT_DATE <", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateLessThanOrEqualTo(Date value) {
            addCriterion("SELECT_DATE <=", value, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateIn(List<Date> values) {
            addCriterion("SELECT_DATE in", values, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateNotIn(List<Date> values) {
            addCriterion("SELECT_DATE not in", values, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateBetween(Date value1, Date value2) {
            addCriterion("SELECT_DATE between", value1, value2, "selectDate");
            return (Criteria) this;
        }

        public Criteria andSelectDateNotBetween(Date value1, Date value2) {
            addCriterion("SELECT_DATE not between", value1, value2, "selectDate");
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

        public Criteria andWebBidDateStartIsNull() {
            addCriterion("WEB_BID_DATE_START is null");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartIsNotNull() {
            addCriterion("WEB_BID_DATE_START is not null");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_START =", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartNotEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_START <>", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartGreaterThan(Date value) {
            addCriterion("WEB_BID_DATE_START >", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartGreaterThanOrEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_START >=", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartLessThan(Date value) {
            addCriterion("WEB_BID_DATE_START <", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartLessThanOrEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_START <=", value, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartIn(List<Date> values) {
            addCriterion("WEB_BID_DATE_START in", values, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartNotIn(List<Date> values) {
            addCriterion("WEB_BID_DATE_START not in", values, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartBetween(Date value1, Date value2) {
            addCriterion("WEB_BID_DATE_START between", value1, value2, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateStartNotBetween(Date value1, Date value2) {
            addCriterion("WEB_BID_DATE_START not between", value1, value2, "webBidDateStart");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndIsNull() {
            addCriterion("WEB_BID_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndIsNotNull() {
            addCriterion("WEB_BID_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_END =", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndNotEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_END <>", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndGreaterThan(Date value) {
            addCriterion("WEB_BID_DATE_END >", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_END >=", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndLessThan(Date value) {
            addCriterion("WEB_BID_DATE_END <", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndLessThanOrEqualTo(Date value) {
            addCriterion("WEB_BID_DATE_END <=", value, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndIn(List<Date> values) {
            addCriterion("WEB_BID_DATE_END in", values, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndNotIn(List<Date> values) {
            addCriterion("WEB_BID_DATE_END not in", values, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndBetween(Date value1, Date value2) {
            addCriterion("WEB_BID_DATE_END between", value1, value2, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andWebBidDateEndNotBetween(Date value1, Date value2) {
            addCriterion("WEB_BID_DATE_END not between", value1, value2, "webBidDateEnd");
            return (Criteria) this;
        }

        public Criteria andIsDepositIsNull() {
            addCriterion("IS_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andIsDepositIsNotNull() {
            addCriterion("IS_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDepositEqualTo(String value) {
            addCriterion("IS_DEPOSIT =", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotEqualTo(String value) {
            addCriterion("IS_DEPOSIT <>", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositGreaterThan(String value) {
            addCriterion("IS_DEPOSIT >", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEPOSIT >=", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositLessThan(String value) {
            addCriterion("IS_DEPOSIT <", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositLessThanOrEqualTo(String value) {
            addCriterion("IS_DEPOSIT <=", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositLike(String value) {
            addCriterion("IS_DEPOSIT like", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotLike(String value) {
            addCriterion("IS_DEPOSIT not like", value, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositIn(List<String> values) {
            addCriterion("IS_DEPOSIT in", values, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotIn(List<String> values) {
            addCriterion("IS_DEPOSIT not in", values, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositBetween(String value1, String value2) {
            addCriterion("IS_DEPOSIT between", value1, value2, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andIsDepositNotBetween(String value1, String value2) {
            addCriterion("IS_DEPOSIT not between", value1, value2, "isDeposit");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNull() {
            addCriterion("DEPOSIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDepositDateIsNotNull() {
            addCriterion("DEPOSIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDateEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE =", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE <>", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThan(Date value) {
            addCriterion("DEPOSIT_DATE >", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE >=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThan(Date value) {
            addCriterion("DEPOSIT_DATE <", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateLessThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE <=", value, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateIn(List<Date> values) {
            addCriterion("DEPOSIT_DATE in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotIn(List<Date> values) {
            addCriterion("DEPOSIT_DATE not in", values, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_DATE between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateNotBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_DATE not between", value1, value2, "depositDate");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndIsNull() {
            addCriterion("DEPOSIT_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndIsNotNull() {
            addCriterion("DEPOSIT_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE_END =", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndNotEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE_END <>", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndGreaterThan(Date value) {
            addCriterion("DEPOSIT_DATE_END >", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndGreaterThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE_END >=", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndLessThan(Date value) {
            addCriterion("DEPOSIT_DATE_END <", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndLessThanOrEqualTo(Date value) {
            addCriterion("DEPOSIT_DATE_END <=", value, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndIn(List<Date> values) {
            addCriterion("DEPOSIT_DATE_END in", values, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndNotIn(List<Date> values) {
            addCriterion("DEPOSIT_DATE_END not in", values, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_DATE_END between", value1, value2, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andDepositDateEndNotBetween(Date value1, Date value2) {
            addCriterion("DEPOSIT_DATE_END not between", value1, value2, "depositDateEnd");
            return (Criteria) this;
        }

        public Criteria andProcontactIsNull() {
            addCriterion("PROCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andProcontactIsNotNull() {
            addCriterion("PROCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andProcontactEqualTo(String value) {
            addCriterion("PROCONTACT =", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactNotEqualTo(String value) {
            addCriterion("PROCONTACT <>", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactGreaterThan(String value) {
            addCriterion("PROCONTACT >", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactGreaterThanOrEqualTo(String value) {
            addCriterion("PROCONTACT >=", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactLessThan(String value) {
            addCriterion("PROCONTACT <", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactLessThanOrEqualTo(String value) {
            addCriterion("PROCONTACT <=", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactLike(String value) {
            addCriterion("PROCONTACT like", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactNotLike(String value) {
            addCriterion("PROCONTACT not like", value, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactIn(List<String> values) {
            addCriterion("PROCONTACT in", values, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactNotIn(List<String> values) {
            addCriterion("PROCONTACT not in", values, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactBetween(String value1, String value2) {
            addCriterion("PROCONTACT between", value1, value2, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactNotBetween(String value1, String value2) {
            addCriterion("PROCONTACT not between", value1, value2, "procontact");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileIsNull() {
            addCriterion("PROCONTACT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileIsNotNull() {
            addCriterion("PROCONTACT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileEqualTo(String value) {
            addCriterion("PROCONTACT_MOBILE =", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileNotEqualTo(String value) {
            addCriterion("PROCONTACT_MOBILE <>", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileGreaterThan(String value) {
            addCriterion("PROCONTACT_MOBILE >", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PROCONTACT_MOBILE >=", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileLessThan(String value) {
            addCriterion("PROCONTACT_MOBILE <", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileLessThanOrEqualTo(String value) {
            addCriterion("PROCONTACT_MOBILE <=", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileLike(String value) {
            addCriterion("PROCONTACT_MOBILE like", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileNotLike(String value) {
            addCriterion("PROCONTACT_MOBILE not like", value, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileIn(List<String> values) {
            addCriterion("PROCONTACT_MOBILE in", values, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileNotIn(List<String> values) {
            addCriterion("PROCONTACT_MOBILE not in", values, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileBetween(String value1, String value2) {
            addCriterion("PROCONTACT_MOBILE between", value1, value2, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactMobileNotBetween(String value1, String value2) {
            addCriterion("PROCONTACT_MOBILE not between", value1, value2, "procontactMobile");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailIsNull() {
            addCriterion("PROCONTACT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailIsNotNull() {
            addCriterion("PROCONTACT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailEqualTo(String value) {
            addCriterion("PROCONTACT_EMAIL =", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailNotEqualTo(String value) {
            addCriterion("PROCONTACT_EMAIL <>", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailGreaterThan(String value) {
            addCriterion("PROCONTACT_EMAIL >", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("PROCONTACT_EMAIL >=", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailLessThan(String value) {
            addCriterion("PROCONTACT_EMAIL <", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailLessThanOrEqualTo(String value) {
            addCriterion("PROCONTACT_EMAIL <=", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailLike(String value) {
            addCriterion("PROCONTACT_EMAIL like", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailNotLike(String value) {
            addCriterion("PROCONTACT_EMAIL not like", value, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailIn(List<String> values) {
            addCriterion("PROCONTACT_EMAIL in", values, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailNotIn(List<String> values) {
            addCriterion("PROCONTACT_EMAIL not in", values, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailBetween(String value1, String value2) {
            addCriterion("PROCONTACT_EMAIL between", value1, value2, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andProcontactEmailNotBetween(String value1, String value2) {
            addCriterion("PROCONTACT_EMAIL not between", value1, value2, "procontactEmail");
            return (Criteria) this;
        }

        public Criteria andDeptcontactIsNull() {
            addCriterion("DEPTCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andDeptcontactIsNotNull() {
            addCriterion("DEPTCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcontactEqualTo(String value) {
            addCriterion("DEPTCONTACT =", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactNotEqualTo(String value) {
            addCriterion("DEPTCONTACT <>", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactGreaterThan(String value) {
            addCriterion("DEPTCONTACT >", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCONTACT >=", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactLessThan(String value) {
            addCriterion("DEPTCONTACT <", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactLessThanOrEqualTo(String value) {
            addCriterion("DEPTCONTACT <=", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactLike(String value) {
            addCriterion("DEPTCONTACT like", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactNotLike(String value) {
            addCriterion("DEPTCONTACT not like", value, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactIn(List<String> values) {
            addCriterion("DEPTCONTACT in", values, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactNotIn(List<String> values) {
            addCriterion("DEPTCONTACT not in", values, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactBetween(String value1, String value2) {
            addCriterion("DEPTCONTACT between", value1, value2, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactNotBetween(String value1, String value2) {
            addCriterion("DEPTCONTACT not between", value1, value2, "deptcontact");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileIsNull() {
            addCriterion("DEPTCONTACT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileIsNotNull() {
            addCriterion("DEPTCONTACT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileEqualTo(String value) {
            addCriterion("DEPTCONTACT_MOBILE =", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileNotEqualTo(String value) {
            addCriterion("DEPTCONTACT_MOBILE <>", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileGreaterThan(String value) {
            addCriterion("DEPTCONTACT_MOBILE >", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCONTACT_MOBILE >=", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileLessThan(String value) {
            addCriterion("DEPTCONTACT_MOBILE <", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileLessThanOrEqualTo(String value) {
            addCriterion("DEPTCONTACT_MOBILE <=", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileLike(String value) {
            addCriterion("DEPTCONTACT_MOBILE like", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileNotLike(String value) {
            addCriterion("DEPTCONTACT_MOBILE not like", value, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileIn(List<String> values) {
            addCriterion("DEPTCONTACT_MOBILE in", values, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileNotIn(List<String> values) {
            addCriterion("DEPTCONTACT_MOBILE not in", values, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileBetween(String value1, String value2) {
            addCriterion("DEPTCONTACT_MOBILE between", value1, value2, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andDeptcontactMobileNotBetween(String value1, String value2) {
            addCriterion("DEPTCONTACT_MOBILE not between", value1, value2, "deptcontactMobile");
            return (Criteria) this;
        }

        public Criteria andMemberOrgIsNull() {
            addCriterion("MEMBER_ORG is null");
            return (Criteria) this;
        }

        public Criteria andMemberOrgIsNotNull() {
            addCriterion("MEMBER_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOrgEqualTo(String value) {
            addCriterion("MEMBER_ORG =", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgNotEqualTo(String value) {
            addCriterion("MEMBER_ORG <>", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgGreaterThan(String value) {
            addCriterion("MEMBER_ORG >", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ORG >=", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgLessThan(String value) {
            addCriterion("MEMBER_ORG <", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ORG <=", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgLike(String value) {
            addCriterion("MEMBER_ORG like", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgNotLike(String value) {
            addCriterion("MEMBER_ORG not like", value, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgIn(List<String> values) {
            addCriterion("MEMBER_ORG in", values, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgNotIn(List<String> values) {
            addCriterion("MEMBER_ORG not in", values, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgBetween(String value1, String value2) {
            addCriterion("MEMBER_ORG between", value1, value2, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberOrgNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ORG not between", value1, value2, "memberOrg");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerIsNull() {
            addCriterion("MEMBER_BROKER is null");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerIsNotNull() {
            addCriterion("MEMBER_BROKER is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerEqualTo(String value) {
            addCriterion("MEMBER_BROKER =", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerNotEqualTo(String value) {
            addCriterion("MEMBER_BROKER <>", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerGreaterThan(String value) {
            addCriterion("MEMBER_BROKER >", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_BROKER >=", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerLessThan(String value) {
            addCriterion("MEMBER_BROKER <", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_BROKER <=", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerLike(String value) {
            addCriterion("MEMBER_BROKER like", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerNotLike(String value) {
            addCriterion("MEMBER_BROKER not like", value, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerIn(List<String> values) {
            addCriterion("MEMBER_BROKER in", values, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerNotIn(List<String> values) {
            addCriterion("MEMBER_BROKER not in", values, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerBetween(String value1, String value2) {
            addCriterion("MEMBER_BROKER between", value1, value2, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberBrokerNotBetween(String value1, String value2) {
            addCriterion("MEMBER_BROKER not between", value1, value2, "memberBroker");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNull() {
            addCriterion("MEMBER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("MEMBER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("MEMBER_MOBILE =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("MEMBER_MOBILE <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("MEMBER_MOBILE >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_MOBILE >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("MEMBER_MOBILE <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_MOBILE <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("MEMBER_MOBILE like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("MEMBER_MOBILE not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("MEMBER_MOBILE in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("MEMBER_MOBILE not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("MEMBER_MOBILE between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("MEMBER_MOBILE not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("MEMBER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("MEMBER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("MEMBER_EMAIL =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("MEMBER_EMAIL >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("MEMBER_EMAIL <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("MEMBER_EMAIL like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("MEMBER_EMAIL not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("MEMBER_EMAIL in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("MEMBER_EMAIL not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIsNull() {
            addCriterion("PROJECT_URL is null");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIsNotNull() {
            addCriterion("PROJECT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProjectUrlEqualTo(String value) {
            addCriterion("PROJECT_URL =", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotEqualTo(String value) {
            addCriterion("PROJECT_URL <>", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlGreaterThan(String value) {
            addCriterion("PROJECT_URL >", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_URL >=", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLessThan(String value) {
            addCriterion("PROJECT_URL <", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_URL <=", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLike(String value) {
            addCriterion("PROJECT_URL like", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotLike(String value) {
            addCriterion("PROJECT_URL not like", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIn(List<String> values) {
            addCriterion("PROJECT_URL in", values, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotIn(List<String> values) {
            addCriterion("PROJECT_URL not in", values, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlBetween(String value1, String value2) {
            addCriterion("PROJECT_URL between", value1, value2, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotBetween(String value1, String value2) {
            addCriterion("PROJECT_URL not between", value1, value2, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlIsNull() {
            addCriterion("WEB_BID_URL is null");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlIsNotNull() {
            addCriterion("WEB_BID_URL is not null");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlEqualTo(String value) {
            addCriterion("WEB_BID_URL =", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlNotEqualTo(String value) {
            addCriterion("WEB_BID_URL <>", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlGreaterThan(String value) {
            addCriterion("WEB_BID_URL >", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_BID_URL >=", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlLessThan(String value) {
            addCriterion("WEB_BID_URL <", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlLessThanOrEqualTo(String value) {
            addCriterion("WEB_BID_URL <=", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlLike(String value) {
            addCriterion("WEB_BID_URL like", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlNotLike(String value) {
            addCriterion("WEB_BID_URL not like", value, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlIn(List<String> values) {
            addCriterion("WEB_BID_URL in", values, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlNotIn(List<String> values) {
            addCriterion("WEB_BID_URL not in", values, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlBetween(String value1, String value2) {
            addCriterion("WEB_BID_URL between", value1, value2, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andWebBidUrlNotBetween(String value1, String value2) {
            addCriterion("WEB_BID_URL not between", value1, value2, "webBidUrl");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIsNull() {
            addCriterion("TERMINATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIsNotNull() {
            addCriterion("TERMINATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminateDateEqualTo(Date value) {
            addCriterion("TERMINATE_DATE =", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotEqualTo(Date value) {
            addCriterion("TERMINATE_DATE <>", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateGreaterThan(Date value) {
            addCriterion("TERMINATE_DATE >", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TERMINATE_DATE >=", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateLessThan(Date value) {
            addCriterion("TERMINATE_DATE <", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateLessThanOrEqualTo(Date value) {
            addCriterion("TERMINATE_DATE <=", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIn(List<Date> values) {
            addCriterion("TERMINATE_DATE in", values, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotIn(List<Date> values) {
            addCriterion("TERMINATE_DATE not in", values, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateBetween(Date value1, Date value2) {
            addCriterion("TERMINATE_DATE between", value1, value2, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotBetween(Date value1, Date value2) {
            addCriterion("TERMINATE_DATE not between", value1, value2, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonIsNull() {
            addCriterion("TERMINATE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonIsNotNull() {
            addCriterion("TERMINATE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonEqualTo(String value) {
            addCriterion("TERMINATE_REASON =", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonNotEqualTo(String value) {
            addCriterion("TERMINATE_REASON <>", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonGreaterThan(String value) {
            addCriterion("TERMINATE_REASON >", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINATE_REASON >=", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonLessThan(String value) {
            addCriterion("TERMINATE_REASON <", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonLessThanOrEqualTo(String value) {
            addCriterion("TERMINATE_REASON <=", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonLike(String value) {
            addCriterion("TERMINATE_REASON like", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonNotLike(String value) {
            addCriterion("TERMINATE_REASON not like", value, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonIn(List<String> values) {
            addCriterion("TERMINATE_REASON in", values, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonNotIn(List<String> values) {
            addCriterion("TERMINATE_REASON not in", values, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonBetween(String value1, String value2) {
            addCriterion("TERMINATE_REASON between", value1, value2, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andTerminateReasonNotBetween(String value1, String value2) {
            addCriterion("TERMINATE_REASON not between", value1, value2, "terminateReason");
            return (Criteria) this;
        }

        public Criteria andPauseDateIsNull() {
            addCriterion("PAUSE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPauseDateIsNotNull() {
            addCriterion("PAUSE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPauseDateEqualTo(Date value) {
            addCriterion("PAUSE_DATE =", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateNotEqualTo(Date value) {
            addCriterion("PAUSE_DATE <>", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateGreaterThan(Date value) {
            addCriterion("PAUSE_DATE >", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAUSE_DATE >=", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateLessThan(Date value) {
            addCriterion("PAUSE_DATE <", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateLessThanOrEqualTo(Date value) {
            addCriterion("PAUSE_DATE <=", value, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateIn(List<Date> values) {
            addCriterion("PAUSE_DATE in", values, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateNotIn(List<Date> values) {
            addCriterion("PAUSE_DATE not in", values, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateBetween(Date value1, Date value2) {
            addCriterion("PAUSE_DATE between", value1, value2, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseDateNotBetween(Date value1, Date value2) {
            addCriterion("PAUSE_DATE not between", value1, value2, "pauseDate");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNull() {
            addCriterion("PAUSE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNotNull() {
            addCriterion("PAUSE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonEqualTo(String value) {
            addCriterion("PAUSE_REASON =", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotEqualTo(String value) {
            addCriterion("PAUSE_REASON <>", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThan(String value) {
            addCriterion("PAUSE_REASON >", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("PAUSE_REASON >=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThan(String value) {
            addCriterion("PAUSE_REASON <", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThanOrEqualTo(String value) {
            addCriterion("PAUSE_REASON <=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLike(String value) {
            addCriterion("PAUSE_REASON like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotLike(String value) {
            addCriterion("PAUSE_REASON not like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIn(List<String> values) {
            addCriterion("PAUSE_REASON in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotIn(List<String> values) {
            addCriterion("PAUSE_REASON not in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonBetween(String value1, String value2) {
            addCriterion("PAUSE_REASON between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotBetween(String value1, String value2) {
            addCriterion("PAUSE_REASON not between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andResumeDateIsNull() {
            addCriterion("RESUME_DATE is null");
            return (Criteria) this;
        }

        public Criteria andResumeDateIsNotNull() {
            addCriterion("RESUME_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andResumeDateEqualTo(Date value) {
            addCriterion("RESUME_DATE =", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateNotEqualTo(Date value) {
            addCriterion("RESUME_DATE <>", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateGreaterThan(Date value) {
            addCriterion("RESUME_DATE >", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RESUME_DATE >=", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateLessThan(Date value) {
            addCriterion("RESUME_DATE <", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateLessThanOrEqualTo(Date value) {
            addCriterion("RESUME_DATE <=", value, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateIn(List<Date> values) {
            addCriterion("RESUME_DATE in", values, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateNotIn(List<Date> values) {
            addCriterion("RESUME_DATE not in", values, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateBetween(Date value1, Date value2) {
            addCriterion("RESUME_DATE between", value1, value2, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andResumeDateNotBetween(Date value1, Date value2) {
            addCriterion("RESUME_DATE not between", value1, value2, "resumeDate");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeIsNull() {
            addCriterion("UNIFIED_DEAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeIsNotNull() {
            addCriterion("UNIFIED_DEAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeEqualTo(String value) {
            addCriterion("UNIFIED_DEAL_CODE =", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeNotEqualTo(String value) {
            addCriterion("UNIFIED_DEAL_CODE <>", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeGreaterThan(String value) {
            addCriterion("UNIFIED_DEAL_CODE >", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIED_DEAL_CODE >=", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeLessThan(String value) {
            addCriterion("UNIFIED_DEAL_CODE <", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeLessThanOrEqualTo(String value) {
            addCriterion("UNIFIED_DEAL_CODE <=", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeLike(String value) {
            addCriterion("UNIFIED_DEAL_CODE like", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeNotLike(String value) {
            addCriterion("UNIFIED_DEAL_CODE not like", value, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeIn(List<String> values) {
            addCriterion("UNIFIED_DEAL_CODE in", values, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeNotIn(List<String> values) {
            addCriterion("UNIFIED_DEAL_CODE not in", values, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeBetween(String value1, String value2) {
            addCriterion("UNIFIED_DEAL_CODE between", value1, value2, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andUnifiedDealCodeNotBetween(String value1, String value2) {
            addCriterion("UNIFIED_DEAL_CODE not between", value1, value2, "unifiedDealCode");
            return (Criteria) this;
        }

        public Criteria andPostPoneIsNull() {
            addCriterion("POST_PONE is null");
            return (Criteria) this;
        }

        public Criteria andPostPoneIsNotNull() {
            addCriterion("POST_PONE is not null");
            return (Criteria) this;
        }

        public Criteria andPostPoneEqualTo(String value) {
            addCriterion("POST_PONE =", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneNotEqualTo(String value) {
            addCriterion("POST_PONE <>", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneGreaterThan(String value) {
            addCriterion("POST_PONE >", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneGreaterThanOrEqualTo(String value) {
            addCriterion("POST_PONE >=", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneLessThan(String value) {
            addCriterion("POST_PONE <", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneLessThanOrEqualTo(String value) {
            addCriterion("POST_PONE <=", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneLike(String value) {
            addCriterion("POST_PONE like", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneNotLike(String value) {
            addCriterion("POST_PONE not like", value, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneIn(List<String> values) {
            addCriterion("POST_PONE in", values, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneNotIn(List<String> values) {
            addCriterion("POST_PONE not in", values, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneBetween(String value1, String value2) {
            addCriterion("POST_PONE between", value1, value2, "postPone");
            return (Criteria) this;
        }

        public Criteria andPostPoneNotBetween(String value1, String value2) {
            addCriterion("POST_PONE not between", value1, value2, "postPone");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNull() {
            addCriterion("PLATFORM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNotNull() {
            addCriterion("PLATFORM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeEqualTo(String value) {
            addCriterion("PLATFORM_CODE =", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotEqualTo(String value) {
            addCriterion("PLATFORM_CODE <>", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThan(String value) {
            addCriterion("PLATFORM_CODE >", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_CODE >=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThan(String value) {
            addCriterion("PLATFORM_CODE <", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_CODE <=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLike(String value) {
            addCriterion("PLATFORM_CODE like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotLike(String value) {
            addCriterion("PLATFORM_CODE not like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIn(List<String> values) {
            addCriterion("PLATFORM_CODE in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotIn(List<String> values) {
            addCriterion("PLATFORM_CODE not in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeBetween(String value1, String value2) {
            addCriterion("PLATFORM_CODE between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_CODE not between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeIsNull() {
            addCriterion("PUB_SERVICE_PLAT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeIsNotNull() {
            addCriterion("PUB_SERVICE_PLAT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeEqualTo(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE =", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeNotEqualTo(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE <>", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeGreaterThan(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE >", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE >=", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeLessThan(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE <", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeLessThanOrEqualTo(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE <=", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeLike(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE like", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeNotLike(String value) {
            addCriterion("PUB_SERVICE_PLAT_CODE not like", value, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeIn(List<String> values) {
            addCriterion("PUB_SERVICE_PLAT_CODE in", values, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeNotIn(List<String> values) {
            addCriterion("PUB_SERVICE_PLAT_CODE not in", values, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeBetween(String value1, String value2) {
            addCriterion("PUB_SERVICE_PLAT_CODE between", value1, value2, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andPubServicePlatCodeNotBetween(String value1, String value2) {
            addCriterion("PUB_SERVICE_PLAT_CODE not between", value1, value2, "pubServicePlatCode");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIsNull() {
            addCriterion("DATA_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIsNotNull() {
            addCriterion("DATA_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimestampEqualTo(Date value) {
            addCriterion("DATA_TIMESTAMP =", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotEqualTo(Date value) {
            addCriterion("DATA_TIMESTAMP <>", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampGreaterThan(Date value) {
            addCriterion("DATA_TIMESTAMP >", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("DATA_TIMESTAMP >=", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampLessThan(Date value) {
            addCriterion("DATA_TIMESTAMP <", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampLessThanOrEqualTo(Date value) {
            addCriterion("DATA_TIMESTAMP <=", value, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampIn(List<Date> values) {
            addCriterion("DATA_TIMESTAMP in", values, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotIn(List<Date> values) {
            addCriterion("DATA_TIMESTAMP not in", values, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampBetween(Date value1, Date value2) {
            addCriterion("DATA_TIMESTAMP between", value1, value2, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andDataTimestampNotBetween(Date value1, Date value2) {
            addCriterion("DATA_TIMESTAMP not between", value1, value2, "dataTimestamp");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIsNull() {
            addCriterion("EXCEPTION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIsNotNull() {
            addCriterion("EXCEPTION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusEqualTo(String value) {
            addCriterion("EXCEPTION_STATUS =", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotEqualTo(String value) {
            addCriterion("EXCEPTION_STATUS <>", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusGreaterThan(String value) {
            addCriterion("EXCEPTION_STATUS >", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_STATUS >=", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusLessThan(String value) {
            addCriterion("EXCEPTION_STATUS <", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_STATUS <=", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusLike(String value) {
            addCriterion("EXCEPTION_STATUS like", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotLike(String value) {
            addCriterion("EXCEPTION_STATUS not like", value, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusIn(List<String> values) {
            addCriterion("EXCEPTION_STATUS in", values, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotIn(List<String> values) {
            addCriterion("EXCEPTION_STATUS not in", values, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusBetween(String value1, String value2) {
            addCriterion("EXCEPTION_STATUS between", value1, value2, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionStatusNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_STATUS not between", value1, value2, "exceptionStatus");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNull() {
            addCriterion("IS_GZ is null");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNotNull() {
            addCriterion("IS_GZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsGzEqualTo(String value) {
            addCriterion("IS_GZ =", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotEqualTo(String value) {
            addCriterion("IS_GZ <>", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThan(String value) {
            addCriterion("IS_GZ >", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GZ >=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThan(String value) {
            addCriterion("IS_GZ <", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThanOrEqualTo(String value) {
            addCriterion("IS_GZ <=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLike(String value) {
            addCriterion("IS_GZ like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotLike(String value) {
            addCriterion("IS_GZ not like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzIn(List<String> values) {
            addCriterion("IS_GZ in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotIn(List<String> values) {
            addCriterion("IS_GZ not in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzBetween(String value1, String value2) {
            addCriterion("IS_GZ between", value1, value2, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotBetween(String value1, String value2) {
            addCriterion("IS_GZ not between", value1, value2, "isGz");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonIsNull() {
            addCriterion("MAN_POSTPONE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonIsNotNull() {
            addCriterion("MAN_POSTPONE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonEqualTo(String value) {
            addCriterion("MAN_POSTPONE_REASON =", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonNotEqualTo(String value) {
            addCriterion("MAN_POSTPONE_REASON <>", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonGreaterThan(String value) {
            addCriterion("MAN_POSTPONE_REASON >", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_POSTPONE_REASON >=", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonLessThan(String value) {
            addCriterion("MAN_POSTPONE_REASON <", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonLessThanOrEqualTo(String value) {
            addCriterion("MAN_POSTPONE_REASON <=", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonLike(String value) {
            addCriterion("MAN_POSTPONE_REASON like", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonNotLike(String value) {
            addCriterion("MAN_POSTPONE_REASON not like", value, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonIn(List<String> values) {
            addCriterion("MAN_POSTPONE_REASON in", values, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonNotIn(List<String> values) {
            addCriterion("MAN_POSTPONE_REASON not in", values, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonBetween(String value1, String value2) {
            addCriterion("MAN_POSTPONE_REASON between", value1, value2, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andManPostponeReasonNotBetween(String value1, String value2) {
            addCriterion("MAN_POSTPONE_REASON not between", value1, value2, "manPostponeReason");
            return (Criteria) this;
        }

        public Criteria andPickDateIsNull() {
            addCriterion("PICK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPickDateIsNotNull() {
            addCriterion("PICK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPickDateEqualTo(Date value) {
            addCriterion("PICK_DATE =", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotEqualTo(Date value) {
            addCriterion("PICK_DATE <>", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateGreaterThan(Date value) {
            addCriterion("PICK_DATE >", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PICK_DATE >=", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateLessThan(Date value) {
            addCriterion("PICK_DATE <", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateLessThanOrEqualTo(Date value) {
            addCriterion("PICK_DATE <=", value, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateIn(List<Date> values) {
            addCriterion("PICK_DATE in", values, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotIn(List<Date> values) {
            addCriterion("PICK_DATE not in", values, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateBetween(Date value1, Date value2) {
            addCriterion("PICK_DATE between", value1, value2, "pickDate");
            return (Criteria) this;
        }

        public Criteria andPickDateNotBetween(Date value1, Date value2) {
            addCriterion("PICK_DATE not between", value1, value2, "pickDate");
            return (Criteria) this;
        }

        public Criteria andExpireTypeIsNull() {
            addCriterion("EXPIRE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExpireTypeIsNotNull() {
            addCriterion("EXPIRE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTypeEqualTo(String value) {
            addCriterion("EXPIRE_TYPE =", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeNotEqualTo(String value) {
            addCriterion("EXPIRE_TYPE <>", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeGreaterThan(String value) {
            addCriterion("EXPIRE_TYPE >", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRE_TYPE >=", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeLessThan(String value) {
            addCriterion("EXPIRE_TYPE <", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeLessThanOrEqualTo(String value) {
            addCriterion("EXPIRE_TYPE <=", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeLike(String value) {
            addCriterion("EXPIRE_TYPE like", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeNotLike(String value) {
            addCriterion("EXPIRE_TYPE not like", value, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeIn(List<String> values) {
            addCriterion("EXPIRE_TYPE in", values, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeNotIn(List<String> values) {
            addCriterion("EXPIRE_TYPE not in", values, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeBetween(String value1, String value2) {
            addCriterion("EXPIRE_TYPE between", value1, value2, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireTypeNotBetween(String value1, String value2) {
            addCriterion("EXPIRE_TYPE not between", value1, value2, "expireType");
            return (Criteria) this;
        }

        public Criteria andExpireConditionIsNull() {
            addCriterion("EXPIRE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andExpireConditionIsNotNull() {
            addCriterion("EXPIRE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andExpireConditionEqualTo(String value) {
            addCriterion("EXPIRE_CONDITION =", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionNotEqualTo(String value) {
            addCriterion("EXPIRE_CONDITION <>", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionGreaterThan(String value) {
            addCriterion("EXPIRE_CONDITION >", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRE_CONDITION >=", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionLessThan(String value) {
            addCriterion("EXPIRE_CONDITION <", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionLessThanOrEqualTo(String value) {
            addCriterion("EXPIRE_CONDITION <=", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionLike(String value) {
            addCriterion("EXPIRE_CONDITION like", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionNotLike(String value) {
            addCriterion("EXPIRE_CONDITION not like", value, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionIn(List<String> values) {
            addCriterion("EXPIRE_CONDITION in", values, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionNotIn(List<String> values) {
            addCriterion("EXPIRE_CONDITION not in", values, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionBetween(String value1, String value2) {
            addCriterion("EXPIRE_CONDITION between", value1, value2, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andExpireConditionNotBetween(String value1, String value2) {
            addCriterion("EXPIRE_CONDITION not between", value1, value2, "expireCondition");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleIsNull() {
            addCriterion("POSTPONE_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleIsNotNull() {
            addCriterion("POSTPONE_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleEqualTo(Short value) {
            addCriterion("POSTPONE_CYCLE =", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleNotEqualTo(Short value) {
            addCriterion("POSTPONE_CYCLE <>", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleGreaterThan(Short value) {
            addCriterion("POSTPONE_CYCLE >", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleGreaterThanOrEqualTo(Short value) {
            addCriterion("POSTPONE_CYCLE >=", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleLessThan(Short value) {
            addCriterion("POSTPONE_CYCLE <", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleLessThanOrEqualTo(Short value) {
            addCriterion("POSTPONE_CYCLE <=", value, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleIn(List<Short> values) {
            addCriterion("POSTPONE_CYCLE in", values, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleNotIn(List<Short> values) {
            addCriterion("POSTPONE_CYCLE not in", values, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleBetween(Short value1, Short value2) {
            addCriterion("POSTPONE_CYCLE between", value1, value2, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andPostponeCycleNotBetween(Short value1, Short value2) {
            addCriterion("POSTPONE_CYCLE not between", value1, value2, "postponeCycle");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("REPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("REPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(String value) {
            addCriterion("REPORT_STATUS =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(String value) {
            addCriterion("REPORT_STATUS <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(String value) {
            addCriterion("REPORT_STATUS >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(String value) {
            addCriterion("REPORT_STATUS <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(String value) {
            addCriterion("REPORT_STATUS <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLike(String value) {
            addCriterion("REPORT_STATUS like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotLike(String value) {
            addCriterion("REPORT_STATUS not like", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<String> values) {
            addCriterion("REPORT_STATUS in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<String> values) {
            addCriterion("REPORT_STATUS not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(String value1, String value2) {
            addCriterion("REPORT_STATUS not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("REPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("REPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("REPORT_TIME =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("REPORT_TIME <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("REPORT_TIME >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORT_TIME >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("REPORT_TIME <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("REPORT_TIME <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("REPORT_TIME in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("REPORT_TIME not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("REPORT_TIME between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("REPORT_TIME not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusIsNull() {
            addCriterion("SENSITIVITY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusIsNotNull() {
            addCriterion("SENSITIVITY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS =", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusNotEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS <>", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusGreaterThan(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS >", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS >=", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusLessThan(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS <", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY_STATUS <=", value, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusIn(List<BigDecimal> values) {
            addCriterion("SENSITIVITY_STATUS in", values, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusNotIn(List<BigDecimal> values) {
            addCriterion("SENSITIVITY_STATUS not in", values, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENSITIVITY_STATUS between", value1, value2, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENSITIVITY_STATUS not between", value1, value2, "sensitivityStatus");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteIsNull() {
            addCriterion("SENSITIVITY_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteIsNotNull() {
            addCriterion("SENSITIVITY_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteEqualTo(String value) {
            addCriterion("SENSITIVITY_NOTE =", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteNotEqualTo(String value) {
            addCriterion("SENSITIVITY_NOTE <>", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteGreaterThan(String value) {
            addCriterion("SENSITIVITY_NOTE >", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteGreaterThanOrEqualTo(String value) {
            addCriterion("SENSITIVITY_NOTE >=", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteLessThan(String value) {
            addCriterion("SENSITIVITY_NOTE <", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteLessThanOrEqualTo(String value) {
            addCriterion("SENSITIVITY_NOTE <=", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteLike(String value) {
            addCriterion("SENSITIVITY_NOTE like", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteNotLike(String value) {
            addCriterion("SENSITIVITY_NOTE not like", value, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteIn(List<String> values) {
            addCriterion("SENSITIVITY_NOTE in", values, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteNotIn(List<String> values) {
            addCriterion("SENSITIVITY_NOTE not in", values, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteBetween(String value1, String value2) {
            addCriterion("SENSITIVITY_NOTE between", value1, value2, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andSensitivityNoteNotBetween(String value1, String value2) {
            addCriterion("SENSITIVITY_NOTE not between", value1, value2, "sensitivityNote");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("AUDIT_USER is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("AUDIT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(String value) {
            addCriterion("AUDIT_USER =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(String value) {
            addCriterion("AUDIT_USER <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(String value) {
            addCriterion("AUDIT_USER >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(String value) {
            addCriterion("AUDIT_USER <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLike(String value) {
            addCriterion("AUDIT_USER like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotLike(String value) {
            addCriterion("AUDIT_USER not like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<String> values) {
            addCriterion("AUDIT_USER in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<String> values) {
            addCriterion("AUDIT_USER not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(String value1, String value2) {
            addCriterion("AUDIT_USER between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(String value1, String value2) {
            addCriterion("AUDIT_USER not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AUDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AUDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("AUDIT_TIME =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("AUDIT_TIME <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("AUDIT_TIME >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDIT_TIME >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("AUDIT_TIME <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("AUDIT_TIME <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("AUDIT_TIME in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("AUDIT_TIME not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("AUDIT_TIME between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("AUDIT_TIME not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(BigDecimal value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(BigDecimal value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(BigDecimal value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(BigDecimal value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<BigDecimal> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<BigDecimal> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("AUDIT_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("AUDIT_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("AUDIT_OPINION =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("AUDIT_OPINION <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("AUDIT_OPINION >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_OPINION >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("AUDIT_OPINION <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_OPINION <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("AUDIT_OPINION like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("AUDIT_OPINION not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("AUDIT_OPINION in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("AUDIT_OPINION not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("AUDIT_OPINION between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("AUDIT_OPINION not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeIsNull() {
            addCriterion("RELATEDPROCODE is null");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeIsNotNull() {
            addCriterion("RELATEDPROCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeEqualTo(String value) {
            addCriterion("RELATEDPROCODE =", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeNotEqualTo(String value) {
            addCriterion("RELATEDPROCODE <>", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeGreaterThan(String value) {
            addCriterion("RELATEDPROCODE >", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELATEDPROCODE >=", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeLessThan(String value) {
            addCriterion("RELATEDPROCODE <", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeLessThanOrEqualTo(String value) {
            addCriterion("RELATEDPROCODE <=", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeLike(String value) {
            addCriterion("RELATEDPROCODE like", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeNotLike(String value) {
            addCriterion("RELATEDPROCODE not like", value, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeIn(List<String> values) {
            addCriterion("RELATEDPROCODE in", values, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeNotIn(List<String> values) {
            addCriterion("RELATEDPROCODE not in", values, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeBetween(String value1, String value2) {
            addCriterion("RELATEDPROCODE between", value1, value2, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andRelatedprocodeNotBetween(String value1, String value2) {
            addCriterion("RELATEDPROCODE not between", value1, value2, "relatedprocode");
            return (Criteria) this;
        }

        public Criteria andProbrokerIsNull() {
            addCriterion("PROBROKER is null");
            return (Criteria) this;
        }

        public Criteria andProbrokerIsNotNull() {
            addCriterion("PROBROKER is not null");
            return (Criteria) this;
        }

        public Criteria andProbrokerEqualTo(String value) {
            addCriterion("PROBROKER =", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerNotEqualTo(String value) {
            addCriterion("PROBROKER <>", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerGreaterThan(String value) {
            addCriterion("PROBROKER >", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerGreaterThanOrEqualTo(String value) {
            addCriterion("PROBROKER >=", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerLessThan(String value) {
            addCriterion("PROBROKER <", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerLessThanOrEqualTo(String value) {
            addCriterion("PROBROKER <=", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerLike(String value) {
            addCriterion("PROBROKER like", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerNotLike(String value) {
            addCriterion("PROBROKER not like", value, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerIn(List<String> values) {
            addCriterion("PROBROKER in", values, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerNotIn(List<String> values) {
            addCriterion("PROBROKER not in", values, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerBetween(String value1, String value2) {
            addCriterion("PROBROKER between", value1, value2, "probroker");
            return (Criteria) this;
        }

        public Criteria andProbrokerNotBetween(String value1, String value2) {
            addCriterion("PROBROKER not between", value1, value2, "probroker");
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