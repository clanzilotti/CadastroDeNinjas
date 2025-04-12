package com.fiasco.CadastroDeNinjas.Ninjas;

import com.fiasco.CadastroDeNinjas.Missao.MissaoModel;
import jakarta.persistence.*;

@Entity
@Table(name="tbNinjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missaoId")
    private MissaoModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
