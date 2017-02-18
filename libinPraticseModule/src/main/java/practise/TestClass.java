package practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		
		Configuration con =new Configuration();
		con.configure("sessionFactory.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t =s.beginTransaction();
		Employee emp =new Employee();
		emp.setFirstName("muni");
		emp.setLastName("bhaskar");
		s.save(emp);
		
		Adrress address = new Adrress();
		address.setAddress1("olive");
		address.setAddress2("carnival");
		address.setPhoneNumber(123456789);
		address.setFirstName("libin");
		address.setLastName("l");
		s.save(address);
		t.commit();
		s.close();
		//t.commit();

	}

}
