package OperatoryLogiczne;

public abstract class OperatorJednoargumentowy extends Wyrazenie {
    protected Wyrazenie dzialany;

    public String toString() {
        String Str = dzialany.toString();

        if (dzialany.priorytet() <= priorytet())
            Str = "(" + Str + ")";

        return operator() + Str;
    }

    protected abstract String operator();

    protected OperatorJednoargumentowy(Wyrazenie dzialany) {
        this.dzialany = dzialany;
    }
}