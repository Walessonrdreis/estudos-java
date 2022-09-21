import model.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Pessoa walas = new Pessoa("walas", LocalDate.of(1994,11,30));
        walas.setIdade();

    }


}
