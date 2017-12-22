public interface Part {

    /**
     * get the cost of the part
     * @return the cost
     */
    double getCost();

    /**
     * get the name of the part
     * @return the name
     */
    String getName();

    /**
     * get the weight of the part
     * @return the weight
     */
    double getWeight();

    /**
     * print the bill of materials for the part
     */
    void printBillOfMaterials();
}

