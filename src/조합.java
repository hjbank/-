/* 부분집합 */

public class 조합 {

	static int[] arr = {1, 2, 3 };
			
	static boolean[] sel = new boolean[4];
	
	// idx 번째 원소에 대해서 고를지? 말지?
	static void powerSet(int idx) {
		
		// 다 골랐다.
		if ( idx == arr.length) {
			// 모든 원소들 중에서 골라진 것만 출력
			for( int i=0; i<arr.length; i++) {
				if( sel[i] )
					System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// idx 번째 원소를 고른걸로 체크해두고 다음 원소로 이동
		sel[idx] = true;
		powerSet(idx+1);
		// idx 번째 원소를 안고른걸로 체크해두고 다음 원소로 이동
		sel[idx] = false;
		powerSet(idx+1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerSet(0);
	}

}
