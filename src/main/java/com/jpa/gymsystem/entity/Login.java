package com.jpa.gymsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login",unique = true,nullable = false)
    private String login;

    @Column(name = "pwd_hash")//ate o momento, guardarei as senhas puras sem criptografia, depois irei implementar hash
    private String pwdHash;

    //RELACIONAMENTOS
    @OneToOne
    @JoinColumn(name = "memberID")
    private Member member;


}
