package kfooddelivery.domain;

import kfooddelivery.domain.*;
import kfooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Pick extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String storeId;
    private String storeTel;
    private String customerId;
    private String customerTel;
    private String customerAddr;

    public Pick(Delivery aggregate){
        super(aggregate);
    }
    public Pick(){
        super();
    }
}
