
package com.springboot.database.demo.databasedemo;

import java.util.Date;

public class test {

	public static void main(String[] args) {

		System.out.println("this is util.date -> {}" + new Date().toString());
		System.out.println("this is sql.date -> {}" +new java.sql.Date(5000));

	}
}
