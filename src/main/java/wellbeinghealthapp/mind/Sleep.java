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

public class Sleep extends WellbeingHealth{
    private int hours;

    public Sleep(int hours) {
        this.hours = hours;
    }

    public Sleep(int hours, String name, String date, int age) {
        super(name, date, age);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    
}
