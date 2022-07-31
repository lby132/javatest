package main.java1.exception;

import java.io.File;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);    //파일 클랙스 객체 생성
        // File 객체의 createNewFile메서드를 이용해서 실제 파일을 생성.
        f.createNewFile();
        return f;
    }
}
