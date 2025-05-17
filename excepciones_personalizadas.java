class excepciones_personalizadas {
}

class EmailInvalidoException extends Exception {
    public EmailInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class ContrasenaInseguraException extends Exception {
    public ContrasenaInseguraException(String mensaje) {
        super(mensaje);
    }
}

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
