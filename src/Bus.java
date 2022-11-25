public class Bus extends publicTransport implements publicTransportImpl {
     final int 최대승객수 = 30;
     int 요금 = 1000;
     private static int 버스넘버 = 0;
     public Bus() {
          // 고유'번호' 생성
          번호 = 버스넘버;
          버스넘버++;
          운행시작();
          System.out.println("버스넘버 = " + this.번호);
     }
     
     @Override
     public void 운행불가() {
          상태 = BusEnum.차고지행;
     }
     
     public void 상태변경(BusEnum 상태) {
          this.상태 = 상태;
     }
     
     @Override
     public void 운행시작() {
          상태변경(BusEnum.운행중);
     }
     
     public void 운행종료() {
          상태변경(BusEnum.차고지행);
     }
     
     @Override
     public void 승객탑승(int 승객수) {
          if (상태 != BusEnum.운행중) return;
          
          if (현재승객수 + 승객수 >= 최대승객수) {
               System.out.println("🛑최대 승객수 초과🛑");
               return;
          }
          현재승객수 += 승객수;
          
          System.out.println("탑승 승객수 = " + 현재승객수);
          System.out.println("잔여 승객수 = " + (최대승객수 - 현재승객수));
          System.out.println("요금 확인 = " + (승객수 * 요금));
     }
     
     @Override
     public void 속도변경(int 추가속도) {
          if (주유량 < 10) {
               System.out.println("🛑주유량을 확인해 주세요🛑");
               return;
          }
          속도 += 추가속도;
     }
}
