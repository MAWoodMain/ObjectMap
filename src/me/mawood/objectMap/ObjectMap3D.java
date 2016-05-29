package me.mawood.objectMap;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * ObjectMap - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap3D<T> extends ObjectMap2D<HashMap<Integer, T>>
{
    public ObjectMap3D()
    {
        super();
    }

    public boolean isEmpty(int x,int y, int z)
    {
        return isEmpty(x,y) || !get(x,y).containsKey(z);
    }

    public T get(int x,int y, int z) throws NoSuchElementException
    {
        if(isEmpty(x,y,z)) throw new NoSuchElementException();
        return this.get(x,y).get(z);
    }

    public void set(int x, int y, int z, T val)
    {
        if(isEmpty(x,y,z)) set(x,y,new HashMap<>());
        get(x,y).put(z,val);
    }

    public void remove(int x, int y, int z)
    {
        if(isEmpty(x,y,z)) return;
        if(this.get(x,y).size() <= 1)
        {
            this.remove(x,y);
        }
        else this.get(x,y).remove(z);
    }
}
