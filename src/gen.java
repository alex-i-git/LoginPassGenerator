import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class gen {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String log_template = "temp";
        String abg = "abcdefghijklmnopqrstuvwxyz1234567890";
        int count = 1000;
        int id = 0;
        String pair = "";
        String pass = "";
        String[]  charArray = abg.split("",-1);

        PrintWriter genpass = new PrintWriter("genpass.txt", "UTF-8");

        for(int i=1;i<=count;i++){
            pair=log_template;
            pair = pair.concat(String.valueOf(i));
            id=i+10;
            pass = "";
            for(int j=0;j<7;j++){
                pass = pass.concat(charArray[(int)(Math.random()*charArray.length)]);
            }
            genpass.println("Insert into USERS (ID,USERNAME,PASSWORD) values ('"+id+"','" +pair+"','"+pass+"');");
        }
        genpass.close();
    }
}
