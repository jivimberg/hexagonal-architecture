package io.jivimberg.hexagonalarchitecture.adapters.persistence;

import io.jivimberg.hexagonalarchitecture.application.domain.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpringDataBankAccountRepository extends MongoRepository<BankAccount, Long> { }
