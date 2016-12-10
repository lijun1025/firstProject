package com.gitub.io;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;


public class IOUtils {
		public static void copy(File src,File dest) throws Exception{
			//File dest=null;
			FileInputStream fis=new FileInputStream(src);
			FileOutputStream fos=new FileOutputStream(dest);
			byte[] buffer=new byte[1024];
			int length;
			while(-1!=(length=fis.read(buffer))){
				fos.write(buffer, 0, length);
			}	
		}
	
}
