/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Product;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author OEM
 */
public class ProductRepository extends EntMngClass implements ProductInterface{
    @Override
    public void create(Product p) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void edit(Product p) throws CrudFormException {
        try{
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public void delete(Product p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
           throw new CrudFormException("Msg \n" + e.getMessage());
       }
    }

    @Override
    public List<Product> findByTipi(String tipi) throws CrudFormException {
        try{
            
           return  em.createNamedQuery("Product.findByTipi").setParameter("tipi", tipi).getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public List<Product> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Product.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Product findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT p FROM Product p WHERE p.productID = :id");
            query.setParameter("id", ID);
            return (Product) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
}
