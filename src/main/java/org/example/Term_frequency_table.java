package org.example;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Term_frequency_table {
    public TreeMap<String, Integer> table;
    Consumer<String> incrementa_contatore=((s)->this.table.replace(s, this.table.get(s), this.table.get(s)+1));
    Consumer<String> inserisci_nuovo=((s)->this.table.put(s,1));

    public Term_frequency_table (String testo){
        this.table= new TreeMap<String, Integer>();
        while (!testo.isBlank()){
            if (testo.contains(" ")){
                this.inserisci(testo.substring(0, testo.indexOf(' ')));
                testo=testo.substring(testo.indexOf(' ')+1);
            }
            else{
                this.inserisci(testo);
                testo="";
            }
        }
    }

    public void inserisci(String termine){
        String t=termine.toLowerCase();
        if(this.table.containsKey(t)){
            incrementa_contatore.accept(t);
        }
        else{
            inserisci_nuovo.accept(t);
        }
    }

    public void saluta(){
        System.out.println("Ciaoooooooooooooooooooooooo");
    }


}
