
package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class Conversiones{
    int limite;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
int digitos;double canDigitos,m,d ;
m=0;
canDigitos=0;
int valor = 0;
//double valor2=0.0;
        System.out.println("ingrese digitos");
        digitos=Integer.parseInt(dato.readLine());
        d=digitos;
        do{
            digitos=digitos/10;
            canDigitos++;
            
        }while(digitos>1);
        if (digitos%1==0) {
            
        m=Math.pow(10, canDigitos);
        d=d/m;
        System.out.println("Tiene "+d+" dijitos"); 
        }else{
            System.out.println("no es entero");
        }
               
        
        
}
}

