/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcade;

import java.util.Scanner;

/**
 *
 * @author evoro
 */
public class TestArcade { //Воротникова Е.Ю.

    public static void display() {
        System.out.println("Выберите нужный номер:");
        System.out.println("\n0- Уйти из галерии"
                + "\n1- Чтобы внести деньги на карту"
                + "\n2- Чтобы поиграть в игру"
                + "\n3- Чтобы проверить баланс"
                + "\n4- Обменять билеты на призы"
                + "\n5- Перенести кредиты или билеты на вторую карту"
                + "\n6- Поменять карту\n"
        );
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        Cards card1 = new Cards(0, 0);
        Cards card2 = new Cards(0, 0);
        Cards card = new Cards(0, 0);

        Arcade speen = new Arcade("Колесо фортуны", 10);
        Arcade mario = new Arcade("Марио", 20);
        Arcade zelda = new Arcade("Зельда", 30);

        Terminals term = new Terminals();

        PrizeCategories teddyBear = new PrizeCategories("Мишка", 50, 3);
        PrizeCategories ball = new PrizeCategories("Мячик", 20, 5);
        PrizeCategories balloon = new PrizeCategories("Воздушный шарик", 5, 10);

        int a = 0;
        //int b = 0;
        int vibor = 0;

        while (vibor != 2 && vibor != 1) {
            System.out.println("Выберите карту 1 или 2: ");
            vibor = sc.nextInt();
        }
        if (vibor == 1) {
            card = card1;
        } else if (vibor == 2) {
            card = card2;
        }

        display();
       // boolean donotstop = true;
        a = 9;
        while (a!=0) {
            a = sc.nextInt();
            System.out.println("");

            switch (a) {
                case (0): {
                    System.out.println("До скорых встреч!");

                   // donotstop = false;
                    break;
                }
                case (1): {

                    int money = 0;
                    System.out.println("Сколько денег кладем на карту?");

                    int amtOfgames = 0;
                    while (money <= 0) {
                        System.out.println("Введите положительное целое число ");
                        money = sc.nextInt();
                    }

                    term.convertMoney(card, money);
                    term.getCardBalance(card);
                    display();
                    continue;
                }
                case (2): {

                    System.out.println("В какую игру будете играть? ");
                    System.out.println("1- " + speen.getName() + " -Стоимость игры: " + speen.getCost());
                    System.out.println("2- " + mario.getName() + " -Стоимость игры: " + mario.getCost());
                    System.out.println("3- " + zelda.getName() + " -Стоимость игры: " + zelda.getCost());

                    int g = sc.nextInt();

                    switch (g) {
                        case 1:
                            speen.PlayingGames(card, speen);
                            break;
                        case 2:
                            mario.PlayingGames(card, mario);
                            break;
                        case 3:
                            zelda.PlayingGames(card, zelda);
                            break;
                        default:
                            System.out.println("Неверно введенное число ");
                            break;
                    }
                    term.getCardBalance(card);

                    display();
                    continue;

                }
                case (3): {
//                    
                    term.getCardBalance(card);
                    display();
                    continue;
                }
                case (4): {
                    System.out.println("Выберите желаемый приз. Нажмите нужную цифру:"
                            + "\n1-Мишка стоит " + teddyBear.getNrOfTicketss() + " билетов. Осталось " + teddyBear.getCntItems() + " шт."
                            + "\n2-Мячик стоит " + ball.getNrOfTicketss() + " билетов. Осталось " + ball.getCntItems() + " шт."
                            + "\n3-Шарик стоит " + balloon.getNrOfTicketss() + " билетов. Осталось " + balloon.getCntItems() + " шт.");
                    int pr = sc.nextInt();

                    switch (pr) {
                        case 1:
                            term.convertTickets(card, teddyBear);
                            break;
                        case 2:
                            term.convertTickets(card, ball);
                            break;
                        case 3:
                            term.convertTickets(card, balloon);
                            break;
                        default:
                            System.out.println("Неверно введенное число ");
                            break;
                    }
                    term.getCardBalance(card);

                    display();
                    continue;
                }
                case (5): {
                    System.out.println("Перевести кредиты: нажмите 1"
                            + "\nПеревести билеты: нажмите 2");
                    int trans = sc.nextInt();
                    switch (trans) {
                        case 1:
                            System.out.println("Перевести с карты 1 на карту 2: нажмите 1"
                                    + "\nПеревести с карты 2 на карту 1: нажмите 2");
                            int numOfCard = sc.nextInt();
                            System.out.println("Введите сумму перевода: ");
                            int sum = 0;
                            while (sum <= 0) {
                                System.out.println("Введите положительное целое число ");
                                sum = sc.nextInt();
                            }

                            if (numOfCard == 1) {
                                term.transactMoney(card1, card2, sum);
                                term.getCardBalance(card1);
                                term.getCardBalance(card2);
                            } else if (numOfCard == 2) {
                                term.transactMoney(card2, card1, sum);
                                term.getCardBalance(card1);
                                term.getCardBalance(card2);
                            } else {
                                System.out.println("Неверно введенное число ");
                            }
                            break;
                        case 2:
                            System.out.println("Перевести с карты 1 на карту 2: нажмите 1"
                                    + "\nПеревести с карты 2 на карту 1: нажмите 2");
                            int numOfCard1 = sc.nextInt();
                            System.out.println("Введите сумму перевода: ");
                            int summ = 0;
                            while (summ <= 0) {
                                System.out.println("Введите положительное целое число ");
                                summ = sc.nextInt();
                            }
                            if (numOfCard1 == 1) {
                                term.transactTickets(card1, card2, summ);
                                term.getCardBalance(card1);
                                term.getCardBalance(card2);
                            } else if (numOfCard1 == 2) {
                                term.transactTickets(card2, card1, summ);
                                term.getCardBalance(card1);
                                term.getCardBalance(card2);
                            } else {
                                System.out.println("Неверно введенное число ");
                            }
                            break;
                        default:
                            System.out.println("Неверно введенное число ");
                            break;
                    }
                    display();
                    continue;

                }

                case (6): {
                    if (vibor == 1) {
                        vibor = 2;
                        card = card2;
                        System.out.println("Выбрана карта 2");
                        display();
                        continue;
                    } else if (vibor == 2) {
                        vibor = 1;
                        card = card1;
                        System.out.println("Выбрана карта 1");
                        display();
                        continue;
                    }
                }
            }

        }

    }
}
