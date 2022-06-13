package com.chainsys.springproject.test;
import org.springframework.context.ApplicationContext; // parent
import org.springframework.context.annotation.AnnotationConfigApplicationContext; //child

import com.chainsys.springproject.appconfig.AppConfig;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.component.MobilePhone;

public class TestAnnotationConfig 
{
	public static void testA()
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	Employee emp=ac.getBean(Employee.class);
	emp.setId(10);
	emp.setName("Aravinth");
	emp.print();
	Employee emp1=ac.getBean(Employee.class);
}
	public static void testPhone() {
        AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext();
        ac.scan("com.chainsys.springproject.component");
        ac.refresh();
        MobilePhone phone=ac.getBean(MobilePhone.class);
        phone.setPhoneNumber(9842098986l);
        long number=phone.getPhoneNumber();
        System.out.println("Phone number: "+number);
        }
}