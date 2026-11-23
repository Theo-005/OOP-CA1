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
    
    protected int hrBefore;
    protected int hrDuring;
    protected int hrAfter;
    protected String trend;
    
    public HeartRate(String name, String date, int age, int hrBefore, int hrDuring, int hrAfter, String trend) {
        super(name, date, age);
        
        this.hrBefore = hrBefore;
        this.hrDuring = hrDuring;
        this.hrAfter = hrAfter;
        this.trend = trend;
    }
    
    
    public final String createHrReport() {
        String hrOutput;
        
        if (hrBefore < hrAfter) {
            trend = "Upwards";
        } else if (hrBefore == hrAfter) {
            trend = "No Change";
        } else {
            trend = "Downwards";
        }
        
        hrOutput = "Before: " + hrBefore + "\nDuring: " + hrDuring + "\nAfter: " + hrAfter + "\nTrend: " + trend;
        return hrOutput;
    }
}
