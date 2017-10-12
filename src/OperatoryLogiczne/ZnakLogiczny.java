package OperatoryLogiczne;

public abstract class ZnakLogiczny extends Wyrazenie {
    protected Boolean wartosc;

    ZnakLogiczny(Boolean wartosc) {
        this.wartosc = wartosc;
    }
}
