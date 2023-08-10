package com.driver;

public class B extends A{
    @Override
    public String meth()
    {
        return "Method is overridden in Extended class B";
    }
    public static void main(String[] args)
    {
        B b=new B();
        b.meth();
        b.meth();
    }
}
