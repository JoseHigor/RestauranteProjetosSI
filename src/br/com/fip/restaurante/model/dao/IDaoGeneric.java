package br.com.fip.restaurante.model.dao;

import java.util.List;

import org.hibernate.Criteria;

public interface IDaoGeneric<T> {

  void save(T t) throws Exception;;
  void update(T t) throws Exception;;
  void remove(T t) throws Exception;;
  T find(Long id) throws Exception;;
  List<T> all() throws Exception;;
  Criteria getCriteria();   

}
