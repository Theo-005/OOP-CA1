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
    
    protected int stepsTarget;
    protected int stepsTaken;
    protected boolean syncStatus;
    protected String stepsMessage;
    
    public Steps(String name, String date, int age, int stepsTarget, int stepsTaken, boolean syncStatus) {
        super(name, date, age);
                
        this.stepsTarget = stepsTarget;
        this.stepsTaken = stepsTaken;
        this.syncStatus = syncStatus;
    }
    
    public final String createStepsReport() {
        String stepsOutput;
        
        if (stepsTaken < stepsTarget) {
            stepsMessage = "You did not meet your steps target.";
        } else if (stepsTaken == stepsTarget) {
            stepsMessage = "You took the same steps as your target.";
        } else if (stepsTaken > stepsTarget) {
            stepsMessage = "You beat your steps target!";
        }
        
        stepsOutput = "YOUR STEPS:\n\nSteps target: " + stepsTarget + "\nSteps taken: " + stepsTaken + "\n" + stepsMessage + "\n\nSync with watch? " + syncStatus; 
        
        return stepsOutput;        
    }
    
}
