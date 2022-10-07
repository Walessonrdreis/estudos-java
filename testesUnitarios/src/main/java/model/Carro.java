package model;

import java.util.Objects;

public class Carro {
    public String marca;
    public Carro(String marca) {
        this.marca = marca;
    }
    public boolean equals(Object o) {
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }
    public int hashCode() {
        return 1;
    }
}
