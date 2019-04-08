
package readfromfile;
import java.util.*;
import java.io.*;
//import jdk.jfr.events.FileWriteEvent;
public class ReadFromFile {
    
    public static void main(String[] args) throws IOException{
        File in = new File("input.txt");
        FileWriter out = new FileWriter("output.txt");
        
        String str;
        Scanner scan =new Scanner(in);
        Vector<String> paragraph= new Vector();
        while(scan.hasNext()){
            str=scan.next();
            paragraph.add(str);
        }
        Collections.sort(paragraph);
        int count=1,unique=1;
        for(int i=0;i<paragraph.size()-1;i++){
            if(!paragraph.get(i).equals(paragraph.get(i+1))){
                   out.write(paragraph.get(i)+" "+count+"\n");
                   count=1;
                   unique++;
            } 
            else
                count++;
        }
        out.write(paragraph.get(paragraph.size()-1)+" "+count+"\n");
        out.write("\nTotal Word = "+paragraph.size()+"\n");
        out.write("\nTotal Unique Word = "+unique+"\n");
        out.close();
                
        
        
        
        
    }
/*
    private static Vector<String> add(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    
}