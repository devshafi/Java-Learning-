package solution_dod;

public class PeopleTesterDemo {

    public static void main(String[] args) {

        YoungPeople youngPeople = new YoungPeople();
        OldPeople oldPeople = new OldPeople();

        getRunningPerformance(youngPeople);
        getRunningPerformance(oldPeople);
    }

    static void getRunningPerformance(Runnable runnable){
        runnable.run();
    }
}
