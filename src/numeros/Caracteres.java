
package numeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNO
 */
public class Caracteres {
    
    
    public String pedirString(String mensaje)throws IOException{
        
    InputStreamReader flujo=new InputStreamReader(System.in);
    BufferedReader teclado=new BufferedReader(flujo);
    
    String dato="";
    try{
        System.out.println(mensaje + "  ");
        dato=teclado.readLine();
        while(dato.equals("")){
            System.out.println("Debes introducir algo");
            System.out.println(mensaje + "");
             dato=teclado.readLine();
            
        }
    }catch(IOException ex){}
    
    return dato;
    
    
        
    
    
    
    }
    
    
}
