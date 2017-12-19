import java.text.DecimalFormat;

public class Duplicate implements Part{

    public static final double REDUCTION_FACTOR1 = .95;
    public static final double REDUCTION_FACTOR2 = .9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private DecimalFormat costFormat = new DecimalFormat(); //TODO
    private DecimalFormat weightFormat = new DecimalFormat(); //TODO
    private Part identicalPart;
    private int numDuplicates;

    Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }



    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        double cost = numDuplicates * identicalPart.getCost();
        if (cost >= USD_THRESHOLD2){
            cost *= REDUCTION_FACTOR2;
        }else if(cost >= USD_THRESHOLD1){
            cost *= REDUCTION_FACTOR1;
        }
        return cost;
    }

    /**
     * get the name of the part
     * @return the name
     */
    public String getName(){
        return numDuplicates + " "+ identicalPart.getName() + "s";
    }

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight(){
        return numDuplicates * identicalPart.getWeight();
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getName() + "\n" +
                "Copies: " + numDuplicates + "\n" +
                "Individual cost: $" + identicalPart.getCost() + "\n" +
                "Individual weight: " + identicalPart.getWeight() + " lbs\n" +
                "Total cost: $" + getCost() + "\n" +
                "Total weight: " + getWeight() + " lbs");
        identicalPart.printBillOfMaterials();
    }

}
