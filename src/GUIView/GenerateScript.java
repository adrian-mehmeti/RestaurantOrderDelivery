/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIView;

import BLL.Consumer;
import BLL.Product;
import DAL.ConsumerRepository;
import DAL.CrudFormException;
import DAL.ProductRepository;
import GUIModel.ConsumersModel;
import GUIModel.ProductTableModel;
import GUIModel.ProductsModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author OEM
 */
public class GenerateScript extends javax.swing.JInternalFrame {

    /**
     * Creates new form GenerateScript
     */
    ProductRepository pr = new ProductRepository();
    ConsumerRepository cr = new ConsumerRepository();
    public GenerateScript() {
        initComponents();
    }
             
    private void GenerateProduct() throws FileNotFoundException, JRException, CrudFormException{
        List <Product> list = pr.findAll();
        Iterator<Product> it = list.iterator();
        
        List <ProductsModel> listItems = new ArrayList<ProductsModel>();
        
        while(it.hasNext()){
            Product temp5 = it.next();
            listItems.add(new ProductsModel(temp5.getProductID(),temp5.getName(),temp5.getPrice(),temp5.getTipi()));
        }		
		
        
        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBEAN = new JRBeanCollectionDataSource(listItems);
        
        /* Map to hold Jasper report Parameters */
        Map<String,Object> parameters = new HashMap<String,Object>();
        parameters.put("CollectionBeanParam", itemsJRBEAN);
        
        //read jrxml file and creating jasperdesign object
        InputStream input  = new FileInputStream(new File("C:\\Users\\OEM\\Desktop\\template\\Product.jrxml"));
       
        JasperDesign jasperDesign = JRXmlLoader.load(input);
        
        /*compiling jrxml with help of JasperReport class*/
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        
         /* Using jasperReport object to generate PDF */
        JasperPrint jasperPrint =  JasperFillManager.fillReport(jasperReport, parameters,new JREmptyDataSource());
        
         /*call jasper engine to display report in jasperviewer window*/
        JasperViewer.viewReport(jasperPrint);
       
        System.out.println("File Generated");	
    }
    
    
     private void GenerateConsumer() throws FileNotFoundException, JRException, CrudFormException{
        String outputFile = "C:\\Users\\OEM\\Desktop\\template\\consumermodel.pdf";
        
        List <Consumer> list = cr.findAll();
        Iterator<Consumer> it = list.iterator();
        
        List <ConsumersModel> listItems = new ArrayList<ConsumersModel>();
        
        while(it.hasNext()){
            Consumer temp = it.next();
            listItems.add(new ConsumersModel(temp.getConsumerID(),temp.getName(),temp.getSurname(),temp.getAdress(),temp.getCity(),temp.getPostCode(),temp.getEmail(),temp.getTelephone()));
        }
         
        
        
        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBEAN = new JRBeanCollectionDataSource(listItems);
       
         /* Map to hold Jasper report Parameters */
        Map<String,Object> parameters = new HashMap<String,Object>();
        parameters.put("CollectionBeanParam", itemsJRBEAN);
        
         //read jrxml file and creating jasperdesign object
        InputStream input  = new FileInputStream(new File("C:\\Users\\OEM\\Desktop\\template\\Consumer.jrxml"));
        
        JasperDesign jasperDesign = JRXmlLoader.load(input);
       
        /*compiling jrxml with help of JasperReport class*/
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
       
        /* Using jasperReport object to generate PDF */
        JasperPrint jasperPrint =  JasperFillManager.fillReport(jasperReport, parameters,new JREmptyDataSource());
       
         /*call jasper engine to display report in jasperviewer window*/
        JasperViewer.viewReport(jasperPrint);
        
        OutputStream outputStream = new FileOutputStream(new File(outputFile));
        
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
       
        System.out.println("File Generated");	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CostumersButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 630));

        CostumersButton.setText("Costumers");
        CostumersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostumersButtonActionPerformed(evt);
            }
        });

        ProductButton.setText("Product");
        ProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Generate script for Products");

        jLabel2.setText("Generate script for Consumer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CostumersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(ProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CostumersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CostumersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostumersButtonActionPerformed
        try {
            // TODO add your handling code here:
            GenerateConsumer();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CrudFormException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CostumersButtonActionPerformed

    private void ProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductButtonActionPerformed
        try {
            // TODO add your handling code here:
            GenerateProduct();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CrudFormException ex) {
            Logger.getLogger(GenerateScript.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ProductButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CostumersButton;
    private javax.swing.JButton ProductButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
