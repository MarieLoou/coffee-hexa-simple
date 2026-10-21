package org.formation.coffee_hexa_simple.domain.exception;


// Basic domain Exception
public abstract class DomainException extends RuntimeException{

    protected DomainException(String message) {
        super(message);
    }
}
