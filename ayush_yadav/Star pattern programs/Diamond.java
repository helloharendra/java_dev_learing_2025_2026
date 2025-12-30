public class Diamond {
    public static void main (String[]args){
        int n = 5;
        //Upper Part 
        for (int i = 1; i<=n; i++){
         for (int s = n - i; s > 0; s--) {
           System.out.print(" ");
         } 
         for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
         }
         System.out.println();
        }
     //Lower Part 
     for (int i = n - 1; i >=1; i--){
        for(int s = n - i; s>0; s--){
            System.out.print(" ");
        }
        for (int j = 1; j <=(2 * i- 1); j++){
            System.out.print("*");
        }
        System.out.println("");
     }   
    }
}
