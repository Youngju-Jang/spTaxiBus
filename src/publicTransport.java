public abstract class publicTransport {
     int 번호 = 0;
     int 주유량 = 100;
     int 속도=0;
     int 현재승객수 = 0;
     int 최대승객수;
     int 현재속도 = 0;
     void 승객탑승(int 승객수){};
     transportEnum 상태;
     public void 운행불가(){};
     
     public void 주유량변경(int 주유량) {
          this.주유량 += 주유량;
          
          if (주유량 < 0) {
               System.out.println("주유량 = " + this.주유량);
               if (this.주유량 < 10) {
                    운행불가();
                    System.out.println("상태 = " + this.상태);
                    System.out.println("🛑주유 필요🛑");
               }
          } else {
               System.out.println("상태 = " + this.상태);
               System.out.println("주유량 = " + this.주유량);
          }
     }
     
}
