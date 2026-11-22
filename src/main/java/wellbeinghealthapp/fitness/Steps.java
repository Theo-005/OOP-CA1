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
    
    private String[] routine;
    private String workout;
    private int reps;
    private int sets;
    
    public Steps(String name, String date, int age, String[] routine, String workout, int reps, int sets) {
        super(name, date, age);
        
        this.routine = routine;
        this.workout = workout;
        this.reps = reps;
        this.sets = sets;
    }

    public String[] getRoutine() {
        return routine;
    }

    public String getWorkout() {
        return workout;
    }

    public int getReps() {
        return reps;
    }

    public int getSets() {
        return sets;
    }
}
