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
    String sleepMessage;

    public Sleep() {
        hours = 0;
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
    
    @Override
    public String toString() {
        return "Sleep (" + hours + " hrs): " + calcSleep();
    }

    public String calcSleep(){
        if(age <= 2){
            if(hours < 11){
                sleepMessage = "You need to get more sleep";
            }else if(hours > 14){
                sleepMessage = "You need to get less sleep";
            }else{
                sleepMessage = "You're getting the right amount sleep";
            }
        }else if(age >=3 && age <= 5){
            if(hours < 10){
                sleepMessage = "You need to get more sleep";
            }else if(hours > 13){
                sleepMessage = "You need to get less sleep";
            }else{
                sleepMessage = "You're getting the right amount sleep";
            }
        }else if(age >=6 && age <= 12){
            if(hours < 9){
                sleepMessage = "You need to get more sleep";
            }else if(hours > 12){
                sleepMessage = "You need to get less sleep";
            }else{
                sleepMessage = "You're getting the right amount sleep";
            }
        }else if(age >=13 && age <= 18){
            if(hours < 8){
                sleepMessage = "You need to get more sleep";
            }else if(hours > 10){
                sleepMessage = "You need to get less sleep";
            }else{
                sleepMessage = "You're getting the right amount sleep";
            }
        }else{
            if(hours < 7){
                sleepMessage = "You need to get more sleep";
            }else if(hours > 9){
                sleepMessage = "You need to get less sleep";
            }else{
                sleepMessage = "You're getting the right amount sleep";
            }
        }
        
        return sleepMessage;
    }
    
    /*Sleep requirements gotten from: https://www.mayoclinic.org/healthy-lifestyle/adult-health/expert-answers/how-many-hours-of-sleep-are-enough/faq-20057898 
    and: https://www.rte.ie/lifestyle/living/2024/1003/1473383-this-is-how-much-sleep-adults-need-per-age-group/
    */

    
}
