import java.util.Scanner;
public class DoWhile {
Scanner scanner;

    public void Ejercicio2(){
        /*Desarrolla un programa que pida al usuario una contraseña.
        La contraseña correcta es "1234". Usa un bucle do-while para seguir pidiendo
        la contraseña hasta que el usuario la introduzca correctamente.
         */
        int contraseña = 1234;
        int intentos = 3;
        int contUsuario = 0;
        boolean bloqueado = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduce la contraseña:");
             contUsuario = scanner.nextInt();
             intentos--;
             if (contraseña!=contUsuario){
                 System.out.println("Contraseña incorrecta, sigue intentándolo.");
             }
        }while (intentos>=1 && contUsuario!=contraseña);{
            ;
            if (intentos == 0 && contUsuario!=contraseña) {
                bloqueado = true;
            }
        }
        if (bloqueado) {
            System.out.println("Contraseña bloqueada");
        }else {
            System.out.println("Acceso permitido");
        }
    }


}
