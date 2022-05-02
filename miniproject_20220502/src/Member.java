public class Member {
    private String member_ID;
    private String name;
    private String phone_Number;

    public String getMember_ID() {
        return member_ID;
    }

    public void setMember_ID(String member_ID) {
        this.member_ID = member_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_ID='" + member_ID + '\'' +
                ", name='" + name + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                '}';
    }
}
