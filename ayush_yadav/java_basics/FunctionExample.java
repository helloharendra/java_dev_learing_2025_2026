public class FunctionExample{
    int FirstNumber;
    int SecondNumber;
    public void SumOfTwoNumbers( int first, int second){
        this.FirstNumber=first;
        this.SecondNumber =second;
        
    }
    public void printSum() {
        int c = FirstNumber + SecondNumber;
        System.out.println("Sum is" +c);
    } 
  public static void main (String[]args){
    FunctionExample obj = new FunctionExample ();
    obj.SumOfTwoNumbers(10, 20); 
    obj.printSum();
    obj.SumOfTwoNumbers(50, 20);
    obj.printSum();
    obj.SumOfTwoNumbers(100, 20);
    obj.printSum();
    obj.SumOfTwoNumbers(1000, 20);
    obj.printSum();
    

  }    
    }
