/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmuhlestein_pa.View_Controller;

/**
 *
 * @author robmu
 */
public class ProductClass {
    private int PartID;
    private String PartName;
    private int InvLevel;
    private double Cost;

    public ProductClass(int PartID, String PartName, int InvLevel, double Cost) {
        this.PartID = PartID;
        this.PartName = PartName;
        this.InvLevel = InvLevel;
        this.Cost = Cost;
    }

    /**
     * @return the PartNumber
     */
    public int getPartID() {
        return PartID;
    }

    /**
     * @param PartID the PartNumber to set
     */
    public void setPartID(int PartID) {
        this.PartID = PartID;
    }

    /**
     * @return the PartName
     */
    public String getPartName() {
        return PartName;
    }

    /**
     * @param PartName the PartName to set
     */
    public void setPartName(String PartName) {
        this.PartName = PartName;
    }

    /**
     * @return the InvLevel
     */
    public int getInvLevel() {
        return InvLevel;
    }

    /**
     * @param InvLevel the InvLevel to set
     */
    public void setInvLevel(int InvLevel) {
        this.InvLevel = InvLevel;
    }

    /**
     * @return the Cost
     */
    public double getCost() {
        return Cost;
    }

    /**
     * @param Cost the Cost to set
     */
    public void setCost(double Cost) {
        this.Cost = Cost;
    }
    
}
