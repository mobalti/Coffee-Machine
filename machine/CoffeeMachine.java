package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void printAll(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printAll(water, milk, beans, cups, money);
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }

    }
    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:: ");
        String choice = scanner.next();
        switch (choice) {
            case "1":

                if (water >= 250) {
                    water -= 250;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (beans >= 16) {
                    beans -= 16;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }

                if (cups >= 1){
                    cups -= 1;
                } else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                money += 4;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "2":
                if (water >= 350) {
                    water -= 350;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }


                if (milk >= 75) {
                    milk -= 75;
                } else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (beans >= 20) {
                    beans -= 20;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }

                if (cups >= 1) {
                    cups -= 1;
                } else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                money += 7;
                System.out.println("I have enough resources, making you a coffee!");
                break;


            case "3":
                if (water >= 200) {
                    water -= 200;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (milk >= 100) {
                    milk -= 100;
                } else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (beans >= 12) {
                    beans -= 12;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }

                if (cups >= 1) {
                    cups -= 1;
                } else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                money += 6;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "back":
                break;
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups =scanner.nextInt();
        System.out.println();

        water += addWater;
        milk += addMilk;
        beans += addBeans;
        cups += addCups;
    }

    public static void take() {
        System.out.println("I gave you $"+money);
        System.out.println();
        money = 0;
    }
}
