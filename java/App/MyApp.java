package App;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		String cmd = null;
		boolean flag = true;

		while (flag) {
			// 메뉴 구성
			System.out.println("원하시는 메뉴 번호를 입력하세요.");
			System.out.println("1. 입 력");
			System.out.println("2. 수 정");
			System.out.println("3. 검 색");
			System.out.println("4. 목록보기");
			System.out.println("5. 삭 제");
			System.out.println("9. 종 료");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			System.out.print("입력 : ");
			cmd = scanner.nextLine().trim();

			switch (cmd) {
			case "1":
				System.out.println("입력 작업 수행");
				break;
			case "2":
				System.out.println("수정 작업 수행");
				break;
			case "3":
				System.out.println("검색 작업 수행");
				break;
			case "4":
				System.out.println("목록보기 작업 수행");
				break;
			case "5":
				System.out.println("삭제 작업 수행");
				break;
			case "9":
				System.out.println("삭제 작업 수행");
				System.out.println("종료를 원하면 q를 입력하세요.");
				if (scanner.nextLine().equalsIgnoreCase("q")) {
					System.out.println("종료합니다.");

					scanner.close();
					scanner = null;
					return;
				} else {
					break;
				}
			default:
				System.out.println("메뉴선택을 다시 해 주세요.");
			}
		}

	}

}
