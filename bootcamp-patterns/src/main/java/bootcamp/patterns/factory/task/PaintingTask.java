package bootcamp.patterns.factory.task;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecute = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public PaintingTask() {
    }

    @Override
    public void executeTask() {
        if (isTaskExecuted()) {
            System.out.println("Painting execute");
        }
    }

    public String getTaskName() {
        return "Painting task";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                ", isExecute=" + isExecute +
                '}';
    }
}
