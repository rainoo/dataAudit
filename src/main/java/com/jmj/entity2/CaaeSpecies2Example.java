package com.jmj.entity2;

import java.util.ArrayList;
import java.util.List;

public class CaaeSpecies2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaaeSpecies2Example() {
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

        public Criteria andSpeciesIdIsNull() {
            addCriterion("SPECIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdIsNotNull() {
            addCriterion("SPECIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdEqualTo(String value) {
            addCriterion("SPECIES_ID =", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdNotEqualTo(String value) {
            addCriterion("SPECIES_ID <>", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdGreaterThan(String value) {
            addCriterion("SPECIES_ID >", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIES_ID >=", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdLessThan(String value) {
            addCriterion("SPECIES_ID <", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdLessThanOrEqualTo(String value) {
            addCriterion("SPECIES_ID <=", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdLike(String value) {
            addCriterion("SPECIES_ID like", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdNotLike(String value) {
            addCriterion("SPECIES_ID not like", value, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdIn(List<String> values) {
            addCriterion("SPECIES_ID in", values, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdNotIn(List<String> values) {
            addCriterion("SPECIES_ID not in", values, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdBetween(String value1, String value2) {
            addCriterion("SPECIES_ID between", value1, value2, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesIdNotBetween(String value1, String value2) {
            addCriterion("SPECIES_ID not between", value1, value2, "speciesId");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeIsNull() {
            addCriterion("SPECIES_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeIsNotNull() {
            addCriterion("SPECIES_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeEqualTo(String value) {
            addCriterion("SPECIES_CODE =", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeNotEqualTo(String value) {
            addCriterion("SPECIES_CODE <>", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeGreaterThan(String value) {
            addCriterion("SPECIES_CODE >", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIES_CODE >=", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeLessThan(String value) {
            addCriterion("SPECIES_CODE <", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeLessThanOrEqualTo(String value) {
            addCriterion("SPECIES_CODE <=", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeLike(String value) {
            addCriterion("SPECIES_CODE like", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeNotLike(String value) {
            addCriterion("SPECIES_CODE not like", value, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeIn(List<String> values) {
            addCriterion("SPECIES_CODE in", values, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeNotIn(List<String> values) {
            addCriterion("SPECIES_CODE not in", values, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeBetween(String value1, String value2) {
            addCriterion("SPECIES_CODE between", value1, value2, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesCodeNotBetween(String value1, String value2) {
            addCriterion("SPECIES_CODE not between", value1, value2, "speciesCode");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIsNull() {
            addCriterion("SPECIES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIsNotNull() {
            addCriterion("SPECIES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameEqualTo(String value) {
            addCriterion("SPECIES_NAME =", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotEqualTo(String value) {
            addCriterion("SPECIES_NAME <>", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameGreaterThan(String value) {
            addCriterion("SPECIES_NAME >", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIES_NAME >=", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLessThan(String value) {
            addCriterion("SPECIES_NAME <", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLessThanOrEqualTo(String value) {
            addCriterion("SPECIES_NAME <=", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameLike(String value) {
            addCriterion("SPECIES_NAME like", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotLike(String value) {
            addCriterion("SPECIES_NAME not like", value, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameIn(List<String> values) {
            addCriterion("SPECIES_NAME in", values, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotIn(List<String> values) {
            addCriterion("SPECIES_NAME not in", values, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameBetween(String value1, String value2) {
            addCriterion("SPECIES_NAME between", value1, value2, "speciesName");
            return (Criteria) this;
        }

        public Criteria andSpeciesNameNotBetween(String value1, String value2) {
            addCriterion("SPECIES_NAME not between", value1, value2, "speciesName");
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