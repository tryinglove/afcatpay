package com.afcat.mailserver.title;

import com.afcat.mailserver.file.NumberReader;

/**
 * Created by xn.L on 2018/7/9.
 */
public abstract class AbstractTitleHandle {
    private  String type;
    private int number = 0;
    private  NumberReader reader;

    private AbstractTitleHandle(){}

    public AbstractTitleHandle(String type){
        this.type = type;
        this.reader = getResource();
        setNumber();

    }
    public  int getNumber(){
        return this.number;

    }

    public void setClientNumber(){
        String[] numbers = getContext().split(",");
        for(int i = 0;i<numbers.length;i++){

            if(type.equals(numbers[i].substring(0,2)))
                numbers[i] = numbers[i].substring(0,2)+":"+String.valueOf(number+1)+",";

        }
        String conte = "";
        for(int i = 0;i<numbers.length;i++){
            conte+=numbers[i];
        }
        System.out.println(conte);
        reader.setContext(conte);
    }
    private void setNumber(){

        String[] numbers = getContext().split(",");
        for(String clientInfo:numbers){

            if(type.equals(clientInfo.substring(0,2))){
                this.number =  Integer.valueOf(clientInfo.substring(3,clientInfo.length()));
                break;
            }

        }

    }
    private  String getContext(){

        return reader.getContext();
    }
    public abstract NumberReader getResource();
}
