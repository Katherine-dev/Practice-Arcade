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
public class Terminals { //Воротникова Е.Ю.

    private Cards card;

    public void convertMoney(Cards card, int amt) {
        if (amt < 0) {
            System.out.println("Введите целое положительное число ");
        } else {
            card.setCurrentBalance(card.getCurrentBalance() + (amt * 2));

            //System.out.println("Текущий баланс карты: " + card.getCurrentBalance());
        }

    }

    public void convertTickets(Cards card, PrizeCategories prize) {

        if (card.getTicketBalance() < prize.getNrOfTicketss()) {
            System.out.println("Недостаточно билетов для получения данного приза\n");
        } else if (prize.getCntItems() < 1) {
            System.out.println("К сожалению призы типа " + prize.getName() + " закончились");
            System.out.println("Вы можете выбрать другой приз\n");
        } else {

            card.setTicketBalance((card.getTicketBalance() - prize.getNrOfTicketss()));;
            prize.setCntItems(prize.getCntItems() - 1);
            System.out.println("Получите свой приз: " + prize.getName());
            System.out.println("В терминале осталось: " + prize.getCntItems() + " шт.\n");

        }
    }

    public void transactMoney(Cards fromCard, Cards toCard, int amt) {
        if (fromCard.getCurrentBalance() < amt) {
            System.out.println("Недостаточно средств на карте \n");
        } else {
            toCard.setCurrentBalance(toCard.getCurrentBalance() + amt);
            fromCard.setCurrentBalance(fromCard.getCurrentBalance() - amt);
        }

    }

    public void transactTickets(Cards fromCard, Cards toCard, int amt) {
        if (fromCard.getTicketBalance() < amt) {
            System.out.println("Недостаточно билетов на карте \n");
        } else {
            toCard.setTicketBalance(toCard.getTicketBalance() + amt);
            fromCard.setTicketBalance(fromCard.getTicketBalance() - amt);
        }
    }

    public void getCardBalance(Cards card) {
        System.out.println("Номер карты: " + card.getCardNumber());
        System.out.println("Текущий баланс карты: " + card.getCurrentBalance() + " кредитов и " + card.getTicketBalance() + " билетов\n");
    }

}
