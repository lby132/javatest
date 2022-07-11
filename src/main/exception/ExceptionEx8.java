package main.exception;

import java.io.File;
// 커맨드라인 명령어로 실행해야 함 아니면 java.lang.ArrayIndexOutOfBoundsException 발생
public class ExceptionEx8 {
    public static void main(String[] args) {
        // command line 에서 입력받은 값을 이름으로 갖는 파일을 생성한다.
        File f = createFile(args[0]);
        System.out.println(f.getName() + " 파일을 성공적으로 생성하였습니다.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            // 파일이름이 부적절인 경우, 파일 이름을 '제목없음.txt'로 한다.
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);    //File클래스의 객체를 만든다.
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile();  // 파일을 생성한다.
        } catch (Exception e) {

        }
    }
}
