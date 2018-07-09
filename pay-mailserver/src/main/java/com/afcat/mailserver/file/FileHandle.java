package com.afcat.mailserver.file;

import com.afcat.mailserver.util.ClassUtils;

import java.io.*;


/**
 * Created by xn.L on 2018/7/9.
 */
public class FileHandle implements NumberReader{
    private static  final  String FILENAME =  "titleNumberFile.txt";

    private String fileContext;

    public FileHandle(){
        init();
    }
    private void init(){
        InputStream is = null;
        try {
        is = ClassUtils.getDefaultClassLoader().getResourceAsStream(FILENAME);

        byte[] b = new byte[1024];
        int i = 0;
        int index = 0;
        is.read(b);

        while((i=is.read())!=-1){//把读取的数据放到i中
            b[index]=(byte) i;
            index++;
        }
        //把字节数组转成字符串
        System.out.println(new String(b,"ISO-8859-1"));

        this.fileContext = new String(b);

        System.out.println(fileContext);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getContext(){
        return fileContext;
    }

    public void setContext(String context) {
       String path = ClassUtils.getDefaultClassLoader().getResource(FILENAME).getPath();
        File file = new File(path);
        FileWriter writer;
        try {
            writer = new FileWriter(path);
            writer.write(context);
            writer.flush();
            writer.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }



}
