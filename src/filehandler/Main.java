/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandler;

import java.io.FileNotFoundException;


/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        // let the 'user' or main handle the exception
        FileHandler fh = new FileHandler();
        String [] filenames = { "test.txt",
                                "image.jpg",
                                "video.mp4"
                              };
        for(String filename : filenames){
            try{
                fh.readFile(filename);
            }
            catch (FileNotFoundException e){
                System.out.println("CRAP! file not found");            
            }
            catch (FileSizeToolLargeException e){
                System.out.println("Exception: " + filename + e.getMessage());            
            }            
        }
    }
}
