public class TestTaxi {
     
     public static void main(String[] args) {
          System.out.println("1~2");
          Taxi t1 = new Taxi();
          Taxi t2 = new Taxi();
          System.out.println();
          
          System.out.println("1~2");
          t1.승객탑승(2,  "서울역", 2);
          System.out.println();
          
          System.out.println("3");
          t1.주유량변경(-80);
          t1.요금결제();
          System.out.println();
     
          System.out.println("6~7");
          t1.승객탑승(5);
          System.out.println();
          
          System.out.println("8~9");
          t1.승객탑승(3, "구로디지털단지역", 12);
          System.out.println();
          
          System.out.println("10~13");
          t1.주유량변경(-20);
          t1.요금결제();
          
          
          
          
          
          
     }
}
