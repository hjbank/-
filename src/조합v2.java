import java.util.Arrays;

public class 조합v2 {

	static int[] arr = {1, 2, 3};
	static int N = 3;
	static int R = 2;
	static int[] sel = new int[2];
	
	/*
	 * static void comb( 위에 화살표, 아래 화살표) { if ( 아래 화살표 나갔다.) { 출력 return; }
	 * 
	 * if ( 위에 화살표가 나갔다.) { // 파토 return; }
	 * 
	 * 위에 화살표 위치의 숫자를 아래 화살표 위치에 담는다. 위 화살표 + 1, 아래 화살표 + 1 다음 상태 호출 위에 화살표 +1, 아래
	 * 화살표 그대로 다음 상태 호출 }
	 */
	static void comb( int idx, int s_idx) {
		
		if ( s_idx >= sel.length) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		
		if ( idx >= arr.length) {
			return;
		}
		
		sel[s_idx] = arr[idx];
		comb( idx +1, s_idx+1);
		comb( idx +1, s_idx);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		comb(0, 0);
		
	}

}
