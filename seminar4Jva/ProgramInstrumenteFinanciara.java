import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProgramInstrumenteFinanciara {
    public static void Main(String[] args )
    {
        Instrument i1 = new Instrument();
        i1.setSimbol("BRD");
        Instrument.Operatiune op1 = new Instrument.Operatiune(TipOperatiune.CUMPARARE,
                LocalDate.now(),250,3);
        Instrument.Operatiune op2 = new Instrument.Operatiune(TipOperatiune.VANZARE,
                LocalDate.now(),250,30);
        Instrument.Operatiune op3 = new Instrument.Operatiune(TipOperatiune.CUMPARARE,
                LocalDate.now(),250,37);
        List<Instrument.Operatiune> opList = new ArrayList<>();
        Collections.addAll(opList,op1,op2,op3);
        i1.setOperatiuni(opList);
        PortofoliuGenerics<Instrument> portofoliu = new PortofoliuGenerics<>();
        portofoliu.adaugaInstrument(i1.getSimbol(),i1);
        Actiune a1 = new Actiune("BCR", opList,2.5);
        portofoliu.adaugaInstrument(a1.getSimbol(),a1);
        /*
        for(var instrument: portofoliu.getPortofoliu().entrySet())
        {
            System.out.println(instrument);
            valoare += instrument.getValue().valoare();
            LocalDate data = instrument.getValue().valoare();
        }

         */

    }



}
