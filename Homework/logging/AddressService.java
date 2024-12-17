package logging;

import java.util.ArrayList;
import java.util.List;

public class AddressService{
    private static List<Address> addressServiceList = new ArrayList<>();


    public void create (Address address){
        for (Address addressService : addressServiceList) {
            Address address1 = new Address();

            System.out.println("Country name: ");
            String country = ScannerUtil.getScannerForStr().nextLine();
            address.setCountry(country);
            System.out.println("Enter your region: ");
            String region = ScannerUtil.getScannerForStr().nextLine();
            address.setRegion(region);
            System.out.println("Enter your birthday: ");
            int birthday = ScannerUtil.getScannerForInt().nextInt();
            address.setBirthDate(String.valueOf(birthday));

            address1.setCountry(address.getCountry());
            address1.setRegion(address.getRegion());
            address1.setBirthDate(address.getBirthDate());
            addressServiceList.add(address1);
        }
    }
}
