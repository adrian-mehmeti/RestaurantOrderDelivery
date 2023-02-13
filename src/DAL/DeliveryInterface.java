/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Delivery;
import java.util.List;

/**
 *
 * @author OEM
 */
public interface DeliveryInterface {
   void create (Delivery d)throws CrudFormException;
    void edit(Delivery d)throws CrudFormException;
    void delete(Delivery d)throws CrudFormException;
    List <Delivery> findAll() throws CrudFormException;
    Delivery findByID(Integer ID) throws CrudFormException;
}
