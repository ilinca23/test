public enum TipOperatiune {
    CUMPARARE,
    VANZARE;
    private int direction;
    public int pozitie()
    {
        if(TipOperatiune.valueOf("CUMPARARE") == this)
            return 1;
        else
            return -1;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
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

