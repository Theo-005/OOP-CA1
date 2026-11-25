/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wellbeinghealthapp.Nutrition;

/**
 *
 * @author karlw
 */
public class Goal {
    private double calsG;
    private double proG;
    private double fibG;
    private double fatG;
    private double carbsG;

    
    public Goal(){
        calsG = 0;
        proG = 0;
        fibG = 0;
        fatG = 0;
        carbsG = 0;
    }
    public Goal(double calsG, double proG, double fibG, double fatG, double carbsG) {
        this.calsG = calsG;
        this.proG = proG;
        this.fibG = fibG;
        this.fatG = fatG;
        this.carbsG = carbsG;
    }

    
    public double getCalsG() {
        return calsG;
    }

    public void setCalsG(double calsG) {
        this.calsG = calsG;
    }

    public double getProG() {
        return proG;
    }

    public void setProG(double proG) {
        this.proG = proG;
    }

    public double getFibG() {
        return fibG;
    }

    public void setFibG(double fibG) {
        this.fibG = fibG;
    }

    public double getFatG() {
        return fatG;
    }

    public void setFatG(double fatG) {
        this.fatG = fatG;
    }

    public double getCarbsG() {
        return carbsG;
    }

    public void setCarbsG(double carbsG) {
        this.carbsG = carbsG;
    }
    
    
}
