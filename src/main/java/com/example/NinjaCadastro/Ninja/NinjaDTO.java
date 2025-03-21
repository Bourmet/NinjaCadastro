package com.example.NinjaCadastro.Ninja;

import com.example.NinjaCadastro.Missoes.MissionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {
    private Long id;
    private String name;
    private String email;
    private String imgUrl;
    private int age;
    private String rank;
    private MissionModel missions;

}
