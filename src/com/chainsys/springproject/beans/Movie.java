package com.chainsys.springproject.beans;

public class Movie {
public String title;
public String director;
public Movie( String flimtitle,String filmdirector) {
title=flimtitle;
director=filmdirector;
	System.out.println(title);
	System.out.println(director);
}
	
}
