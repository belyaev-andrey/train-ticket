package train.entity;

import edu.fudan.common.entity.AssignableUuid;
import lombok.Data;
import lombok.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Data
@Entity
public class TrainType {
    @Id
    @AssignableUuid
    @Column(length = 36)
    private String id;

    @NotNull
    @Column(name="name", unique = true)
    private String name;

    @Valid
    @Column(name = "economy_class")
    private int economyClass;
    @Valid
    @Column(name = "confort_class")
    private int confortClass;
    @Column(name = "average_speed")
    private int averageSpeed;

    public TrainType(){
        //Default Constructor
    }

    public TrainType(String name, int economyClass, int confortClass) {
        this.name = name;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
    }

    public TrainType(String name, int economyClass, int confortClass, int averageSpeed) {
        this.name = name;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
        this.averageSpeed = averageSpeed;
    }

}
