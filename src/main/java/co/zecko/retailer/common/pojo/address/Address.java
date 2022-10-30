package co.zecko.retailer.common.pojo.address;


import co.zecko.retailer.common.enums.CountryCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address implements Serializable {

    private static final long serialVersionUID = 935795371849834313L;

    String address1;

    String address2;

    String city;

    String country;

    CountryCode countryCode;

    String firstName;

    List<String> formatted;

    String formattedArea;

    String lastName;

    String name;

    String phone;

    String province;

    String zip;
}
