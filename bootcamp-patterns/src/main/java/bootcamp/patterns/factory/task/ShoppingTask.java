package bootcamp.patterns.factory.task;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecute = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public ShoppingTask() {
    }

    @Override
    public void executeTask() {
        if (isTaskExecuted()) {
            System.out.println("Task execute");
        }
    }

    public String getTaskName() {
        return "Shopping task";
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecute;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", isExecute=" + isExecute +
                '}';
    }
}
