package org.examples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[]) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	
	EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	int status=dao.saveEmployee(new Employee(107,"Sandeep",75000));
	System.out.println("Row Inserted Successfully" +status);
	
	/*int status=dao.updateEmployee(new Employee(102,"Rajan",15000));
	System.out.println(status);
	*/
	
	/*Employee e=new Employee();
	e.setId(102);
	int status=dao.deleteEmployee(e);
	System.out.println(status);*/
  }
}