package co.com.bancolombia.model.animales;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Animales {
    private String numeroAnimal;
    private int mumeroDePatas;
    private Character genero;
    private String especie;
    private String habitat;
    private boolean domestico;

}
