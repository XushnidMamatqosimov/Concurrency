package javaConcurrency.Task4;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"xushnid",19, "xmamatqoismov@gmail.com");
        User user2 = new User(1,"xislat",12, "xmamatqoismov@gmail.com");
        User user3  = new User(1,"xasan",13, "xmamatqoismov@gmail.com");

        UserDTO userDTO = new UserDTO();
        userDTO.create(user);
        userDTO.create(user2);
        userDTO.create(user3);

        userDTO.readAll();

        userDTO.remove(user);
        userDTO.readAll();
    }

}
