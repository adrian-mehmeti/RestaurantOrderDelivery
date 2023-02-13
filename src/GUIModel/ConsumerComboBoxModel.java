/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Consumer;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author OEM
 */
public class ConsumerComboBoxModel extends AbstractListModel<Consumer> implements ComboBoxModel<Consumer>{
    
    private List<Consumer> data;
    private Consumer selectedItem;
    
    public  ConsumerComboBoxModel(){}
    
    public ConsumerComboBoxModel(List<Consumer> data){
        this.data = data;
    }
    
    public void addList(List<Consumer> data){
        this.data = data;
    }
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Consumer getElementAt(int index) {
      return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Consumer)anItem;
    }

    @Override
    public Object getSelectedItem() {
       return selectedItem;
    }
    
}
