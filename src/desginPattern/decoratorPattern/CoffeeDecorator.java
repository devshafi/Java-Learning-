package desginPattern.decoratorPattern;

//base decorator class
public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}