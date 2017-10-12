package com.jmj.entity2;

import java.util.ArrayList;
import java.util.List;

public class GqCaaeProject2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GqCaaeProject2Example() {
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

        public Criteria andGetControllingInterestIsNull() {
            addCriterion("GET_CONTROLLING_INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestIsNotNull() {
            addCriterion("GET_CONTROLLING_INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestEqualTo(String value) {
            addCriterion("GET_CONTROLLING_INTEREST =", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestNotEqualTo(String value) {
            addCriterion("GET_CONTROLLING_INTEREST <>", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestGreaterThan(String value) {
            addCriterion("GET_CONTROLLING_INTEREST >", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestGreaterThanOrEqualTo(String value) {
            addCriterion("GET_CONTROLLING_INTEREST >=", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestLessThan(String value) {
            addCriterion("GET_CONTROLLING_INTEREST <", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestLessThanOrEqualTo(String value) {
            addCriterion("GET_CONTROLLING_INTEREST <=", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestLike(String value) {
            addCriterion("GET_CONTROLLING_INTEREST like", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestNotLike(String value) {
            addCriterion("GET_CONTROLLING_INTEREST not like", value, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestIn(List<String> values) {
            addCriterion("GET_CONTROLLING_INTEREST in", values, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestNotIn(List<String> values) {
            addCriterion("GET_CONTROLLING_INTEREST not in", values, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestBetween(String value1, String value2) {
            addCriterion("GET_CONTROLLING_INTEREST between", value1, value2, "getControllingInterest");
            return (Criteria) this;
        }

        public Criteria andGetControllingInterestNotBetween(String value1, String value2) {
            addCriterion("GET_CONTROLLING_INTEREST not between", value1, value2, "getControllingInterest");
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

        public Criteria andGoTypeIsNull() {
            addCriterion("GO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoTypeIsNotNull() {
            addCriterion("GO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoTypeEqualTo(String value) {
            addCriterion("GO_TYPE =", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotEqualTo(String value) {
            addCriterion("GO_TYPE <>", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeGreaterThan(String value) {
            addCriterion("GO_TYPE >", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GO_TYPE >=", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLessThan(String value) {
            addCriterion("GO_TYPE <", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLessThanOrEqualTo(String value) {
            addCriterion("GO_TYPE <=", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLike(String value) {
            addCriterion("GO_TYPE like", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotLike(String value) {
            addCriterion("GO_TYPE not like", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeIn(List<String> values) {
            addCriterion("GO_TYPE in", values, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotIn(List<String> values) {
            addCriterion("GO_TYPE not in", values, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeBetween(String value1, String value2) {
            addCriterion("GO_TYPE between", value1, value2, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotBetween(String value1, String value2) {
            addCriterion("GO_TYPE not between", value1, value2, "goType");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeIsNull() {
            addCriterion("RELATED_PRO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeIsNotNull() {
            addCriterion("RELATED_PRO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeEqualTo(String value) {
            addCriterion("RELATED_PRO_CODE =", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeNotEqualTo(String value) {
            addCriterion("RELATED_PRO_CODE <>", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeGreaterThan(String value) {
            addCriterion("RELATED_PRO_CODE >", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELATED_PRO_CODE >=", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeLessThan(String value) {
            addCriterion("RELATED_PRO_CODE <", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeLessThanOrEqualTo(String value) {
            addCriterion("RELATED_PRO_CODE <=", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeLike(String value) {
            addCriterion("RELATED_PRO_CODE like", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeNotLike(String value) {
            addCriterion("RELATED_PRO_CODE not like", value, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeIn(List<String> values) {
            addCriterion("RELATED_PRO_CODE in", values, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeNotIn(List<String> values) {
            addCriterion("RELATED_PRO_CODE not in", values, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeBetween(String value1, String value2) {
            addCriterion("RELATED_PRO_CODE between", value1, value2, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andRelatedProCodeNotBetween(String value1, String value2) {
            addCriterion("RELATED_PRO_CODE not between", value1, value2, "relatedProCode");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNull() {
            addCriterion("IS_BIND is null");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNotNull() {
            addCriterion("IS_BIND is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindEqualTo(String value) {
            addCriterion("IS_BIND =", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotEqualTo(String value) {
            addCriterion("IS_BIND <>", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThan(String value) {
            addCriterion("IS_BIND >", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BIND >=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThan(String value) {
            addCriterion("IS_BIND <", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThanOrEqualTo(String value) {
            addCriterion("IS_BIND <=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLike(String value) {
            addCriterion("IS_BIND like", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotLike(String value) {
            addCriterion("IS_BIND not like", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindIn(List<String> values) {
            addCriterion("IS_BIND in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotIn(List<String> values) {
            addCriterion("IS_BIND not in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindBetween(String value1, String value2) {
            addCriterion("IS_BIND between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotBetween(String value1, String value2) {
            addCriterion("IS_BIND not between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andProBrokerIsNull() {
            addCriterion("PRO_BROKER is null");
            return (Criteria) this;
        }

        public Criteria andProBrokerIsNotNull() {
            addCriterion("PRO_BROKER is not null");
            return (Criteria) this;
        }

        public Criteria andProBrokerEqualTo(String value) {
            addCriterion("PRO_BROKER =", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerNotEqualTo(String value) {
            addCriterion("PRO_BROKER <>", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerGreaterThan(String value) {
            addCriterion("PRO_BROKER >", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_BROKER >=", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerLessThan(String value) {
            addCriterion("PRO_BROKER <", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerLessThanOrEqualTo(String value) {
            addCriterion("PRO_BROKER <=", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerLike(String value) {
            addCriterion("PRO_BROKER like", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerNotLike(String value) {
            addCriterion("PRO_BROKER not like", value, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerIn(List<String> values) {
            addCriterion("PRO_BROKER in", values, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerNotIn(List<String> values) {
            addCriterion("PRO_BROKER not in", values, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerBetween(String value1, String value2) {
            addCriterion("PRO_BROKER between", value1, value2, "proBroker");
            return (Criteria) this;
        }

        public Criteria andProBrokerNotBetween(String value1, String value2) {
            addCriterion("PRO_BROKER not between", value1, value2, "proBroker");
            return (Criteria) this;
        }

        public Criteria andManagementIntentIsNull() {
            addCriterion("MANAGEMENT_INTENT is null");
            return (Criteria) this;
        }

        public Criteria andManagementIntentIsNotNull() {
            addCriterion("MANAGEMENT_INTENT is not null");
            return (Criteria) this;
        }

        public Criteria andManagementIntentEqualTo(String value) {
            addCriterion("MANAGEMENT_INTENT =", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentNotEqualTo(String value) {
            addCriterion("MANAGEMENT_INTENT <>", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentGreaterThan(String value) {
            addCriterion("MANAGEMENT_INTENT >", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEMENT_INTENT >=", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentLessThan(String value) {
            addCriterion("MANAGEMENT_INTENT <", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentLessThanOrEqualTo(String value) {
            addCriterion("MANAGEMENT_INTENT <=", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentLike(String value) {
            addCriterion("MANAGEMENT_INTENT like", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentNotLike(String value) {
            addCriterion("MANAGEMENT_INTENT not like", value, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentIn(List<String> values) {
            addCriterion("MANAGEMENT_INTENT in", values, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentNotIn(List<String> values) {
            addCriterion("MANAGEMENT_INTENT not in", values, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentBetween(String value1, String value2) {
            addCriterion("MANAGEMENT_INTENT between", value1, value2, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andManagementIntentNotBetween(String value1, String value2) {
            addCriterion("MANAGEMENT_INTENT not between", value1, value2, "managementIntent");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityIsNull() {
            addCriterion("GIVE_UP_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityIsNotNull() {
            addCriterion("GIVE_UP_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityEqualTo(String value) {
            addCriterion("GIVE_UP_PRIORITY =", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityNotEqualTo(String value) {
            addCriterion("GIVE_UP_PRIORITY <>", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityGreaterThan(String value) {
            addCriterion("GIVE_UP_PRIORITY >", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("GIVE_UP_PRIORITY >=", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityLessThan(String value) {
            addCriterion("GIVE_UP_PRIORITY <", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityLessThanOrEqualTo(String value) {
            addCriterion("GIVE_UP_PRIORITY <=", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityLike(String value) {
            addCriterion("GIVE_UP_PRIORITY like", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityNotLike(String value) {
            addCriterion("GIVE_UP_PRIORITY not like", value, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityIn(List<String> values) {
            addCriterion("GIVE_UP_PRIORITY in", values, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityNotIn(List<String> values) {
            addCriterion("GIVE_UP_PRIORITY not in", values, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityBetween(String value1, String value2) {
            addCriterion("GIVE_UP_PRIORITY between", value1, value2, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andGiveUpPriorityNotBetween(String value1, String value2) {
            addCriterion("GIVE_UP_PRIORITY not between", value1, value2, "giveUpPriority");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleIsNull() {
            addCriterion("EMPLOYEE_SETTLE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleIsNotNull() {
            addCriterion("EMPLOYEE_SETTLE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleEqualTo(String value) {
            addCriterion("EMPLOYEE_SETTLE =", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleNotEqualTo(String value) {
            addCriterion("EMPLOYEE_SETTLE <>", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleGreaterThan(String value) {
            addCriterion("EMPLOYEE_SETTLE >", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SETTLE >=", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleLessThan(String value) {
            addCriterion("EMPLOYEE_SETTLE <", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SETTLE <=", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleLike(String value) {
            addCriterion("EMPLOYEE_SETTLE like", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleNotLike(String value) {
            addCriterion("EMPLOYEE_SETTLE not like", value, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleIn(List<String> values) {
            addCriterion("EMPLOYEE_SETTLE in", values, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleNotIn(List<String> values) {
            addCriterion("EMPLOYEE_SETTLE not in", values, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SETTLE between", value1, value2, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andEmployeeSettleNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SETTLE not between", value1, value2, "employeeSettle");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateIsNull() {
            addCriterion("BUYER_POSTULATE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateIsNotNull() {
            addCriterion("BUYER_POSTULATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateEqualTo(String value) {
            addCriterion("BUYER_POSTULATE =", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateNotEqualTo(String value) {
            addCriterion("BUYER_POSTULATE <>", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateGreaterThan(String value) {
            addCriterion("BUYER_POSTULATE >", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_POSTULATE >=", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateLessThan(String value) {
            addCriterion("BUYER_POSTULATE <", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateLessThanOrEqualTo(String value) {
            addCriterion("BUYER_POSTULATE <=", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateLike(String value) {
            addCriterion("BUYER_POSTULATE like", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateNotLike(String value) {
            addCriterion("BUYER_POSTULATE not like", value, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateIn(List<String> values) {
            addCriterion("BUYER_POSTULATE in", values, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateNotIn(List<String> values) {
            addCriterion("BUYER_POSTULATE not in", values, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateBetween(String value1, String value2) {
            addCriterion("BUYER_POSTULATE between", value1, value2, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andBuyerPostulateNotBetween(String value1, String value2) {
            addCriterion("BUYER_POSTULATE not between", value1, value2, "buyerPostulate");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIsNull() {
            addCriterion("IMPORTANT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIsNotNull() {
            addCriterion("IMPORTANT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andImportantInfoEqualTo(String value) {
            addCriterion("IMPORTANT_INFO =", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotEqualTo(String value) {
            addCriterion("IMPORTANT_INFO <>", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoGreaterThan(String value) {
            addCriterion("IMPORTANT_INFO >", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_INFO >=", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLessThan(String value) {
            addCriterion("IMPORTANT_INFO <", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_INFO <=", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoLike(String value) {
            addCriterion("IMPORTANT_INFO like", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotLike(String value) {
            addCriterion("IMPORTANT_INFO not like", value, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoIn(List<String> values) {
            addCriterion("IMPORTANT_INFO in", values, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotIn(List<String> values) {
            addCriterion("IMPORTANT_INFO not in", values, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoBetween(String value1, String value2) {
            addCriterion("IMPORTANT_INFO between", value1, value2, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andImportantInfoNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_INFO not between", value1, value2, "importantInfo");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsIsNull() {
            addCriterion("OTHER_CONDITIONS is null");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsIsNotNull() {
            addCriterion("OTHER_CONDITIONS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsEqualTo(String value) {
            addCriterion("OTHER_CONDITIONS =", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsNotEqualTo(String value) {
            addCriterion("OTHER_CONDITIONS <>", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsGreaterThan(String value) {
            addCriterion("OTHER_CONDITIONS >", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_CONDITIONS >=", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsLessThan(String value) {
            addCriterion("OTHER_CONDITIONS <", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsLessThanOrEqualTo(String value) {
            addCriterion("OTHER_CONDITIONS <=", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsLike(String value) {
            addCriterion("OTHER_CONDITIONS like", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsNotLike(String value) {
            addCriterion("OTHER_CONDITIONS not like", value, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsIn(List<String> values) {
            addCriterion("OTHER_CONDITIONS in", values, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsNotIn(List<String> values) {
            addCriterion("OTHER_CONDITIONS not in", values, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsBetween(String value1, String value2) {
            addCriterion("OTHER_CONDITIONS between", value1, value2, "otherConditions");
            return (Criteria) this;
        }

        public Criteria andOtherConditionsNotBetween(String value1, String value2) {
            addCriterion("OTHER_CONDITIONS not between", value1, value2, "otherConditions");
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

        public Criteria andTransPromiseIsNull() {
            addCriterion("TRANS_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andTransPromiseIsNotNull() {
            addCriterion("TRANS_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andTransPromiseEqualTo(String value) {
            addCriterion("TRANS_PROMISE =", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseNotEqualTo(String value) {
            addCriterion("TRANS_PROMISE <>", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseGreaterThan(String value) {
            addCriterion("TRANS_PROMISE >", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_PROMISE >=", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseLessThan(String value) {
            addCriterion("TRANS_PROMISE <", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseLessThanOrEqualTo(String value) {
            addCriterion("TRANS_PROMISE <=", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseLike(String value) {
            addCriterion("TRANS_PROMISE like", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseNotLike(String value) {
            addCriterion("TRANS_PROMISE not like", value, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseIn(List<String> values) {
            addCriterion("TRANS_PROMISE in", values, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseNotIn(List<String> values) {
            addCriterion("TRANS_PROMISE not in", values, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseBetween(String value1, String value2) {
            addCriterion("TRANS_PROMISE between", value1, value2, "transPromise");
            return (Criteria) this;
        }

        public Criteria andTransPromiseNotBetween(String value1, String value2) {
            addCriterion("TRANS_PROMISE not between", value1, value2, "transPromise");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNull() {
            addCriterion("LIMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNotNull() {
            addCriterion("LIMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualTo(Short value) {
            addCriterion("LIMIT_TIME =", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualTo(Short value) {
            addCriterion("LIMIT_TIME <>", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThan(Short value) {
            addCriterion("LIMIT_TIME >", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("LIMIT_TIME >=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThan(Short value) {
            addCriterion("LIMIT_TIME <", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualTo(Short value) {
            addCriterion("LIMIT_TIME <=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIn(List<Short> values) {
            addCriterion("LIMIT_TIME in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotIn(List<Short> values) {
            addCriterion("LIMIT_TIME not in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeBetween(Short value1, Short value2) {
            addCriterion("LIMIT_TIME between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotBetween(Short value1, Short value2) {
            addCriterion("LIMIT_TIME not between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioIsNull() {
            addCriterion("ALLOW_END_PRIO is null");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioIsNotNull() {
            addCriterion("ALLOW_END_PRIO is not null");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioEqualTo(String value) {
            addCriterion("ALLOW_END_PRIO =", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioNotEqualTo(String value) {
            addCriterion("ALLOW_END_PRIO <>", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioGreaterThan(String value) {
            addCriterion("ALLOW_END_PRIO >", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_END_PRIO >=", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioLessThan(String value) {
            addCriterion("ALLOW_END_PRIO <", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_END_PRIO <=", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioLike(String value) {
            addCriterion("ALLOW_END_PRIO like", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioNotLike(String value) {
            addCriterion("ALLOW_END_PRIO not like", value, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioIn(List<String> values) {
            addCriterion("ALLOW_END_PRIO in", values, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioNotIn(List<String> values) {
            addCriterion("ALLOW_END_PRIO not in", values, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioBetween(String value1, String value2) {
            addCriterion("ALLOW_END_PRIO between", value1, value2, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndPrioNotBetween(String value1, String value2) {
            addCriterion("ALLOW_END_PRIO not between", value1, value2, "allowEndPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioIsNull() {
            addCriterion("ALLOW_HOLL_PRIO is null");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioIsNotNull() {
            addCriterion("ALLOW_HOLL_PRIO is not null");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioEqualTo(String value) {
            addCriterion("ALLOW_HOLL_PRIO =", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioNotEqualTo(String value) {
            addCriterion("ALLOW_HOLL_PRIO <>", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioGreaterThan(String value) {
            addCriterion("ALLOW_HOLL_PRIO >", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_HOLL_PRIO >=", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioLessThan(String value) {
            addCriterion("ALLOW_HOLL_PRIO <", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_HOLL_PRIO <=", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioLike(String value) {
            addCriterion("ALLOW_HOLL_PRIO like", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioNotLike(String value) {
            addCriterion("ALLOW_HOLL_PRIO not like", value, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioIn(List<String> values) {
            addCriterion("ALLOW_HOLL_PRIO in", values, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioNotIn(List<String> values) {
            addCriterion("ALLOW_HOLL_PRIO not in", values, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioBetween(String value1, String value2) {
            addCriterion("ALLOW_HOLL_PRIO between", value1, value2, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowHollPrioNotBetween(String value1, String value2) {
            addCriterion("ALLOW_HOLL_PRIO not between", value1, value2, "allowHollPrio");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidIsNull() {
            addCriterion("ALLOW_END_BID is null");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidIsNotNull() {
            addCriterion("ALLOW_END_BID is not null");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidEqualTo(String value) {
            addCriterion("ALLOW_END_BID =", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidNotEqualTo(String value) {
            addCriterion("ALLOW_END_BID <>", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidGreaterThan(String value) {
            addCriterion("ALLOW_END_BID >", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_END_BID >=", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidLessThan(String value) {
            addCriterion("ALLOW_END_BID <", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_END_BID <=", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidLike(String value) {
            addCriterion("ALLOW_END_BID like", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidNotLike(String value) {
            addCriterion("ALLOW_END_BID not like", value, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidIn(List<String> values) {
            addCriterion("ALLOW_END_BID in", values, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidNotIn(List<String> values) {
            addCriterion("ALLOW_END_BID not in", values, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidBetween(String value1, String value2) {
            addCriterion("ALLOW_END_BID between", value1, value2, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andAllowEndBidNotBetween(String value1, String value2) {
            addCriterion("ALLOW_END_BID not between", value1, value2, "allowEndBid");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIsNull() {
            addCriterion("IS_COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIsNotNull() {
            addCriterion("IS_COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommissionEqualTo(String value) {
            addCriterion("IS_COMMISSION =", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotEqualTo(String value) {
            addCriterion("IS_COMMISSION <>", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionGreaterThan(String value) {
            addCriterion("IS_COMMISSION >", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COMMISSION >=", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionLessThan(String value) {
            addCriterion("IS_COMMISSION <", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionLessThanOrEqualTo(String value) {
            addCriterion("IS_COMMISSION <=", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionLike(String value) {
            addCriterion("IS_COMMISSION like", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotLike(String value) {
            addCriterion("IS_COMMISSION not like", value, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionIn(List<String> values) {
            addCriterion("IS_COMMISSION in", values, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotIn(List<String> values) {
            addCriterion("IS_COMMISSION not in", values, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionBetween(String value1, String value2) {
            addCriterion("IS_COMMISSION between", value1, value2, "isCommission");
            return (Criteria) this;
        }

        public Criteria andIsCommissionNotBetween(String value1, String value2) {
            addCriterion("IS_COMMISSION not between", value1, value2, "isCommission");
            return (Criteria) this;
        }

        public Criteria andComPercentIsNull() {
            addCriterion("COM_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andComPercentIsNotNull() {
            addCriterion("COM_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andComPercentEqualTo(Short value) {
            addCriterion("COM_PERCENT =", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotEqualTo(Short value) {
            addCriterion("COM_PERCENT <>", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentGreaterThan(Short value) {
            addCriterion("COM_PERCENT >", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentGreaterThanOrEqualTo(Short value) {
            addCriterion("COM_PERCENT >=", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentLessThan(Short value) {
            addCriterion("COM_PERCENT <", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentLessThanOrEqualTo(Short value) {
            addCriterion("COM_PERCENT <=", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentIn(List<Short> values) {
            addCriterion("COM_PERCENT in", values, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotIn(List<Short> values) {
            addCriterion("COM_PERCENT not in", values, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentBetween(Short value1, Short value2) {
            addCriterion("COM_PERCENT between", value1, value2, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotBetween(Short value1, Short value2) {
            addCriterion("COM_PERCENT not between", value1, value2, "comPercent");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Short value) {
            addCriterion("COMMISSION =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Short value) {
            addCriterion("COMMISSION <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Short value) {
            addCriterion("COMMISSION >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Short value) {
            addCriterion("COMMISSION >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Short value) {
            addCriterion("COMMISSION <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Short value) {
            addCriterion("COMMISSION <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Short> values) {
            addCriterion("COMMISSION in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Short> values) {
            addCriterion("COMMISSION not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Short value1, Short value2) {
            addCriterion("COMMISSION between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Short value1, Short value2) {
            addCriterion("COMMISSION not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupIsNull() {
            addCriterion("INCREMENT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupIsNotNull() {
            addCriterion("INCREMENT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupEqualTo(String value) {
            addCriterion("INCREMENT_GROUP =", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupNotEqualTo(String value) {
            addCriterion("INCREMENT_GROUP <>", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupGreaterThan(String value) {
            addCriterion("INCREMENT_GROUP >", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupGreaterThanOrEqualTo(String value) {
            addCriterion("INCREMENT_GROUP >=", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupLessThan(String value) {
            addCriterion("INCREMENT_GROUP <", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupLessThanOrEqualTo(String value) {
            addCriterion("INCREMENT_GROUP <=", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupLike(String value) {
            addCriterion("INCREMENT_GROUP like", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupNotLike(String value) {
            addCriterion("INCREMENT_GROUP not like", value, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupIn(List<String> values) {
            addCriterion("INCREMENT_GROUP in", values, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupNotIn(List<String> values) {
            addCriterion("INCREMENT_GROUP not in", values, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupBetween(String value1, String value2) {
            addCriterion("INCREMENT_GROUP between", value1, value2, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementGroupNotBetween(String value1, String value2) {
            addCriterion("INCREMENT_GROUP not between", value1, value2, "incrementGroup");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIsNull() {
            addCriterion("INCREMENT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIsNotNull() {
            addCriterion("INCREMENT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementValueEqualTo(String value) {
            addCriterion("INCREMENT_VALUE =", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotEqualTo(String value) {
            addCriterion("INCREMENT_VALUE <>", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueGreaterThan(String value) {
            addCriterion("INCREMENT_VALUE >", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueGreaterThanOrEqualTo(String value) {
            addCriterion("INCREMENT_VALUE >=", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueLessThan(String value) {
            addCriterion("INCREMENT_VALUE <", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueLessThanOrEqualTo(String value) {
            addCriterion("INCREMENT_VALUE <=", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueLike(String value) {
            addCriterion("INCREMENT_VALUE like", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotLike(String value) {
            addCriterion("INCREMENT_VALUE not like", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIn(List<String> values) {
            addCriterion("INCREMENT_VALUE in", values, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotIn(List<String> values) {
            addCriterion("INCREMENT_VALUE not in", values, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueBetween(String value1, String value2) {
            addCriterion("INCREMENT_VALUE between", value1, value2, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotBetween(String value1, String value2) {
            addCriterion("INCREMENT_VALUE not between", value1, value2, "incrementValue");
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