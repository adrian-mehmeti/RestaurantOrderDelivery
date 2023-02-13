/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Product;
import java.util.List;

/**
 *
 * @author OEM
 */
public interface ProductInterface {
    void create (Product p)throws CrudFormException;
    void edit(Product p)throws CrudFormException;
    void delete(Product p)throws CrudFormException;
    List <Product> findByTipi(String tipi) throws CrudFormException;
    List <Product> findAll()throws CrudFormException;
    Product findByID(Integer ID) throws CrudFormException;
}
