package OperatoryLogiczne;

public abstract class Wyrazenie {
    public Wyrazenie and(Wyrazenie w) {
        return w.andOdwr(this);
    }

    public Wyrazenie andOdwr(Wyrazenie w) {
        return new And(w, this);
    }

    public Wyrazenie andTrue(Wyrazenie w) {
        return new And(w, this);
    }

    public Wyrazenie or(Wyrazenie w) {
        return w.orOdwr(this);
    }

    public Wyrazenie orOdwr(Wyrazenie w) {
        return new Or(w, this);
    }

    public Wyrazenie orFalse(Wyrazenie w) {
        return new Or(w, this);
    }

    public Wyrazenie not() {
        return new Not(this);
    }

    public Wyrazenie xor(Wyrazenie w) {return new Xor(this, w ); }

    public Wyrazenie xorFalse(Wyrazenie w) {return new Xor(w, this ); }

    public Wyrazenie xorTrue(Wyrazenie w) {return new Xor(w, this ); }

    public abstract Boolean oblicz(Boolean x);

    protected int priorytet() {
        return Integer.MAX_VALUE;
    }
}

