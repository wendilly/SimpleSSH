package com.wend.utils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/23.
 * 岳文东
 */
public class EmptyUtil {

    public static boolean isNotEmpty(String str){
        return !(str==null || "".equals(str.trim()));

    }


    public static boolean isNotEmpty(Object[] os){
        return !(os==null || os.length==0);

    }

    public static boolean isNotEmpty(Collection<?> list){
        return  !(list==null  || list.size()==0);
    }

    public static boolean isNotEmpty(Map<?,?> map){
        return  !(map==null  || map.isEmpty());
    }

    public static boolean isNotNull(Object... o){
        boolean isNotNulls=true;
        if (o!=null) {

            for (Object o1 : o) {
                System.out.println("o1 = " + o1);
                if (o1==null){
                    isNotNulls= false;
                }
            }
        }else {
            isNotNulls=false;
        }
        return isNotNulls;
    }
}
