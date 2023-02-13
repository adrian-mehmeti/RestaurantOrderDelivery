/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIView;

import BLL.Product;
import DAL.CrudFormException;
import DAL.ProductRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OEM
 */
public class CreatesDeliveryUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreatesDeliveryUser
     */
    ProductRepository pr = new ProductRepository();
    public CreatesDeliveryUser() {
        initComponents();
        try {
            setBreaksFast();
            setSalad();
            setBurger();
            setDrinks();
        } catch (CrudFormException ex) {
            Logger.getLogger(CreateOrderUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static double breakfast1Price = 0;
    private static double breakfast2Price = 0;
    private static double breakfast3Price = 0;
    private void setBreaksFast() throws CrudFormException{
        List<Product> lista = pr.findByTipi("mengjes");
        Iterator<Product> it = lista.iterator();
        
        if(it.hasNext()){
           Product p = it.next();
            breakfastCheckBox.setText(p.getName());
            breakfast1Price = p.getPrice();
        }else{
            breakfastCheckBox.setVisible(false);
            breakfastSpinner.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            breakfastCheckBox1.setText(p.getName());
            breakfast2Price = p.getPrice();
        }else{
            breakfastCheckBox1.setVisible(false);
            breakfastSpinner1.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            breakfastCheckBox2.setText(p.getName());
            breakfast3Price = p.getPrice();
        }else{
            breakfastCheckBox2.setVisible(false);
            breakfastSpinner2.setVisible(false);
        }     
    }
    
    
    private static double salad1Price = 0;
    private static double salad2Price = 0;
    private static double salad3Price = 0;
    private void setSalad() throws CrudFormException{
        List<Product> lista = pr.findByTipi("salad");
        Iterator<Product> it = lista.iterator();
        if(it.hasNext()){
            Product p = it.next();
           saladCheckBox.setText(p.getName());
           salad1Price = p.getPrice();
        }else{
            saladCheckBox.setVisible(false);
            saladSpinner.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            saladCheckBox1.setText(p.getName());
            salad2Price = p.getPrice();
        }else{
            saladCheckBox1.setVisible(false);
            saladSpinner1.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            saladCheckBox2.setText(p.getName());
            salad3Price = p.getPrice();
        }else{
            saladCheckBox2.setVisible(false);
            saladSpinner2.setVisible(false);
        }  
    }
    
    
    private static double burger1Price = 0;
    private static double burger2Price = 0;
    private static double burger3Price = 0;
    private void setBurger() throws CrudFormException{
        List<Product> lista = pr.findByTipi("burger");
        Iterator<Product> it = lista.iterator();
        if(it.hasNext()){
           Product p = it.next();
           burgerCheckBox.setText(p.getName());
           burger1Price = p.getPrice();
        }else{
            burgerCheckBox.setVisible(false);
            burgerSpinner.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            burgerCheckBox1.setText(p.getName());
            burger2Price = p.getPrice();
        }else{
            burgerCheckBox1.setVisible(false);
            burgerSpinner1.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            burgerCheckBox2.setText(p.getName());
            burger3Price = p.getPrice();
        }else{
            burgerCheckBox2.setVisible(false);
            burgerSpinner2.setVisible(false);
        }  
    }
    
    
    private static double drinks1Price = 0;
    private static double drinks2Price = 0;
    private static double drinks3Price = 0;
    private void setDrinks() throws CrudFormException{
         List<Product> lista = pr.findByTipi("drink");
        Iterator<Product> it = lista.iterator();
        if(it.hasNext()){
            Product p = it.next();
           drinkCheckBox.setText(p.getName());
           drinks1Price = p.getPrice();
        }else{
            drinkCheckBox.setVisible(false);
            drinksSpinner.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            drinkCheckBox1.setText(p.getName());
            drinks2Price = p.getPrice();
        }else{
           drinkCheckBox1.setVisible(false);
           drinksSpinner1.setVisible(false);
        }
        if(it.hasNext()){
            Product p = it.next();
            drinkCheckBox2.setText(p.getName());
            drinks3Price = p.getPrice();
        }else{
            drinkCheckBox2.setVisible(false);
            drinksSpinner2.setVisible(false);
        }  
    }
    
    
    static ArrayList <String> list = null;
    static ArrayList <Integer> listaSasia = null;
    static ArrayList <Double> listaPrice = null;
    static ArrayList getOrderChoose(){
        list = new ArrayList<String>();
        listaSasia = new ArrayList<Integer>();
        listaPrice  = new ArrayList<Double>();
        if(breakfastCheckBox.isSelected()){
            list.add(breakfastCheckBox.getText());
            listaSasia.add((int)breakfastSpinner.getValue());
            listaPrice.add(breakfast1Price * ((int)breakfastSpinner.getValue()));
        }
        
        if(breakfastCheckBox1.isSelected()){
             list.add(breakfastCheckBox1.getText());
            listaSasia.add((int)breakfastSpinner1.getValue());
            listaPrice.add(breakfast2Price * ((int)breakfastSpinner1.getValue()));
        }
        
        if(breakfastCheckBox2.isSelected()){
            list.add(breakfastCheckBox2.getText());
           listaSasia.add((int)breakfastSpinner2.getValue());
           listaPrice.add(breakfast3Price * ((int)breakfastSpinner2.getValue()));
        }
        
        if(saladCheckBox.isSelected()){
            list.add(saladCheckBox.getText());
            listaSasia.add((int)saladSpinner.getValue());
            listaPrice.add(salad1Price * ((int)saladSpinner.getValue()));
        }
        
        if(saladCheckBox1.isSelected()){
           list.add(saladCheckBox1.getText());
           listaSasia.add((int)saladSpinner1.getValue());
           listaPrice.add(salad2Price * ((int)saladSpinner1.getValue()));
        }
        
        if(saladCheckBox2.isSelected()){
            list.add(saladCheckBox2.getText());
            listaSasia.add((int)saladSpinner2.getValue());
            listaPrice.add(salad3Price * ((int)saladSpinner2.getValue()));
        }
        
        if(burgerCheckBox.isSelected()){
           list.add(burgerCheckBox.getText());
           listaSasia.add((int)burgerSpinner.getValue());
           listaPrice.add(burger1Price * ((int)burgerSpinner.getValue()));
        }
        
        if(burgerCheckBox1.isSelected()){
            list.add(burgerCheckBox1.getText());
            listaSasia.add((int)burgerSpinner1.getValue());
            listaPrice.add(burger2Price * ((int)burgerSpinner1.getValue()));
        }
        
        if(burgerCheckBox2.isSelected()){
            list.add(burgerCheckBox2.getText());
           listaSasia.add((int)burgerSpinner2.getValue());
           listaPrice.add(burger3Price * ((int)burgerSpinner2.getValue()));
        }
        
        if(drinkCheckBox.isSelected()){
            list.add(drinkCheckBox.getText());
            listaSasia.add((int)drinksSpinner.getValue());
            listaPrice.add(drinks1Price * ((int)drinksSpinner.getValue()));
        }
        if(drinkCheckBox1.isSelected()){
            list.add(drinkCheckBox.getText());
           listaSasia.add((int)drinksSpinner1.getValue());
           listaPrice.add(drinks2Price * ((int)drinksSpinner1.getValue()));
        }
        if(drinkCheckBox2.isSelected()){
            list.add(drinkCheckBox.getText());
            listaSasia.add((int)drinksSpinner2.getValue());
            listaPrice.add(drinks3Price * ((int)drinksSpinner2.getValue()));
        }
     return list;
 }
    
    
    
    private void clearCheck(){
        breakfastCheckBox.setSelected(false);
        breakfastCheckBox2.setSelected(false);
        breakfastCheckBox1.setSelected(false);
        saladCheckBox.setSelected(false);
        saladCheckBox1.setSelected(false);
        saladCheckBox2.setSelected(false);
        burgerCheckBox.setSelected(false);
        burgerCheckBox1.setSelected(false);
        burgerCheckBox2.setSelected(false);
        drinkCheckBox.setSelected(false);
        
        
        breakfastSpinner.setValue(0);
        breakfastSpinner1.setValue(0);
        breakfastSpinner2.setValue(0);
        saladSpinner.setValue(0);
        saladSpinner1.setValue(0);
        saladSpinner2.setValue(0);
        burgerSpinner.setValue(0);
        burgerSpinner1.setValue(0);
        burgerSpinner2.setValue(0);
        drinksSpinner.setValue(0);
        
    }
    
    private boolean check(){
        if(breakfastCheckBox.isSelected()){
          if(((int)breakfastSpinner.getValue()) <= 0)
              return false;  
        }
        
        if(breakfastCheckBox1.isSelected()){
            if(((int)breakfastSpinner1.getValue()) <= 0)
                return false;
        }
        
        if(breakfastCheckBox2.isSelected()){
           if(((int)breakfastSpinner2.getValue()) <= 0)
               return false;
        }
        
        if(saladCheckBox.isSelected()){
           if(((int)saladSpinner.getValue()) <= 0)
               return false;
        }
        
        if(saladCheckBox1.isSelected()){
           if(((int)saladSpinner1.getValue()) <= 0)
               return false;
        }
        
        if(saladCheckBox2.isSelected()){
            if(((int)saladSpinner2.getValue()) <= 0)
                return false;
        }
        
        if(burgerCheckBox.isSelected()){
           if(((int)burgerSpinner.getValue()) <= 0)
               return false;
        }
        
        if(burgerCheckBox1.isSelected()){
           if(((int)burgerSpinner1.getValue()) <= 0)
               return false;
        }
        
        if(burgerCheckBox2.isSelected()){  
           if(((int)burgerSpinner2.getValue()) <= 0)
               return false;
        }
        
        if(drinkCheckBox.isSelected()){
            if(((int)drinksSpinner.getValue()) <= 0)
                return false;
        }
        if(drinkCheckBox1.isSelected()){
           if(((int)drinksSpinner1.getValue()) <= 0)
              return false;
        }
        if(drinkCheckBox2.isSelected()){
            if(((int)drinksSpinner2.getValue()) <= 0);
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

        mainDesktopPane = new javax.swing.JDesktopPane();
        orderButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        breakfastCheckBox = new javax.swing.JCheckBox();
        breakfastCheckBox1 = new javax.swing.JCheckBox();
        breakfastSpinner = new javax.swing.JSpinner();
        breakfastSpinner1 = new javax.swing.JSpinner();
        breakfastCheckBox2 = new javax.swing.JCheckBox();
        breakfastSpinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        saladCheckBox = new javax.swing.JCheckBox();
        saladCheckBox1 = new javax.swing.JCheckBox();
        saladSpinner = new javax.swing.JSpinner();
        saladSpinner1 = new javax.swing.JSpinner();
        saladCheckBox2 = new javax.swing.JCheckBox();
        saladSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        burgerCheckBox = new javax.swing.JCheckBox();
        burgerCheckBox1 = new javax.swing.JCheckBox();
        burgerSpinner = new javax.swing.JSpinner();
        burgerSpinner1 = new javax.swing.JSpinner();
        burgerCheckBox2 = new javax.swing.JCheckBox();
        burgerSpinner2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        drinkCheckBox = new javax.swing.JCheckBox();
        drinkCheckBox1 = new javax.swing.JCheckBox();
        drinksSpinner = new javax.swing.JSpinner();
        drinksSpinner1 = new javax.swing.JSpinner();
        drinkCheckBox2 = new javax.swing.JCheckBox();
        drinksSpinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(857, 620));

        mainDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        breakfastCheckBox.setText("jCheckBox1");
        breakfastCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastCheckBoxActionPerformed(evt);
            }
        });

        breakfastCheckBox1.setText("jCheckBox2");

        breakfastCheckBox2.setText("jCheckBox3");

        jLabel1.setText("Breakfast");

        jDesktopPane1.setLayer(breakfastCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(breakfastCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(breakfastSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(breakfastSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(breakfastCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(breakfastSpinner2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breakfastCheckBox)
                            .addComponent(breakfastCheckBox1)
                            .addComponent(breakfastCheckBox2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(breakfastSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(breakfastSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakfastSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakfastCheckBox)
                    .addComponent(breakfastSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakfastCheckBox1)
                    .addComponent(breakfastSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakfastCheckBox2)
                    .addComponent(breakfastSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));

        saladCheckBox.setText("jCheckBox1");
        saladCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladCheckBoxActionPerformed(evt);
            }
        });

        saladCheckBox1.setText("jCheckBox2");

        saladCheckBox2.setText("jCheckBox3");

        jLabel2.setText("Salad");

        jDesktopPane2.setLayer(saladCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(saladCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(saladSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(saladSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(saladCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(saladSpinner2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saladCheckBox)
                            .addComponent(saladCheckBox1)
                            .addComponent(saladCheckBox2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(saladSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(saladSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saladSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saladCheckBox)
                    .addComponent(saladSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saladCheckBox1)
                    .addComponent(saladSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saladCheckBox2)
                    .addComponent(saladSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));

        burgerCheckBox.setText("jCheckBox1");
        burgerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerCheckBoxActionPerformed(evt);
            }
        });

        burgerCheckBox1.setText("jCheckBox2");

        burgerCheckBox2.setText("jCheckBox3");

        jLabel3.setText("Burger");

        jDesktopPane3.setLayer(burgerCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(burgerCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(burgerSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(burgerSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(burgerCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(burgerSpinner2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(burgerCheckBox)
                            .addComponent(burgerCheckBox1)
                            .addComponent(burgerCheckBox2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(burgerSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerCheckBox)
                    .addComponent(burgerSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerCheckBox1)
                    .addComponent(burgerSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerCheckBox2)
                    .addComponent(burgerSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jDesktopPane4.setBackground(new java.awt.Color(255, 255, 255));

        drinkCheckBox.setText("jCheckBox1");
        drinkCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkCheckBoxActionPerformed(evt);
            }
        });

        drinkCheckBox1.setText("jCheckBox2");

        drinkCheckBox2.setText("jCheckBox3");

        jLabel4.setText("Drinks");

        jDesktopPane4.setLayer(drinkCheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(drinkCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(drinksSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(drinksSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(drinkCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(drinksSpinner2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkCheckBox)
                            .addComponent(drinkCheckBox1)
                            .addComponent(drinkCheckBox2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(drinksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drinksSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinksSpinner2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkCheckBox)
                    .addComponent(drinksSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkCheckBox1)
                    .addComponent(drinksSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkCheckBox2)
                    .addComponent(drinksSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        mainDesktopPane.setLayer(orderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainDesktopPane.setLayer(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainDesktopPane.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainDesktopPane.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainDesktopPane.setLayer(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainDesktopPane.setLayer(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                .addGroup(mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306)
                        .addGroup(mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainDesktopPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDesktopPaneLayout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        if(check()){
            ConfrimDeliveryUser cdu = new ConfrimDeliveryUser();
            mainDesktopPane.add(cdu);
            cdu.show();
        }else{
            JOptionPane.showMessageDialog(this, "Vlera zero te produketeve te selekturara nuk lejohen");
        }

    }//GEN-LAST:event_orderButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void breakfastCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastCheckBoxActionPerformed

    private void saladCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saladCheckBoxActionPerformed

    private void burgerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerCheckBoxActionPerformed

    private void drinkCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox breakfastCheckBox;
    private static javax.swing.JCheckBox breakfastCheckBox1;
    private static javax.swing.JCheckBox breakfastCheckBox2;
    private static javax.swing.JSpinner breakfastSpinner;
    private static javax.swing.JSpinner breakfastSpinner1;
    private static javax.swing.JSpinner breakfastSpinner2;
    private static javax.swing.JCheckBox burgerCheckBox;
    private static javax.swing.JCheckBox burgerCheckBox1;
    private static javax.swing.JCheckBox burgerCheckBox2;
    private static javax.swing.JSpinner burgerSpinner;
    private static javax.swing.JSpinner burgerSpinner1;
    private static javax.swing.JSpinner burgerSpinner2;
    private javax.swing.JButton clearButton;
    private static javax.swing.JCheckBox drinkCheckBox;
    private static javax.swing.JCheckBox drinkCheckBox1;
    private static javax.swing.JCheckBox drinkCheckBox2;
    private static javax.swing.JSpinner drinksSpinner;
    private static javax.swing.JSpinner drinksSpinner1;
    private static javax.swing.JSpinner drinksSpinner2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JButton orderButton;
    private static javax.swing.JCheckBox saladCheckBox;
    private static javax.swing.JCheckBox saladCheckBox1;
    private static javax.swing.JCheckBox saladCheckBox2;
    private static javax.swing.JSpinner saladSpinner;
    private static javax.swing.JSpinner saladSpinner1;
    private static javax.swing.JSpinner saladSpinner2;
    // End of variables declaration//GEN-END:variables
}
