package com.packages;
class A 
{
private static int k=20;
static int m=10;
private void m1()
{
System.out.println(k);
}
private void m2()
{
m2();
}
public static void main(String[]args) 
{
A a =new A();
System.out.println(a.m);

}
}
