/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Consumer;
import java.util.List;

/**
 *
 * @author OEM
 */
public interface ConsumerInterface {
    void create (Consumer c)throws CrudFormException;
    void edit(Consumer c)throws CrudFormException;
    void delete(Consumer c)throws CrudFormException;
    List <Consumer> findAll() throws CrudFormException;
    Consumer findByID(Integer ID) throws CrudFormException;
}
