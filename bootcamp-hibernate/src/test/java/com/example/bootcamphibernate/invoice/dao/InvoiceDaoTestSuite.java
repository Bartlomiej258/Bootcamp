package com.example.bootcamphibernate.invoice.dao;

import com.example.bootcamphibernate.invoice.Invoice;
import com.example.bootcamphibernate.invoice.Item;
import com.example.bootcamphibernate.invoice.Product;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;



    @Test
    void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("candy");
        Product product2 = new Product("drinks");

        Item cola = new Item(product2, new BigDecimal(8), 2, new BigDecimal(4));
        Item pepsi = new Item(product2, new BigDecimal(7), 1, new BigDecimal(3));
        Item chocolate = new Item(product1, new BigDecimal(2), 2, new BigDecimal(3));

        cola.setProduct(product2);
        pepsi.setProduct(product2);
        chocolate.setProduct(product2);

        product2.getItems().add(cola);
        product2.getItems().add(pepsi);
        product2.getItems().add(chocolate);

        Invoice invoice = new Invoice();
        invoice.setNumber("123");

        cola.setInvoice(invoice);
        pepsi.setInvoice(invoice);
        chocolate.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //then
        assertNotEquals(0, id);

        //CleanUp
//        invoiceDao.delete(invoice);


    }
}
