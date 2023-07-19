package com.shalom;
import java.util.Scanner;
public class Program79_SwitchStmt1 {
    @SuppressWarnings("SwitchExpressionCanBePushedDown")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("sunday");
//            case 2 -> System.out.println("monday");
//            case 3 -> System.out.println("tuesday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("saturday");
//            default -> System.out.println("enter valid number of day");
//        }
//    }
//}



//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
//            case 6, 7 -> System.out.println("weekend");
//        }
//    }
//}



        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }
    }
}




//            System.out.println(switch (day) {
//                case 1 -> "sunday";
//                case 2 -> "monday";
//                case 3 -> "tuesday";
//                case 4 -> "wednesday";
//                case 5 -> "thursday";
//                case 6 -> "friday";
//                case 7 -> "saturday";
//                default -> "enter valid number of day";
//            });
//        }
//    }
