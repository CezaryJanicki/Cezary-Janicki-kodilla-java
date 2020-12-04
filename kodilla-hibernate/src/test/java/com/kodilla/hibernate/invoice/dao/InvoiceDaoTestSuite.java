package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("Milk");
        Product banana = new Product("Banana");
        Product oranges = new Product("Oranges");

        Item item = new Item(new BigDecimal("10.50"), 10, milk);
        Item item2 = new Item(new BigDecimal("2.50"), 10, banana);
        Item item3 = new Item(new BigDecimal("3.00"), 20, oranges);

        Invoice invoice = new Invoice("Invoice no 1/2020");
        Invoice invoice2 = new Invoice("Invoice no 2/2020");

        invoice.getItems().add(item);
        item.setInvoice(invoice);
        invoice.getItems().add(item2);
        item2.setInvoice(invoice);
        invoice2.getItems().add(item3);
        item3.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice);
        int idInvoice = invoice.getId();
        invoiceDao.save(invoice2);
        int idInvoice2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, idInvoice);
        Optional<Invoice> invoiceReadFromDaoOpt = invoiceDao.findById(idInvoice);
        Assert.assertTrue(invoiceReadFromDaoOpt.isPresent());
        Invoice invoiceReadFromDao = invoiceReadFromDaoOpt.get();
        Assert.assertEquals("Invoice no 1/2020", invoiceReadFromDao.getNumber());
        Assert.assertEquals(item.getPrice(), invoiceReadFromDao.getItems().get(0).getPrice());
        Assert.assertEquals(milk.getName(), invoiceReadFromDao.getItems().get(0).getProduct().getName());
        Assert.assertNotEquals(0, idInvoice2);

        //CleanUp
        invoiceDao.deleteById(idInvoice);
        invoiceDao.deleteById(idInvoice2);
    }

}
