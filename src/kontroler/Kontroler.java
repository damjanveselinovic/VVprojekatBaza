/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontroler;

import baza.DBBroker;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import model.Autor;
import model.Knjiga;
import model.ZanrKnjige;



/**
 *
 * @author damja
 */
public class Kontroler {
    
    private DBBroker dbb;
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
        dbb=new DBBroker();
        
        
        
        
        
        
        
        
        
        
        /*Autor autor1=new Autor("Ivo", "Andric", 1892, "Biografija Ivo A");
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
        listaAutora.add(autor3);*/
        
              
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

    public void obrisiKnjigu(int id) {
        dbb.obrisiKnjigu(id);
        
        
        
       //listaKnjiga.remove(selectedRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        
        dbb.dodajKnjigu(novaKnjiga);
        //listaKnjiga.add(novaKnjiga);
        
    }

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
        this.listaKnjiga=dbb.ucitajListuKnjigaIzBaze();                       //dodatno cuvamo u lokalnoj memoriji 
        return this.listaKnjiga;                                   
    
    
    
    }

    public List<Autor> getListaAutoraIzBaze() {
        return dbb.getListaAutoraIzBaze();
        
    }

    public void azurirajKnjiguUBazi(Knjiga knjigaZaIzmenu) {
        dbb.azurirajKnjiguUBazi(knjigaZaIzmenu);
    }

    public boolean login2(String username, String password) {
        return dbb.login2(username,password);
        
        
        
    }

    public List<Knjiga> filtriraj(String autor, String naziv) {
        List<Knjiga> rezultat=new ArrayList<>();
        
        if(autor!=null && naziv==null){
            for(Knjiga k: listaKnjiga){
                String autorKnjiga=k.getAutor().getIme()+" "+k.getAutor().getPrezime();
                if(autorKnjiga.contains(autor)){
                    rezultat.add(k);
                    
                }
            
            }
          
        }
        if(autor==null && naziv!=null){
            for(Knjiga k: listaKnjiga){
                if(k.getIme().contains(naziv)){
                    rezultat.add(k);
                }
            }
            
        }
        if(autor!=null && naziv!=null){
            for(Knjiga k: listaKnjiga){
                String autorKnjiga=k.getAutor().getIme()+" "+k.getAutor().getPrezime();
                if(autorKnjiga.contains(autor)&& k.getIme().contains(naziv)){
                    rezultat.add(k);
                }
            }
        }
        //mislim da je ovo za liste lokalno!!!!!!!!!!!
        
        
       // List<Knjiga> rezultat2=new ArrayList<>();
       // rezultat2=listaKnjiga.stream()
        //        .filter(k->(naziv!=null && k.getIme().contains(naziv)) &&
       //         (autor!=null && (k.getAutor().getIme()+" "+k.getAutor().getPrezime()).contains(autor) )).collect(Collectors.toList());
        
        
        
                
                
                
     
        
        return rezultat;
       
    }

   // public List<Knjiga> filtriraj2(String autor, String naziv) {
    //    return dbb.filtriraj2(autor,naziv);
    //}

    
    
    
    
}
