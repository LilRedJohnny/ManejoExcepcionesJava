
# 🎯 Reporte de Práctica: Validación de Datos con Excepciones Personalizadas en Java

## 🧾 Descripción General
Esta práctica consistió en desarrollar un sistema en Java que permite validar datos de entrada como el correo electrónico, la contraseña y la edad,
usando excepciones personalizadas para gestionar errores de forma más clara y controlada. 

El sistema está compuesto por varias clases que se comunican entre sí para validar los datos ingresados por el usuario. Se probó la robustez del sistema usando entradas válidas e inválidas.

---

## 📁 Ramas del Proyecto
- `📄 Main.java`
- `📄 email_incorrecto.java`
- `📄 contrasenia_insegura.java`
- `📄 unidades_invalidas.java`
- `📄 excepciones_personalizadas.java`

---

## 📄 Main.java
**Rol:** Clase principal del programa.  
Desde aquí se realiza el registro del usuario, se invocan las validaciones y se capturan las excepciones personalizadas.

```java
try {
    formulario.registrarUsuario("usuario@correo.com", "Password123", 30);
    System.out.println("Usuario registrado correctamente");
} catch (EmailInvalidoException e) {
    System.out.println("Error de email: " + e.getMessage());
}
```

- Crea un formulario de registro.
- Ejecuta el método de registro.
- Usa bloques `try-catch` para capturar errores específicos de:
  - Email inválido
  - Contraseña insegura
  - Edad fuera de rango

---

## 📄 email_incorrecto.java
**Rol:** Validar que un correo electrónico cumpla con el formato estándar.

```java
if (!email.matches("^[\\w.-]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
    throw new EmailInvalidoException("El formato del email es inválido.");
}
```

- Usa una expresión regular para verificar que tenga el formato: `usuario@dominio.com`.
- Lanza una excepción `EmailInvalidoException` si el email está vacío o es incorrecto.

---

## 📄 contrasenia_insegura.java
**Rol:** Validar que una contraseña cumpla con criterios mínimos de seguridad.

```java
if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$")) {
    throw new ContrasenaInseguraException("La contraseña es insegura.");
}
```

- Verifica que tenga al menos:
  - 8 caracteres
  - Una mayúscula
  - Una minúscula
  - Un número
- Si no cumple, lanza `ContrasenaInseguraException`.

---

## 📄 unidades_invalidas.java
**Rol:** Validar que la edad esté dentro de un rango lógico (0 a 120 años).

```java
if (edad < 0 || edad > 120) {
    throw new EdadInvalidaException("Edad fuera de rango.");
}
```

- Protege de valores irreales (como edades negativas).
- Lanza `EdadInvalidaException`.

---

## 📄 excepciones_personalizadas.java
**Rol:** Define tres excepciones personalizadas que heredan de `Exception`.

```java
public class EmailInvalidoException extends Exception {
    public EmailInvalidoException(String mensaje) {
        super(mensaje);
    }
}
```

Incluye:
- `EmailInvalidoException`
- `ContrasenaInseguraException`
- `EdadInvalidaException`

Estas clases permiten lanzar errores con mensajes descriptivos específicos.

---

## 🔚 Conclusión
La práctica permitió comprender el uso de:
- Validaciones con expresiones regulares.
- Excepciones personalizadas para mejorar el control de errores.
- Modularización del código para mantener una arquitectura limpia y mantenible.

---



