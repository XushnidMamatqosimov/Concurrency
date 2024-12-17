package logging;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Service {
    private static final List<TaskDTO> taskDTOList = new ArrayList<>();
    private static int generalId = 0;

    public void create (TaskDTO taskDTO){
        for (TaskDTO dto : taskDTOList) {
            if (dto.getTaskName().equals(taskDTO)){
                System.out.println("this task is already exist;");
            }else {
                TaskDTO dto1 = new TaskDTO();
                dto1.setTaskName(dto.getTaskName());
                dto1.setTaskDuration(dto.getTaskDuration());
                taskDTOList.add(dto1);
                generalId++;
            }
        }
    }

    public void remove (Integer removeById){
        for (TaskDTO taskDTO : taskDTOList) {
            if (taskDTO.getTaskId()==removeById){
                taskDTOList.remove(removeById);
                generalId--;
            }
        }

    }
}
