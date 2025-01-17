import java.util.Scanner;

public class Nested_switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which format you wanna play?");
        String format  = sc.next();
        String series = sc.next();
        /*
        So in nested switch cases we have switch inside a switch just like in below code as when user will enter format and series he/she
        can get the value attached to the data item and the nested switch can be written like this/syntax of nested switch is preetty much 
        same like in the switch cases
        */
        switch (format) {
            case "T20":
                switch (series) {
                    case "IPL":
                        System.out.print("Indian Premier League");
                        break;
                    case "Bigbash":
                        System.out.println("Australian Premier League");
                        break;
                    case "The 100":
                        System.out.println("England Premier League");
                        break;
                    default:
                        System.out.println("No series entered");
                }
                break;
            case "ODI":
                System.out.println("50 Overs match");
                break;
            case "Test":
                switch (series) {
                    case "Border-Gavaskar":
                        System.out.println("Played between India & Australia");
                        break;
                    case "Ashes":
                        System.out.println("Played between Australia & England");
                    default:
                        System.out.println("No series entered");
                }
                break;
            default:
                System.out.println("No format or series entered!");
        }
    }
}
