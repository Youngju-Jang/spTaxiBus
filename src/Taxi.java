public class Taxi extends publicTransport implements publicTransportImpl{
     
     String 목적지;
     int 기본거리 = 1;
     int 목적지까지거리;
     int 기본요금 = 3000;
     int 거리당요금 = 1000;
     final int 최대승객수 = 4;
     int 누적요금 = 0;
     private static int 택시넘버 = 0;
     
     public Taxi() {
          번호 = 택시넘버;
          택시넘버++;
          상태 = TaxiEnum.일반;
          System.out.println("택시넘버 = " + this.번호);
          System.out.println("주유량 = " + 주유량);
          System.out.println("상태 = " + 상태);
     }
     @Override
     public void 운행불가(){
          상태 = TaxiEnum.운행불가;
     }
     
     @Override
     public void 운행시작() {
          if(주유량 < 10) return;
          this.상태 = TaxiEnum.운행중;
     }
     
     
     public void 승객탑승(int 승객수, String 목적지, int 목적지까지거리) {
          if(this.상태 != TaxiEnum.일반){
               System.out.println("🛑탑승 불가🛑");
               return;
          }
          if(승객수 > 최대승객수) {
               System.out.println("🛑최대 승객 수 초과🛑");
               return;
          }
          현재승객수 = 승객수;
          this.목적지 = 목적지;
          this.목적지까지거리 = 목적지까지거리;
          운행시작();
          누적요금 += 지불할요금();
          
          System.out.println("탑승 승객수 = " + 현재승객수);
          System.out.println("잔여 승객수 = " + (최대승객수 - 현재승객수));
          System.out.println("기본 요금 확인 = " + 기본요금);
          System.out.println("목적지 = " + this.목적지);
          System.out.println("목적지까지 거리 = " + this.목적지까지거리 + "km");
          System.out.println("지불할 요금 = " + 지불할요금());
          System.out.println("상태 = " + 상태);
     }
     @Override
     void 승객탑승(int 승객수) {
          승객탑승(승객수, "", 0);
     }
     int 지불할요금(){
          return 기본요금 + (목적지까지거리-기본거리)*거리당요금;
     }
     
     
     @Override
     public void 속도변경(int 추가속도) {
          속도 += 추가속도;
     }
     
     public void 요금결제(){
          상태 = TaxiEnum.일반;
          System.out.println("누적 요금 =" + 누적요금);
     }
}
