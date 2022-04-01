import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Instrument implements Evaluabil{
    private String simbol;
    private List<Operatiune> operatiuni;
    public Instrument()
    {

    }
    public Instrument(String simbol, List<Operatiune> operatiuni) {
        this.simbol = simbol;
        this.operatiuni = new ArrayList<Operatiune>();
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "simbol='" + simbol + '\'' +
                ", operatiuni=" + operatiuni +
                '}';
    }
    //metoda care sa adauge o noua operatiune pe un instrument
    public void adaugaOperatiune(Operatiune operatiune)
    {
        this.operatiuni.add(operatiune);
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public List<Operatiune> getOperatiuni() {
        return operatiuni;
    }

    public void setOperatiuni(List<Operatiune> operatiuni) {
        this.operatiuni = operatiuni;
    }

    @Override
    public double valoare() {
        double valoare = 0;
        for(var operatiune: this.operatiuni)
        {
            valoare+=operatiune.getCantitate()*operatiune.getPret()*operatiune.getTip().pozitie();
        }
        return valoare;
    }



    public static class Operatiune
    {
        private final TipOperatiune tip;
        private final LocalDate data;
        private final double pret;
        private final int cantitate;

        public Operatiune(TipOperatiune tip, LocalDate data, double pret, int cantitate) {
            this.tip = tip;
            this.data = data;
            this.pret = pret;
            this.cantitate = cantitate;
        }

        public TipOperatiune getTip() {
            return tip;
        }

        public LocalDate getData() {
            return data;
        }

        public double getPret() {
            return pret;
        }

        public int getCantitate() {
            return cantitate;
        }

        @Override
        public String toString() {
            return "Operatiune{" +
                    "tip=" + tip +
                    ", data=" + data +
                    ", pret=" + pret +
                    ", cantitate=" + cantitate +
                    '}';
        }
    }
}
/*
 Program intrumente financiare.
         *
         * Cerințe:
         *
         * 1. O clasa Instrument, care sa implementeze interfata Evaluabil si care contine urmatoarele atribute private:
        * symbol - String, o colectie de obiecte de tip Operatiune financiara
        * si o clasă internă statică Operatiune (tip - TipOperatiune, data - LocalDate, preț - număr cu zecimale, cantitate - întreg).
        *
        * Clasa Instrument va avea cel putin:
        *  - constructor cu parametri si fara parametri;
        *  - metode de citire pentru toate atributele;
        *  - posibilitatea de a adăuga operatiuni la un intrumentul financiar.
        *
        * 2. Clasa Operatiune trebuie să publica.
        *
        * 3. Interfata Evaluabil, defineste metoda double valoare(Intrument instrument), care returneaza double si
        * primeste ca parametru un Intrument financiar.
        *
        * 4. Un enum TipOperatiune cu valorile CUMPARARE, VANZARE și o metodă pozitie() care să dea directia operatiunii
        * financiare (-1 VANZARE, 1 CUMPARARE).
        *
        * 5. O clasa Actiune, derivata din Intrumnet si care implementeaza interfata Evaluabil. Are in plus un atribut privat double - procentDividend.
        *
        * 6. O clasa  PortofoliuGenerics<T> ce implementeaza o colectie generica de intrumente financiare. Are un atribut privat portofoliu ce
        * stocheaza colectia de obiecte <T> si contructori cu si fara parametri. Contine urmatoarele metode publice:
        *  getProtofoliu(),
        *  setPortofoliu(),
        *  adaugaIntrument(),
        *  getIntrument().
        *
        * Sa se creeze un program pentru popularea colectiei de intrumente financiare cu obiecte de tip Intrument si cu obiecte de tip Aciune.
        * Sa de afiseze continutul portofoliului, valoarea acestuia si data primei operatiuni financiare efectuate pentru fiecare intrument
        * financiar continut in portofoliu.
        *
        * */