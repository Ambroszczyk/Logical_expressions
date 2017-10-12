package OperatoryLogiczne;

public class False extends ZnakLogiczny {
    private static False nie = new False();

    public static False daj() {
        return nie;
    }

    public Boolean oblicz(Boolean x) {
        return false;
    }

    public Wyrazenie and(Wyrazenie w) {
        return nie;
    }

    public Wyrazenie andOdwr(Wyrazenie w) {
        return nie;
    }

    public Wyrazenie andTrue(Wyrazenie w) {
        return nie;
    }

    public Wyrazenie or(Wyrazenie w) {
        return w.orFalse(this);
    }

    public Wyrazenie orFalse(Wyrazenie w) {
        return nie;
    }

    public Wyrazenie not() {
        return True.daj();
    }

    public Wyrazenie xor(Wyrazenie w) {
        return w.xorFalse(this);
    }

    public Wyrazenie xorFalse(Wyrazenie w) {
        return False.daj();
    }

    public Wyrazenie xorTrue(Wyrazenie w) {
        return True.daj();
    }

    private False(){
        super(new Boolean(false));
    }

    public String toString() {
        return "0";
    }
}
