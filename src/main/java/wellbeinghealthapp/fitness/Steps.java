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

public class Steps extends WellbeingHealth {
    
    protected int stepsTaken;
    protected int stepsTarget;
    protected boolean syncStatus;
    
    public Steps(String name, String date, int age, int stepsTaken, int stepsTarget, boolean syncStatus) {
        super(name, date, age);
                
        this.stepsTaken = stepsTaken;
        this.stepsTarget = stepsTarget;
        this.syncStatus = syncStatus;
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public int getStepsTarget() {
        return stepsTarget;
    }

    public boolean isSyncStatus() {
        return syncStatus;
    }  
}
