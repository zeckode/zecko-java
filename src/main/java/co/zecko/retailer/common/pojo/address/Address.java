package co.zecko.retailer.common.pojo.address;

import co.zecko.retailer.common.enums.CountryCode;
import co.zecko.retailer.common.pojo.base.BaseEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.List;
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
public class Address extends BaseEntry implements Serializable {

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
