/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.fip.restaurante.model.bean.Atendente;
import br.com.fip.restaurante.model.dao.AtendenteDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author jh_an
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AtendenteJUnitTest {
    AtendenteDAO dao =  new AtendenteDAO();
    public AtendenteJUnitTest() {
    }
    
    
    @Test
    public void test1Save() throws Exception{
        Atendente a = new Atendente("a","a","a");
        dao.save(a);
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test2Find() throws Exception{
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test3Update() throws Exception{
        Atendente a = dao.find(1L);
        String nome = "Jhigor";
        a.setNome(nome);
        dao.update(a);
        assertEquals(nome,dao.find(1L).getNome());
    }
    
    @Test
    public void test4Remove() throws Exception{
        dao.remove(dao.find(1L));
        assertNull(dao.find(1L));
    }
}
