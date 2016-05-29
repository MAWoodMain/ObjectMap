package me.mawood.objectMap;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * ObjectMap - me.mawood.objectMap
 * Created by matthew on 29/05/16.
 */
public class ObjectMap4D<T> extends ObjectMap3D<HashMap<Integer, T>>
{
    public ObjectMap4D()
    {
        super();
    }

    public boolean isEmpty(int x,int y, int z, int t)
    {
        return isEmpty(x,y,z) || !get(x,y,z).containsKey(t);
    }

    public T get(int x,int y, int z, int t) throws NoSuchElementException
    {
        if(isEmpty(x,y,z,t)) throw new NoSuchElementException();
        return this.get(x,y,z).get(t);
    }

    public void set(int x, int y, int z, int t, T val)
    {
        if(isEmpty(x,y,z,t)) set(x,y,z,new HashMap<>());
        get(x,y,z).put(t,val);
    }

    public void remove(int x, int y, int z, int t)
    {
        if(isEmpty(x,y,z,t)) return;
        if(this.get(x,y,z).size() <= 1)
        {
            this.remove(x,y,z);
        }
        else this.get(x,y,z).remove(t);
    }
}
