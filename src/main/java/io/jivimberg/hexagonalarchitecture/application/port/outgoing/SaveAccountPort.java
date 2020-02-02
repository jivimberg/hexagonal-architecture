package io.jivimberg.hexagonalarchitecture.application.port.outgoing;

import io.jivimberg.hexagonalarchitecture.application.domain.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}