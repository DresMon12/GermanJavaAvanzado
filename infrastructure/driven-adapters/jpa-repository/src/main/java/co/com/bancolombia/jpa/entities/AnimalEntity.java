package co.com.bancolombia.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "animales")
public class AnimalEntity {
    @Id
    private String numeroAnimal;
    @Column
    private int mumeroDePatas;
    @Column
    private Character genero;
    @Column
    private String especie;
    @Column
    private String habitat;
    @Column
    private boolean domestico;

}
