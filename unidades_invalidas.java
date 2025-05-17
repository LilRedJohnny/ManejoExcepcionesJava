class unidades_invalidas {
    /**
     * Valida que la edad esté dentro del rango permitido
     * @param edad La edad a validar
     * @throws EdadInvalidaException Si la edad está fuera del rango válido
     */
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años");
        }
    }
}
