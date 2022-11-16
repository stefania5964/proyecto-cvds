package edu.eci.cvds.services;

public class ExceptionServices extends Exception {
    public ExceptionServices() {
    }
    public ExceptionServices(String message) {
        super(message);
    }
    public ExceptionServices(String message, Throwable cause) {
        super(message, cause);
    }


}
