package inside_payment.entity;

import edu.fudan.common.entity.AssignableUuid;
import lombok.Data;

import jakarta.persistence.*;
//import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @author fdse
 */
@Data
@Entity
@Table(name = "inside_money")
public class Money {

    @Valid
    @NotNull
    @Id
    @Column(length = 36)
    @AssignableUuid
    private String id;

    @Valid
    @NotNull
    @Column(length = 36)
    private String userId;

    @Valid
    @NotNull
    private String money; //NOSONAR

    @Valid
    @NotNull
    @Enumerated(EnumType.STRING)
    private MoneyType type;

    public Money(){
        this.userId = "";
        this.money = "";

    }

}
