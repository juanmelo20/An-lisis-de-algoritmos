
public class Talla {

   
       public static void main(String[] args) {
                   long startTime= System.currentTimeMillis();
           int talla=7000;
           int matriz[][] = new int[talla][talla];
           for (int i=0; i < talla; i++) {
                for (int j=0; j < talla; j++) {
                    matriz[i][j] = (int) (Math.random()*10);
                    System.out.print(matriz[i][j]);               
                }
                System.out.println("");
            }
           long endTime=System.currentTimeMillis();
           long duration= endTime-startTime;
           System.out.println("duration = " + duration);
       }
}