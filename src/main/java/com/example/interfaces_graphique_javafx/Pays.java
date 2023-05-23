package com.example.interfaces_graphique_javafx;

public class Pays {
    private String CodeValue;
    private String AlternateName;
    private String CountryGroup;
    private String NameEN;
    private String NameFR;
    private String NameDE;
    private String Latitude;
    private String Longitude;

    public Pays(String codeValue, String alternateName, String countryGroup, String nameEN, String nameFR, String nameDE, String latitude, String longitude) {
        CodeValue = codeValue;
        AlternateName = alternateName;
        CountryGroup = countryGroup;
        NameEN = nameEN;
        NameFR = nameFR;
        NameDE = nameDE;
        Latitude = latitude;
        Longitude = longitude;

    }
    public String getCodeValue() {
        return CodeValue;
    }

    public void setCodeValue(String codeValue) {
        CodeValue = codeValue;
    }

    public String getAlternateName() {
        return AlternateName;
    }

    public void setAlternateName(String alternateName) {
        AlternateName = alternateName;
    }

    public String getCountryGroup() {
        return CountryGroup;
    }

    public void setCountryGroup(String countryGroup) {
        CountryGroup = countryGroup;
    }

    public String getNameEN() {
        return NameEN;
    }

    public void setNameEN(String nameEN) {
        NameEN = nameEN;
    }

    public String getNameFR() {
        return NameFR;
    }

    public void setNameFR(String nameFR) {
        NameFR = nameFR;
    }

    public String getNameDE() {
        return NameDE;
    }

    public void setNameDE(String nameDE) {
        NameDE = nameDE;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }
}
