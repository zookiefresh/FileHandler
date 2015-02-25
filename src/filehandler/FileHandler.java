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
    
    void readFile(String filename) throws FileNotFoundException{
        System.out.println("Attempting to read " + filename);        
        long filesize = getFileSize(filename);        
        System.out.println(filename + " size is " + filesize);        
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
