package kr.or.ddit.Atest;

import java.util.Scanner;

public class test {
   //1. 회원가입
   //  -> 아이디, 비번, 전화번호 입력
   //  -> 아이디 중복되면 생성 X
   //   -> 비밀번호 => 대문자, 특수문자 포함(ASCII 코드)
   //  -> 전화번호 중복되면 생성 X (전화번호에 - 입력 X)
   //2. 로그인
   //  -> 아이디 비번 확인 후 로그인 성공 메시지 출력
   //3. 회원 탈퇴
   //  -> 아이디 비번 확인 후 회원 정보 삭제
   //    **********************************
   //   회원가입, 로그인, 회원탈퇴 메소드 나눠서 생성
   //
   // !! 가능한곳까지 해보고 물어보시면 알려드립니다. !!

   // 결과만 실행 되면 됩니다.  homework10이랑 비슷한 문제.
   Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      test obj = new test();
      obj.process();
   }

   public void process() {
      user[] userList = new user[100];
      int cur = 0;
      while (true) {
         System.out.println("1. 회원가입");
         System.out.println("2. 로그인");
         System.out.println("3. 회원탈퇴");
         int sel = sc.nextInt();
         if (sel == 1) {
            //회원가입
            user list;
            System.out.println("이름를 입력하시오 : ");
            String name = sc.next();
            System.out.println("나이를 입력하시오 : ");
            int age = sc.nextInt();
            System.out.println("아이디를 입력하시오 : ");
            String id = sc.next();
            boolean idCheck = false;
            for (int i = 0; i < cur; i++) {
               if (userList[i] != null && userList[i].id.equals(id)) {
                  idCheck = true;
                  break;
               }
            }
            if (idCheck) {
               System.out.println("중복된 아이디입니다.");
               continue;
            }
            System.out.println("비밀번호를 입력하시오 : ");
            System.out.println("대문자, 특수문자 포함");
            String password = sc.next();
            boolean passwordCheck = false;
            boolean hasUpperCase = !password.equals(password.toLowerCase());
            boolean hasSpecialChar = !password.matches("[A-Za-z0-9 ]*");
            if (hasUpperCase && hasSpecialChar) {
               passwordCheck = true;
            }
            if (!passwordCheck) {
               System.out.println("비밀번호는 대문자와 특수문자를 포함해야 합니다.");
               continue;
            }
            System.out.println("전화번호를 입력하시오 : ");
            String telno = sc.next();
            boolean telnoCheck = false;
            for (int i = 0; i < cur; i++) {
               if (userList[i] != null && userList[i].telno.equals(telno)) {
                  telnoCheck = true;
                  break;
               }
            }
            if (telnoCheck) {
               System.out.println("중복된 전화번호입니다.");
               continue;
            }
            list = new user(name, age, id, password, telno);
            userList[cur++] = list;

         }
         if (sel == 2) {
            //로그인
            System.out.println("아이디를 입력하시오 : ");
            String id = sc.next();
            System.out.println("비밀번호를 입력하시오 : ");
            String password = sc.next();
            boolean loginCheck = false;
            for (int i = 0; i < cur; i++) {
               if (userList[i] != null && userList[i].id.equals(id) && userList[i].password.equals(password)) {
                  loginCheck = true;
               }
               if (loginCheck)
                  System.out.println("로그인 되었습니다.");
               else
                  System.out.println("다시 시도 하십시오.");

            }
         }
         if (sel == 3) {
            //회원탈퇴
            System.out.println("아이디를 입력하시오 : ");
            String id = sc.next();
            System.out.println("비밀번호를 입력하시오 : ");
            String password = sc.next();
            boolean deleted = false;
            for (int i = 0; i < cur; i++) {
               if (userList[i] != null && userList[i].id.equals(id) && userList[i].password.equals(password)) {
                  userList[i] = null;
                  deleted = true;
                  System.out.println("회원탈퇴 되었습니다.");
                  break;
               }

            }
            if (!deleted)
               System.out.println("다시 시도 하십시오.");
         }
      }
   }
}

//생성자
class user {
   String name; //이름
   int age; //나이
   String id; //아이디
   String password; //비밀번호
   String telno; //전화번호

   public user(String name, int age, String id, String password, String telno) {
      this.name = name;
      this.age = age;
      this.id = id;
      this.password = password;
      this.telno = telno;
   }

}