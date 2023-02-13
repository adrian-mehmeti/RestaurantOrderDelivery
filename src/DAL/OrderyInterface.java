/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Ordery;
import java.util.List;

/**
 *
 * @author OEM
 */
public interface OrderyInterface {
    void create (Ordery o)throws CrudFormException;
    void edit(Ordery o)throws CrudFormException;
    void delete(Ordery o)throws CrudFormException;
    List <Ordery> findAll() throws CrudFormException;
    Ordery findByID(Integer ID) throws CrudFormException;
}
