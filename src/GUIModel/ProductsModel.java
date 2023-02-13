/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

/**
 *
 * @author OEM
 */
public class ProductsModel {
    private final int productID;
    private final String name;
    private final double price;
    private final String tipi;
    
    public ProductsModel(int productID, String name,double price,String tipi){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.tipi = tipi;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
       return name;
    }

    public double getPrice() {
       return price;
    }

    public String getTipi() {
         return tipi;
    }            
} 

