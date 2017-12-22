import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part{

    public static final double USD_PER_SUB_PART = .25;
    private DecimalFormat costFormat = new DecimalFormat("0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.###");
    private String name;
    private ArrayList<Part> subParts = new ArrayList<>();

    Assembly(String name){
        this.name = name;
    }

    public void addPart(Part part){
        subParts.add(part);
    }


    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost(){
        double cost = 0;
        for (Part part: subParts
             ) {
            cost += part.getCost();
        }
        cost += USD_PER_SUB_PART * subParts.size();
        return cost;
    }

    /**
     * get the name of the part
     * @return the name
     */
    public String getName(){
        return  name;
    }

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight(){
        double weight = 0;
        for (Part part: subParts
                ) {
            weight += part.getWeight();
        }
        weightFormat.format(weight);
        return weight;
    }

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials(){
        String buffer = "";
        for (Part part: subParts
                ) {
            buffer += "Part: " + part.getName() + "\n" +
                    "Cost: $" + costFormat.format(part.getCost()) + "\n" +
                    "Weight: " + weightFormat.format(part.getWeight()) + " lbs\n";
        }
        buffer += "Total cost: $" + costFormat.format(getCost()) + "\n"+
                  "Total weight: " + weightFormat.format(getWeight()) + " lbs" ;
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                buffer);
        for (Part part: subParts
             ) {
            part.printBillOfMaterials();
        }
    }


}
