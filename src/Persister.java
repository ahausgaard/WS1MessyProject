import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for(int x=0; x<=users.size(); x++)
        {
            bw.write(users.get(x).c_nam);
            bw.write(users.get(x).getId());
        }
    }
}
