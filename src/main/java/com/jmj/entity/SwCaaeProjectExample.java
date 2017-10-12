package com.jmj.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SwCaaeProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SwCaaeProjectExample() {
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

        public Criteria andPropertyIsNull() {
            addCriterion("PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("PROPERTY =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("PROPERTY <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("PROPERTY >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTY >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("PROPERTY <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTY <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("PROPERTY like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("PROPERTY not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("PROPERTY in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("PROPERTY not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("PROPERTY between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("PROPERTY not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("CATALOG =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("CATALOG <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("CATALOG >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("CATALOG >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("CATALOG <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("CATALOG <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("CATALOG like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("CATALOG not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("CATALOG in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("CATALOG not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("CATALOG between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("CATALOG not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTransferNotesIsNull() {
            addCriterion("TRANSFER_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andTransferNotesIsNotNull() {
            addCriterion("TRANSFER_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNotesEqualTo(String value) {
            addCriterion("TRANSFER_NOTES =", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesNotEqualTo(String value) {
            addCriterion("TRANSFER_NOTES <>", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesGreaterThan(String value) {
            addCriterion("TRANSFER_NOTES >", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NOTES >=", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesLessThan(String value) {
            addCriterion("TRANSFER_NOTES <", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NOTES <=", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesLike(String value) {
            addCriterion("TRANSFER_NOTES like", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesNotLike(String value) {
            addCriterion("TRANSFER_NOTES not like", value, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesIn(List<String> values) {
            addCriterion("TRANSFER_NOTES in", values, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesNotIn(List<String> values) {
            addCriterion("TRANSFER_NOTES not in", values, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesBetween(String value1, String value2) {
            addCriterion("TRANSFER_NOTES between", value1, value2, "transferNotes");
            return (Criteria) this;
        }

        public Criteria andTransferNotesNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_NOTES not between", value1, value2, "transferNotes");
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

        public Criteria andComPercentEqualTo(BigDecimal value) {
            addCriterion("COM_PERCENT =", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotEqualTo(BigDecimal value) {
            addCriterion("COM_PERCENT <>", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentGreaterThan(BigDecimal value) {
            addCriterion("COM_PERCENT >", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COM_PERCENT >=", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentLessThan(BigDecimal value) {
            addCriterion("COM_PERCENT <", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COM_PERCENT <=", value, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentIn(List<BigDecimal> values) {
            addCriterion("COM_PERCENT in", values, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotIn(List<BigDecimal> values) {
            addCriterion("COM_PERCENT not in", values, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COM_PERCENT between", value1, value2, "comPercent");
            return (Criteria) this;
        }

        public Criteria andComPercentNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andCommissionEqualTo(BigDecimal value) {
            addCriterion("COMMISSION =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(BigDecimal value) {
            addCriterion("COMMISSION <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(BigDecimal value) {
            addCriterion("COMMISSION >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(BigDecimal value) {
            addCriterion("COMMISSION <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<BigDecimal> values) {
            addCriterion("COMMISSION in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<BigDecimal> values) {
            addCriterion("COMMISSION not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
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