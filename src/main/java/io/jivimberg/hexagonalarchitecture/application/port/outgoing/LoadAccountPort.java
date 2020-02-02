package io.jivimberg.hexagonalarchitecture.application.port.outgoing;

import io.jivimberg.hexagonalarchitecture.application.domain.BankAccount;

import java.util.Optional;

public interface LoadAccountPort {
    Optional<BankAccount> load(Long id);
}