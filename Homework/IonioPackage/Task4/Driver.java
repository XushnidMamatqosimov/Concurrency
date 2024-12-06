package IonioPackage.Task4;

import java.io.Serializable;

public class Driver implements Serializable {
    private String driversName;
    private String driversLicense;
    private  transient  String carType;

    public Driver(String driversName, String driversLicense, String carType) {
        this.driversName = driversName;
        this.driversLicense = driversLicense;
        this.carType = carType;
    }

    public String getDriversName() {
        return driversName;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driversName='" + driversName + '\'' +
                ", driversLicense='" + driversLicense + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
