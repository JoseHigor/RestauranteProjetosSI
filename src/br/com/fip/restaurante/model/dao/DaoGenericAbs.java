package br.com.fip.restaurante.model.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import br.com.fip.restaurante.util.PersistenceUtil;

public abstract class DaoGenericAbs<T> implements IDaoGeneric<T> {

  EntityManager manager;
  private Class classe;

  public DaoGenericAbs() {
    manager = PersistenceUtil.createEntityManager();
    classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }

  
  public void save(T t) throws Exception {
    try {
      manager.getTransaction().begin();    
      manager.persist(t);
      manager.getTransaction().commit();
    }catch (Exception e) {
      manager.getTransaction().rollback();
      e.printStackTrace();
      throw new Exception("Erro ao cadastrar");
    }
    
  }

  public void update(T t) throws Exception {
    try {
      manager.getTransaction().begin();    
      manager.merge(t);
      manager.getTransaction().commit();
    }catch (Exception e) {
      manager.getTransaction().rollback();
      throw new Exception("Erro ao editar");
    }
    
  }

  public void remove(T t) throws Exception {
    try {
      manager.getTransaction().begin();    
      manager.remove(t);
      manager.getTransaction().commit();
    }catch (Exception e) {
      manager.getTransaction().rollback();
      throw new Exception("Erro ao Remover");
    }
  }

  public T find(Long id) throws Exception {
    try {
      return (T) manager.find(classe, id);
    }catch (Exception e) {
      manager.getTransaction().rollback();
      throw new Exception("Erro ao buscar");
    }
  }

  public List<T> all() throws Exception {
    try {
      Criteria criteria = getCriteria();
      criteria.addOrder(Order.asc("id"));
      return (List<T>) criteria.list();
    }catch (Exception e) {
      manager.getTransaction().rollback();
      throw new Exception("Erro ao listar");
    }
  }

  public Criteria getCriteria() {
    Session session = ((Session) manager.getDelegate());
    Criteria criteria = session.createCriteria(classe);
    return criteria;
  }

}
