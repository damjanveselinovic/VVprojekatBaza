/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Autor;
import model.Knjiga;
import model.ZanrKnjige;

/**
 *
 * @author damja
 */
public class DBBroker {

    public List<Knjiga> ucitajListuKnjigaIzBaze() {       
        List<Knjiga> lista=new ArrayList<>();
        try {
            String upit="SELECT * FROM KNJIGA k JOIN AUTOR a ON k.autorid=a.id";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs =st.executeQuery(upit);
            
            while(rs.next()){
                int id=rs.getInt("k.id");
                String naslov=rs.getString("k.naslov");
                int godIzdanja=rs.getInt("k.godinaIzdanja");
                String isbn=rs.getString("k.isbn");
                String zanr=rs.getString("k.zanr");
                ZanrKnjige z=ZanrKnjige.valueOf(zanr);
                
                String ime=rs.getString("a.ime");
                String prezime=rs.getString("a.prezime");
                String biografija=rs.getString("a.biografija");
                int ida=rs.getInt("a.id");
                int godRodj=rs.getInt("a.godinaRodjenja");
                
                Autor a=new Autor(ida, ime, prezime, godRodj, biografija);
                Knjiga k=new Knjiga(id, naslov, a, isbn, godIzdanja, z);
                lista.add(k);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    return lista;
     
    }

    public List<Autor> getListaAutoraIzBaze() {
        List<Autor> lista=new ArrayList<>();
        try {
            String upit="SELECT * FROM AUTOR a";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs =st.executeQuery(upit);
            
            while(rs.next()){
               
                
                String ime=rs.getString("a.ime");
                String prezime=rs.getString("a.prezime");
                String biografija=rs.getString("a.biografija");
                int ida=rs.getInt("a.id");
                int godRodj=rs.getInt("a.godinaRodjenja");
                
                Autor a=new Autor(ida, ime, prezime, godRodj, biografija);
                
                lista.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    return lista;
    }

    public void obrisiKnjigu(int id) {
       
        try {
            String upit="DELETE FROM KNJIGA WHERE id=?";
            PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, id);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        try {
            String upit="INSERT INTO knjiga (id, naslov, autorid, isbn, godinaIzdanja, zanr)"+" VALUES (?,?,?,?,?,?)";
            PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, novaKnjiga.getId());
            ps.setString(2, novaKnjiga.getIme());
            ps.setInt(3, novaKnjiga.getAutor().getId());
            ps.setString(4, novaKnjiga.getISBN());
            ps.setInt(5, novaKnjiga.getGodinaIzdanja());
            ps.setString(6, String.valueOf(novaKnjiga.getZanr()));
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("Uspehhh");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void azurirajKnjiguUBazi(Knjiga knjigaZaIzmenu) {
        try {
            String upit="UPDATE KNJIGA SET naslov=?, autorid=?, godinaIzdanja=?, "+"zanr=? where id=?";
            PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
            
            ps.setString(1, knjigaZaIzmenu.getIme());
            ps.setInt(2, knjigaZaIzmenu.getAutor().getId());
            
            ps.setInt(3, knjigaZaIzmenu.getGodinaIzdanja());
            ps.setString(4, String.valueOf(knjigaZaIzmenu.getZanr()));
            
            ps.setInt(5,knjigaZaIzmenu.getId());
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("bravo");
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login2(String username, String password) {
        try {
            String upit="SELECT * FROM User WHERE username=? AND password=?";
            PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

   /* public List<Knjiga> filtriraj2(String autor, String naziv) {
        String upit="SELECT naslov,ime,prezime FROM knjiga k join autor a on k.autorid=a.id "
                + "WHERE 1=1";
        if(naziv!=null){
            upit+="AND k.naslov=?";
        }
        if(autor!=null){
            String[] podaci=autor.split(" ");
            if(podaci[0]!=null){
                upit+="AND a.ime=?";
            }
            if(podaci[1]!=null){
                upit+="AND a.prezime=?";   
            }
             
        }
        PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
        ps.setString(1, naziv);
       
        ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                int id=rs.getInt("k.id");
                String naslov=rs.getString("k.naslov");
                int godIzdanja=rs.getInt("k.godinaIzdanja");
                String isbn=rs.getString("k.isbn");
                String zanr=rs.getString("k.zanr");
                ZanrKnjige z=ZanrKnjige.valueOf(zanr);
                
                String ime=rs.getString("a.ime");
                String prezime=rs.getString("a.prezime");
                String biografija=rs.getString("a.biografija");
                int ida=rs.getInt("a.id");
                int godRodj=rs.getInt("a.godinaRodjenja");
                
                Autor a=new Autor(ida, ime, prezime, godRodj, biografija);
                Knjiga k=new Knjiga(id, naslov, a, isbn, godIzdanja, z);
                lista.add(k);
            }
        
    }*/

    
}