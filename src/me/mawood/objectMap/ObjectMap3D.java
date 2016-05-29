package me.mawood.objectMap;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ObjectMap - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap3D<T> extends ObjectMap2D<ConcurrentHashMap<Integer, T>>
{
    public ObjectMap3D()
    {
        super();
    }

    public synchronized boolean isEmpty(int x,int y, int z)
    {
        return isEmpty(x,y) || !get(x,y).containsKey(z);
    }

    public synchronized T get(int x,int y, int z) throws NoSuchElementException
    {
        if(isEmpty(x,y,z)) throw new NoSuchElementException();
        return this.get(x,y).get(z);
    }

    public synchronized void set(int x, int y, int z, T val)
    {
        if(isEmpty(x,y,z)) set(x,y,new ConcurrentHashMap<>());
        get(x,y).put(z,val);
    }

    public synchronized void remove(int x, int y, int z)
    {
        if(isEmpty(x,y,z)) return;
        if(this.get(x,y).size() <= 1)
        {
            this.remove(x,y);
        }
        else this.get(x,y).remove(z);
    }
}
