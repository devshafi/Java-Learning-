package solution_dod;

public interface Walkable {
    default void doSomething(){
        System.out.println("I can walk");
    }
}
