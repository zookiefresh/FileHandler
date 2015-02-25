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
    private static final int maxFileSize = 1;
    
    FileHandler(){}
    
    void readFile(String filename) throws FileNotFoundException, FileSizeToolLargeException{        
        System.out.println("Attempting to read " + filename);        
        long filesize = getFileSize(filename);        
        System.out.println(filename + " size is " + filesize);        
    }
    
    long getFileSize(String filename) throws FileNotFoundException, FileSizeToolLargeException{
        File file = new File(filename);
        if(!file.exists()){
            FileNotFoundException e = new FileNotFoundException(filename);
            throw e;
        }
        
        long fileSize = file.length();
        if(fileSize > maxFileSize){
            FileSizeToolLargeException e = new FileSizeToolLargeException(maxFileSize);
            throw e;
        }
        return fileSize;
    }
    
}
