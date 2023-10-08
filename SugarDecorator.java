class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с Сахаром (кто пьет кофе без сахара)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
