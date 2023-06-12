class employee
{
    int id=123;//instance variable
    String name="Madhu";//instance variable
    String address="Bangalore";//instance variable
    static String org="TCS"; //static variable
    public static void main(String args[])
    {
        employee e1=new employee();//creating object using new operator
        //we can access instance variable with the help of object name
       System.out.println(e1.address);
        System.out.println(e1.id);
        System.out.println(e1.name);
        // we can access static variable in 3 ways 
       // 1:with the help of class name
       //2:with the help of object name
       //3 :we can give direct static variable name
        System.out.println(org);
        System.out.println(employee.org);
        System.out.println(e1.org);

        int i=0;
        System.out.println(i);

    }
}