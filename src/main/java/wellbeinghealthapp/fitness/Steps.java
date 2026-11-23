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
    
    public final String createStepsReport() {
        String stepsOutput, stepsMessage;
        
        if (stepsTaken < stepsTarget) {
            stepsMessage = "You did not meet your steps target.";
        } else if (stepsTaken == stepsTarget) {
            stepsMessage = "You took the same steps as your target.";
        } else {
            stepsMessage = "You beat your steps target.";
        }
        
        stepsOutput = "YOUR STEP COUNT: " + stepsTaken + "\nSteps target: " + stepsTarget + "\n" + stepsMessage + "\n\nSync with watch? " + syncStatus; 
        
        return stepsOutput;        
    }
    
}
