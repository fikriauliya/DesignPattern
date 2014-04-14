package com.levifikri.java.learn.designpattern.structural.filtercriteria;

import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}