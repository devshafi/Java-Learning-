package desginPattern.decoratorPattern;

// concrete class of Coffee interface
public class CoffeeBean implements Coffee {
    @Override
    public String getIngredients() {
        return "Coffee bean";
    }
}
