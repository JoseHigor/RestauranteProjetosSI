/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.fip.restaurante.model.bean.Prato;
import br.com.fip.restaurante.model.bean.ProdutoPrato;
import br.com.fip.restaurante.model.dao.PratoDAO;
import br.com.fip.restaurante.model.dao.ProdutoPratoDAO;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Wanderson
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoPratoJUnitTest {
    ProdutoPratoDAO dao = new ProdutoPratoDAO();
//    PratoDAO pratoDAO = new PratoDAO();
    public ProdutoPratoJUnitTest() {
    }

    @Test
    public void test1Save() throws Exception{
        ProdutoPrato p = new ProdutoPrato(new Prato(),10);
        dao.save(p);
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test2Find() throws Exception{
        assertNotNull(dao.find(1L));
    }
    
    @Test
    public void test3Update() throws Exception{
        ProdutoPrato p = dao.find(1L);
        int qtd = 5;
        p.setQuantidade(qtd);
        dao.update(p);
        assertEquals(qtd,dao.find(1L).getQuantidade());
    }
    
    @Test
    public void test4Remove() throws Exception{
        dao.remove(dao.find(1L));
        assertNull(dao.find(1L));
    }
}
