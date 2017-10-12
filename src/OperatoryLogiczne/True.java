package OperatoryLogiczne;

public class True extends ZnakLogiczny {
    static True tak = new True();

    public static True daj() {
        return tak;
    }

    public Boolean oblicz(Boolean x) {
        return true;
    }

    public Wyrazenie and(Wyrazenie w) {
        return w.andTrue(this);
    }

    public Wyrazenie andTrue(Wyrazenie w) {
        return tak;
    }

    public Wyrazenie or(Wyrazenie w) {
        return tak;
    }

    public Wyrazenie orOdwr(Wyrazenie w) {
        return tak;
    }

    public Wyrazenie orFalse(Wyrazenie w) {
        return tak;
    }

    public Wyrazenie not() {
        return False.daj();
    }

    public Wyrazenie xor(Wyrazenie w) {
        return w.xorTrue(this);
    }

    public Wyrazenie xorFalse(Wyrazenie w) {
        return True.daj();
    }

    public Wyrazenie xorTrue(Wyrazenie w) {
        return False.daj();
    }

    private True(){
        super(new Boolean(true));
    }

    public String toString() {
        return "1";
    }
}
