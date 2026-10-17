package order.entity;

import edu.fudan.common.entity.AssignableUuid;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.Column;
import java.util.UUID;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
public class OrderAlterInfo {

    @AssignableUuid
    @Column(length = 36)
    private String accountId;

    @AssignableUuid
    @Column(length = 36)
    private String previousOrderId;

    private String loginToken;

    private Order newOrderInfo;

    public OrderAlterInfo(){
        newOrderInfo = new Order();
    }
}
