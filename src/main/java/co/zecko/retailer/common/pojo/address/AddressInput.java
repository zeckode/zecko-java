package co.zecko.retailer.common.pojo.address;

import co.zecko.retailer.common.enums.CountryCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressInput implements Serializable {

    private static final long serialVersionUID = -6508043866447760439L;

    String address1;

    String address2;

    String city;

    String country;

    CountryCode countryCode;

    String firstName;

    String lastName;

    String phone;

    String province;

    String zip;
}
