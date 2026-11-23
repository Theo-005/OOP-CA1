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

public abstract class Fitness extends WellbeingHealth {
    
    protected int hrBefore;
    protected int hrDuring;
    protected int hrAfter;
    protected int hrTrend;
    
    protected String[] routine;
    protected String workout;
    protected int sets;
    protected int reps;
    
    protected int stepsTaken;
    protected int stepsTarget;
    protected boolean syncStatus;

    public Fitness(int hrBefore, int hrDuring, int hrAfter, int hrTrend, String[] routine, String workout, int sets, int reps, int stepsTaken, int stepsTarget, boolean syncStatus) {
        this.hrBefore = hrBefore;
        this.hrDuring = hrDuring;
        this.hrAfter = hrAfter;
        this.hrTrend = hrTrend;
        this.routine = routine;
        this.workout = workout;
        this.sets = sets;
        this.reps = reps;
        this.stepsTaken = stepsTaken;
        this.stepsTarget = stepsTarget;
        this.syncStatus = syncStatus;
    }
    
    
    
}
