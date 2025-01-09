public class Day_4_Conditionals {
    /*When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of c*/
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend){
          if(cigars>=40){
            return true;
          }else{
            return false;
          }
        }else{
          if(cigars>=40 && cigars<=60){
            return true;
          }else{
            return false;
          }
        }
      }
    
}
