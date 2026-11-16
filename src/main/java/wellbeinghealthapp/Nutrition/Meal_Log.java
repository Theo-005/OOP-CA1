/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.Nutrition;

/**
 *
 * @author karlw
 */
public class Meal_Log {
    private String breakfast;
    private String lunch;
    private String dinner;
    private double cals;
    private double pro;
    private double fib;
    private double fat;
    private double carbs;

    public Meal_Log(String breakfast, String lunch, String dinner, double cals, double pro, double fib, double fat, double carbs) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.cals = cals;
        this.pro = pro;
        this.fib = fib;
        this.fat = fat;
        this.carbs = carbs;
    }

   

    
    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public double getCals() {
        return cals;
    }

    public void setCals(double cals) {
        this.cals = cals;
    }

    public double getPro() {
        return pro;
    }

    public void setPro(double pro) {
        this.pro = pro;
    }

    public double getFib() {
        return fib;
    }

    public void setFib(double fib) {
        this.fib = fib;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
    
    
}
