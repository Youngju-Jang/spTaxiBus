
public class TestBus {
     public static void main(String[] args) {
          System.out.println("1~2");
          Bus bus1 = new Bus();
          Bus bus2 = new Bus();
          System.out.println();
          
          System.out.println("1~2");
          bus1.승객탑승(2);
          System.out.println();
          
          System.out.println("3~4");
          bus1.주유량변경(-50);
          System.out.println();
          
          System.out.println("5~7");
          bus1.상태변경(BusEnum.차고지행);
          bus1.주유량변경(10);
          System.out.println();
          
          System.out.println("8~10");
          bus1.상태변경(BusEnum.운행중);
          bus1.승객탑승(45);
          System.out.println();
          
          System.out.println("11~12");
          bus1.승객탑승(5);
          System.out.println();
          
          System.out.println("13~15");
          bus1.주유량변경(-55);
     
     }
}