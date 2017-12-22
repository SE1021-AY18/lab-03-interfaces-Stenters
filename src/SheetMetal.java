/*
 * SE1021 - 061
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name - Stuart Enters
 * Created: 12/7/2016
 */
import java.text.DecimalFormat;

/**
 * Creates a sheet metal part and calculates weight and cost
 * @author enterss
 * @version 1.0
 */
public class SheetMetal implements Part {

    private static final double LBS_MULTIPLIER = 0.1;
    private static final double USD_MULTIPLIER = 0.50;
    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

    SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;

    }

    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        return USD_MULTIPLIER * lengthInches * widthInches * thicknessInches;
    }

    /**
     * get the name of the part
     * @return the name
     */
    public String getName(){
        return  lengthInches + "x" + widthInches + "x" + thicknessInches + " sheet";
    }

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight(){
        return LBS_MULTIPLIER * lengthInches * widthInches * thicknessInches;
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
                "Length: " + lengthInches + " inches\n" +
                "Width: " + widthInches + " inches\n" +
                "Thickness: " + thicknessInches + " inches\n" +
                "Cost: $" + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs");
    }

}

