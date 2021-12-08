import java.util.Scanner;

public class coordinateChecker {

    public static void main(String[] args){
        Scanner coordinate = new Scanner(System.in);
        double x = coordinate.nextDouble();
        double y = coordinate.nextDouble();
        coordinateCheck(x,y);


    }

    public static void coordinateCheck(double x, double y){
      String result = x > 0 && y > 0 ? "I четверть"
                : x < 0 && y > 0 ? "II четверть"
                : x < 0 && y < 0 ? " III четверть"
                : x > 0 && y < 0 ? "IV четверть"
                : x == 0 && y != 0 ? "Ось y"
                : x != 0 && y == 0 ? "Ось x"
                : "Центр Оси";

      System.out.println(result);
    }

}
