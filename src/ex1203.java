import java.io.File;
import java.io.FileOutputStream;

public class ex1203 {

	public static void main(String[] args) {
		File file = new File ("gugudan.txt");
		
		try {
		if(!file.exists())
			file.createNewFile();
		
			FileOutputStream fos = new FileOutputStream(file);
			
			// 파일에서 구구단 계산 출력하기
			for(int x = 2; x <= 9; x++) {//그룹
				for(int y = 1; y <=9; y++) {//숫자
					String str = x + "x" + y + "=" +(x+y) + "\n";
					byte[] b = str.getBytes();
					fos.write(b);
				}
			}
			
			fos.close();
			System.out.println("파일 쓰기 성공!");
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
