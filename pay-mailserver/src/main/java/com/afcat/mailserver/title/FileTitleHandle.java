package com.afcat.mailserver.title;

import com.afcat.mailserver.file.FileHandle;
import com.afcat.mailserver.file.NumberReader;

/**
 * Created by xn.L on 2018/7/9.
 */
public class FileTitleHandle extends AbstractTitleHandle{


    public FileTitleHandle(String type) {
        super(type);
    }

    public NumberReader getResource() {
        return new FileHandle();
    }


}
