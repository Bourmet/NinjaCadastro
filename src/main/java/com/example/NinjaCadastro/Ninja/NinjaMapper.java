package com.example.NinjaCadastro.Ninja;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissions(ninjaDTO.getMissions());

        return ninjaModel;

    }
    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setName(ninjaModel.getName());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setAge(ninjaModel.getAge());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setMissions(ninjaModel.getMissions());

        return ninjaDTO;
    }
}
