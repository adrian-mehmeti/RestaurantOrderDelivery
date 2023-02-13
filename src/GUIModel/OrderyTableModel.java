/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Ordery;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OEM
 */
public class OrderyTableModel extends AbstractTableModel{
    List<Ordery> listOrdery;
    String [] cols = {"TicketNr","Type","Price"};
    
    public OrderyTableModel(){}
    
    public OrderyTableModel( List<Ordery> listOrdery){
        this.listOrdery = listOrdery;
    }
    
    public void addListOrdery(List<Ordery> listOrdery){
        this.listOrdery = listOrdery;
    }   
    @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return listOrdery.size();
        
    }
     
    
    public void remove(int row){
        listOrdery.remove(row);
    }
    
    public Ordery getOrdery(int index){
        return listOrdery.get(index);
    }
    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ordery o = listOrdery.get(rowIndex);
        switch(columnIndex){
            case 0:
                return o.getTicketNr();
            case 1:
                return "Ordery";
            case 2:
                return o.getPrice();
            default:
                return null;
        }
    }
    
}
