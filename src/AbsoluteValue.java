public class AbsoluteValue {

    public void absolutevalueOne(){
        int i = 1;
        double d = 2.5;
        float f = 3.5f;
        System.out.println(Math.abs(i));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));
        System.out.println(Math.abs(f)+Math.abs(Integer.MAX_VALUE));
        System.out.println(Math.abs(f)+Math.abs(Integer.MIN_VALUE));
    }

}
