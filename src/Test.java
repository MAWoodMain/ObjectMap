/**
 * ObjectMap2D - PACKAGE_NAME
 * Created by matthew on 29/05/16.
 */
public class Test
{
    public static void main(String[] args)
    {
        ObjectMap2D<Integer> twoDim = new ObjectMap2D<>();
        System.out.println(twoDim.isEmpty(5,6));
        twoDim.set(5,6,1);
        System.out.println(twoDim.isEmpty(5,6));
        System.out.println(twoDim.get(5,6));
        twoDim.remove(5,6);
        System.out.println(twoDim.isEmpty(5,6));

        System.out.println();
        System.out.println();

        ObjectMap3D<Integer> threeDim = new ObjectMap3D<>();
        System.out.println(threeDim.isEmpty(5,6,7));
        threeDim.set(5,6,7,1);
        System.out.println(threeDim.isEmpty(5,6,7));
        System.out.println(threeDim.get(5,6,7));
        threeDim.remove(5,6,7);
        System.out.println(threeDim.isEmpty(5,6,7));
    }
}
