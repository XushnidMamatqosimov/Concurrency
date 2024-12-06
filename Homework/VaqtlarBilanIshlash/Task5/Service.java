package VaqtlarBilanIshlash.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    private static List<TaskDTO> list = new ArrayList<>();
    private static int taskId = 1;


    public void start() {
        boolean loop = true;
        while (loop) {
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    getAddTask();
                    break;
                case 2:
                    getTaskList();
                    break;
                case 3:
                    getMarkTaskAsCompleted();
                    break;
                case 4:
                    getDeleteTask();
                    break;
                case 5:
                    loop = false;
                default:
                    System.out.println("Invalid Syntax");
            }
        }
    }

    private static void getDeleteTask() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("list");
        System.out.println("Enter your task id: ");
        int taskid = scanner1.nextInt();

        for (TaskDTO task : list) {
            if (task.getTaskId() == taskid) {
                list.remove(task);
                System.out.println("Deleted successfully");
            }
        }
    }

    private static void getTaskList() {
        list.forEach(System.out::println);
    }

    private static void getMarkTaskAsCompleted() {
        TaskDTO task = new TaskDTO();
        if (task.isCompleted() == true) {
            System.out.println("Task is completed:");
        } else {
            System.out.println("Not finished yet!!!");
        }
    }

    private static void getAddTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name : ");
        String name = scanner.nextLine();
        System.out.println("Task description: ");
        String desc = scanner.nextLine();


        TaskDTO task = new TaskDTO();
        task.setTaskName(name);
        task.setDescription(desc);
        task.setTaskId(taskId++);

        list.add(task);
        System.out.println("Task created successfully!!!");
    }


    public void printMenu() {
        System.out.println("*** Main Menu ***");
        System.out.println("Add new Task => 1");
        System.out.println("View Tasks => 2");
        System.out.println("Mark As Completed => 3");
        System.out.println("Delete a Task => 4");
        System.out.println("Exit => 5");
    }
}
