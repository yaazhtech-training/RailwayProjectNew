package com.yaazhtech.railwayManagement.LamdaExpression;
interface FuncInterface
{
    void abstractFun(int x);
}

public class Test {
    public static void main(String args[]) {
        FuncInterface fobj = (int x) -> System.out.println(2 * x);
        fobj.abstractFun(5);

    }
}
