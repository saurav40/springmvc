package springmvc.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {
	
 @Autowired
 @Qualifier("hibernateRef")
 private HibernateTemplate template;
 
 



@Transactional
 public int saveUser(User user)
 {
	 //user.setId(101);
	System.out.println(user);
	 int x= (Integer) this.template.save(user);
	 
	 System.out.println(x);
	 return x;
 }
 
 
}
