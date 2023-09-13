package member;

public class Member {
    private  int list;
    private String id;
    private String pw;
    private String repw;


    public Member(int list, String id, String pw, String repw){
        this.id = id;
        this.pw = pw;
        this.repw = repw;
        this.list = list;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nPW:" + pw + "\nREPW;"+repw;
    }
}
