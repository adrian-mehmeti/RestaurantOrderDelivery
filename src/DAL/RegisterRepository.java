/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Register;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class RegisterRepository extends EntMngClass implements RegisterInterface {
    @Override
    public void create(Register r) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Register r) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Register r) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Register> findByRoli(Integer ID) throws CrudFormException {
        try {
            return em.createQuery("SELECT r FROM Register r WHERE r.roliID.id = :id").setParameter("id", ID).getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Register findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT r FROM Register r WHERE r.registerID = :id");
            query.setParameter("id", ID);
            return (Register) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Register loginByUsernameAndPassword(String u, String p) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT r FROM Register r WHERE r.username = :usr AND r.password = :psw");
            query.setParameter("usr", u);
            query.setParameter("psw", p);
            return (Register) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
