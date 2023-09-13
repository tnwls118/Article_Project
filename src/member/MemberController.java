package member;


import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

    private ArrayList<Member> members;

    public MemberController(ArrayList<Member> members) {
        this.members = members;
    }


    public void memberJoin(Scanner sc, int num) {

        boolean pwsame = false;
        while (!pwsame) {
            System.out.println("ID:");
            String id = sc.nextLine();
            System.out.println("PW:");
            String pw = sc.nextLine();
            System.out.println("REPW:");
            String repw = sc.nextLine();
            if (pw.equals(repw)) {
                pwsame = true;
                Member member = new Member(num, id, pw, repw);
                members.add(member);
                System.out.println(num + "번 계정이 생성되었습니다.\n");
                break;
            } else if (!pwsame) {
                System.out.println("패스워드가 일치하지 않습니다.");
                System.out.println();
                System.out.println("가입 정보를 재입력 해주세요.");
                continue;
            }
        }
    }
}

