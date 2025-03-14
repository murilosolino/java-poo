package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-03-07");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-07T14:48:26");
        Instant d06 = Instant.parse("2025-03-07T01:48:26Z");

        //subtraindo a data local de d04
        LocalDate pastWeekLocalDate = d04.minusDays(7);

        // incrementando a data localde d04
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println(pastWeekLocalDate + " : " + nextWeekLocalDate);

        // Fazendo o mesmo com data e hora local mas mexendo na hora
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        nextWeekLocalDateTime = nextWeekLocalDateTime.minusHours(7);
        pastWeekLocalDateTime = pastWeekLocalDateTime.minusMinutes(30);

        System.out.println(pastWeekLocalDateTime + " : " + nextWeekLocalDateTime);

        // Quando a variavel eh um tipo objeto Instant, para mexer com dias, meses e ano devemos utilizar o ChronoUnit
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstat = d06.plus(7, ChronoUnit.DAYS);

        //Calculo de duracao Data-hora1 - Data-hora2

        Duration t1 = Duration.between(pastWeekLocalDateTime,d05);
        System.out.println(t1.toDays());

        //Para usar Durantion.between para um objeto do tipo LocalDate eh necessario convertelo para LocalDateTime
        // Duration.between lancara um erro caso seja usado com um objeto LocalDate
        // atStartOfDays converte o LocalDate para Local Date Time com horario 00:00:00
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(d06, pastWeekInstant);
        System.out.println(t3.toDays());

    }

}
