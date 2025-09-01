package bootcamp.schulung.oop.statisch;

public class StaticFinalExercise {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Statik-Zähler: " + totalCount + " ; Instanz-Zähler: " + instanceCount;
    }
}
