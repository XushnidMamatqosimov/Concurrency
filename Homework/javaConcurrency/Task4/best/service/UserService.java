package javaConcurrency.Task4.best.service;

import javaConcurrency.Task4.best.modul.Users;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private Integer userIndex;
    private List<Users> userList;

    public UserService() {
        this.userIndex = 0;
        this.userList = new ArrayList<>();
    }

    public String createUser(Users users) {
        users.setUserId(++this.userIndex);
        userList.add(users);
       /* for (Users users1 : userList) {
            if (users1.getFirstname() != users.getFirstname() && users1.getLastname()!=users.getLastname()){

            }
        }*/
        return String.format("This %d user id created successfully: ", users.getUserId());
    }

    public String getUsers(Integer userID) {
        for (Users users : userList) {
            if (users.getUserId().equals(userID)) {
                return users.toString();
            }

        }
        return String.format("This %d user is not found:", userID);
    }

    public String update(Integer userID, Users newUser) {
        for (Users users : userList) {
            if (users.getUserId().equals(userID)) {
                newUser.setUserId(users.getUserId());
                int index = this.userList.indexOf(users);
                this.userList.set(index, newUser);
                return String.format("This %d user updated successfully ", userID);
            }
        }
        return String.format("This %d user is not found:", userID);
    }

    public void remove(Integer userIndex) {
        for (Users users : userList) {
            if (users.getUserId().equals(userIndex)) {
                userList.remove(users);
                System.out.println("Removed successfully: ");
            }
            System.out.println("This user not found:");
        }
    }

    public List<Users> getAllUsers() {
        return userList;
    }
}
