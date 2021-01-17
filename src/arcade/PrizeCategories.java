/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

/**
 *
 * @author evoro
 */
public class PrizeCategories { //Воротникова Е.Ю.

    private String name;
    private int nrOfTickets;
    private int cntItems;

    public PrizeCategories(String name, int nrOfTickets, int cntItems) {
        this.name = name;
        this.nrOfTickets = nrOfTickets;
        this.cntItems = cntItems;
    }

    public String getName() {
        return name;
    }

    public int getCntItems() {
        return cntItems;
    }

    public int getNrOfTicketss() {
        return nrOfTickets;
    }

    public void setCntItems(int cntItems) {
        this.cntItems = cntItems;
    }
}
