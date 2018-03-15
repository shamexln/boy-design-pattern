package bugmakers.club.dp.structural.seq6.flyweight.demooptimized;

/**
 * @Description:
 * @Author: Bruce
 * @Datetime: 2018/3/15 14:32
 */
public class FlyweightDemoClient {

    public static final String w = "white";
    public static final String b = "black";

    /**
     * 程序启动入口
     */
    public static void main(String[] args) {
        IgoChessmanFactory factory = IgoChessmanFactory.instance();

        AbstractIgoChessman b1, b2, w1, w2;

        b1 = factory.getIgoChessman(b);
        b2 = factory.getIgoChessman(b);
        System.out.println("判断两颗黑子是否相同：" + (b1 == b2));

        w1 = factory.getIgoChessman(w);
        w2 = factory.getIgoChessman(w);
        System.out.println("判断两颗白子是否相同：" + (w1 == w2));

        b1.display(new Coordinates(1, 2));
        b2.display(new Coordinates(1, 3));
        w1.display(new Coordinates(2, 2));
        w2.display(new Coordinates(2, 3));
    }
}
