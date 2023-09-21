package calculosueldo;


public class Empleado {

    //Atributos de la clase empleado
    public String nombres;
    public String apellidos;
    public String documentos;
    public double sueldoBase;
    public int edad;
    public int cantExtra;
    final public int EXTRA = 1000;
    
    //Constructores
    public Empleado(/*Se pueden recibir parámetros*/){
        
        //Modificador this
        this.nombres = "";
        this.apellidos = "";
        this.documentos = "";
        this.sueldoBase = 0.0;
        this.edad = 0;
        this.cantExtra = 0;
    }

    public Empleado(String nombres, String apellidos, String documentos, double sueldoBase, int edad, int cantExtra) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documentos = documentos;
        this.sueldoBase = sueldoBase;
        this.edad = edad;
        this.cantExtra = cantExtra;
    }

    public Empleado(double sueldoBase, int edad, int cantExtra) {
        this.sueldoBase = sueldoBase;
        this.edad = edad;
        this.cantExtra = cantExtra;
    }
    
    public double calcularSueldo(){
        
        double sueldoPagar = 0; //Variable de ámbito local
        int totalExtra = 0;
        if(this.edad > 60){
            sueldoPagar = (this.sueldoBase * 0.10) + this.sueldoBase;
        }else{
            sueldoPagar = this.sueldoBase;
        }
        totalExtra = cantExtra * EXTRA;
        sueldoPagar += totalExtra;
        
        return sueldoPagar;
    }
    
}
