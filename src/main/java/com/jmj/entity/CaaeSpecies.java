package com.jmj.entity;

public class CaaeSpecies {
    private String speciesId;

    private String speciesCode;

    private String speciesName;

    public String getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(String speciesId) {
        this.speciesId = speciesId == null ? null : speciesId.trim();
    }

    public String getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode == null ? null : speciesCode.trim();
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName == null ? null : speciesName.trim();
    }
}