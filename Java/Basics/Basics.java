public class Basics {
    public static void main(String[] args) {
        System.out.println("Here we learn the basic of Java");
        // Variables
            // byte b = 23;
            // int i = 10669687;
            // short s = 1283;
            // long l = 12471284;
            // char ch = 'H';
            // float f = 123.12f;
            // double d = 1233455.23343545;

        // Condition Statements
            // if (condition) {
            //     //body
            // }
            // else{
            //     //body
            // }

            // if (condition) {
            //     //body
            // } else if(condition){
            //     //body
            // }
            // else {
                //body
            // }

            // switch ("hi") {
            //     case "hi":
            //             System.out.println("hi");
            //         break;
            //     case "hello":
            //         System.out.println("hello");
            //     break;
            //     default:
            //         System.out.println("Default");
            //         break;
            // }

            // switch ("value2") {
            //     case "value1" -> System.out.println("Value1");
            //     case "value2" -> System.out.println("Value2");
            //     case "value3" -> System.out.println("Value3");
            //     default -> System.out.println("Default");
            // }

        // loops
            // for (int i = 0; i < args.length; i++) {
            //     //body
            // }

            // int i=0;
            // while (condition) {
            //     //body
            //     i++;
            // }

            // int i =0;
            // do {
            //     //body
            //     i++;
            // } while (condition);
            
        // TypeCasting
            // Rules:?
                // 1. Comatiable (int -> float (TRUE), char -> float (FALSE))
                // 2. Destination type > Sourse type

            // int c = 'A';    // Implicit
            // int x = (int)(12.34f);  //Explicit
            // int ch = (int)('A');    //Explicit

        //Function / Method
            // accessSpecifier returnType name(parameters){
            //     //body
            //     return ;
            // }

            // static int sum(int a, int b){
            //     return a+b;
            // }
            

            //Variable length arguments
                // static int sum(int a, int b, int ...x){
                //     int ans = a+b;
                //     for (int i = 0; i < x.length; i++) {
                //         ans += x[i];
                //     }
                //     return ans;
                // }  
        }
}
