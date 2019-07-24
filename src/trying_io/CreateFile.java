/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying_io;

import java.io.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Sajeda Qafeshi
 */
public class CreateFile {
    private Formatter SourceCode;
    private String FileName;
    private String UploadCode;
   
    public CreateFile(String file_name,String uplode_code){
        this.FileName=file_name+".txt";
        this.UploadCode=uplode_code;
        try{
        this.SourceCode = new Formatter(this.FileName);
        this.SourceCode.format(UploadCode);
        this.SourceCode.close();
        }
        catch(Exception e){
            System.out.println("You have an error!");
        
        }
    }
    
    public CreateFile(String file_name){
        this.FileName=file_name+".txt";
        
        try{
        this.SourceCode = new Formatter(this.FileName);
        this.SourceCode.format(UploadCode);
        }
        catch(Exception e){
            System.out.println("You have an error!");
        
        }
    }
    
    public void close(){
        SourceCode.close();
    
    }
    
}
