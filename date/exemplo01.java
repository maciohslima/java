package date;

import java.util.Date;

public class exemplo01 {
    public static void main(String[] args) {
        System.out.println("Inicio da instrução");
        
        Date data = new Date();

        System.out.println(data); //Imprime data atual

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);

        System.out.println("Fim da Instrução!!!");

    }
    
}
