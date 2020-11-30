import java.util.Scanner;
// считается, что пользователь не вводт некорректных значений

import java.util.Scanner;
    public class Homework {
        // Создать пустой проект в IntelliJ IDEA и прописать метод main();
        public static void main(String[] args)
        {
            //Создать переменные всех пройденных типов данных, и инициализировать их значения;
            byte testbyte = 127;
            short testshort = -32768;
            int testint = -2147483648;
            long testlong = 0;
            float a=1, b=5, c=5, d=2, e;
            double testdouble = 100d;
            char testchar = 1521;
            boolean testboolean;
            //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
            // где a, b, c, d – входные параметры этого метода;
            e=calc( a, b, c, d);
            System.out.println("Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,\n" +
                    "        где a, b, c, d – входные параметры этого метода;\n" +
                    "a = " + a + ", b = " + b +", c = " + c +", d = " + d + "\n Result = " + e);
         /* Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
         в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае
         – false;
          */
            Scanner in = new Scanner(System.in);
            System.out.println("Hаписать метод, принимающий на вход два числа, и проверяющий что их сумма лежит \n" +
                    "         в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае \n" +
                    "         – false;\n" +
                    " Insert first integer ");
            int check1 = in.nextInt();
            System.out.println(" Insert second integer ");
            int check2= in.nextInt();
            boolean result=check10_20(check1,  check2);
            System.out.println(result);
        /*
        Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
        ноль считаем положительным числом.
         */
            System.out.println("Написать метод, которому в качестве параметра передается целое число, метод должен \n" +
                    "        напечатать в консоль положительное ли число передали, или отрицательное; Замечание: \n" +
                    "        ноль считаем положительным числом.\n" +
                    " Insert the integer ");
            testint= in.nextInt();
            String pos_neg = positiveness(testint);
            System.out.println(pos_neg);

        /* Написать метод, которому в качестве параметра передается целое число, метод должен
        вернуть true, если число отрицательное;
         */
            System.out.println("Написать метод, которому в качестве параметра передается целое число,\n" +
                    " метод должен  вернуть true, если число отрицательное\n" +
                    " Insert the integer ");
            testint= in.nextInt();
            testboolean=Negative_chkr(testint);
            System.out.print(testboolean);
        /*
        Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        метод должен вывести в консоль сообщение «Привет, указанное_имя!»
         */
            System.out.println("\n Написать метод, которому в качестве параметра передается строка, обозначающая имя,\n" +
                    "        метод должен вывести в консоль сообщение «Привет, указанное_имя!»\n" +
                    " Insert the name ");
            String name = in.next();
            Greeter(name);
            /*
             * Написать метод, который определяет является ли год високосным,
             * и выводит сообщение в консоль. Каждый 4-й год является високосным,
             *  кроме каждого 100-го, при этом каждый 400-й – високосный.
             */
            System.out.println(" Написать метод, который определяет является ли год високосным\n"+
                    " Insert the year ");
            int year = in.nextInt();
            leap(year);
        }

        private static void leap(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                System.out.println("This year is leap");
            }
            else
            {
                System.out.println("This year is NOT leap");
            }
        }

        private static void Greeter(String name) {
        /*Очевидно, что нужно вывести строчку с введенным именем,
         однако в задании написано вывести "Привет, указанное_имя".
         На всякий случай реализованы оба варианта.
         */
            System.out.println("Привет, указанное_имя!\n"+
                    "Привет, " + name + '!');
        }

        private static boolean Negative_chkr(int testint) {
            return testint < 0;
        }

        private static String positiveness(int testint) {
            String responce;
            if (testint<0)
            {
                responce="Negative";
            }
            else
            {
                responce="Positive";
            }
            return responce;
        }

        private static float calc( float a,float b,float c,float d) {
            float result;
            result = a*(b+(c/d));
            return result;
        }
        private static boolean check10_20 (int check1, int check2){
            int sum=check1+check2;
            return sum > 10 && sum < 20;
        }
    }


