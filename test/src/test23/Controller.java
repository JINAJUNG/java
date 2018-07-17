package test23;

public class Controller {
	public void callOrder(String order) {
		if("1".equals(order)) {
			System.out.println("유저리스트를 보고 싶군요");
		}else if("2".equals(order)) {
			System.out.println("유저리스트를 추가하고 싶군요");
		}else if("3".equals(order)) {
			System.out.println("유저리스트를 수정하고 싶군요");
		}else if("4".equals(order)) {
			System.out.println("유저리스트를 삭제하고 싶군요");
		}else if("q".equals(order)){
			System.out.println("종료각~");
		//	System.exit(0);//강제종료
		}else {
			System.out.println("존재하지 않는 명령어 임네다!");
		}
	}
}