package logging;

public class TaskDTO {
    private int taskId;

    private String taskName;
    private int taskDuration;

    public TaskDTO() {
    }

    public TaskDTO(int taskId, String taskName, int taskDuration) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDuration = taskDuration;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskDuration=" + taskDuration +
                '}';
    }
}
