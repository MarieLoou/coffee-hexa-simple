package org.formation.coffee_hexa_simple.domain.model;

import org.formation.coffee_hexa_simple.domain.exception.DomainValidationException;

public record CoffeeId(long value) {
    public CoffeeId {
        if(value <= 0) {
            throw new DomainValidationException("Coffee id must be positive, got " + value);
        }
    }
}
