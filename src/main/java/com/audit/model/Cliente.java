package com.audit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
/*Então, para que nossa classe contenha os campos de auditoria, basta estender a mesma da classe Auditable.
 * Vale lembrar que os campos da classe Auditable precisam existir na tabela do banco de dados, neste caso, a tabela cliente.
 * Vide o script de migração V001__cria-tabela-cliente, em src/main/resources/db/migration
 * */
public class Cliente extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String nome;

}
