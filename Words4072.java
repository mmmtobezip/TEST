import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Words4072 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = br.readLine();
			if (line.equals("#")==true) break;
			String[] tt = line.split(" ");
			for (int i=0; i<tt.length; i++) {
				StringBuilder uu = new StringBuilder(tt[i]);
				sb.append(uu.reverse()+" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
