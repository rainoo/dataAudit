package com.jmj.entity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaaeFile2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeFile2Example() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileDescIsNull() {
            addCriterion("FILE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFileDescIsNotNull() {
            addCriterion("FILE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFileDescEqualTo(String value) {
            addCriterion("FILE_DESC =", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescNotEqualTo(String value) {
            addCriterion("FILE_DESC <>", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescGreaterThan(String value) {
            addCriterion("FILE_DESC >", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_DESC >=", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescLessThan(String value) {
            addCriterion("FILE_DESC <", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescLessThanOrEqualTo(String value) {
            addCriterion("FILE_DESC <=", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescLike(String value) {
            addCriterion("FILE_DESC like", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescNotLike(String value) {
            addCriterion("FILE_DESC not like", value, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescIn(List<String> values) {
            addCriterion("FILE_DESC in", values, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescNotIn(List<String> values) {
            addCriterion("FILE_DESC not in", values, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescBetween(String value1, String value2) {
            addCriterion("FILE_DESC between", value1, value2, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileDescNotBetween(String value1, String value2) {
            addCriterion("FILE_DESC not between", value1, value2, "fileDesc");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("FILE_URL =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("FILE_URL <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("FILE_URL >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_URL >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("FILE_URL <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("FILE_URL <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("FILE_URL like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("FILE_URL not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("FILE_URL in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("FILE_URL not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("FILE_URL between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("FILE_URL not between", value1, value2, "fileUrl");
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

        public Criteria andFileTypeIsNull() {
            addCriterion("FILE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FILE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Object value) {
            addCriterion("FILE_TYPE =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Object value) {
            addCriterion("FILE_TYPE <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Object value) {
            addCriterion("FILE_TYPE >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("FILE_TYPE >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Object value) {
            addCriterion("FILE_TYPE <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Object value) {
            addCriterion("FILE_TYPE <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Object> values) {
            addCriterion("FILE_TYPE in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Object> values) {
            addCriterion("FILE_TYPE not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Object value1, Object value2) {
            addCriterion("FILE_TYPE between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Object value1, Object value2) {
            addCriterion("FILE_TYPE not between", value1, value2, "fileType");
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