package day06_Shorthand_LogicalOperators;

public class logicalOp {
    public static void main(String[] args) {

        //      ! method that apply for boolean expression
        boolean result1 = true;
        System.out.println(!result1);


        boolean result2 = ! (10 + 15 > 15);
        System.out.println(result2);


        boolean result3 = !true == !false;
        System.out.println(result3);
///////////////////////////////////////////////////////////////////////////

        // && AND logic

      boolean R1 = " Corona" != "End of the world" && " toilet papers " =="Cure";


        boolean R2 = 10 > 15 && 15 < 13;
        System.out.println(R2);
        System.out.println(R1);

        boolean R3 = 'a'=='b'-1 && 'b'+1=='c';
        System.out.println(R3);





        boolean R4 = true != false || false == !true;
        System.out.println(R4);


        boolean R5 = true != false && false == !true;
        System.out.println(R5);

        boolean R6 = !!!false;
        System.out.println(R6);


        System.out.println("5+2 = " + 3 + 4);
        System.out.println("5+2=" + (3+4));




        }
    }





