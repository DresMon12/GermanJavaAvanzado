package co.com.bancolombia.jpa;

import co.com.bancolombia.model.animales.Animales;
import co.com.bancolombia.model.animales.gateways.AnimalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class JpaAnimalImpl implements AnimalesRepository {
    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public Animales create(Animales animales) {
        String numeroAnimal = UUID.randomUUID().toString();
               animales.setNumeroAnimal(numeroAnimal);
        jpaRepositoryAdapter.save(animales);
        return jpaRepositoryAdapter.findById(numeroAnimal);
    }

    @Override
    public Animales read(String numeroAnimal) {
        return (Animales) jpaRepositoryAdapter.findById(numeroAnimal);
    }

    @Override
    public Animales update(String numeroAnimal, Animales animales) throws Exception {
        Animales animalesDb = jpaRepositoryAdapter.findById(numeroAnimal);

        if (animalesDb == null) throw new Exception("Animal not found : " + numeroAnimal);

        animalesDb.setMumeroDePatas(animales.getMumeroDePatas());
        animalesDb.setGenero(animales.getGenero());
        animalesDb.setEspecie(animales.getEspecie());
        animalesDb.setHabitat(animales.getHabitat());
        animalesDb.setDomestico(animales.isDomestico());
        jpaRepositoryAdapter.save(animalesDb);
        AnimalesRepository.super.update(numeroAnimal, animales);
        return animalesDb;
    }

    @Override
    public void delete(String numeroAnimal) {
        jpaRepositoryAdapter.deleteById(numeroAnimal);



    }

    @Override
    public List<Animales> getAll() {

        return jpaRepositoryAdapter.findAll();
    }


}
