package desginPattern.decoratorPattern.decoratorClasses;

import desginPattern.decoratorPattern.Coffee;
import desginPattern.decoratorPattern.CoffeeDecorator;

public class DarkCookieCrumb extends CoffeeDecorator {
    public DarkCookieCrumb(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()
                + " + Dark Cookie Crumb" ;
    }
}
