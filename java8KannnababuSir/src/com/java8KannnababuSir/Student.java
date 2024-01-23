package com.java8KannnababuSir;

public class Student {
public Integer sid;
public String name;
public String subject;
public Double percentage;
public Student(Integer sid, String name, String subject, Double percentage) {
	super();
	this.sid = sid;
	this.name = name;
	this.subject = subject;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", subject=" + subject + ", percentage=" + percentage + "]";
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public  void setSubject(String subject) {
	this.subject = subject;
}
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}

}
