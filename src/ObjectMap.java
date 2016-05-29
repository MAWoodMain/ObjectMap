/**
 * ObjectMap - PACKAGE_NAME
 * Created by matthew on 29/05/16.
 */
public class ObjectMap<T>
{
    private T origin;

    private T north;
    private T south;
    private T east;
    private T west;

    public ObjectMap(T origin)
    {
        this.origin = origin;
    }
}
