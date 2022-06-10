package com.chainsys.springproject.beans;

public class CalenderFactory {
	// The factory method is not static here
	public Calender createCalender() {
		// The constructor is default access modifier so, can be called here
		// The calender class and the calender factory class are both in the same
		// package
		return new Calender();
	}
	public Appointments createAppointment() {
		return new Appointments();
	}
}
