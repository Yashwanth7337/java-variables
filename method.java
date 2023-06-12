public class method {

    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    int mul(int a,int b)
    {
       return a*b;
    }

    public static void main(String args[])
    {
        method m=new method();
        m.add(4,5);
        sub(10,20);
       System.out.println(m.mul(5,4));
        float x=10;
        float y=15;
       System.out.println(x/y);

    }
}
