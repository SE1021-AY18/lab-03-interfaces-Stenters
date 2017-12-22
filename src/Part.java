/*
 * SE1021 - 061
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name - Stuart Enters
 * Created: 12/7/2016
 */


/**
 * An interface for all parts
 * @author enterss
 * @version 1.0
 */
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

