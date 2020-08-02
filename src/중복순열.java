import java.util.Arrays;

/*
 * N진 트리 
 * 
 * */
public class 중복순열 {
	
	static int N =3;
	static int [] arr = {1, 3, 5};
	static int [] sel= new int[N]; // arr과 같은 크기
	
	//idx 번째에 대해서 어떤 숫자를 골라?
	
	static void perm(int idx) {
		
		// 모두 골랐다.
		if ( idx == N ) {
			System.out.println(Arrays.toString(sel));
			return ;
		}
		
		for ( int i=0; i< N; i++) {
			sel[idx] = arr[i];
			perm(idx+1);
		}		
	}
	
	
	public static void main(String[] args) {
		perm(0);
		
	}
}
