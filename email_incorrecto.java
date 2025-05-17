class email_incorrectos {
    /**
     * Valida el formato de una dirección de correo electrónico
     * @param email El email a validar
     * @throws EmailInvalidoException Si el email no cumple con el formato requerido
     */
    public static void validarEmail(String email) throws EmailInvalidoException {
        if (email == null || email.trim().isEmpty()) {
            throw new EmailInvalidoException("El email no puede estar vacío");
        }
        
        if (!email.matches("^[\\w.-]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new EmailInvalidoException("El formato del email es inválido. Debe ser usuario@dominio.com");
        }
    }
}
