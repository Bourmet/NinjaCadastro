package com.example.NinjaCadastro.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos
    /*public List<NinjaModel> showAll(){
        return ninjaRepository.findAll();
    }*/

    //Listar todos - versão DTO
    public List<NinjaDTO> showAll(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }
    //Listar por Id
    /*public NinjaModel show(Long id){
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }*/

    //Listar por Id - versão DTO
    public NinjaDTO show(Long id){
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.map(ninjaMapper::map).orElse(null);
    }
    //Criar novo ninja
    /*public NinjaModel createNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }*/

    //Criar novo ninja - versão DTO
    public NinjaDTO createNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }
    //Deletar
    public void deleteById(Long id){
        ninjaRepository.deleteById(id);
    }
    //Atualizar(por completo)
    /*public NinjaModel change(Long id, NinjaModel ninjaMod){
        if(ninjaRepository.existsById(id)){
            ninjaMod.setId(id);
            return ninjaRepository.save(ninjaMod);
        }
        return null;
    }*/

    //Atualizar(por completo) - versão DTO
    public NinjaDTO change(Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaExist = ninjaRepository.findById(id);
        if(ninjaExist.isPresent()){
            NinjaModel ninjaMod = ninjaMapper.map(ninjaDTO);
            ninjaMod.setId(id);
            NinjaModel ninjaSave = ninjaRepository.save(ninjaMod);
            return ninjaMapper.map((ninjaSave));
        }
        return null;
    }
}
