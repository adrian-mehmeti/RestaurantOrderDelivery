/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIView;

import BLL.Ordery;
import BLL.Product;
import DAL.CrudFormException;
import DAL.OrderyRepository;
import DAL.ProductRepository;
import java.awt.Dimension;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.criteria.Order;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OEM
 */
public class ConfirmOrderUser extends javax.swing.JInternalFrame {

    
    
    private int TicketNr = 10;
    OrderyRepository or = new OrderyRepository();
    
    public ConfirmOrderUser() {
        initComponents();
        addRowToTable(); 
        calculo();
        TicketNr++;
    }
    
/**
     * Creates new form ConfirmOrderUser
     */
        ArrayList<Double> listaa = null;
        private void addRowToTable(){
          DefaultTableModel model = (DefaultTableModel)table.getModel();
          ArrayList <String> lista = CreateOrderUser.getOrderChoose();
          ArrayList<Integer> list = CreateOrderUser.listaSasia;
          listaa = CreateOrderUser.listaPrice;
          Object rowData[] = new Object[3];
          for(int i=0;i<lista.size();i++){
              rowData[0] =lista.get(i);
              rowData[1] = list.get(i);
              rowData[2] = listaa.get(i);
              model.addRow(rowData);
          }
        }
        
        double shuma = 0;
        private void calculo(){
            double tvsh = 0.18;
            listaa = CreateOrderUser.listaPrice;
            for(Double b : listaa){
                shuma+=b;
            }
            double paTVSH = shuma - (shuma*tvsh);
            String str = String.format("%.2f", paTVSH);
            qmimiMeTVSHField.setText(String.valueOf(shuma));
            qmimiPaTVSHField.setText(str);
            qmimiField.setText(String.valueOf(shuma)); 
            ticketNrField.setText(String.valueOf(TicketNr));
        }
        
        private void clear(){
            qmimiMeTVSHField.setText("");
            qmimiPaTVSHField.setText("");
            qmimiField.setText("");
            ticketNrField.setText("");
            table.clearSelection();
        }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmOrderDesktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        ticketNrField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qmimiMeTVSHField = new javax.swing.JTextField();
        qmimiPaTVSHField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qmimiField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(857, 620));

        confirmOrderDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Ticket Nr.");

        ticketNrField.setEditable(false);
        ticketNrField.setText("3");

        jLabel2.setText("Qmimi me TVSH");

        jLabel3.setText("Qmimi pa TVSH");

        jLabel4.setText("Qmimi");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "Sasia", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        confirmOrderDesktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(ticketNrField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(qmimiMeTVSHField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(qmimiPaTVSHField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(qmimiField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(cancelButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(confirmButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmOrderDesktopPane.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout confirmOrderDesktopPaneLayout = new javax.swing.GroupLayout(confirmOrderDesktopPane);
        confirmOrderDesktopPane.setLayout(confirmOrderDesktopPaneLayout);
        confirmOrderDesktopPaneLayout.setHorizontalGroup(
            confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmOrderDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmOrderDesktopPaneLayout.createSequentialGroup()
                        .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmOrderDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)))
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qmimiField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qmimiMeTVSHField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qmimiPaTVSHField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(335, 335, 335))
            .addGroup(confirmOrderDesktopPaneLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmOrderDesktopPaneLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(confirmOrderDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketNrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        confirmOrderDesktopPaneLayout.setVerticalGroup(
            confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmOrderDesktopPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketNrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qmimiMeTVSHField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qmimiPaTVSHField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(qmimiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(confirmOrderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(confirmOrderDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(confirmOrderDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         CreateOrderUser cou =  new CreateOrderUser();
         cou.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        try{
        Ordery o = new Ordery();
        o.setTicketNr(TicketNr);
        o.setPrice(shuma);
        or.create(o);
        JOptionPane.showMessageDialog(this, "Ju keni bere nje Order");
        clear();
        }catch(CrudFormException efx){
            JOptionPane.showMessageDialog(this, "Nuk mund te insertoni");
        }
        CreateOrderUser cou = new CreateOrderUser();
        cou.setVisible(true);
    }//GEN-LAST:event_confirmButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    protected javax.swing.JDesktopPane confirmOrderDesktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField qmimiField;
    private javax.swing.JTextField qmimiMeTVSHField;
    private javax.swing.JTextField qmimiPaTVSHField;
    private javax.swing.JTable table;
    private javax.swing.JTextField ticketNrField;
    // End of variables declaration//GEN-END:variables


}