public interface Part {

    /**
     * get the cost of the part
     * @return the cost
     */
    public double getCost();

    /**
     * get the name of the part
     * @return the name
     */
    public String getName();

    /**
     * get the weight of the part
     * @return the weight
     */
    public double getWeight();

    /**
     * print the bill of materials for the part
     */
    public void printBillOfMaterials();
}

