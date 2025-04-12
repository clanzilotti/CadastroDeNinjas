package com.fiasco.CadastroDeNinjas.Missao;

import com.fiasco.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name="tbMissao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public MissaoModel() {
    }

    public MissaoModel(String descricao, String dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }
}
