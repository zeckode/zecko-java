package co.zecko.retailer.common.pojo.interfaces;

public interface WebhookData<T> {
  T getData();

  void setData(T t);

}
