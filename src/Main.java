
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUAN OSCAR PRO
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
//        System.out.println("¡Elige la opción: *.* *_*!");
//        System.out.println("[1] Bancaria [2] Ahorro [3] Cheques");
//        int cuenta = leer.nextInt();
//        System.out.println("--------------------------------------------------");
//        if (cuenta == 1) {
//            CuentaBancaria cuenta1 = new CuentaBancaria(1,new Cliente("juan Oscar ","Cahuich Euan"));
//            int contador = 0;
//            System.out.println("NUMERO DE CUENTA: " + cuenta1.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta1.getcliente());
//            while (contador == 0) {
//                System.out.println(" ¿Que accion desea realizar?\n 1 = Depositar \n 2 = Retirar \n 3 = Finalizar \n");
//                int a = leer.nextInt();
//                if (a == 1) {
//                    System.out.println("¿Cuanto deseas depositar?");
//                    cuenta1.Depositar(leer.nextDouble());
//                }
//                if (a == 2) {
//                    System.out.println("¿Cuanto deseas retirar?");
//                    cuenta1.Retirar(leer.nextDouble());
//                }
//                if (a == 3) {
//                    System.out.println("Fin");
//                    contador = 1;
//                }
//                System.out.println("saldo: " + cuenta1.getSaldo());
//            }
//        }
//        if (cuenta == 2) {
//            CuentaDeAhorro cuenta2 = new CuentaDeAhorro(100154325, "juan oscar");
//            System.out.println("NUMERO DE CUENTA: " + cuenta2.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta2.getcliente());
//            System.out.println(cuenta2.getSaldo());
//            cuenta2.Depositar(200);
//            System.out.println(cuenta2.getSaldo());
//            cuenta2.corteMensual();
//            System.out.println(cuenta2.getSaldo());
//            cuenta2.Retirar(500);
//            System.out.println(cuenta2.getSaldo());
//            cuenta2.corteMensual();
//            System.out.println("saldo: " + cuenta2.getSaldo());
//        }
//        if (cuenta == 3) {
//            CuentaDeCheques cuenta3 = new CuentaDeCheques(100154325, "juan oscar");
//            System.out.println("NUMERO DE CUENTA: " + cuenta3.getnumeroDeCuenta() + " " + "NOMBRE: " + cuenta3.getcliente());
//            int contador = 0;
//             System.out.println(" ¡¡Tienes un saldo!!" + cuenta3.getSaldo());
//            while (contador == 0) {
//                System.out.println(" ¿Que accion desea realizar?\n 1 = Depositar \n 2 = Retirar \n 3 = Finalizar \n");
//                int x = leer.nextInt();
//             if (x == 1) {
//                 System.out.println("¿Cuanto deseas depositar?");
//                    cuenta3.Depositar(leer.nextDouble());
//                }
//                if (x == 2) {
//                    System.out.println("saldo: " + cuenta3.getSaldo());
//                    System.out.println("¿Cuanto deseas retirar?");
//                    cuenta3.Retirar(leer.nextDouble());
//                }
//                if (x == 3) {
//                    System.out.println("Fin");
//                    contador = 1;
//                }
//                System.out.println("saldo: " + cuenta3.getSaldo());
//            }
//        }
//    }
        
        System.out.println("¿QUE CUENTA DE SEAS REALIZAR");
        System.out.println("[1] Bancaria [2] Ahorro [3] Cheques");
        int cuenta = leer.nextInt();
        if (cuenta == 1){    
        System.out.println("Proporcione el numero de la cuenta.");
        int numeroDeCuenta = leer.nextInt();
        System.out.println("Proporcione el nombre del cliente.");
        String nombre = leer.next();
        System.out.println("Proporcione el apellido del cliente.");
        String apellido = leer.next();
        Cliente cliente = new Cliente(nombre, apellido);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroDeCuenta, cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?\n 1 = Introducir datos personales \n 2 = Proporcionar los datos del cliente \n 3 = Depositar \n 4 = Retirar \n 5 = Finalizar \n ");
          int accion = leer.nextInt();
          if (accion == 1){
                System.out.println("Porporcione su fecha de nacimiento.");
                String fechaDeNacimiento;
                fechaDeNacimiento = leer.nextLine();
                
                System.out.println("Porporcione su direccion.");
                String direccion = leer.nextLine();
               
                System.out.println("Porporcione su ocupacion.");
                String ocupacion= leer.nextLine();
                
                System.out.println("Proporcione su telefono.");
                String telefono= leer.nextLine();
               System.out.println("Proporcione su correo Electronico.");
                String correoElectronico = leer.nextLine();
                cliente.setFechaDeNacimiento(fechaDeNacimiento);
                cliente.setDireccion(direccion);
                cliente.setOcupacion(ocupacion);
                cliente.setTelefono(telefono);
                cliente.setCorreoElectronico(correoElectronico);
            }
           if (accion == 2){
                System.out.println("El numero de la cuenta del cliente es: " 
                        +cuentaBancaria.getNumeroDeCuenta());
                System.out.println("El nombre del cliente es: " 
                        +cliente.getNombre());
                System.out.println("El apellido del cliente es: " 
                        +cliente.getApellido());
                System.out.println("La fecha de nacimiento del cliente es: "
                        +cliente.getFechaDeNacimiento());
                System.out.println("El cliente vive en: " 
                        +cliente.getDireccion());
                System.out.println("El cliente trabaja como: " 
                        +cliente.getOcupacion());
                System.out.println("El numero telefonico del cliente es: "
                        +cliente.getTelefono());
                System.out.println("El correo electronico es: "
                        +cliente.getCorreoElectronico());
            }
            
            if (accion == 3){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = leer.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 4){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = leer.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 5){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        else {
            System.out.println("Cuenta no disponible.");
        }
                
        
        
        
        
        
        
        
        
        
        

}
}
