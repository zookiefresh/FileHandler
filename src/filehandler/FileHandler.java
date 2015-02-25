/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandler;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class FileHandler  {
    
    FileHandler(){}
    
    void readFile(String filename){
        System.out.println("Attempting to read " + filename);        
        try{            
            long filesize = getFileSize(filename);        
            System.out.println(filename + " size is " + filesize);
        }
        catch (FileNotFoundException e){
           System.out.println("File missing");           
        }        
    }
    
    long getFileSize(String filename) throws FileNotFoundException{
        File file = new File(filename);
        if(!file.exists()){
            FileNotFoundException e = new FileNotFoundException(filename);
            throw e;
        }
        return file.length();
    }
    
}
