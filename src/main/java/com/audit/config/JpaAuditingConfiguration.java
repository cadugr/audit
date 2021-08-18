package com.audit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
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
