package com.audit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

//Essa classe de configuração é criada para habilitar o recurso de auditoria com Spring Data Jpa
@Configuration
/*A anotação a seguir irá habilitar os recursos de auditoria do Spring Data Jpa para a aplicação.
 * Ela é capaz de gerenciar (para criação e atualização) a data relacionada a campos que possuem as anotações
 * @CreatedDate e @LastModifiedDate.  Porém, para campos anotados com @CreatedBy e @LastModifiedBy
 * precisamos ter uma forma de informar para o Spring Data Jpa como gerenciá-los.  Fazemos isso provendo uma implementação 
 * que retorna um tipo AuditorAware, neste caso tipado com String, já que nos campos anotados com  @CreatedDate e @LastModifiedDate
 * teremos uma informação do tipo String
 * */
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {

	@Bean
    public AuditorAware<String> auditorProvider() {

         /*
         Se estiver utilizando spring security, você pode capturar o usuário logado com o seguinte trecho de código.
         SecurityContextHolder.getContext().getAuthentication().getName()
         */
        return () -> Optional.ofNullable("userTeste");
    }
}
