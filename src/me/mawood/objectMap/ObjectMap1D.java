package me.mawood.objectMap;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * ObjectMap - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap1D<T>
{
    private final HashMap<Integer, T> map;

    public ObjectMap1D()
    {
        map = new HashMap<>();
    }

    public boolean isEmpty(int x)
    {
        return !map.containsKey(x);
    }

    public T get(int x) throws NoSuchElementException
    {
        if(isEmpty(x)) throw new NoSuchElementException();
        return map.get(x);
    }

    public void set(int x, T val)
    {
        map.put(x,val);
    }

    public void remove(int x)
    {
        if(isEmpty(x)) return;
        map.remove(x);
    }
}
