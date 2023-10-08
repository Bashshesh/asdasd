class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Обычный кофе";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
