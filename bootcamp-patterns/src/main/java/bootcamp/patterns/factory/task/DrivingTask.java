package bootcamp.patterns.factory.task;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String  using;
    private boolean isExecute = true;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public DrivingTask() {
    }

    @Override
    public void executeTask() {
        if (isTaskExecuted()) {
            System.out.println("Driving execute");
        }
    }

    public String getTaskName() {
        return "Driving task";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", isExecute=" + isExecute +
                '}';
    }
}
