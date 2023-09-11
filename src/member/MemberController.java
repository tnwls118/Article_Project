package member;


import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {


private ArrayList<Member> members;

public MemberController(ArrayList<Member> members) {
        this.members = members;
        }


    public void memberJoin(Scanner sc, int num) {
        System.out.println("ID:");
        String id = sc.nextLine();
        System.out.println("PW:");
        String pw = sc.nextLine();
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Phone:");
        String phone = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();

        Member member = new Member(num, id, pw, name, phone, email);
        members.add(member);
            System.out.println(num + "번 계정이 생성되었습니다.\n");
        }
    }