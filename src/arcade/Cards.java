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
public class Cards {    //Воротникова Е.Ю.

    
    private int  currentBalance;
    private int ticketBalance;
    private int cardNumber=0;
    private static int amountOfCards=0;
  
    
    public  Cards( int currentBalance,int ticketBalance){
        this.currentBalance = currentBalance;
        this.ticketBalance = ticketBalance;
        amountOfCards++;
        this.cardNumber=amountOfCards;
       
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

}
