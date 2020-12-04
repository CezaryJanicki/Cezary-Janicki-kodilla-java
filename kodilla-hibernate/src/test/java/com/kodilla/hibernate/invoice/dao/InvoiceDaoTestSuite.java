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

        Item item = new Item(new BigDecimal(10), 10, milk);
        Item item2 = new Item(new BigDecimal(2.5), 10, banana);
        Item item3 = new Item(new BigDecimal(3), 20, oranges);

        Invoice invoice = new Invoice("Invoice no 1/2020");
        Invoice invoice2 = new Invoice("Invoice no 2/2020");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice2.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int idInvoice = invoice.getId();
        invoiceDao.save(invoice2);
        int idInvoice2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, idInvoice);
        Assert.assertNotEquals(0, idInvoice2);

        //CleanUp
        invoiceDao.deleteById(idInvoice);
        invoiceDao.deleteById(idInvoice2);
    }

}
