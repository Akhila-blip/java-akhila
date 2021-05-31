package com.sriram.sample;
public class Test
{
public void m1()
{

System.out.println("Test");
}
public static void main(String[]args)
{
m2();
}
public static void m2()
{
 Test t=new Test();
t.m1();
}
}
