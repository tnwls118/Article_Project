package member;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String email;
    private  int list;

    public Member(int list, String id, String pw, String name, String phone, String email){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.list = list;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\nPW:" + pw + "\nName:" + name + "\nPhone" + phone + "\nEmail:" + email;
    }
}
