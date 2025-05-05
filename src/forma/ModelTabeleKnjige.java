/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author damja
 */
public class ModelTabeleKnjige extends AbstractTableModel {
    
    private List<Knjiga> listaKnjiga;
    private final String[] kolone={"id","Naslov","Autor","ISBN","Godina"};

    public ModelTabeleKnjige(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    
    
    
    @Override
    public int getRowCount() {
        return listaKnjiga.size();
             
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga knjiga=listaKnjiga.get(rowIndex);
        switch (columnIndex){
            case 1:
                return knjiga.getIme();
            case 2:
                return knjiga.getAutor().getIme()+" "+knjiga.getAutor().getPrezime();
            case 3:
                return knjiga.getISBN();
            case 4:
                return knjiga.getGodinaIzdanja();
            case 0:
                return knjiga.getId();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    void osveziPodatke() {
        fireTableDataChanged();
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }
    
    
    
}
