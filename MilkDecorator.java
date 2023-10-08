class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с Молоком";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
