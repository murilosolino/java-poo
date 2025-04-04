package generics.set.exercicio.ex2.entities;

import java.util.Objects;

public class User {
    private Integer code;

    public User(Integer code) {
        this.code = code;
    }

    public User(){}

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(code, user.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

}
