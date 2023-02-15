
public class OrSample {
    
    public static void main(String[]args) {
        int scoreSansu = 79;// 算数の成績
        int scoreKokugo = 60;// 国語の成績
        
        if (scoreSansu >=  60 && scoreKokugo >= 60) {
            System.out.println("合格しています！");
        }else if(scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数か国語どちらか補講対象です");
        }else {
            System.out.println("赤点です…補講を行います");
        }
    }

}
