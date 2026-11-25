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
    private int moodVal;
    String moodMessage;

    public Mood() {
        moodVal = 0;
    }

    public Mood(String name, String date, int age,int moodVal  ) {
        super(name, date, age);
        this.moodVal = moodVal;
    }

    public int getMood() {
        return moodVal;
    }

    public void setMood(int mood) {
        this.moodVal = moodVal;
    }
    
    public String calcMood(){
        if(moodVal< 5){
            moodMessage = "Your mood was really low.\nIf you nee to talk to someone please reach out to counselling@ncirl.ie";
        } else{
            moodMessage = "I'm glad you're having a good day";
        }
        
        return moodMessage;
    }
    //email gotten from: https://www.ncirl.ie/Students/Student-Services/Support-Services/Student-Counselling-Wellness-Service
    
    public String printDetails() {
        return "Details: \nName:" + name + "\nAge:" + age + "\nDate:" + date ;
    }
    
    @Override
    public String toString() {
        return "Mood: " + moodVal + "/10";
    }
    
}
