/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandler;

/**
 *
 * @author User
 */
public class FileSizeToolLargeException extends Exception{    
    private long fileSize;
    
    FileSizeToolLargeException(int fileSize){
        super();
        this.fileSize = fileSize;
    }
    FileSizeToolLargeException(int fileSize, String msg){
        super(msg);
        this.fileSize = fileSize;
    }
    
    @Override
    public String getMessage(){
        return " exceeds max file size of " + fileSize;              
    }
}
