package educate.AlienLaptop;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
/*        Laptop laptop = new Laptop();
        laptop.setLid(104);
        laptop.setBrand("Acer");
        laptop.setPrice(45000);

        Alien a1 = new Alien();
        a1.setAid(10);
        a1.setAname("Rahul");
        a1.setMarks(72);
        a1.getLaptop().add(laptop);   
        
        laptop.setAlien(a1);
*/        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        session.beginTransaction();
/*        session.persist(a1);
        session.persist(laptop);
        session.getTransaction().commit();
*/
        Alien a1 = session.get(Alien.class, 10);
        System.out.println(a1.getAname() + a1);
        
/*        Collection<Laptop> laps = a1.getLaptop();
        
        for(Laptop l: laps)
        	System.out.println(l.getLid() + "\t" + l.getBrand() + "\t" + l.getPrice());
*/  
    }
}
