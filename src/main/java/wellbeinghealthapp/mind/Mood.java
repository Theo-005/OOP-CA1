/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.mind;

/**
 *
 * @author stowe
 */

import wellbeinghealthapp.WellbeingHealth;

public class Mood extends WellbeingHealth{
    private int mood;

    public Mood(int mood) {
        this.mood = mood;
    }

    public Mood(int mood, String name, String date, int age) {
        super(name, date, age);
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
    
    
}
