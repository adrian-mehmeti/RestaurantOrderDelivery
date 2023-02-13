/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Product;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OEM
 */
public class ProductTableModel extends AbstractTableModel{
    List<Product> list;
    String [] cols = {"Name","price"};
    
    public ProductTableModel(){}
    
    public ProductTableModel(List<Product> list){
        this.list = list;
    }
    
    public void addList(List<Product> list){
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
    
    public Product getProduct(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getName();
            case 1:
                return p.getPrice();
            default:
                return null;
        }
    }
}
