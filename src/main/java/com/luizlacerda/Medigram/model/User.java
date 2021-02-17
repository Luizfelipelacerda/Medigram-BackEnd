package com.luizlacerda.Medigram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String login;
    private String nome;
    private String turma;

    public User(String login, String nome, String turma) {
        this.login = login;
        this.nome = nome;
        this.turma = turma;
    }
}
