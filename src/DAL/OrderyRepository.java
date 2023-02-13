/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Ordery;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class OrderyRepository extends EntMngClass implements OrderyInterface{
     @Override
    public void create(Ordery o) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Ordery o) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Ordery o) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public List<Ordery> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Ordery.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Ordery findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT o FROM Ordery o WHERE o.OrderyID = :id");
            query.setParameter("id", ID);
            return (Ordery) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
