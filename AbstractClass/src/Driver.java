public class Driver extends Healper{
    public static void main(String[] args){
        Healper.demofun();
        ParentAbstract child2Abstract = new Child2Abstract();
        child2Abstract.m1();
        child2Abstract.m2();
        child2Abstract.m2();
    }
}
