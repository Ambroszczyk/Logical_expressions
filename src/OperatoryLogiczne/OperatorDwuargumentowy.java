package OperatoryLogiczne;

public abstract class OperatorDwuargumentowy extends Wyrazenie {
    protected Wyrazenie lewy;
    protected Wyrazenie prawy;

    public String toString() {
        String StrLewy = lewy.toString();
        String StrPrawy = prawy.toString();

        if (lewy.priorytet() <= priorytet()) {
            StrLewy = "(" + StrLewy + ")";
        }

        if (prawy.priorytet() <= priorytet()) {
            StrPrawy = "(" + StrPrawy + ")";
        }

        return StrLewy + operator()+ StrPrawy;
    }

    protected abstract String operator();

    protected OperatorDwuargumentowy(Wyrazenie lewy, Wyrazenie prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }
}
