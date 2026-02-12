public class WeeklyCalander {
  public static void main(String[]args){
    String day = "SUNDAY";
    switch (day) {
    case "MONDAY":
    case "TUESDAY":
    case "WEDNESDAY":
    case "THURSDAY":
    case "FRIDAY":
    System.out.println("Weekday");
    break;
   case "SATURDAY":
    case "SUNDAY" :
    System.out.println("Weekday");  
    break;
    default:   
    System.out.println("Invalid Day");  
  }  
}
}