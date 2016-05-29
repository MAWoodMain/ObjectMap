package me.mawood.objectMap;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ObjectMap - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap1D<T>
{
    private final ConcurrentHashMap<Integer, T> map;

    public ObjectMap1D()
    {
        map = new ConcurrentHashMap<>();
    }

    public synchronized boolean isEmpty(int x)
    {
        return !map.containsKey(x);
    }

    public synchronized T get(int x) throws NoSuchElementException
    {
        if(isEmpty(x)) throw new NoSuchElementException();
        return map.get(x);
    }

    public synchronized void set(int x, T val)
    {
        map.put(x,val);
    }

    public synchronized void remove(int x)
    {
        if(isEmpty(x)) return;
        map.remove(x);
    }
}
