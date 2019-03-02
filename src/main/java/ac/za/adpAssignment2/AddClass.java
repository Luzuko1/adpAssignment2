package ac.za.adpAssignment2;

public class AddClass implements Calculator
{
    public int num1;
    public int num2;
    @Override
    public int add(int one, int two)
    {
        return one+two;
    }

    @Override
    public int subtract(int one, int two)
    {
        return one-two;
    }

    @Override
    public int multiply(int one, int two)
    {
        return one*two;
    }


}
