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
public class Cliente extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String nome;

}
