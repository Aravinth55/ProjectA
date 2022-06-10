package com.chainsys.springproject.startup;

import com.chainsys.springproject.test.TestAnnotationConfig;
import com.chainsys.springproject.test.TestCar;
import com.chainsys.springproject.test.TestClasspathXml;
import com.chainsys.springproject.test.TestXmlBeanFactory;
import com.chainsys.springproject.autowire.Car;
public class Main {

	public static void main(String[] args) {
	TestClasspathXml.testAutoWireQualifier();
	}

}
