/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Roli;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class RoliRepository extends EntMngClass implements RoliInterface{
    @Override
    public void create(Roli r) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Roli r) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.merge(r);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Roli r) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public List<Roli> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Roli.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Roli findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT r FROM Roli r WHERE r.RoliID = :id");
            query.setParameter("id", ID);
            return (Roli) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}

