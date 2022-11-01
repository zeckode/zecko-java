package co.zecko.retailer.common.pojo.base;

import co.zecko.retailer.common.pojo.AbstractEntry;

import java.util.Date;

public class BaseDataBaseEntry extends AbstractEntry<Long> {

    private static final long serialVersionUID = 1349160665663941607L;

    private Long id;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;
}
