package co.com.bancolombia.model.animales.gateways;

import co.com.bancolombia.model.animales.Animales;

import java.util.List;

public interface AnimalesRepository {
    Animales create(Animales animales);
    Animales read(String  numeroAnimal);
    default Animales update(String numeroAnimal, Animales animales) throws Exception{
        return animales;
    }
    void delete(String numeroAnimal);


    List<Animales> getAll();

}
