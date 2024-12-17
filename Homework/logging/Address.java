package logging;

public class Address {
    private String country;
    private String region;
    private String birthDate;

    public Address() {
    }

    public Address(String country, String region, String birthDate) {
        this.country = country;
        this.region = region;
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
