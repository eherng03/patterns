package es.unileon.designpatterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductHandlerTests {

    private ProductHandler productHandlerPS;
    private ProductHandler productHandlerDS;

    @Before
    public void setUp(){
        productHandlerDS = new ProductHandler();
        productHandlerPS = new ProductHandler();
        productHandlerPS.setType("PS");
        productHandlerDS.setType("DS");
    }

    @Test
    public void testProductHandlerPSType(){
        assertEquals(productHandlerPS.toString().substring(0,2), "PS");
    }

    @Test
    public void testProductHandlerDSType(){
        assertEquals(productHandlerDS.toString().substring(0,2), "DS");
    }

    @Test
    public void testProductHandlerSerialNumberIncrease(){
        ProductHandler productHandler1 = new ProductHandler();
        productHandler1.setType("DS");
        int serialNumber = ProductHandler.getSerialNumber();
        assertEquals(productHandler1.toString(),"DS-" + String.format("%06d", serialNumber));

        ProductHandler productHandler2 = new ProductHandler();
        productHandler2.setType("DS");
        assertEquals(productHandler2.toString(),"DS-" + String.format("%06d", serialNumber+1));
    }

    @Test
    public void testCompareToEquals(){
        assertTrue(productHandlerDS.compareTo(productHandlerDS));
    }

    @Test
    public void testCompareToDifferent(){
        assertFalse(productHandlerDS.compareTo(productHandlerPS));
    }

}
