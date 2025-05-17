import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FormularioRegistro formulario = new FormularioRegistro();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== FORMULARIO DE REGISTRO ===");
            
            System.out.print("Ingrese su email: ");
            String email = scanner.nextLine();
            
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            
            formulario.registrarUsuario(email, contrasena, edad);
            System.out.println("Usuario registrado correctamente");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: La edad debe ser un numero entero");
        } catch (EmailInvalidoException e) {
            System.out.println("Error de email: " + e.getMessage());
        } catch (ContrasenaInseguraException e) {
            System.out.println("Error de contraseña: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("Error de edad: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    static class FormularioRegistro {
        public void registrarUsuario(String email, String contrasena, int edad) 
                throws EmailInvalidoException, ContrasenaInseguraException, EdadInvalidaException {
            
            email_incorrectos.validarEmail(email);
            contrasenas_inseguras.validarContrasena(contrasena);
            unidades_invalidas.validarEdad(edad);
            
            System.out.println("Datos validados correctamente:");
            System.out.println("Email: " + email);
            System.out.println("Edad: " + edad);
        }
    }
}
