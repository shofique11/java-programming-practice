public class Demo implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    String name = "GeeksForGeeks";
}
