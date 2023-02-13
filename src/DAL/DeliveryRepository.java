/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Delivery;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class DeliveryRepository extends EntMngClass implements DeliveryInterface {
    @Override
    public void create(Delivery d) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Delivery d) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.merge(d);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Delivery d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public List<Delivery> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Delivery.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Delivery findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Delivery d WHERE d.DeliveryID = :id");
            query.setParameter("id", ID);
            return (Delivery) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
