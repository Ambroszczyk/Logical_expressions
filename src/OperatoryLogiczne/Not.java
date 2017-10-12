package OperatoryLogiczne;

public class Not extends OperatorJednoargumentowy {
    protected Not(Wyrazenie pojedynczy) {
        super(pojedynczy);
    }

    protected String operator() {
        return "!";
    }

    public Wyrazenie not() {
        return dzialany;
    }

    public Boolean oblicz(Boolean x) {
        return !dzialany.oblicz(x);
    }

    protected int priorytet() {
        return 4;
    }
}
