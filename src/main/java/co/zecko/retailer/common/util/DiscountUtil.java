package co.zecko.retailer.common.util;

public class DiscountUtil {

    public static String getDiscountPercentage(String price, String compareAtPrice) {
        if (price == null || compareAtPrice == null) {
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
