public class Nut implements Part{

    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;
    private double diameterInches;


    Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }


    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        return (Math.round(100 * USD_MULTIPLIER * diameterInches) / 100);
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
        return (Math.round(100 * LBS_MULTIPLIER * Math.pow(diameterInches,2)) / 100);
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Cost: $" + getCost() + "\n" +
                "Weight:" + getWeight() + " lbs");
    }

}
