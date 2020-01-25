import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2752_세수정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] num = new int[3];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<3;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(num);
		
		for(int i=0;i<3;i++)
			System.out.print(num[i] + " ");
	}
}