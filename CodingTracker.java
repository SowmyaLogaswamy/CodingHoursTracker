import java.io.Console;

public class CodingTracker {
  public static void main(String[] args) {

    int totalHours1 = calculateHoursSpent("yesterday");
    int totalHours2 = calculateHoursSpent("day before yesterday");
    int totalHours3 = calculateHoursSpent("today");

    int totalHours = totalHours1 + totalHours2 + totalHours3;
    System.out.println("Your spent a total of " + totalHours + " hours coding");
  //
  // System.out.println("You have spent " + hoursYesterday + " hours");
  //
  // System.out.println("How many hours did you spend coding day before yesterday?");
  // String stringNumber2 = myConsole.readLine();
  // Integer hoursDayBeforeYesterday = Integer.parseInt(stringNumber2);
  // System.out.println("You have spent " + hoursDayBeforeYesterday + " hours");
  //
  // System.out.println("How many hours did you spend coding today?");
  // String stringNumber3 = myConsole.readLine();
  // Integer hoursToday = Integer.parseInt(stringNumber3);
  // System.out.println("You spent " + hoursToday + " hours.");
  //
  // int totalHours = hoursYesterday + hoursDayBeforeYesterday + hoursToday;
  // System.out.println("You spent a total of " + totalHours + " hours on coding!");
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
