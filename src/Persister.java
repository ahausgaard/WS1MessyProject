import java.io.*;
import java.util.*;

public class Persister
{
    public static void s(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int x = 0; x < users.size(); x++)
        {
            bufferedWriter.write(String.valueOf(users.get(x).name));
            bufferedWriter.write(String.valueOf(users.get(x).getName() + "," +users.get(x).getId() +"\n"));
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
