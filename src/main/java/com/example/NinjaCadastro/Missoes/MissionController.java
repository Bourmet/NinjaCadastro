package com.example.NinjaCadastro.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {
    //Criar missão
    @PostMapping("/create")
    public String createMission(){
        return "mission create";
    }
    //Mostrar missões
    @GetMapping("/show")
    public String showMission(){
        return "todas";
    }
    //Alterar missão
    @PutMapping
    public String updateMission(){
        return "ok";
    }
    //Deletar missão
    @DeleteMapping
    public String deleteMission(){
        return "oi";
    }
}
