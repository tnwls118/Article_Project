import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = 1;
        ArrayList<Aritcle> articles = new ArrayList<>();

        System.out.println("도움말\n 1.article write\n 2.article list\n 3.system.out\n 4.article delete\n 5.article detail\n 6.article correction\n\n ===== 명령어를 입력해주세요.=====");

        while (true) {
            String cdm = sc.nextLine();
            //게시물 생성 기능
            if (cdm.equals("article write")) {
                System.out.println("title:");
                String title = sc.nextLine();
                System.out.println("body:");
                String body = sc.nextLine();

                Aritcle article = new Aritcle(title, body, num, Time.time());
                articles.add(article);
                System.out.println(num + "번 게시물이 생성되었습니다.\n");
                num++;

                //게시물 리스트 확인 기능
            } else if (cdm.equals("article list")) {
                if (articles.size() == 0) {
                    System.out.println("조회 게시물 없음");
                } else {
                    for (int i = articles.size() - 1; i >= 0; i--) {
                        System.out.println(articles.get(i));
                    }
                }
                //프로그램 종료
            } else if (cdm.equals("system.out")) {
                System.out.println("프로그램 종료");
                break;

            }
            //게시물 삭제 기능
            else if (cdm.equals("article delete")) {
                System.out.println("삭제하고싶은 게시물 번호를 입력하세요");
                int delete = sc.nextInt();
                boolean deleted = false;
                for(int i = 0; i< articles.size(); i++){
                    if(articles.get(i).id == delete){
                        articles.remove(i);
                        deleted = true;
                        System.out.println(delete + "번 게시물을 삭제했습니다.");
                        break;
                    }

                }
                if(!deleted){
                    System.out.println("해당 게시물 번호가 존재하지 않습니다.");
                }
                }

            //게시물 세부 내용 확인
            else if (cdm.equals("article detail")) {
                System.out.println("열람하고싶은 게시물 번호를 입력하세요");
                int search = sc.nextInt();

                boolean searched = false;
                for (int i = 0; i<articles.size(); i++){
                    if(articles.get(i).id == search) {
                        System.out.println(articles.get(i));
                        searched = true;
                        System.out.println(search + "번 게시물을 조회합니다.");
                        break;
                    }

                }if(!searched){
                    System.out.println("해당 게시물을 조회할 수 없습니다.");
                }

                //게시물 내용 수정
            }else if (cdm.equals("article correction")) {
                System.out.println("수정하실 게시물 번호를 입력하세요.");
                int correction = sc.nextInt();
                sc.nextLine();
                boolean correcioned = false;
                for (int i = 0; i < articles.size(); i++) {
                    if (articles.get(i).id == correction) {
                        System.out.println("새로운 내용을 입력해주세요))");
                        System.out.println("title:");
                        String title = sc.nextLine();
                        System.out.println("body:");
                        String body = sc.nextLine();
                        correcioned = true;

                        Aritcle aritcle = new Aritcle(title, body, correction, Time.time());
                        articles.set(i, aritcle);
                        System.out.println(correction+"번 게시물이 수정되었습니다.");
                        break;
                    }
                }if(!correcioned){
                    System.out.println("수정 가능한 게시물이 없습니다.");
                }
            }
        }
    }
}


class Aritcle {
    String title;
    String body;
    int id;
    String time;
    Aritcle(String title, String body, int id,String time){
        this.title = title;
        this.body = body;
        this.id = id;
        this.time = time;
    }
    @Override
    public String toString() {
        return "게시물 번호: " + id + "\n제목: " + title + "\n내용: " + body + "\n등록시간:" + time;
    }
}
