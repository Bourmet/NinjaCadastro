package com.example.NinjaCadastro.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/oi")
    public String bomDia(){
        return "1° mensagem";
    }

    //Add Ninja - CREATE
    @PostMapping("/add")
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.createNinja(ninja);
    }

    //Procurar ninja por Id - READ
    @GetMapping("/show/{id}")
    public NinjaDTO show(@PathVariable Long id){
        return ninjaService.show(id);
    }

    //Mostrar todos os ninjas
    @GetMapping("/all")
    public List<NinjaDTO> showAll(){
        return ninjaService.showAll();
    }
    //Alterar dados dos ninjas - UPDATE
    @PutMapping("/change/{id}")
    public NinjaDTO change(@PathVariable Long id,@RequestBody NinjaDTO ninjaMod){
        return ninjaService.change(id, ninjaMod);
    }
    //Deletar ninja - DELETE
    @DeleteMapping("/deleteId/{id}")
    public void deleteById(@PathVariable Long id){
        ninjaService.deleteById(id);
    }
}
