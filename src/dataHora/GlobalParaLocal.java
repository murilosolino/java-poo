package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-03-07");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-07T14:48:26");
        Instant d06 = Instant.parse("2025-03-07T01:48:26Z");

        /*Para converter um Instant que eh uma data hora global para local, eh necessario no metodo
        * of instant passar o timezone desejado*/

        //Timezone pode ser passado por ZoneID
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.of("America/Sao_Paulo"));
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
