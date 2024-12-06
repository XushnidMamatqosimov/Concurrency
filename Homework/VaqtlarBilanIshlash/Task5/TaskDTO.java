package VaqtlarBilanIshlash.Task5;

import java.time.LocalTime;
import java.util.ArrayList;

public class TaskDTO {
    private int taskId;
    private String taskName;
    private String description;
    private boolean isCompleted;
    private LocalTime timeNeeded;
    public static ArrayList arrayList = new ArrayList();


    public TaskDTO(String description, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public LocalTime getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(LocalTime timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public static ArrayList getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList arrayList) {
        TaskDTO.arrayList = arrayList;
    }

    public TaskDTO() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", timeNeeded=" + timeNeeded +
                '}';
    }
}
