public class Main
{
  public static void main(String[] args) {
    Candy[][] box = new Candy[4][3];
    box[0][1] = new Candy("lime");
    box[1][1] = new Candy("orange");
    box[2][2] = new Candy("cherry");
    box[3][1] = new Candy("lemon");
    box[3][2] = new Candy("grape");
    System.out.println(box);

    BoxOfCandy b = new BoxOfCandy(box);
    System.out.println(b);


    Candy[][] box2 = new Candy[3][5];
    box2[0][0] = new Candy("lime");
    box2[0][1] = new Candy("lime");
    box2[0][3] = new Candy("lemon");
    box2[1][0] = new Candy("orange");
    box2[1][4] = new Candy("lime");
    box2[1][3] = new Candy("lime");
    box2[2][0] = new Candy("cherry");
    box2[2][2] = new Candy("lemon");
    box2[2][4] = new Candy("orange");
    BoxOfCandy c = new BoxOfCandy(box2);
    System.out.println(c);

    System.out.println(c.removeNextByFlavor("cherry"));
    System.out.println(c);

    Candy[][] box3 = new Candy[3][5];
    box3[0][0] = new Candy("lime");
    box3[0][1] = new Candy("lime");
    box3[0][3] = new Candy("lemon");
    box3[1][0] = new Candy("orange");
    box3[1][4] = new Candy("lime");
    box3[1][3] = new Candy("lime");
    box3[2][0] = new Candy("cherry");
    box3[2][2] = new Candy("lemon");
    box3[2][4] = new Candy("orange");
    BoxOfCandy d = new BoxOfCandy(box3);
    System.out.println(d.removeNextByFlavor("lime"));
    System.out.println(d);

    Candy[][] box4 = new Candy[3][5];
    box4[0][0] = new Candy("lime");
    box4[0][1] = new Candy("lime");
    box4[0][3] = new Candy("lemon");
    box4[1][0] = new Candy("orange");
    box4[1][4] = new Candy("lime");
    box4[1][3] = new Candy("lime");
    box4[2][0] = new Candy("cherry");
    box4[2][2] = new Candy("lemon");
    box4[2][4] = new Candy("orange");
    BoxOfCandy e = new BoxOfCandy(box4);
    System.out.println(e.removeNextByFlavor("grape"));
    System.out.println(e);

    }
  }
