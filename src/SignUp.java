import java.util.Scanner;

public class SignUp {
    Scanner sc=new Scanner(System.in);
    String st_ans;
    public void status(){
        System.out.println("회원가입 하셨습니까? y or n");
        st_ans=sc.nextLine();
        String yes="y";
        String no="n";

        if(st_ans.equals(yes)) {
            log();
        }
        else if(st_ans.equals(no)){
            sign();
        }

    }

    public static void sign(){
        System.out.println("회원가입 페이지입니다.\n");
    }

    public static void log(){
        System.out.println("로그인 페이지입니다.\n");
    }


}
