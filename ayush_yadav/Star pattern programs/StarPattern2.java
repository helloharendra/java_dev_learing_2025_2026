public class StarPattern2{
    public static void main (String[]args){
        int n = 15;
        System.out.println("Simple Traingle Pattern");
        for (int i = 1;  i < n; i++ ){
        for (int j =  1; j <i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}