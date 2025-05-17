class contrasenas_inseguras {
    /**
     * Valida que la contraseña cumpla con los requisitos de seguridad
     * @param contrasena La contraseña a validar
     * @throws ContrasenaInseguraException Si la contraseña no cumple los requisitos
     */
    public static void validarContrasena(String contrasena) throws ContrasenaInseguraException {
        if (contrasena == null || contrasena.trim().isEmpty()) {
            throw new ContrasenaInseguraException("La contraseña no puede estar vacía");
        }
        
        if (contrasena.length() < 8) {
            throw new ContrasenaInseguraException("La contraseña debe tener al menos 8 caracteres");
        }
        
        if (!contrasena.matches(".*[A-Z].*")) {
            throw new ContrasenaInseguraException("La contraseña debe contener al menos una letra mayúscula");
        }
        
        if (!contrasena.matches(".*\\d.*")) {
            throw new ContrasenaInseguraException("La contraseña debe contener al menos un número");
        }
    }
}