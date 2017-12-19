import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part{

    public static final double USD_PER_SUB_PART = .25;
    private DecimalFormat costFormat = new DecimalFormat(); //TODO
    private DecimalFormat weightFormat = new DecimalFormat(); //TODO
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
        //TODO: format
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
        //TODO: format
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
                    "Cost: %" + part.getCost() + "\n" +
                    "Weight: " + getWeight() + " lbs\n";
        }
        buffer += "Total cost: " + getCost() + "\n"+
                  "Total weight: " + getWeight() ;
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
