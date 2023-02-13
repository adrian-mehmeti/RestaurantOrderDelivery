/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIView;

import BLL.Product;
import DAL.CrudFormException;
import DAL.ProductRepository;
import GUIModel.ProductTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author OEM
 */
public class DrinksAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form BreakfastAdmin
     */
    ProductRepository pr = new ProductRepository();
    ProductTableModel ptm = new ProductTableModel();
    public DrinksAdmin() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
    }
    
    private void loadTable(){
        try{
            List<Product> lista = pr.findByTipi("drink");
            ptm.addList(lista);
            table.setModel(ptm);
            ptm.fireTableDataChanged();
        }catch(CrudFormException ex){
            Logger.getLogger(BreakfastAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
     
     private void tabelaSelectedIndexChange(){
        final ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener(){
            
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    return;
                }
                
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Product p = ptm.getProduct(selectedIndex);
                    double nr = p.getPrice();
                    nameField.setText(p.getName());
                    priceField.setText(String.valueOf(nr));
                }
            }
        
        
        });
        
    }
     
      private void clear(){
        table.clearSelection();
        nameField.setText("");
        priceField.setText("");
    }
      
      private boolean check(){
          if(nameField == null || nameField.getText().trim().isEmpty()){
               return false;
          }
          if(priceField.getText().isEmpty()  || priceField == null){
              return false;
          }
          
          return true;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(800, 630));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Drinks");

        jLabel2.setText("Name");

        jLabel3.setText("Price");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(priceField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(addButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(deleteButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(editButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        if(check())
            try{
               int row = table.getSelectedRow();
               if(row == -1){
                   Product p = new Product();
                   p.setName(nameField.getText());
                   p.setPrice(Double.parseDouble(priceField.getText()));
                   p.setTipi("drink");
                   pr.create(p);
                   JOptionPane.showMessageDialog(this, "Produkti u krijua me sukses");
               clear();
               loadTable();
              }
           }catch(CrudFormException ex){
               JOptionPane.showMessageDialog(this, "E dhena ekziston");
           }
        else{
             JOptionPane.showMessageDialog(this, "Ju lutem plotesoni te gjitha fushat");
            clear();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row != -1 ) {
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this, "A deshironi te fshini", "Fshirja",JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,ob,ob[1]);
            if(i == 0){
                Product p = ptm.getProduct(row);
                try{
                    pr.delete(p);
                }catch(CrudFormException ex){
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                 clear();
                loadTable();
            }else{
                clear();
                
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar agjse per te fshir");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        try{
        int row = table.getSelectedRow();
        if(row != -1){
             Product p = ptm.getProduct(row);
             p.setName(nameField.getText());
             p.setPrice(Double.parseDouble(priceField.getText()));
             pr.edit(p);
             clear();
            loadTable();
        }
        }catch(CrudFormException ec){
            ec.printStackTrace();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}