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

public class Journal extends WellbeingHealth{
    private String entry;

    public Journal() {
        entry = "";
    }
    
    

    public Journal(String entry, String name, String date, int age) {
        super(name, date, age);
        this.entry = entry;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
    
    
}
