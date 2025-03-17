package com.example.NinjaCadastro.Missoes;

import com.example.NinjaCadastro.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String level;
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninja;
}
