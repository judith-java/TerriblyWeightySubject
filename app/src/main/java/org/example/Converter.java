package org.example;

public class Converter {

    // Converts ounces to pounds as decimal with 4 decimals and singular/plural unit
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String unit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%.4f %s", pounds, unit);
    }

    // Converts ounces to "X lb(s) Y oz" format with singular/plural for pounds
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;

        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        return String.format("%d %s %d oz", pounds, poundUnit, remainingOunces);
    }

    // Converts pounds and ounces to total ounces string
    public String toOunces(int pounds, int ounces) {
        int totalOunces = pounds * 16 + ounces;
        return totalOunces + " oz";
    }
}

