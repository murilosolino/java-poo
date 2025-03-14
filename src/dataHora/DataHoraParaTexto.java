package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraParaTexto {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-03-07"); // instancia uma data a partir de de uma String passada no Padrao ISO8601
        LocalDateTime d05 = LocalDateTime.parse("2025-03-07T14:48:26"); // instancia uma data a partir de de uma String passada no Padrao ISO8601
        Instant d06 = Instant.parse("2025-03-07T01:48:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d05.format(fmt1));
        System.out.println(d05.format(ftm2));

        //Formata um instant passando um timedoze default do sistema nesse caso GTM-3
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt3.format(d06));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(fmt4.format(d05));

        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(fmt5.format(d06));

    }
}
