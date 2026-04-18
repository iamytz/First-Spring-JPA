package com.jpa.gymsystem.repository;


import com.jpa.gymsystem.entity.Member; //Nescessario importar a classe que for usar
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {    //nao pode ser um tipo primitivo
    List<Member> findByName(String name);
    //retorna list de registros com nomes gabriel

    Member findById(int id);
}
