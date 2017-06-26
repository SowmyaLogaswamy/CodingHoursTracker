import java.io.Console;
public class CodingTracker {
  public static void main(String[] args) {
    int totalHours1 = calculateHoursSpent("yesterday");
    int totalHours2 = calculateHoursSpent("day before yesterday");
    int totalHours3 = calculateHoursSpent("today");
    int totalHours = totalHours1 + totalHours2 + totalHours3;
    System.out.println("Your spent a total of " + totalHours + " hours coding");
    if(totalHours > 10) {
      System.out.println("Great job! You're on track to becoming a Java pro in no time!");
    } else {
      System.out.println("Thats Okay!! Keep practicing");
    }
  }

  public static Integer calculateHoursSpent(String day) {
    Console myConsole = System.console();
    System.out.println("How many hours did you spend coding " + day + "?");
    String stringNumber = myConsole.readLine();
    Integer hoursSpent = Integer.parseInt(stringNumber);
    System.out.println("You have spent " + hoursSpent + " hours " + day);
    return hoursSpent;
  }
}
