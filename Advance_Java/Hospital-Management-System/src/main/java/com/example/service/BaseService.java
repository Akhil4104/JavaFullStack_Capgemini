package com.example.service;

import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class BaseService<T> {

    private final Class<T> entityClass;

    public BaseService(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void save(T entity) {
        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public T find(Long id) {
        EntityManager em = JpaUtil.getFactory().createEntityManager();
        T entity = em.find(entityClass, id);
        em.close();
        return entity;
    }

    public void delete(Long id) {
        EntityManager em = JpaUtil.getFactory().createEntityManager();
        em.getTransaction().begin();
        T entity = em.find(entityClass, id);
        if (entity != null) {
            em.remove(entity);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<T> findAll() {
        EntityManager em = JpaUtil.getFactory().createEntityManager();
        List<T> list = em.createQuery(
                "FROM " + entityClass.getSimpleName(),
                entityClass
        ).getResultList();
        em.close();
        return list;
    }
}