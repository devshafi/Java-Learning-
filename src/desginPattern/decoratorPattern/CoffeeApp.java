package desginPattern.decoratorPattern;

import desginPattern.decoratorPattern.decoratorClasses.SaltedCaramelFudge;
import desginPattern.decoratorPattern.decoratorClasses.SweetenedMilk;
import desginPattern.decoratorPattern.decoratorClasses.VanillaAlmondExtract;

public class CoffeeApp {

    public static void main(String[] args) {
        Coffee coffee = new VanillaAlmondExtract(new CoffeeBean());
        System.out.println(coffee.getIngredients());
    }
}
