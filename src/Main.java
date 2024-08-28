public class Main {

  public static void main(String[] args) {
   System.out.println("Hello World");
   printDayOfWeek(-1);
   printDayOfWeek(0);
   printDayOfWeek(4);
   printDayOfWeek(8);
  }

  public static void printDayOfWeek(int day) {
    String dayOfTheWeek;

    dayOfTheWeek =  switch(day) {
      case -1,0 -> {
        if (day == -1) {
          yield "Minus One";
        } else {
          yield "Sunday";
        }
      }
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      default -> "The " + day + " of the week was Not Found.";
    };

    System.out.println("Day number " + day + " is " + dayOfTheWeek);
  }

}