package com.trainticket.entity;

import edu.fudan.common.entity.AssignableUuid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Money {
    @Id
    @Column(length = 36)
    @AssignableUuid
    private String id;

    @Column(length = 36)
    private String userId;
    private String money; //NOSONAR

}
