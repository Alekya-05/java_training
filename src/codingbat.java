public class codingbat {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
                  speed -= 5;
              }
              if (speed <= 60) {
                  return 0; 
              } else if (speed <= 80) {
                  return 1; 
              } else {
                  return 2;
              }
          }

          public boolean love6(int a, int b) {
            if(a==6 || b==6 || a+b==6 || Math.abs(a-b)==6){
              return true;
            }else{
              return false;
            }
          }

          public boolean more20(int n) {
            if(n%20==1 || n%20==2){
              return true;
            }else{
              return false;
            }
          }
          
          public String stringTimes(String str, int n) {
            String result="";
            for(int i=0;i<n;i++){
            result=result+str;
            }
            return result;
          }
    
}
