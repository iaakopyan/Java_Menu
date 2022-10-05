public class PopUpJava {
    public static int record=0;
    public static int rec=0;
         public static String Popup(int res){
         String ans;
         if (res == 0) {
             ans=("Вы ответили верно");
             record+=100;
             rec=record;
              }
         else if (res == 1)
             ans=("Вы ответили неверно");
         else
             ans=("Вы пропустили вопрос");
         return ans;
         }
         public static String Popup2(String res){
             String ans;
             if (res.equals( "2022") ) {
                 ans=("Вы ответили верно");
                 record+=100;
                 rec=record;
                }
             else
                 ans=("Неверно или пропущено");
             return ans;
         }
         public static String Popup4(String res){
             String ans;
             if (res.equals( "-28") ) {
                 ans=("Вы ответили верно");
                 record+=100;
                 rec=record;
             }
             else
                 ans=("Неверно или пропущено");
            return ans;
    }
         public static int Popup3() {
             return rec;
         }
}
