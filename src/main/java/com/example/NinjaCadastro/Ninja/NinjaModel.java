package com.example.NinjaCadastro.Ninja;

import com.example.NinjaCadastro.Missoes.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_register")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    private int age;
    private String rank;
    @ManyToOne
    @JoinColumn(name = "missions_id")   // Foreing Key
    private MissionModel missions;

}
