package com.sabre.avfm.airfaresmanager.api;

import org.joda.time.DateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SG0227823 on 3/13/2018.
 */

@Getter
@Setter
public class Fare {
    private String carrierCode;
    private String originCityCode;
    private String destinationCityCode;
    private String rbd;
    private String footnoteCode;
    private Double fareAmount;
    private String ruleNumber;
    private String currencyCode;
    private DateTime transmissionDateTime;

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getOriginCityCode() {
        return originCityCode;
    }

    public void setOriginCityCode(String originCityCode) {
        this.originCityCode = originCityCode;
    }

    public String getDestinationCityCode() {
        return destinationCityCode;
    }

    public void setDestinationCityCode(String destinationCityCode) {
        this.destinationCityCode = destinationCityCode;
    }

    public String getRbd() {
        return rbd;
    }

    public void setRbd(String rbd) {
        this.rbd = rbd;
    }

    public String getFootnoteCode() {
        return footnoteCode;
    }

    public void setFootnoteCode(String footnoteCode) {
        this.footnoteCode = footnoteCode;
    }

    public Double getFareAmount() {
        return fareAmount;
    }

    public void setFareAmount(Double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public String getRuleNumber() {
        return ruleNumber;
    }

    public void setRuleNumber(String ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public DateTime getTransmissionDateTime() {
        return transmissionDateTime;
    }

    public void setTransmissionDateTime(DateTime transmissionDateTime) {
        this.transmissionDateTime = transmissionDateTime;
    }

}
