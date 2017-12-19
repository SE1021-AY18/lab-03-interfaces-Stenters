public class SheetMetal implements Part {

    public static final double LBS_MULTIPLIER = 0.1;
    public static final double USD_MULTIPLIER = 0.50;
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
        return (Math.round(100 * USD_MULTIPLIER * lengthInches * widthInches * thicknessInches) / 100);
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
        return (Math.round(100 * LBS_MULTIPLIER * lengthInches * widthInches * thicknessInches) / 100);
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
        getName() + "\n" +
        "==========================\n" +
        "Length: " + lengthInches + " inches\n" +
        "Width: " + widthInches + " inches\n" +
        "Thickness: " + thicknessInches + " inches\n" +
        "Cost: $" + getCost() + "\n" +
        "Weight:" + getWeight() + "lbs");
    }

}

