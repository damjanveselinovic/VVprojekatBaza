/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author damja
 */
public class Knjiga {
    
   private int id;
   private String ime;
   private Autor autor;
   private String ISBN;
   private int godinaIzdanja;
   private ZanrKnjige zanr;

    public Knjiga(String ime, Autor autor, String ISBN, int godinaIzdanja, ZanrKnjige zanr) {
        this.ime = ime;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }

    public Knjiga(int id, String ime, Autor autor, String ISBN, int godinaIzdanja, ZanrKnjige zanr) {
        this.id = id;
        this.ime = ime;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }
    
    

   
    

    
   
   
   

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public ZanrKnjige getZanr() {
        return zanr;
    }

    public void setZanr(ZanrKnjige zanr) {
        this.zanr = zanr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

    @Override
    public String toString() {
        return "Knjiga{" + "ime=" + ime + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + '}';
    }
   
   
    
}
