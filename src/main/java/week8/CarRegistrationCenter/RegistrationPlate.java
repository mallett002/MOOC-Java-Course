package week8.CarRegistrationCenter;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        else if (this.getClass() != object.getClass()) return false;

        RegistrationPlate compared = (RegistrationPlate) object;

        if (!this.getRegCode().equals(compared.getRegCode()) ||
            !this.getCountry().equals(compared.getCountry())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.getRegCode() == null) {
            return 7;
        }
        
        return this.getRegCode().hashCode() + 7;
    }

    public String toString() {
        return country + " " + regCode;
    }
}
