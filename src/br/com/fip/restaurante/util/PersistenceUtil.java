/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fip.restaurante.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jh_an
 */
public class PersistenceUtil {
   private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Restaurante");
    private static EntityManager em;

    public static EntityManager createEntityManager() {
        try {
            em = emf.createEntityManager();
            return em;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeEntityManagerFactory() {
        try {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
