import java.util.*;
import java.io.*;

class arraylist
{
    static public void main(String args[]) throws IOException
    {
        BufferedReader in = null;
List<String> myList = new ArrayList<String>();
try {   
    in = new BufferedReader(new FileReader("Ramika"));
    String str;
    while ((str = in.readLine()) != null) {
        
        myList.add(str);
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    if (in != null) {
        in.close();
    }
}
    System.out.println(myList);
    }
}