package OperatoryLogiczne;

public class Xor extends OperatorDwuargumentowy {
    protected Xor(Wyrazenie lewy, Wyrazenie prawy) {
        super(lewy, prawy);
    }

    protected String operator() {
        return "^";
    }

    public Boolean oblicz(Boolean x) {
        return lewy.oblicz(x) ^ prawy.oblicz(x);
    }

    protected int priorytet() {
        return 1;
    }
}
