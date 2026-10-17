package consignprice.entity;

import edu.fudan.common.entity.AssignableUuid;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@Entity
@Table(name="consign_price")
public class ConsignPrice {
    @Id
    @AssignableUuid
    @Column(length = 36)
    private String id;
    @Column(name = "idx",unique = true)
    private int index;
    @Column(name = "initial_weight")
    private double initialWeight;
    @Column(name = "initial_price")
    private double initialPrice;
    @Column(name = "within_price")
    private double withinPrice;
    @Column(name = "beyond_price")
    private double beyondPrice;

    public ConsignPrice(){
        //Default Constructor
    }

}
