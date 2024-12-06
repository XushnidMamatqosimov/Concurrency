package javaConcurrency.Task4;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private List<User> list = new ArrayList<>();
    private int id;

    public void create(User user) {
        user.setId(id++);
        user.setFullName(user.getFullName());
        user.setAge(user.getAge());
        list.add(user);
    }

    public void remove(User user) {
        for (User user1 : list) {
            if (user.getFullName().equals(user1.getFullName()) &&
                    user.getAge() == user1.getAge() && user.getEmail().equals(user1.getEmail())) {
                list.remove(user);
            }
        }
        System.out.println("Removed successfully");
    }

    public void readAll() {
        System.out.println(list);
    }

    public void update(User user) {

    }
}
