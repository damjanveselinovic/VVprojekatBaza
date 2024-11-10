/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontroler;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.ZanrKnjige;



/**
 *
 * @author damja
 */
public class Kontroler {
    
    private List<Knjiga> listaKnjiga=new ArrayList<>();;
    private List<Autor> listaAutora=new ArrayList<>();;
    
    public static Kontroler instance;
    public static Kontroler getInstance(){
        if(instance==null){
            instance=new Kontroler();
        }
        return instance;
    }
    
    
    
    private Kontroler() {
        Autor autor1=new Autor("Ivo", "Andric", 1892, "Biografija Ivo A");
        Autor autor2=new Autor("Danilo", "Kis", 1899, "Biografija Danila");
        Autor autor3=new Autor("Mesa", "Selimovic", 1910, "Biografija Mese");
        
        Knjiga knjiga1=new Knjiga("Na drini cuprija", autor1,"1234567890", 1945,ZanrKnjige.POEZIJA);
        Knjiga knjiga2=new Knjiga("Basta", autor2,"1234567820", 1940, ZanrKnjige.DETEKTIVSKI);
        Knjiga knjiga3=new Knjiga("Tvrdjava", autor3,"44467890", 1976, ZanrKnjige.ROMAN);
        
        
        
        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);
        listaKnjiga.add(knjiga3);
        
        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);
        
              
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int selectedRed) {
       listaKnjiga.remove(selectedRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        listaKnjiga.add(novaKnjiga);
        
    }

    
    
    
    
}
