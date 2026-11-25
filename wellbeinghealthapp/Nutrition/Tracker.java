/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.Nutrition;

/**
 *
 * @author karlw
 */
public class Tracker {

    public Tracker(){

    }

    public double calcPro(double pro_ML, double proG)
    {
        if(proG == 0)
        {
            return 0;
        }

        return (pro_ML / proG) * 100;
    }

    public double calcCals(double cals_ML, double calsG){
        if(calsG == 0)
        {
            return 0;
        }

        return (cals_ML / calsG) * 100;
    }

    public double calcCarbs(double carbs_ML, double carbsG){
        if(carbsG == 0)
        {
            return 0;
        }

        return (carbs_ML / carbsG) * 100;
    }

    public double calcFib(double fib_ML, double fibG){
        if(fibG == 0)
        {
            return 0;
        }

        return (fib_ML / fibG) * 100;
    }

    public double calcFat(double fat_ML, double fatG){
        if(fatG == 0)
        {
            return 0;
        }

        return (fat_ML / fatG) * 100;
    }
}
