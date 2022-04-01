import java.util.List;

public class Actiune extends Instrument implements Evaluabil {
    public double procentDividend;

    public Actiune(String simbol, List<Operatiune> operatiuni,double procentDividend) {
        super(simbol, operatiuni);
        this.procentDividend = procentDividend;
    }

    public double getProcentDividend() {
        return procentDividend;
    }

    @Override
    public String toString() {
        return "Actiune{" +
                "procentDividend=" + procentDividend +
                '}';
    }

    public void setProcentDividend(double procentDividend) {
        this.procentDividend = procentDividend;
    }
    @Override
    public double valoare()
    {
        double valoare = super.valoare();
        return valoare += (valoare * procentDividend) /100.0;
    }





}
