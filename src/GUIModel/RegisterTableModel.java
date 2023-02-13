/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Register;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OEM
 */
public class RegisterTableModel extends AbstractTableModel{
    List<Register> list;
    String [] cols = {"Name","Surname","Username","Password"};
    
    public RegisterTableModel(){}
    
    public RegisterTableModel(List<Register> list){
        this.list = list;
    }
    
    public void addList(List<Register> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Register getRegister(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Register r = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return r.getName();
            case 1:
                return r.getSurname();
            case 2:
                return r.getUsername();
            case 3:
                return r.getPassword();
            default:
                return null;
        }
    }
}

