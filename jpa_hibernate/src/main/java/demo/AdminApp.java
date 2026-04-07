package demo;

import entities.Product;
import entities.Person;
import models.ProductModel;
import models.PersonModel;
import java.util.Date;
import java.util.List;

public class AdminApp {

    public static void main(String[] args) {

        ProductModel productModel = new ProductModel();
        PersonModel personModel = new PersonModel();

        Product p1 = new Product();
        p1.setName("TV");
        p1.setPrice(300.0);
        p1.setQuantity(100);
        p1.setStatus(true);

        productModel.create(p1);

        List<Product> products = productModel.findAll();
        System.out.println(products.size());

        Person person = new Person();
        person.setName("John");
        person.setEmail("john@email.com");
        person.setAge(30);
        person.setCpf("123456789");
        person.setBirthDate(new Date());

        personModel.create(person);

        List<Person> persons = personModel.findAll();
        System.out.println(persons.size());
    }
}
