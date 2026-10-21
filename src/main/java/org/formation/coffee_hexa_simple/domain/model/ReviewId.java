package org.formation.coffee_hexa_simple.domain.model;

import org.formation.coffee_hexa_simple.domain.exception.DomainValidationException;

public record ReviewId(long value) {
    public ReviewId {
        if(value <= 0) {
            throw new DomainValidationException("Review id must be positive, got " + value);
        }
    }
}
