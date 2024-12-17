package logging;

public class Controller1 {

    public void start() {
        printMenu();
        boolean loop = true;
        int command = ActionUtil.getAction();
        while (loop) {
            switch (command) {
                case 1:
                    getName();
                    break;
                case 2:
                    getTaskDetails();
                    break;
                case 3:
                    loop = false;
                    break;

            }
        }
    }

    private static void getTaskDetails() {
        System.out.println("Enter your task name: ");
        String taskName = ScannerUtil.getScannerForStr().nextLine();
        System.out.println("Enter your task duration: ");
        String taskDuration = ScannerUtil.getScannerForStr().nextLine();

        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTaskDuration(Integer.parseInt(taskDuration));
        taskDTO.setTaskName(taskName);

    }

    private static void getName() {
        System.out.println("Enter your surname: ");
        String surname = ScannerUtil.getScannerForStr().nextLine();
        System.out.println("Enter your name: ");
        String name = ScannerUtil.getScannerForStr().nextLine();
        System.out.println("Enter your Address: ");


       /* Address address = new Address();
        System.out.println("Country name: ");
        String country = ScannerUtil.getScannerForStr().nextLine();
        address.setCountry(country);
        System.out.println("Enter your region: ");
        String region = ScannerUtil.getScannerForStr().nextLine();
        address.setRegion(region);
        System.out.println("Enter your birthday: ");
        int birthday = ScannerUtil.getScannerForInt().nextInt();
        address.setBirthDate(String.valueOf(birthday));*/

        PersonalInfoDTO personalInfo = new PersonalInfoDTO();
        personalInfo.setName(name);
        personalInfo.setSurname(surname);
        Address address = new Address();
        personalInfo.setAddress(address);
        System.out.println("Created successfully;");

    }

    public void printMenu() {
        System.out.println("***Main menu***");
        System.out.println("1 => Enter Your Info:");
        System.out.println("2 => Enter Your Task Details:");
        System.out.println("3 => Quit: ");

    }
}
