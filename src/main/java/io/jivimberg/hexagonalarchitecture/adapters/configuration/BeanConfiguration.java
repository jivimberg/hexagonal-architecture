package io.jivimberg.hexagonalarchitecture.adapters.configuration;

import io.jivimberg.hexagonalarchitecture.HexagonalApplication;
import io.jivimberg.hexagonalarchitecture.adapters.persistence.BankAccountRepository;
import io.jivimberg.hexagonalarchitecture.application.services.BankAccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class BeanConfiguration {

    @Bean
    BankAccountService bankAccountService(BankAccountRepository repository) {
        return new BankAccountService(repository, repository);
    }
}
