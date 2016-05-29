import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * ObjectMap2D - PACKAGE_NAME
 * Created by matthew on 29/05/16.
 */
public class ObjectMap2D<T> extends ObjectMap1D<HashMap<Integer, T>>
{

    public ObjectMap2D()
    {
        super();
    }

    public boolean isEmpty(int x,int y)
    {
        return isEmpty(x) || !get(x).containsKey(y);
    }

    public T get(int x, int y) throws NoSuchElementException
    {
        if(isEmpty(x,y)) throw new NoSuchElementException();
        return this.get(x).get(y);
    }

    public void set(int x, int y, T val)
    {
        if(isEmpty(x,y)) set(x,new HashMap<>());
        get(x).put(y,val);
    }

    public void remove(int x, int y)
    {
        if(isEmpty(x,y)) return;
        if(this.get(x).size() <= 1)
        {
            this.remove(x);
        }
        else this.get(x).remove(y);
    }
}
