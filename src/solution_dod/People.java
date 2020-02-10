package solution_dod;

public class People implements Eatable,Walkable {

    // overriding default doSomething method
    public void doSomeThing(){
        Eatable.super.domSomething();
        Walkable.super.doSomething();
    }
}
