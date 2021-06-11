package date;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //sex jun 11 11:20:45 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-06-11

        System.out.printf("%tD\n", agora);
        //06/11/21

        System.out.printf("%tr\n", agora);
        //11:20:45 AM

        System.out.printf("%tT\n", agora);
        //11:20:45

    }
}