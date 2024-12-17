package logging;

import javaConcurrency.immutable.versionOne.Address;

public class PersonalInfoDTO {
    private String name;
    private String surname;
    private Address address;

    public void setAddress(logging.Address address) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress(Address address) {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }

    public void setAddress(String country, String region, int birthday) {
    }

}

