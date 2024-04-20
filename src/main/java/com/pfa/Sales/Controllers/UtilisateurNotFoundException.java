package com.pfa.Sales.Controllers;

public class UtilisateurNotFoundException extends RuntimeException {
    public UtilisateurNotFoundException(String message) {
        super(message);
    }
    public UtilisateurNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
