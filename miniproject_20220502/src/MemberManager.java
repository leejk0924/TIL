import java.util.Scanner;

public class MemberManager {
    Scanner sc = new Scanner(System.in);
    MemberDAO memberDAO = new MemberDAO();
    String member_ID;
    String name;
    String phone_Number;

    public void startProgram() {

        readMenu();
    }

    void readMenu() {

        menuLoop:
        while (true) {
            System.out.println("목록을 원하시면 1번을 입력하세요.");
            System.out.println("등록을 원하시면 2번을 입력하세요.");
            System.out.println("수정을 원하시면 3번을 입력하세요.");
            System.out.println("삭제을 원하시면 4번을 입력하세요.");
            System.out.println("종료을 원하시면 0번을 입력하세요.");
            int menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    memberDAO.getMemberList();
                    break;

                case 2:
                    System.out.print("아이디를 입력하세요 (형식 M-00001) : ");
                    member_ID = sc.nextLine();

                    System.out.print("이름을 입력하세요 : ");

                    name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요 : ");
                    phone_Number = sc.nextLine();
                    memberDAO.insertMember(member_ID, name, phone_Number);
                    break;

                case 3:
                    System.out.print("수정할 아이디를 입력하세요 (형식 M-00001): ");
                    member_ID = sc.nextLine();
                    System.out.print("수정할 전화번호를 입력하세요 : ");
                    phone_Number = sc.nextLine();
                    memberDAO.updateMember(member_ID, phone_Number);
                    break;

                case 4:
                    System.out.print("수정할 아이디를 입력하세요 (형식 M-00001): ");
                    member_ID = sc.nextLine();
                    memberDAO.deleteMember(member_ID);
                    System.out.println(member_ID + "회원 삭제에 성공하셨습니다.");
                    break;

                case 0:
                    sc.close();
                    break menuLoop;
                default:
                    System.out.println("다시 입력하세요");
                    break;
            }
        }
    }
}
