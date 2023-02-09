package it.develhope.genericswildcars;
public class GenericsClass<T>
{
    private T t;
    public T getT()
    {
        return t;
    }
    public void setT(T valueToSet)
    {
        t = valueToSet;
    }
    public static <T> boolean isEqual(GenericsClass<T> gc1, GenericsClass<T> gc2)
    {
        return gc1.getT().equals(gc2.getT());
    }
}