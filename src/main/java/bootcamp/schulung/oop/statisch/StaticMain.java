package bootcamp.schulung.oop.statisch;

public class StaticMain {
    public static void main(String[] args) {
        StaticFinalExercise staticFinalExercise1 = new StaticFinalExercise();
        StaticFinalExercise staticFinalExercise2 = new StaticFinalExercise();
        StaticFinalExercise staticFinalExercise3 = new StaticFinalExercise();

        staticFinalExercise1.incrementInstanceCount();
        staticFinalExercise1.incrementInstanceCount();
        staticFinalExercise1.incrementInstanceCount();
        staticFinalExercise1.incrementTotalCount();
        staticFinalExercise1.incrementTotalCount();

        staticFinalExercise2.incrementInstanceCount();
        staticFinalExercise2.incrementInstanceCount();
        staticFinalExercise2.incrementTotalCount();
        staticFinalExercise2.incrementTotalCount();
        staticFinalExercise2.incrementTotalCount();

        staticFinalExercise3.incrementInstanceCount();
        staticFinalExercise3.incrementInstanceCount();
        staticFinalExercise3.incrementInstanceCount();
        staticFinalExercise3.incrementTotalCount();
        staticFinalExercise3.incrementTotalCount();
        staticFinalExercise3.incrementTotalCount();

        System.out.println("Nummer 1: " + staticFinalExercise1);
        System.out.println("Nummer 2: " + staticFinalExercise2);
        System.out.println("Nummer 3: " + staticFinalExercise3);
    }
}
