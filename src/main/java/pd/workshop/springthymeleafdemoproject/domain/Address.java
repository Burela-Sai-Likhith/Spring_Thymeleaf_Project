package pd.workshop.springthymeleafdemoproject.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Address {



    @NotBlank
    @Size(min=1, max=18, message="Street name is either too small or too large")
    private String street;
    @NotNull(message="Zip Code cannot be Null")
    private Integer zipcode;

    public Address() {
    }

    public Address(String street, Integer zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }


}