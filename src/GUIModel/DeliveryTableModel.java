package GUIModel;

import BLL.Delivery;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OEM
 */
public class DeliveryTableModel extends AbstractTableModel{
    List<Delivery> listDelivery;
    String [] cols = {"TicketNr","Type","Price","Menyra Pageses"};
    
    public DeliveryTableModel(){}
    
    public DeliveryTableModel( List<Delivery> listDelivery){
        this.listDelivery = listDelivery;
    }
    
    public void addListDelivery(List<Delivery> listDelivery){
        this.listDelivery = listDelivery;
    }   
    @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return listDelivery.size();
    }
    
    public void remove(int row){
        listDelivery.remove(row);
    }
    
    public Delivery getDelivery(int index){
        return listDelivery.get(index);
    }
    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Delivery d = listDelivery.get(rowIndex);
        switch(columnIndex){
            case 0:
                return d.getTicketNr();
            case 1:
                return "Delivery";
            case 2:
                return d.getPrice();
            case 3:
                return d.getPaymentMethod();
                
            default:
                return null;
        }
    }
    
}


