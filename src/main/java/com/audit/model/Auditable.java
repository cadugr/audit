package com.audit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/*Esta classe foi criada de forma a expor campos para auditoria que podem ser utilizados por qualquer entidade do nosso projeto*/
@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
//A anotação a seguir é inserida para que todas as informações de mapeamento contidas nela sejam aplicadas às classes que dela herdarem.
@MappedSuperclass 
/*Usamos a anotação a seguir, informando a classe AuditingEntityListener fornecida pelo Spring Data JPA, responsável por gerenciar propriedades
 * relacionadas à auditoria, como por exemplo @CreatedBy.  Esta classe faz esse gerenciamento sempre antes de inserir registros e atualizar os mesmos.
 */
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U>
{
    @CreatedBy //Anotação para setar o campo com o nome do usuário que criou um registro
    @Column(name = "created_by")
    private U createdBy;

    @CreatedDate //Anotação para setar o campo com a data em que um registro foi criado
    @Column(name = "created_date")
    private Date createdDate;

    @LastModifiedBy //Anotação para setar o campo com o nome do usuário que atualizou um registro
    @Column(name = "last_modified_by")
    private U lastModifiedBy;

    @LastModifiedDate //Anotação para setar o campo com a data em que um registro foi atualizado
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
