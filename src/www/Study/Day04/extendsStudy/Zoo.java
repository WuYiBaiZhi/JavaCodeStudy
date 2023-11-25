package www.Study.Day04.extendsStudy;

public class Zoo {
    public static void main(String[] args) {
        MuppetFur muppetFur = new MuppetFur();
//        Animal类中的eat和drink方法
        muppetFur.eat();
        muppetFur.drink();
//        Cat类中的catchMice方法
        muppetFur.catchMice();
        Huskies huskies = new Huskies();
//        Animal类中的eat和drink方法
        huskies.eat();
        huskies.drink();
//        Dog类中的gatekeeper方法
        huskies.gatekeeper();
//        Huskies类中的hitHouse方法
        huskies.hitHouse();
//        Object类中的getClass方法
        System.out.println(huskies.getClass());
    }
}
