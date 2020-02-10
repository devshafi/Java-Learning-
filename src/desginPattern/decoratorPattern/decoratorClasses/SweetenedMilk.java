package desginPattern.decoratorPattern.decoratorClasses;

import desginPattern.decoratorPattern.Coffee;
import desginPattern.decoratorPattern.CoffeeDecorator;

public class SweetenedMilk extends CoffeeDecorator {
    public SweetenedMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()
                + " + Sweetened Milk";
    }
}
