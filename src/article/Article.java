package article;

public class Article {
    private String title;
    private String body;
    private int id;
    private int viewCount;
    private String time;

    public Article(String title, String body, int id, String time) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.time = time;
        viewCount = 0; // 초기 조회수는 0으로 설정
    }

    // Getter 메서드
    public int getId() {
        return id;
    }

    // Setter 메서드 (필요한 경우에만 사용)
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "게시물 번호: " + id + "\n제목: " + title + "\n내용: " + body + "\n등록시간:" + time;
    }

    public void increaseViewCnt() {
        viewCount++;
    }

    public int getViewCount() {
        return viewCount;
    }
}
