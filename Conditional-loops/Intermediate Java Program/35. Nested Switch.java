package com.shalom;
import java.util.Scanner;
public class Program80_NestedSwitch {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int ID=in.nextInt();
        String Dept=in.next();
        switch (ID) {
            case 1 -> System.out.println("palash faddewar");
            case 2 -> System.out.println("sabah nazeem");
            case 3 -> System.out.println("priyanka sharma");
            case 4 -> {
                System.out.println("your entered 4 Id number");
                switch (Dept) {
                    case "math" -> System.out.println("mathematics department");
                    case "cs" -> System.out.println("computer science department");
                    default -> System.out.println("no department exist");
                }
            }
            default -> System.out.println("enter valid ID");
        }
    }
}


//switch (ID) {
//            case 1:
//                System.out.println("palash faddewar");
//                break;
//            case 2:
//                System.out.println("sabah nazeem");
//                break;
//            case 3:
//                System.out.println("priyanka sharma");
//                break;
//            case 4:
//                System.out.println("your entered 4 Id number");
//                switch (Dept) {
//                    case "math" -> System.out.println("mathematics department");
//                    case "cs" -> System.out.println("computer science department");
//                    default -> System.out.println("no department exist");
//                }
//                break;
//            default:
//                System.out.println("enter valid ID");
//                break;
//        }
//    }
//}
