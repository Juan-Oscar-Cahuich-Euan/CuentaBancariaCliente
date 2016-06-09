
public class Cliente {
     

    private String Nombre;
    private String Apellido;
    private String FechaDeNacimiento;
    private String Direccion;
    private String Ocupacion;
    private String CorreoElectronico;
    private String Telefono;
    
    
    public Cliente(String nombre, String apellido){
    this.Nombre = Nombre;
    this.Apellido = Apellido;
    this.FechaDeNacimiento = "00/00/00";
    this.Direccion = "0";
    this.Ocupacion = "0";
    this.Telefono = "(000)000-0000";
    this.CorreoElectronico = "0";
    
    
    }

      
    public String getNombre(){
        return Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getFechaDeNacimiento(){
        return FechaDeNacimiento;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getOcupacion(){
        return Ocupacion;
    }
    public String getTelefono(){
        return Telefono;
    }
    public String getCorreoElectronico(){
        return CorreoElectronico;
    }
    
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void setApellido(String apellido){
        this.Apellido =  apellido;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.FechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.Direccion = direccion;
    }
    public void setOcupacion(String acupacion){
        this.Ocupacion = Ocupacion;
    }
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
    public void setCorreoElectronico(String email){
        this.CorreoElectronico = CorreoElectronico;
}
    
    
    }
    
    
    
    
    
    
    
    

