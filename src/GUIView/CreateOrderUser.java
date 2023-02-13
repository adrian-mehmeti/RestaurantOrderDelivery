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
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author OEM
 */
public class CreateOrderUser extends javax.swing.JFrame{

    /**
     * Creates new form CreateOrderUser
     */
    ProductRepository pr = new ProductRepository();
    
    public CreateOrderUser() {
        initComponents();
        setLocationRelativeTo(null);
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
    private  void setBurger() throws CrudFormException{
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
    private  void setDrinks() throws CrudFormException{
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

        orderDesktopPane = new javax.swing.JDesktopPane();
        orderButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        breakfastSpinner = new javax.swing.JSpinner();
        breakfastSpinner1 = new javax.swing.JSpinner();
        breakfastSpinner2 = new javax.swing.JSpinner();
        breakfastCheckBox1 = new javax.swing.JCheckBox();
        breakfastCheckBox = new javax.swing.JCheckBox();
        breakfastCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        selectOrderyDelivery = new javax.swing.JButton();
        confirmOrderButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderDesktopPane.setBackground(new java.awt.Color(255, 255, 255));

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
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane1.add(breakfastSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 60, 40, -1));
        jDesktopPane1.add(breakfastSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 100, 40, -1));
        jDesktopPane1.add(breakfastSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 140, 40, -1));

        breakfastCheckBox1.setText("mengjes");
        breakfastCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastCheckBox1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(breakfastCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 99, -1, -1));

        breakfastCheckBox.setText("mengjes");
        breakfastCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastCheckBoxActionPerformed(evt);
            }
        });
        jDesktopPane1.add(breakfastCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 58, -1, -1));

        breakfastCheckBox2.setText("mengjes");
        breakfastCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakfastCheckBox2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(breakfastCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 140, -1, -1));

        jLabel5.setText("BreakFast");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 12, 90, -1));

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saladCheckBox.setText("Salad Shope");
        saladCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladCheckBoxActionPerformed(evt);
            }
        });
        jDesktopPane2.add(saladCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        saladCheckBox1.setText("Greece Salad");
        jDesktopPane2.add(saladCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, -1, -1));
        jDesktopPane2.add(saladSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 40, 25));
        jDesktopPane2.add(saladSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 25));

        saladCheckBox2.setText("Salad Shabani");
        jDesktopPane2.add(saladCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 140, -1, -1));
        jDesktopPane2.add(saladSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 40, 25));

        jLabel2.setText("Salad");
        jDesktopPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 12, 50, -1));

        jDesktopPane3.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        burgerCheckBox.setText("Cheese Burger");
        burgerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerCheckBoxActionPerformed(evt);
            }
        });
        jDesktopPane3.add(burgerCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 58, -1, -1));

        burgerCheckBox1.setText("Double Burger");
        jDesktopPane3.add(burgerCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, -1, -1));
        jDesktopPane3.add(burgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, 25));
        jDesktopPane3.add(burgerSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 40, 25));

        burgerCheckBox2.setText("Classic Burger");
        jDesktopPane3.add(burgerCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 140, -1, -1));
        jDesktopPane3.add(burgerSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 40, 25));

        jLabel3.setText("Burger");
        jDesktopPane3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 12, 50, -1));

        jDesktopPane4.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane4.setPreferredSize(new java.awt.Dimension(245, 163));
        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drinkCheckBox.setText("Cola 0.5");
        drinkCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkCheckBoxActionPerformed(evt);
            }
        });
        jDesktopPane4.add(drinkCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 58, -1, -1));

        drinkCheckBox1.setText("Fanta 0.5");
        jDesktopPane4.add(drinkCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, -1, -1));

        drinksSpinner.setPreferredSize(new java.awt.Dimension(25, 20));
        jDesktopPane4.add(drinksSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 59, 40, 25));
        jDesktopPane4.add(drinksSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 100, 40, 25));

        drinkCheckBox2.setText("Sprite 0.5");
        jDesktopPane4.add(drinkCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 140, -1, -1));
        jDesktopPane4.add(drinksSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 141, 40, 25));

        jLabel4.setText("Drinks");
        jDesktopPane4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 12, 50, -1));

        orderDesktopPane.setLayer(orderButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderDesktopPane.setLayer(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderDesktopPane.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderDesktopPane.setLayer(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderDesktopPane.setLayer(jDesktopPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        orderDesktopPane.setLayer(jDesktopPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout orderDesktopPaneLayout = new javax.swing.GroupLayout(orderDesktopPane);
        orderDesktopPane.setLayout(orderDesktopPaneLayout);
        orderDesktopPaneLayout.setHorizontalGroup(
            orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderDesktopPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDesktopPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(121, 121, 121))))
        );
        orderDesktopPaneLayout.setVerticalGroup(
            orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderDesktopPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane3)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(orderDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderDesktopPaneLayout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        selectOrderyDelivery.setText("Create Ordery/Delivery");
        selectOrderyDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOrderyDeliveryActionPerformed(evt);
            }
        });

        confirmOrderButton.setText("ConfrimOrder");
        confirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Place Order");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectOrderyDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(selectOrderyDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(confirmOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderDesktopPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDesktopPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearCheck();
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saladCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saladCheckBoxActionPerformed

    private void burgerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerCheckBoxActionPerformed

    private void drinkCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkCheckBoxActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        if(check()){
            ConfirmOrderUser cou = new ConfirmOrderUser();
            orderDesktopPane.add(cou);
            cou.show();
        }else{
            JOptionPane.showMessageDialog(this, "Vlera zero te produketeve te selekturara nuk lejohen");
        }    
   
    }//GEN-LAST:event_orderButtonActionPerformed

    private void breakfastCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastCheckBox1ActionPerformed

    private void breakfastCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastCheckBoxActionPerformed

    private void breakfastCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakfastCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_breakfastCheckBox2ActionPerformed

    private void confirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Se pari duhet te selektoni ushqimet dhe kliko \"Orders\"");
        
    }//GEN-LAST:event_confirmOrderButtonActionPerformed

    private void selectOrderyDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOrderyDeliveryActionPerformed
        // TODO add your handling code here:
        dispose();
        SelectUser su = new SelectUser();
        su.setVisible(true);
    }//GEN-LAST:event_selectOrderyDeliveryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        CreateOrderUser cou = new CreateOrderUser();
        cou.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateOrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrderUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new CreateOrderUser().setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JCheckBox breakfastCheckBox;
    protected static javax.swing.JCheckBox breakfastCheckBox1;
    protected static javax.swing.JCheckBox breakfastCheckBox2;
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
    private javax.swing.JButton confirmOrderButton;
    private static javax.swing.JCheckBox drinkCheckBox;
    private static javax.swing.JCheckBox drinkCheckBox1;
    private static javax.swing.JCheckBox drinkCheckBox2;
    private static javax.swing.JSpinner drinksSpinner;
    private static javax.swing.JSpinner drinksSpinner1;
    private static javax.swing.JSpinner drinksSpinner2;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orderButton;
    private javax.swing.JDesktopPane orderDesktopPane;
    protected static javax.swing.JCheckBox saladCheckBox;
    protected static javax.swing.JCheckBox saladCheckBox1;
    protected static javax.swing.JCheckBox saladCheckBox2;
    private static javax.swing.JSpinner saladSpinner;
    private static javax.swing.JSpinner saladSpinner1;
    private static javax.swing.JSpinner saladSpinner2;
    private javax.swing.JButton selectOrderyDelivery;
    // End of variables declaration//GEN-END:variables

    
}
