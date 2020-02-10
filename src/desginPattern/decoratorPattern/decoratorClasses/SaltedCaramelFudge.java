package desginPattern.decoratorPattern.decoratorClasses;

import desginPattern.decoratorPattern.Coffee;
import desginPattern.decoratorPattern.CoffeeDecorator;

public class SaltedCaramelFudge extends CoffeeDecorator {

    public SaltedCaramelFudge(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() +
                " + Salted Caramel Fudge";
    }
}
