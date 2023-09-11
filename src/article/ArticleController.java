package article;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleController {
    private ArrayList<Article> articles;

    public ArticleController(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void writeArticle(Scanner sc, int num) {
        System.out.println("title:");
        String title = sc.nextLine();
        System.out.println("body:");
        String body = sc.nextLine();

        Article article = new Article(title, body,num, Time.getTime());
        articles.add(article);
        System.out.println(num + "번 게시물이 생성되었습니다.\n");
    }

    public void listArticles() {
        if (articles.isEmpty()) {
            System.out.println("조회 게시물 없음");
        } else {
            for (int i = articles.size() - 1; i >= 0; i--) {
                System.out.println(articles.get(i));
            }
        }
    }

    public void deleteArticle(Scanner sc) {
        System.out.println("삭제하고 싶은 게시물 번호를 입력하세요");
        int delete = sc.nextInt();
        boolean deleted = false;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId() == delete) {
                articles.remove(i);
                deleted = true;
                System.out.println(delete + "번 게시물을 삭제했습니다.");
                break;
            }
        }
        if (!deleted) {
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
        sc.nextLine(); // 버퍼 비우기
    }

    public void viewArticle(Scanner sc) {
        System.out.println("열람하고 싶은 게시물 번호를 입력하세요");
        int search = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        boolean searched = false;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId() == search) {
                // 조회수를 증가시킴
                articles.get(i).increaseViewCnt();

                // 조회수 증가 후 출력
                System.out.println(articles.get(i));
                System.out.println(search + "번 게시물의 조회수: " + articles.get(i).getViewCount());

                searched = true;
            }
        }
        if (!searched) {
            System.out.println("해당 게시물을 조회할 수 없습니다.");
        }
    }

    public void correctArticle(Scanner sc) {
        System.out.println("수정하실 게시물 번호를 입력하세요.");
        int correction = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        boolean corrected = false;
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId() == correction) {
                System.out.println("새로운 내용을 입력해주세요");
                System.out.println("title:");
                String title = sc.nextLine();
                System.out.println("body:");
                String body = sc.nextLine();
                corrected = true;

                Article article = new Article(title, body, correction, Time.getTime());
                articles.set(i, article);
                System.out.println(correction + "번 게시물이 수정되었습니다.");
                break;
            }
        }
        if (!corrected) {
            System.out.println("수정 가능한 게시물이 없습니다.");
        }
    }
}
