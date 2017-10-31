package com.util;

import com.hi.TableName;
import com.hi.TableU;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Util {
    /**
     * java读取文件中的属性类型
     * @param model
     * @return
     * @throws Exception
     */

    public static ArrayList<FieldData> getModelAttriButeType(Class model) throws Exception{
        Field[] field = model.getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        ArrayList<FieldData> map = new ArrayList<FieldData>();
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
            FieldData data=new FieldData();
            String name = field[j].getName();    //获取属性的名字
            TableName tableName= field[j].getAnnotation(TableName.class);
            System.out.println("attribute name:"+name);
            //name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
            //String type = field[j].getGenericType().toString();    //获取属性的类型
              /*if(type.equals("class java.lang.String")){   //如果type是类类型，则前面包含"class "，后面跟类名
                  Method m = model.getClass().getMethod("get"+name);
                  String value = (String) m.invoke(model);    //调用getter方法获取属性值
                  if(value != null){

                      System.out.println("attribute value:"+value);
                  }
              }*/
            //type = type.replace("class ", "");
            //System.out.println("=>:"+type);
            data.name=name;
            data.value=tableName.value();
            map.add(data);

        }
        return map;
    }

    /**
     * java读取文件中的属性类型
     * @param model
     * @return
     * @throws Exception
     */

    public static Map<String,Object> getModelValue(Object model) throws Exception{
        Field[] field = model.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组
        Map<String,Object> map = new HashMap<String,Object>();
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
            String name = field[j].getName();    //获取属性的名字
            System.out.println("attribute name:"+name);
            String nameA = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
            String type = field[j].getGenericType().toString();    //获取属性的类型
            Object value=null;
                  Method m = model.getClass().getMethod("get"+nameA);
                  value = m.invoke(model);    //调用getter方法获取属性值
                  System.out.println("attribute method:"+"get"+nameA);
                  System.out.println("attribute value:"+value);
            map.put(name,value);

        }
        return map;
    }
    /**
     * 获得8个长度的十六进制的UUID
     * @return UUID
     */
    public static String GetTableName(Class model){
        //TableU tablename=model.getAnnotation(TableU.class);
        TableU tablename=(TableU)model.getAnnotation(TableU.class);
        return tablename.value();
    }
    /**
     * 获得8个长度的十六进制的UUID
     * @return UUID
     */
    public static String get8UUID(){
        UUID id= UUID.randomUUID();
        String[] idd=id.toString().split("-");
        return idd[0];
    }
}
