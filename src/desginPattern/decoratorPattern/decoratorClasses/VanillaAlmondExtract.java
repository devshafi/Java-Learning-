package desginPattern.decoratorPattern.decoratorClasses;

import desginPattern.decoratorPattern.Coffee;
import desginPattern.decoratorPattern.CoffeeDecorator;

public class VanillaAlmondExtract extends CoffeeDecorator {
    public VanillaAlmondExtract(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()
                + " + Vanilla/Almond Extract";
    }
}
