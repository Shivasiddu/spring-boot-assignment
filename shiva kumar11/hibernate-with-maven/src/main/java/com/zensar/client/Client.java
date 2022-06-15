package com.zensar.client;







//import com.zensar.entity.Product;
import com.zensar.entity.Product;







import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;









public class Client {







public static void main(String[] args) {
//TODO Auto-generated method stub
//Product product=new Product(1,"laptop",2345);
Product pro=new Product(4,"raja",30);
System.out.println(pro);








SessionFactory factory=new Configuration().configure().buildSessionFactory();
Session session=factory.openSession();
Transaction transaction = session.beginTransaction();
session.save(pro);
System.out.println("product saved sucessfully....!!!!!");
transaction.commit();
session.close();
factory.close();








}
}