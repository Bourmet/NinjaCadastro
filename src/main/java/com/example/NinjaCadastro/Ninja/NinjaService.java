package com.example.NinjaCadastro.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos
    public List<NinjaModel> showAll(){
        return ninjaRepository.findAll();
    }
    //Listar por Id
    public NinjaModel show(Long id){
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }
    //Criar novo ninja
    public NinjaModel createNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
    //Deletar
    public void deleteById(Long id){
        ninjaRepository.deleteById(id);
    }
    //Atualizar(por completo)
    public NinjaModel change(Long id, NinjaModel ninjaMod){
        if(ninjaRepository.existsById(id)){
            ninjaMod.setId(id);
            return ninjaRepository.save(ninjaMod);
        }
        return null;
    }
}
