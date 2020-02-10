package solution_dod;

public interface Eatable {
    default void domSomething(){
        System.out.println("I can eat");
    }
}
