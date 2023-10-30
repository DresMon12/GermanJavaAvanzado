package co.com.bancolombia.usecase.animalescasos;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AnimalesCasosUseCase {

    private AnimalesRepository animalesRepository;
    public Animales create(Animales animales){
        System.out.println(animales);
        animalesRepository.create(animales);
        return animales;
    }
    public Animales read(String numeroAnimal){return animalesRepository.read(numeroAnimal);}
    public Animales update(String numeroAnimal, Animales animales) throws Exception{
        animalesRepository.update(numeroAnimal, animales);
        return animales;
    }
    public void delete(String numeroAnimal) {animalesRepository.delete(numeroAnimal);}
    public List<Animales> getAll(){return animalesRepository.getAll();}

}

