package javaConcurrency.Task4.best.modul;

import javaConcurrency.Task4.best.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        Users users1 = new Users("Mamatqosimov", "Xushnid", 19, "xushnid1234@");
        Users users2 = new Users("Ubaydullayev", "Akbar", 20, "akbar1234@");
        Users users3 = new Users("Okilov", "Nodir", 21, "nodir1234@");
        Users users4 = new Users("Akbarov", "Akbar", 23, "akkkk1234@");

        service.createUser(users1);
        service.createUser(users2);
        service.createUser(users3);
        service.createUser(users4);


        System.out.println(service.getAllUsers());

        System.out.println(service.getUsers(3));
        service.remove(3);
        System.out.println(service.getAllUsers());


    }

}
