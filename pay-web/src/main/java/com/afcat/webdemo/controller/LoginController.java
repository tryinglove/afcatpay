package com.afcat.webdemo.controller;


import com.afcat.common.service.ImUserService;
import com.afcat.common.vo.ImUser;
import com.afcat.webdemo.common.NoSessionController;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by john on 2017/12/7.
 *
 */
@Controller
@RequestMapping("sys")
public class LoginController extends NoSessionController {
    private final static boolean FLAG = false;
    @Resource(name = "imUserService")
    ImUserService imUserService;

    @GetMapping("/login")
    public String login(ModelMap modelMap){

        return "login";
    }

    @GetMapping("/home")
    public String home(){

        return "index";
    }

    @GetMapping("/content")
    public String content(){

        return "content";
    }

    @RequestMapping("/validateAccount")
    @ResponseBody
    public Map<String,Object> validateAccount(String account){
        Map<String , Object> map = new HashMap<String , Object>();

        List<ImUser> list = imUserService.validateAccount(account);

        map.put("haveOne",list.isEmpty());
        return map;
    }

    @RequestMapping("/register")
    public String register(ImUser imUser,ModelMap modelMap){

        imUserService.add(imUser);
        modelMap.addAttribute("account",imUser.getUser_acc());
        return login(modelMap);
    }



    @PostMapping("/login")
    public String login(String account,String password,String code,ModelMap modelMap){
        String session_code = this.session.getAttribute("validateCode").toString();

        if(FLAG || session_code.equals(code)){
            ImUser imUser = imUserService.login(account,password);
            if(imUser==null){
                modelMap.addAttribute("message" , "用户名和密码不匹配!");
                modelMap.addAttribute("account" , account);
                return login(modelMap);
            }else{
                session.setAttribute("session_user" , imUser);
                return home();
            }
        }else{
            modelMap.addAttribute("message" , "您输入的验证吗不正确,请重新输入!");
            modelMap.addAttribute("account" , account);
            return login(modelMap);
        }
    }

    @GetMapping("/logout")
    public String logout(ModelMap modelMap){
        ImUser imUser = (ImUser)session.getAttribute("session_user");
        modelMap.addAttribute("account" , imUser.getUser_acc());
        session.invalidate();
        return login(modelMap);
    }


    @RequestMapping(path="/code",method=RequestMethod.GET)
    @ResponseBody
    public void validCode() throws Exception{
        String s = "";
        /**
         * 验证码宽度
         */
        int width=100;
        /**
         * 验证码高度
         */
        int height=41;
        /**
         * 验证码字符集
         */
        char[] code=new char[]{
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z',
                '2','3','4','5','6','7','8','9'};

        /**
         *  创建一个随机数生成器类
         */
        Random random = new Random();

        // 随机产生codeCount数字的验证码。
        for (int i = 0; i < 4; i++) {
            // 得到随机产生的验证码数字。
            String strRand = String.valueOf(code[random.nextInt(code.length)]);

            // 将产生的四个随机数组合在一起。
            s=s+strRand;
        }

        // 保存入session,用于与用户的输入进行比较.
        // 注意比较完之后清除session.

        this.session.setAttribute("validateCode", s);

        this.response.setContentType("image/gif");

        // 定义图像buffer
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D gra = image.createGraphics();
        // 将图像填充为白色
        gra.setColor(Color.WHITE);
        gra.fillRect(0, 0, width, height);

        // 创建字体，字体的大小应该根据图片的高度来定。

        //字体对象构造方法public Font(String familyName,int style,int size)
        // familyName字体名；字体名可以分成两大类：中文字体：宋体、楷体、黑体等；英文字体：Arial、Times New Roman等等；
        // style风格。PLAIN普通字体，BOLD（加粗），ITALIC（斜体），Font.BOLD+ Font.ITALIC（粗斜体）
        //size 大小

        Font font = new Font("宋体", Font.BOLD, 32/*height-4*/);//

        // 设置字体。
        gra.setFont(font);

        // 画边框。
        gra.setColor(getColor());
        gra.drawRect(0, 0, width - 1, height - 1);

        // 随机产生干扰线，使图象中的认证码不易被其它程序探测到。
        gra.setColor(Color.BLACK);
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(5);
            int yl = random.nextInt(5);
            gra.setColor(getColor());
            gra.drawLine(x, y, x + xl, y + yl);
        }

        // 输出数字
        char c;

        for (int i = 0; i < 4; i++) {

            c = s.charAt(i);

            gra.drawString(c + "", i * 25 + 2, 32); // 25为宽度，11为上下高度位置

        }

        OutputStream toClient = this.response.getOutputStream();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(toClient);
        encoder.encode(image);

        toClient.close();



    }

    private Color getColor()
    {
        Random random = new Random();
        int red = 0, green = 0, blue = 0;
        // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
        red = random.nextInt(255);
        green = random.nextInt(255);
        blue = random.nextInt(255);
        return new Color(red,green,blue);
    }
}
