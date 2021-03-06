package com.timmy;

import java.util.Date;

/**
 * Represents a service call to fix a water heater
 */

public class WaterHeater extends ServiceCall {

    private int waterHeaterAge;
    private static final double CITYFEE = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int heaterAge) {
        super(serviceAddress, problemDescription, date);
        this.waterHeaterAge = heaterAge;

    }

    /* Get & Set */
    public int getWaterHeaterAge() {return waterHeaterAge;}
    public void setWaterHeaterAge(int waterHeaterAge) {this.waterHeaterAge = waterHeaterAge;}

    @Override
    public String toString() {
        String resolvedDateString = (resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = (this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String totalFeeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + CITYFEE);

        return "Water Heater Service Call " + "\n" +
               "Service Address: " + serviceAddress + "\n" +
               "Problem Description: " + problemDescription  + "\n" +
               "Reported Date: " + reportedDate + "\n" +
               "Resolved Date: " + resolvedDateString + "\n" +
               "Resolution: " + resolutionString + "\n" +
               "Service Charge: " + feeString + "\n" +
               "City Fee: " + "$" + CITYFEE + "\n" +
               "Total Fee: " + totalFeeString + "\n" +
               "Water Heater Age: " + waterHeaterAge;
    }
}
