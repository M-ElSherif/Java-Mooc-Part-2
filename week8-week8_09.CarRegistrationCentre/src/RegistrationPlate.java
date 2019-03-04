
import java.util.*;

public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    // CONSTRUCTOR
    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    // GETTER
    public String getRegCode() {
        return this.regCode;
    }

    // GETTER
    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return this.country + " " + this.regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        final RegistrationPlate compared = (RegistrationPlate) object;

        if (this.country == null || this.country != compared.getCountry()) {
            return false;
        }
        
        if (this.regCode != compared.getRegCode()) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.country == null) {
            return 7;
        }
        return 73*7 + this.country.hashCode();
    }
}
