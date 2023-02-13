/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Consumer;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class ConsumerRepository extends EntMngClass implements ConsumerInterface{
    @Override
    public void create(Consumer c) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Consumer c) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Consumer c) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public List<Consumer> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Consumer.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Consumer findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT c FROM Consumer c WHERE c.ConsumerID = :id");
            query.setParameter("id", ID);
            return (Consumer) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
