/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.fip.restaurante.model.bean.Prato;
import br.com.fip.restaurante.model.dao.PratoDAO;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Roberto
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PratoJUnitTest {
    private PratoDAO dao = new PratoDAO();
    public PratoJUnitTest() {
    }

    @Test
    public void test1Save() throws Exception{
        Prato p = new Prato("a",10);
        dao.save(p);
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test2Find() throws Exception{
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test3Update() throws Exception{
        Prato p = dao.find(1L);
        String descricao = "espetinho";
        p.setDescricao(descricao);
        dao.update(p);
        assertEquals(descricao,dao.find(1L).getDescricao());
    }
    
    @Test
    public void test4Remove() throws Exception{
        dao.remove(dao.find(1L));
        assertNull(dao.find(1L));
    }
}
