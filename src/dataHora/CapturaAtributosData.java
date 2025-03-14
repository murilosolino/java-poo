package dataHora;

import java.time.LocalDate;

public class CapturaAtributosData {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-03-07");

        System.out.println("Dia: " + d04.getDayOfMonth());
        System.out.println("Mes: " + d04.getMonthValue());
        System.out.println("Ano: " + d04.getYear());
    }
}
