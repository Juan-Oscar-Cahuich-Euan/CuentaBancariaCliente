
public class CuentaBancaria {

   private int numeroDeCuenta;
    private Cliente cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, Cliente cliente){
        this.cliente =  new Cliente(cliente.getNombre(), cliente.getApellido());;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo =0.0;
    }
    public void numeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
//    private void cliente(String nombre, String apellido){
//        this.cliente = cliente;
//        
//    }
    
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("No se puede hacer el deposito.");
        }
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("No se puede hacer el retiro.");
        }
    }
    
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    public double getSaldo(){
        return this.saldo;}
        
//          public Cliente getcliente(){
//        return this.cliente;}
        
        public int getnumeroDeCuenta(){
        return this.numeroDeCuenta;
        }

    int getNumeroDeCuenta() {
         return this.getNumeroDeCuenta();
    }
 
}
        
        


