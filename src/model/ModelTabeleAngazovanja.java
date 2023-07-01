/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import domen.Angazovanje;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mafija
 */
public class ModelTabeleAngazovanja extends AbstractTableModel{

    ArrayList<Angazovanje> lista;
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    
    public ModelTabeleAngazovanja(){
        lista = new ArrayList<>();
    }

    public ModelTabeleAngazovanja(ArrayList<Angazovanje> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Angazovanje a = lista.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return a.getPredmet().getNazivPredmeta();
            case 1: 
                if(a.getProfesor() != null){
                    return a.getProfesor();
                }else{
                    return "Nije jos unet profesor";
                }
            case 2: return sdf.format(a.getDatum());
            case 3: return a.getStatus();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Predmet";
            case 1: return "Profesor";
            case 2: return "Datum";
            case 3: return "Status";
            default:
                return "N/A";
        }
    }

    public ArrayList<Angazovanje> getLista() {
        return lista;
    }
    
    public void dodajAngazovanje(Angazovanje a){
        a.setStatus("NOVI");
        lista.add(a);
        fireTableDataChanged();
    }
    
    public void obrisiAngazovanje(int red){
        lista.remove(red);
        fireTableDataChanged();
    }
    
}
