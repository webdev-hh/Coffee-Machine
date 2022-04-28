package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private final CoffeeDrink ESPRESSO = new CoffeeDrink(250, 0, 16, 4);
    private final CoffeeDrink LATTE = new CoffeeDrink(350, 75, 20, 7);
    private final CoffeeDrink CAPPUCCINO = new CoffeeDrink(200, 100, 12, 6);

    private Scanner scanner = new Scanner(System.in);
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.menu();
    }

    public void menu() {
        final String ACTION_BUY = "buy";
        final String ACTION_FILL = "fill";
        final String ACTION_TAKE = "take";
        final String ACTION_REMAINING = "remaining";
        final String ACTION_EXIT = "exit";

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.printf("Write action (buy, fill, take, remaining, exit):%n");
            String action = scanner.next();

            switch (action) {
                case ACTION_BUY:
                    buy();
                    break;
                case ACTION_FILL:
                    fill();
                    break;
                case ACTION_TAKE:
                    take();
                    break;
                case ACTION_REMAINING:
                    printState();
                    break;
                case ACTION_EXIT:
                    exit = true;
                    break;
                default:
                    System.out.printf("Incorrect action%n");
                    break;
            }
        }
    }

    private void buy() {
        final String TYPE_ESPRESSO = "1";
        final String TYPE_LATTE = "2";
        final String TYPE_CAPPUCCINO = "3";
        final String TYPE_BACK = "back";

        System.out.printf("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:%n");
        String coffeeType = scanner.next();
        switch (coffeeType) {
            case TYPE_ESPRESSO:
                makeCoffeeDrink(ESPRESSO);
                break;
            case TYPE_LATTE:
                makeCoffeeDrink(LATTE);
                break;
            case TYPE_CAPPUCCINO:
                makeCoffeeDrink(CAPPUCCINO);
                break;
            case TYPE_BACK:
                break;
            default:
                System.out.println("No such drink.");
                break;
        }
    }

    private void makeCoffeeDrink(CoffeeDrink coffeeDrink) {
        if (cups <= 0) {
            System.out.println("Sorry, not enough cups!");
        } else if (water < coffeeDrink.getWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < coffeeDrink.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < coffeeDrink.getBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.cups--;
            this.water -= coffeeDrink.getWater();
            this.milk -= coffeeDrink.getMilk();
            this.beans -= coffeeDrink.getBeans();
            this.money += coffeeDrink.getCost();
        }
    }

    private void fill() {
        System.out.println("Write how many ml of water you want to add:");
        this.water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        this.milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        this.cups += scanner.nextInt();
    }

    private void take() {
        System.out.printf("I gave you $%d", this.money);
        this.money = 0;
    }

    public void printState() {
        System.out.println();
        System.out.printf("The coffee machine has:%n");
        System.out.printf("%d ml of water%n", water);
        System.out.printf("%d ml of milk%n", milk);
        System.out.printf("%d g of coffee beans%n", beans);
        System.out.printf("%d disposable cups%n", cups);
        System.out.printf("$%d of money%n", money);
    }
}