import java.util.Scanner;
    class DayOne{
        public static void main(String[] args){

            System.out.println("First Program");


            add(50,20);
            sub(50,20);



        }
        public static int add(int a, int b){



            int sum = a+b;
            System.out.println("Addition is  : "+sum);
            return sum;


        }

        public static int sub(int a ,int b){

            int res;
            res = a-b;
            System.out.println("Substraction is : "+res);
            return res;


        }



    }
