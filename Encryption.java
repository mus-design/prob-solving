import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
s=s.replaceAll(" ","");
int p,t;int r=(int)Math.round(Math.sqrt(s.length()));
if(r>=Math.sqrt(s.length())){
t=r;
}
else
{t=r+1;}
System.out.println(s.length()+" "+r+" "+t);
String s1="";
for(int i=0;i<t;i++)
{p=i;
  for(int j=0;j<t;j++)
  {
    if(p<s.length())
    {
s1+=s.charAt(p);
p+=t;
    }
  }
  s1+=" ";
}
System.out.println("wmgjpnull cyjqlejgi lyhhdzbui wctlsqsbm fxeoxmsvv ovxjeirfm zadysxbhn nxkkbffpn bawobphfy");
return s1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
