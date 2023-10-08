public class CoffeeShop {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Ваше кофе стоит: " + simpleCoffee.getCost() + ", Состав: " + simpleCoffee.getDescription());

        // Add milk to the coffee
        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Ваше кофе стоит: " + coffeeWithMilk.getCost() + ", Состов: " + coffeeWithMilk.getDescription());

        // Add sugar to the coffee with milk
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Ваше кофе стоит: " + coffeeWithMilkAndSugar.getCost() + ", Состов: " + coffeeWithMilkAndSugar.getDescription());
    }
}
