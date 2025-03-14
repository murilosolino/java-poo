package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now(); // instancia com a data atual do sistema
        LocalDateTime d02 = LocalDateTime.now(); // instancia com a data-hora atual do sistema
        Instant d03 = Instant.now(); // instancia uma data-hora com o fuso Z (GMT)

        LocalDate d04 = LocalDate.parse("2025-03-07"); // instancia uma data a partir de de uma String passada no Padrao ISO8601
        LocalDateTime d05 = LocalDateTime.parse("2025-03-07T14:48:26"); // instancia uma data a partir de de uma String passada no Padrao ISO8601
        Instant d06 = Instant.parse("2025-03-07T14:48:26Z"); // intancia uma data hora no fuso Z (GMT/UTC)
        Instant d07= Instant.parse("2025-03-07T14:48:26-03:00");// intancia uma data hora no fuso GTM-3 (Sao Paulo)

        // Instanciando uma data a partir de um texto formatado customizado

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Instanciando uma data-hora a partir de um texto formatado customizado
        DateTimeFormatter  ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("15/02/2025 01:30", ftm1);

        //instanciando uma data passando direto o ano, mes, dia
        LocalDate d10 = LocalDate.of(2025,  02, 28);

        //instanciando uma data passando direto o ano, mes, dia
        LocalDateTime d11 = LocalDateTime.of(2025,01,31,05,43,24);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }

}
