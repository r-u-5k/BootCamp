package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 절대경로(Absolute Path)
		 *   - C:, D: 드라이브를 기준으로 경로를 기술
		 *   - ex) C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]
		 * 
		 * 상대경로(Relative Path)
		 *   - 현재 경로를 기준으로 경로를 기술
		 *   - ex) .\a.txt --> C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]\a.txt
		 *   - ex) .\sample\a.txt --> C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]\sample\a.txt
		 *   
		 *   FileMain.class가 실행되고 있는 기준 경로: C:\2023-12-JAVA-DEVELOPER\eclipse-workspace-se\20.입출력[IO]
		 */
		System.out.println(File.separator);
		File file1 = new File("C:\\2023-12-JAVA-DEVELOPER\\eclipse-workspace-se\\20.입출력[IO]\\데미안.txt");
		File file2 = new File("죄와벌.txt");
		File file3 = new File("sample/OSPP.VBS");
		File file4 = new File("sample/subsample1/wmpshare.exe");
		File file5 = new File("sample/subsample2/Car.java");
		
		System.out.println("- 1. File Path [Relative] -");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println(file5.getPath());
		
		System.out.println("- 2. File Path [Absolute] -");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println(file5.getAbsolutePath());
		
		System.out.println("- 3. File Name -");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println(file5.getName());
		
		File dir0 = new File("C:/2023-12-JAVA-DEVELOPER/eclipse-workspace-se/20.입출력[IO]");
		File dir1 = new File("sample");
		File dir2 = new File("sample/subsample1");
		File dir3 = new File("sample", "subsample2");
		
		System.out.println("- isDirectory(), isFile() -");
		System.out.println(dir0.isDirectory());
		System.out.println(dir1.isDirectory());
		System.out.println(file1.isDirectory());
		System.out.println(file2.isDirectory());
		System.out.println(dir2.isFile());
		System.out.println(dir3.isFile());
		System.out.println(file3.isFile());
		System.out.println(file4.isFile());
		
		System.out.println("- 디렉토리 안에 있는 파일[디렉토리] 목록 (String) -");
		String[] fileNameList = dir1.list();
		for (String fileName : fileNameList) {
			System.out.println("\t" + fileName);
		}
		
		System.out.println("- 디렉토리 안에 있는 파일[디렉토리] 목록 (File[]) -");
		File[] fileList = dir1.listFiles();
		for (File file : fileList) {
			if (file.isDirectory()) {
				System.out.println("Dir: " + file.getName());
				//Directory
				File[] subFileList = file.listFiles();
				for (File sub : subFileList) {
					System.out.println("\t" + sub.getName());
				}
			} else {
				System.out.println("File: " + file.getName());
			}
		}
		
		System.out.println("- 1. 디렉토리 생성 -");
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2");
		File newDir3 = new File("sample", "subsample3");
		File newDir4 = new File("sample/subsample4");
		System.out.println("newDir1의 생성 여부: " + newDir1.mkdir());
		System.out.println("newDir2의 생성 여부: " + newDir2.mkdir());
		System.out.println("newDir3의 생성 여부: " + newDir3.mkdir());
		System.out.println("newDir4의 생성 여부: " + newDir4.mkdir());
		
		System.out.println("- 2. 디렉토리 이름 변경 -");
		System.out.println("newDir2 rename 성공 여부: " + newDir2.renameTo(new File("renameDir2")));
		
		System.out.println("- 3. 디렉토리 삭제 -");
		System.out.println("newDir3의 삭제 여부: " + newDir3.delete());
		
//		newDir3.deleteOnExit(); -> 있으면 삭제, 없으면 말고
	}

}
