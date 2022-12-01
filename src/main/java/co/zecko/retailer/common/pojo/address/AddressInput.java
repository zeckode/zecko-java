package co.zecko.retailer.common.pojo.address;

import co.zecko.retailer.common.enums.CountryCode;
import co.zecko.commonPublic.java.pojo.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressInput extends BaseEntry implements Serializable {

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
