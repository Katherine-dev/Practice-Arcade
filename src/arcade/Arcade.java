/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

import java.util.Random;

public class Arcade {//Воротникова Е.Ю.
    private int ticketWon;
    private Cards card;
  
    private String name;
    private int cost;

    public Arcade(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public void PlayingGames(Cards card, Arcade game) {
        if (card.getCurrentBalance() < game.getCost()) {
            System.out.println("Недостаточно кредитов на карте\n");
        } else {
            getNrOfTickets(); // по условию выигрывается случайное количество билетов
            card.setCurrentBalance(card.getCurrentBalance() - game.getCost());
            card.setTicketBalance(card.getTicketBalance() + ticketWon);

            System.out.println("Вы выиграли " + ticketWon + " билетов\n");
        }

    }

    public int getNrOfTickets() {
        Random rd = new Random();
        ticketWon = rd.nextInt(100) + 1;

        return ticketWon;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

   

}
