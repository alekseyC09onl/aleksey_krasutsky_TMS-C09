package Task1;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(1000), new SamsungHand(600), new ToshibaLeg(500));
        Robot robot2 = new Robot(new SonyHead(900), new ToshibaHand(400), new SamsungLeg(700));
        Robot robot3 = new Robot(new ToshibaHead(800), new ToshibaHand(400), new SonyLeg(600));
        robot1.action();
        robot2.action();
        robot3.action();
        theMostExpensive(robot1, robot2, robot3);

    }

    public static void theMostExpensive(Robot robot1, Robot robot2, Robot robot3) {
        if ((robot1.getPrice() > robot2.getPrice()) && (robot1.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот: " + robot1);
        } else if ((robot2.getPrice() > robot1.getPrice()) && (robot2.getPrice() > robot3.getPrice())) {
            System.out.println("Самый дорогой робот: " + robot2);
        } else {
            System.out.println("Самый дорогой робот: " + robot3);
        }
    }
}
