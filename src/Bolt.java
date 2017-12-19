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
        return (Math.round(100 * USD_MULTIPLIER * lengthInches * diameterInches) / 100);
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
        return (Math.round(100 * ) / 100);
        return LBS_MULTIPLIER * lengthInches * Math.pow(diameterInches,2);
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Length: " + lengthInches + " inches\n" +
                "Cost: $" + getCost() + "\n" +
                "Weight:" + getWeight() + " lbs");
    }

}
