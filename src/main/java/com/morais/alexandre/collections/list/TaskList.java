package list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List <Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t: taskList) {
            if(t.getDescription().equalsIgnoreCase(description)){
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public int getAmountTasks() {
        return taskList.size();
    }
    public void getAllDescriptionTasks(){
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList myTaskList = new TaskList();

        myTaskList.addTask("Arrumar o quarto");
        myTaskList.addTask("Arrumar a sala");
        myTaskList.getAllDescriptionTasks();

        myTaskList.removeTask("Arrumar a sala");
        myTaskList.getAllDescriptionTasks();
    }
}
