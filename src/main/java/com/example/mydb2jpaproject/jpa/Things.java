package com.example.mydb2jpaproject.jpa;

import javax.persistence.*;

@Entity
@Table(name="AUTH_OTP",schema="DDSCA001")
public class Things {


    @Id
    @GeneratedValue
    @Column(name = "AUTH_OTP_ID")
    private Long AUTH_OTP_ID;
    @Column(name = "AUTH_MECH_SESSION_ID")
    private String name;
    @Column(name = "AUTH_JOURNEY_SESSION_ID")
    private String AUTH_JOURNEY_SESSION_ID;
    @Column(name = "EVENT_TYPE")
    private String EVENT_TYPE;
    @Column(name = "INTERNAL_USER_ID")
    private String INTERNAL_USER_ID;
    @Column(name = "INTERNAL_PARTY_ID")
    private String INTERNAL_PARTY_ID;
    @Column(name = "CIDPERS_ID")
    private String CIDPERS_ID;
    @Column(name = "EXTERNAL_USER_ID")
    private String EXTERNAL_USER_ID;
    @Column(name = "CHANNEL")
    private String CHANNEL;
    @Column(name = "BRAND")
    private String BRAND;
    @Column(name = "SOURCE_CHANNEL")
    private String SOURCE_CHANNEL;
    @Column(name = "TELEPHONE_NUMBER")
    private String TELEPHONE_NUMBER;
    @Column(name = "CREATED_AT_DATETIME")
    private String CREATED_AT_DATETIME;
    @Column(name = "UPDATED_AT_DATETIME")
    private String UPDATED_AT_DATETIME;
    @Column(name = "EXPIRES_AT_DATETIME")
    private String EXPIRES_AT_DATETIME;
    @Column(name = "CHALLENGE_CODE")
    private String CHALLENGE_CODE;
    @Column(name = "STATUS")
    private String STATUS;




    public Things() {
    }


    public Long getAUTH_OTP_ID() {
        return AUTH_OTP_ID;
    }

    public void setAUTH_OTP_ID(Long AUTH_OTP_ID) {
        this.AUTH_OTP_ID = AUTH_OTP_ID;
    }

    public String getAUTH_MECH_SESSION_ID() {
        return name;
    }

    public void setAUTH_MECH_SESSION_ID(String AUTH_MECH_SESSION_ID) {
        this.name = AUTH_MECH_SESSION_ID;
    }

    public String getAUTH_JOURNEY_SESSION_ID() {
        return AUTH_JOURNEY_SESSION_ID;
    }

    public void setAUTH_JOURNEY_SESSION_ID(String AUTH_JOURNEY_SESSION_ID) {
        this.AUTH_JOURNEY_SESSION_ID = AUTH_JOURNEY_SESSION_ID;
    }

    public String getEVENT_TYPE() {
        return EVENT_TYPE;
    }

    public void setEVENT_TYPE(String EVENT_TYPE) {
        this.EVENT_TYPE = EVENT_TYPE;
    }

    public String getINTERNAL_USER_ID() {
        return INTERNAL_USER_ID;
    }

    public void setINTERNAL_USER_ID(String INTERNAL_USER_ID) {
        this.INTERNAL_USER_ID = INTERNAL_USER_ID;
    }

    public String getINTERNAL_PARTY_ID() {
        return INTERNAL_PARTY_ID;
    }

    public void setINTERNAL_PARTY_ID(String INTERNAL_PARTY_ID) {
        this.INTERNAL_PARTY_ID = INTERNAL_PARTY_ID;
    }

    public String getCIDPERS_ID() {
        return CIDPERS_ID;
    }

    public void setCIDPERS_ID(String CIDPERS_ID) {
        this.CIDPERS_ID = CIDPERS_ID;
    }

    public String getEXTERNAL_USER_ID() {
        return EXTERNAL_USER_ID;
    }

    public void setEXTERNAL_USER_ID(String EXTERNAL_USER_ID) {
        this.EXTERNAL_USER_ID = EXTERNAL_USER_ID;
    }

    public String getCHANNEL() {
        return CHANNEL;
    }

    public void setCHANNEL(String CHANNEL) {
        this.CHANNEL = CHANNEL;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getSOURCE_CHANNEL() {
        return SOURCE_CHANNEL;
    }

    public void setSOURCE_CHANNEL(String SOURCE_CHANNEL) {
        this.SOURCE_CHANNEL = SOURCE_CHANNEL;
    }

    public String getTELEPHONE_NUMBER() {
        return TELEPHONE_NUMBER;
    }

    public void setTELEPHONE_NUMBER(String TELEPHONE_NUMBER) {
        this.TELEPHONE_NUMBER = TELEPHONE_NUMBER;
    }

    public String getCREATED_AT_DATETIME() {
        return CREATED_AT_DATETIME;
    }

    public void setCREATED_AT_DATETIME(String CREATED_AT_DATETIME) {
        this.CREATED_AT_DATETIME = CREATED_AT_DATETIME;
    }

    public String getUPDATED_AT_DATETIME() {
        return UPDATED_AT_DATETIME;
    }

    public void setUPDATED_AT_DATETIME(String UPDATED_AT_DATETIME) {
        this.UPDATED_AT_DATETIME = UPDATED_AT_DATETIME;
    }

    public String getEXPIRES_AT_DATETIME() {
        return EXPIRES_AT_DATETIME;
    }

    public void setEXPIRES_AT_DATETIME(String EXPIRES_AT_DATETIME) {
        this.EXPIRES_AT_DATETIME = EXPIRES_AT_DATETIME;
    }

    public String getCHALLENGE_CODE() {
        return CHALLENGE_CODE;
    }

    public void setCHALLENGE_CODE(String CHALLENGE_CODE) {
        this.CHALLENGE_CODE = CHALLENGE_CODE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    @Override
    public String toString() {
        return String.format("Things[id=%d]", AUTH_OTP_ID);
    }
}