package OperatoryLogiczne;

public class Zmienna extends Wyrazenie {
    private static Zmienna x = new Zmienna();

    public String toString() {
        return "x";
    }

    public Boolean oblicz(Boolean x) {
        return x;
    }

    public static Zmienna daj() {
        return x;
    }

    private Zmienna(){}
}
