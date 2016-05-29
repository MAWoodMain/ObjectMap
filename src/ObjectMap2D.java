import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * ObjectMap2D - PACKAGE_NAME
 * Created by matthew on 29/05/16.
 */
public class ObjectMap2D<T>
{
    private final HashMap<Integer, HashMap<Integer, T>> map;

    public ObjectMap2D()
    {
        map = new HashMap<>();
    }

    public boolean isEmpty(int x,int y)
    {
        // if the row doesn't exist or the cell does not exist return true
        return !map.containsKey(y) || !map.get(y).containsKey(x);
    }

    public T get(int x, int y) throws NoSuchElementException
    {
        if(isEmpty(x,y)) throw new NoSuchElementException();
        return map.get(y).get(x);
    }

    public void set(int x, int y, T val)
    {
        if(!map.containsKey(y)) map.put(y,new HashMap<>());
        map.get(y).put(x,val);
    }

    public void remove(int x, int y)
    {
        if(isEmpty(x,y)) return;
        if(map.get(y).size() <= 1)
        {
            map.remove(y);
        }
        else map.get(y).remove(x);
    }
}
