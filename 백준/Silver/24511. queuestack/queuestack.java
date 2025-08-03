import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        String[] type = br.readLine().split(" ");
        String[] val = br.readLine().split(" ");
        
        int m = Integer.parseInt(br.readLine());
        
        String[] addVar = br.readLine().split(" ");

        
        Queue<String> q = new LinkedList<>();
        for (int i=n-1; i>=0; i--){
            if (type[i].equals("0")) {
            	q.add(val[i]);
            }
        }

        for (String cvar : addVar){
            q.add(cvar);
            bw.write(q.remove()+" ");
        }
        bw.flush();
    }
}
