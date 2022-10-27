package co.zecko.retailer.common.util;

import org.apache.commons.lang3.StringUtils;

public class DiscountUtil {

    public static String getDiscountPercentage(String price, String compareAtPrice) {
        if (StringUtils.isEmpty(price) || StringUtils.isEmpty(compareAtPrice)) {
            return null;
        }

        Double newPrice = Double.parseDouble(price);
        Double oldPrice = Double.parseDouble((compareAtPrice));
        if(newPrice > oldPrice)
            return null;

        Double discountPercentage = (((oldPrice - newPrice) / oldPrice) * 100.00);

        return (discountPercentage.intValue() == discountPercentage) ?
            String.valueOf(discountPercentage.intValue()) : String.format("%.2f", discountPercentage);
    }
}
