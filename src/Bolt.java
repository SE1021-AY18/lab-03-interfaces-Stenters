import java.text.DecimalFormat;

public class Bolt implements Part {

    public static final double LBS_MULTIPLIER = 0.05;
    public static final double USD_MULTIPLIER = 1;
    private double diameterInches;
    private double lengthInches;

    Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }


    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        return USD_MULTIPLIER * lengthInches * diameterInches;
    }

    /**
     * get the name of the part
     * @return the name
     */
    public String getName(){
        return diameterInches + "x" + lengthInches + " bolt";
    }

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight(){
        return LBS_MULTIPLIER * lengthInches * Math.pow(diameterInches,2);
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
                "Length: " + lengthInches + " inches\n" +
                "Cost: $" + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs");
    }

}
