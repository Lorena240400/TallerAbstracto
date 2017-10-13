
package conversiones;


public class Conversiones {

   
    public static void main(String[] args) {
       
        ConersorConcreto miConversor= new ConersorConcreto();
        
        miConversor.dato=80.24;
        
        System.out.println(miConversor.farenheit2kelvin());
        System.out.println(miConversor.grado2radian());
        
        
        ConversorImplementado miImplementado = new ConversorImplementado();
        
        miImplementado.valor=38.58;
        
        System.out.println(miImplementado.grado2radian());
        System.out.println(miImplementado.kelvin2celsius());
        
    }
    
}
