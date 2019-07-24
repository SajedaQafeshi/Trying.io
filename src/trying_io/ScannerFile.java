/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying_io;

import java.io.*;
import java.lang.*;
import java.util.*;
import trying_io.*;
/**
 *
 * @author Sajeda Qafeshi
 */
public class ScannerFile {
    
    private Scanner SourceCode;
    private String FileName;
    private String FileName2;

    
    
    
    public ScannerFile(String file_name){
        this.FileName2=file_name+"1.txt";
        this.FileName=file_name+".txt";

        try{
            
            SourceCode = new Scanner(new File("java.txt"));
            
            
        }
        catch(Exception e){
            System.out.println("You have an error!");
        
        }
    }
    
    
    public void read(){
    
    //    private String FileName2;
        while (SourceCode.hasNext()) {
            String a = SourceCode.next();
            String b = SourceCode.next();
            String c = SourceCode.next();
            String d = SourceCode.next();

            System.out.printf( a+b+c+d);
        }
  
    
    }
    
    public void close(){
    
        SourceCode.close();
    
    }
    
}
