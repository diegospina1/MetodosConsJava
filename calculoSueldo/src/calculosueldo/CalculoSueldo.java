package calculosueldo;

/*Se desea un programa que permita calcular el sueldo a pagar a un empleado
    Se desea registrar nombre apellido y documento. El sueldo base y el sueldo total a pagar.
    Si el empleado es mayor a 60 años se le da un 10% más sobre el sueldo base.*/


public class CalculoSueldo {

    public static void main(String[] args) {
        
        //Crear instancia de Empleado
        Empleado miEmpleado = new Empleado(/*Casado con el constructor*/);
        double sueldo = miEmpleado.calcularSueldo();
        System.out.println("Sueldo: " + sueldo);
        
        Empleado empleado = new Empleado("Sergio", "Ardila", "1010201201", 5000, 61, 2);
        System.out.println("Sueldo: " + empleado.calcularSueldo());
        
        
        Empleado empleadito = new Empleado(15000, 76, 4);
        System.out.println("Sueldo: " + empleadito.calcularSueldo());
    }
    
}
