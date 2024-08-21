
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Perfect {

   
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("ingresa un munero para comprobar si es perfecto");
        
        Instant inicio = Instant.now();
        int s=0;
        int n=32564;
        for(int i=1;i<n;i++){
            if(n%i==0){
                s+=i;
                
            }
        }
        if(s==n){
            System.out.println("El numero "+n+" es perfecto");

        }else{
             System.out.println("El numero "+n+" no es perfecto");
        }
        Instant fin = Instant.now();
        Duration duracion = Duration.between(inicio, fin);
        long tiempoEjecucionMs =duracion.toMillis();
        
           System.out.println("tiempoEjecucionMs = " + tiempoEjecucionMs);
           
        long tiempoEjecucionNs =duracion.toNanos();
           System.out.println("tiempoEjecucionNs = " + tiempoEjecucionNs);
    
       }
}