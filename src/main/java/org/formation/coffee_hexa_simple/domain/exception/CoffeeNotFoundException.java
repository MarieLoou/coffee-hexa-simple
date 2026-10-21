package org.formation.coffee_hexa_simple.domain.exception;

public class CoffeeNotFoundException extends DomainException{
    private final CoffeeId coffeeId;

    public CoffeeNotFoundException(CoffeeId coffeeId){
        super("Coffee " + coffeeId + " not found");
        this.coffeeId = coffeeId;
    }

    public CoffeeId getCoffeeId() {
        return coffeeId;
    }
}
