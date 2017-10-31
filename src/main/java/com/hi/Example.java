package com.hi;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = "com.hi")
@ComponentScan(basePackages="com.hi")
public class Example extends SpringBootServletInitializer {



    protected static Logger logger=LoggerFactory.getLogger(Example.class);
    @ResponseBody
    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        logger.debug("访问helloName,Name={}",myName);
        getURLContent("http://open.douyucdn.cn/api/RoomApi/live");
        return "Hello "+myName+"!!!";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getuser(Model model) throws IOException {



        model.addAttribute("name","a");
        model.addAttribute("sex","a");
        model.addAttribute("a",1);
        return "userdata/jsp/member.jsp";
    }
    /**
     * 程序中访问http数据接口
     */
    public static String getURLContent(String urlStr) {
        /** 网络的url地址 */
        URL url = null;
        /** http连接 */
        HttpURLConnection httpConn = null;
        /**//** 输入流 */
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try{
            url = new URL(urlStr);
            in = new BufferedReader( new InputStreamReader(url.openStream(),"UTF-8") );
            String str = null;
            while((str = in.readLine()) != null) {
                sb.append( str );
            }
        } catch (Exception ex) {

        } finally{
            try{
                if(in!=null) {
                    in.close();
                }
            }catch(IOException ex) {
            }
        }
        String result =sb.toString();
        System.out.println(result);
        return result;
    }


/**
        * post方式请求http服务
    * @param urlStr
    * @param params   name=yxd&age=25
            * @return
            * @throws Exception
    */
    public static String getURLByPost(String urlStr,String params)throws Exception{
        URL url=new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setDoInput(true);
        PrintWriter printWriter = new PrintWriter(conn.getOutputStream());
        printWriter.write(params);
        printWriter.flush();
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try{
            in = new BufferedReader( new InputStreamReader(conn.getInputStream(),"UTF-8") );
            String str = null;
            while((str = in.readLine()) != null) {
                sb.append( str );
            }
        } catch (Exception ex) {
            throw ex;
        } finally{
            try{
                conn.disconnect();
                if(in!=null){
                    in.close();
                }
                if(printWriter!=null){
                    printWriter.close();
                }
            }catch(IOException ex) {
                throw ex;
            }
        }
        return sb.toString();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Example.class);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}