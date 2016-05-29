package me.mawood.objectMap;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ObjectMap2D - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap2D<T> extends ObjectMap1D<ConcurrentHashMap<Integer, T>>
{
    public  ObjectMap2D()
    {
        super();
    }

    public synchronized boolean isEmpty(int x,int y)
    {
        return isEmpty(x) || !get(x).containsKey(y);
    }

    public synchronized T get(int x, int y) throws NoSuchElementException
    {
        if(isEmpty(x,y)) throw new NoSuchElementException();
        return this.get(x).get(y);
    }

    public synchronized void set(int x, int y, T val)
    {
        if(isEmpty(x,y)) set(x,new ConcurrentHashMap<>());
        get(x).put(y,val);
    }

    public synchronized void remove(int x, int y)
    {
        if(isEmpty(x,y)) return;
        if(this.get(x).size() <= 1)
        {
            this.remove(x);
        }
        else this.get(x).remove(y);
    }
}
