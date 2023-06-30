package bootcamp.patterns.factory.task;

public class TaskFactory {

    public final static String DRIVING_TASK = "Driving task";
    public final static String PAINTING_TASK = "Painting task";
    public final static String SHOPPING_TASK = "Shopping task";

    public Task makeTask(String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Driving task", "gym", "car");
            case PAINTING_TASK -> new PaintingTask("Painting task", "black", "door");
            case SHOPPING_TASK -> new ShoppingTask("Shopping task", "car", 1);
            default -> null;
        };
    }
}
