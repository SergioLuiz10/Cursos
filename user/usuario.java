package user;

import java.util.Objects;

public class usuario {
    protected int matricula;

    public usuario(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario user = (usuario) o;
        return matricula == user.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
