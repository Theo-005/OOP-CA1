/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.fitness;

/**
 *
 * @author seanm
 */

import wellbeinghealthapp.WellbeingHealth;

public class HeartRate extends WellbeingHealth {
    
    private int hrBefore;
    private int hrDuring;
    private int hrAfter;
    private double trend;
    
    public HeartRate(String name, String date, int age, int hrBefore, int hrDuring, int hrAfter, double trend) {
        super(name, date, age);
        
        this.hrBefore = hrBefore;
        this.hrDuring = hrDuring;
        this.hrAfter = hrAfter;
        this.trend = trend;
    }

    public int getHrBefore() {
        return hrBefore;
    }

    public int getHrDuring() {
        return hrDuring;
    }

    public int getHrAfter() {
        return hrAfter;
    }

    public double getTrend() {
        return trend;
    }
}
