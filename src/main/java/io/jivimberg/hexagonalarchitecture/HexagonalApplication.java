package io.jivimberg.hexagonalarchitecture;

import io.jivimberg.hexagonalarchitecture.adapters.persistence.BankAccountRepository;
import io.jivimberg.hexagonalarchitecture.application.domain.BankAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class HexagonalApplication {
    public static void main(final String[] args) {
        SpringApplication.run(HexagonalApplication.class, args);
    }

    @Bean
    public CommandLineRunner bootstrapData(BankAccountRepository repository) {
        return (args) -> {
            BigDecimal initialBalance = BigDecimal.valueOf(1000);
            BankAccount bankAccount = new BankAccount(0L, initialBalance);
            repository.save(bankAccount);
        };
    }
}
