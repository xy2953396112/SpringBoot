package com.mess;

import java.util.Date;
public class Test extends Date{
public static void main(String[] args) {
new Test().test();
}
public void test(){

   System.out.println(super.getClass().getName());
}
}