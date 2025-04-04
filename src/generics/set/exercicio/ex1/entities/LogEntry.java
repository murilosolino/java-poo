package generics.set.exercicio.ex1.entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
    private String username;
    private Instant moment;

    public LogEntry(String username, Instant moment) {
        this.username = username;
        this.moment = moment;
    }

    public LogEntry(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    @Override
    public String toString() {
        return username + moment;
    }
}
