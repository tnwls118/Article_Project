import article.Article;
import article.ArticleController;
import article.Time;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        ArrayList<Article> articles = new ArrayList<>();

        // 초기 테스트 데이터 생성
        createTestData(articles);

        ArticleController articleController = new ArticleController(articles);

        System.out.println("도움말\n 1.article write\n 2.article list\n 3.system.out\n 4.article delete\n 5.article detail\n 6.article correction\n\n ===== 명령어를 입력해주세요.=====");

        while (true) {
            String cdm = sc.nextLine();
            // 게시물 생성 기능
            if (cdm.equals("article write")) {
                articleController.writeArticle(sc, num);
                num++;
            } else if (cdm.equals("article list")) {
                articleController.listArticles();
            } else if (cdm.equals("system.out")) {
                // 프로그램 종료
                System.out.println("프로그램 종료");
                break;
            } else if (cdm.equals("article delete")) {
                articleController.deleteArticle(sc);
            } else if (cdm.equals("article detail")) {
                articleController.viewArticle(sc);
            } else if (cdm.equals("article correction")) {
                articleController.correctArticle(sc);
            }
        }
    }

    public static void createTestData(ArrayList<Article> articles) {
        Article article1 = new Article("제목1", "내용1", 1, Time.getTime());
        Article article2 = new Article("제목2", "내용2", 2, Time.getTime());
        Article article3 = new Article("제목3", "내용3", 3, Time.getTime());

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
    }
}
