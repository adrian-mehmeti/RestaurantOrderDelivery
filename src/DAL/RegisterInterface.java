/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Register;
import java.util.List;

/**
 *
 * @author OEM
 */
public interface RegisterInterface {
    void create (Register r)throws CrudFormException;
    void edit(Register r)throws CrudFormException;
    void delete(Register r)throws CrudFormException;
    List <Register> findByRoli(Integer ID) throws CrudFormException;
    Register findByID(Integer ID) throws CrudFormException;
    Register loginByUsernameAndPassword(String u, String p) throws CrudFormException;
}
