public class Main {
    public static void main(String[] args) {
        tesk1();
        tesk2();
        tesk3();
        tesk4();
        tesk5();
        tesk6();
        tesk7();
        tesk8();
        tesk9();
        tesk10();



    }
    private static void tesk1() {
        //Задача 1
        for ( int a=1;a<=10;a++){System.out.println("Интерация цикла "+a);}
    }
    private static void tesk2(){
        //Задача 2
        for (int a = 10;a>0;a = a - 1){System.out.println("Интерация цикла "+a);}
    }
    private static void tesk3() {
        //Задача 3
        for(int a=0;a<17;a=a+2){System.out.println(a);}

    }
    private static void tesk4() {
        //Задача 4
        for (int a=10;a>=-10;a=a-1){System.out.println("Интерация цикла "+a);}
    }

    private static void tesk5(){
        //Задача 5
        for (int a=1904;a<=2096;a=a+4){System.out.println(a+" год является високосным");}
    }

    private static void tesk6(){
        //Задача 6
    for (int a=7;a<=98;a=a+7){System.out.println(a);}
    }

    private static void tesk7(){
        //Задача 7
        for (int a=1;a<=512;a=a*2){System.out.println(a);}
    }

    private static void tesk8(){
        // Задача 8
          int salary=29000;
          int total=0;
          for(int a=1;a<=12;a++)
          {total=total+salary;System.out.println("Месяц "+a+" сумма накомлпений равна "+total+" рублей");}
    }
    private static void tesk9(){
        int salary=29000;
        int total=0;
        for(int a=1;a<=12;a++)
        {total=total+total/100;total=total+salary;System.out.println("Месяц "+a+" сумма накомлпений равна "+total+" рублей");}
    }
    private static void tesk10(){
        int a=2;
        for(int i=1;i<=10;i++){int b=a*i;System.out.println(a+"*"+i+"="+b);}
    }
}