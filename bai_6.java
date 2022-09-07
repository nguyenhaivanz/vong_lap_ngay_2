package ngay_2;
public class bai_6 {
    public static void main(String[] args) {
   int count = 0;
   String text="";
   for(int i = 2;count < 20 ; i++){
       boolean check = true;
       int j = 2;
       while (j <= Math.sqrt(i)){
           if (i % j == 0){
               check = false;
               break;
           }
           j++;
       }
       if(check){
           count++;
           text += (i + ".");
       }
   }
   System.out.println(" in the number: " + text);
        }
    }
