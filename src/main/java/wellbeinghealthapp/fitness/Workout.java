/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.fitness;

/**
 *
 * @author seanm
 */

import java.util.ArrayList;
import wellbeinghealthapp.WellbeingHealth;

public class Workout extends WellbeingHealth {
    
    protected String workout;
    protected String reps;
    protected String sets;
    
    public Workout(String name, String date, int age, String workout, String reps, String sets) {
        super(name, date, age);
        
        this.workout = workout;
        this.reps = reps;
        this.sets = sets;
    }
    
    
    public final String createWorkoutReport() {
        String workoutOutput;
        
        ArrayList<String> routine = new ArrayList<String>();
        
        routine.add(workout);
        routine.add(reps + " reps");
        routine.add(sets + " sets");
        
        workoutOutput = String.join("  |  ", routine);
        
        return workoutOutput;
    }   
}