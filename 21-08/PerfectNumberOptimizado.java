
public class PerfectNumberOptimizado {

   
       public static void main(String[] args) {
        
        System.out.println("Optimizado");

        long startTime= System.nanoTime();
        int s=0;
        int n=986598;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                s+=i;
                
            }
        }
        if(s==n){
            System.out.println("El numero "+n+" es perfecto");

        }else{
             System.out.println("El numero "+n+" no es perfecto");
        }
    
        long endTime=System.nanoTime();
        long duration= endTime-startTime;
           System.out.println("duration = " + duration);
       }      
}