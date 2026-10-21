package org.formation.coffee_hexa_simple.domain.exception;

// Rised for incorrect values / business violations
public class DomainValidationException extends DomainException {
    public DomainValidationException(String message) {
        super(message);
    }
}
