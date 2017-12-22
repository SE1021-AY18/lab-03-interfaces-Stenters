/*
 * SE1021 - 061
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name - Stuart Enters
 * Created: 12/7/2016
 */
import java.text.DecimalFormat;

/**
 * Creates a nut part and calculates weight and cost
 * @author enterss
 * @version 1.0
 */
public class Nut implements Part{

    private static final double LBS_MULTIPLIER = 0.01;
    private static final double USD_MULTIPLIER = 0.5;
    private double diameterInches;


    Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }


    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        return USD_MULTIPLIER * diameterInches;
    }

    /**
     * get the name of the part
     * @return the name
     */
    public String getName(){
        return diameterInches + " inch " + "nut ";
    }

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight(){
        return  LBS_MULTIPLIER * Math.pow(diameterInches,2);
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        DecimalFormat costFormat = new DecimalFormat("0.00");
        DecimalFormat weightFormat = new DecimalFormat("0.###");
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Cost: $" + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs");
    }

}
