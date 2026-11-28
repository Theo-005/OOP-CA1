/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.Nutrition;
import wellbeinghealthapp.WellbeingHealth;
/**
 *
 * @author karlw
 */
public class Meal_Log extends WellbeingHealth {
    private String meal_ML;
    private double cals_ML;
    private double pro_ML;
    private double fib_ML;
    private double fat_ML;
    private double carbs_ML;

    public Meal_Log() {
        meal_ML = "";
        cals_ML = 0;
        pro_ML =0;
        fib_ML = 0;
        fat_ML = 0;
        carbs_ML = 0;
    }

    public Meal_Log(String meal_ML, double cals_ML, double pro_ML, double fib_ML, double fat_ML, double carbs_ML) {
        this.meal_ML = meal_ML;
        this.cals_ML = cals_ML;
        this.pro_ML = pro_ML;
        this.fib_ML = fib_ML;
        this.fat_ML = fat_ML;
        this.carbs_ML = carbs_ML;
    }

    
    
    public String getMeal_ML() {
        return meal_ML;
    }

    public void setMeal_ML(String meal_ML) {
        this.meal_ML = meal_ML;
    }

    public double getCals_ML() {
        return cals_ML;
    }

    public void setCals_ML(double cals_ML) {
        this.cals_ML = cals_ML;
    }

    public double getPro_ML() {
        return pro_ML;
    }

    public void setPro_ML(double pro_ML) {
        this.pro_ML = pro_ML;
    }

    public double getFib_ML() {
        return fib_ML;
    }

    public void setFib_ML(double fib_ML) {
        this.fib_ML = fib_ML;
    }

    public double getFat_ML() {
        return fat_ML;
    }

    public void setFat_ML(double fat_ML) {
        this.fat_ML = fat_ML;
    }

    public double getCarbs_ML() {
        return carbs_ML;
    }

    public void setCarbs_ML(double carbs_ML) {
        this.carbs_ML = carbs_ML;
    }
    
    

   
    
}
