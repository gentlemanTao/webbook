package org.smart4j.framework.util;

/**
 * @Author: Gentleman
 * @Date: 2018/10/19 0:45
 * @Description:转型工具操作类
 **/
public class CastUtil {
    /**
     * 转为String型
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return CastUtil.castString (obj,"");
    }
    /**
     * 转为String型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj,String defaultValue){
        return obj!=null ?String.valueOf (obj):defaultValue;
    }
    /**
     * 转为double型
     * @param obj
     * @return
     */
    public static double castDouble(Object obj){
        return castDouble (obj,0);
    }
    /**
     * 转为double型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static double castDouble(Object obj,double defaultValue){
        double doubleValue=defaultValue;
        if (obj!=null){
            String strVlaue=castString (obj);
            if (StringUtil.isNotEmpty (strVlaue)){
                try {
                    doubleValue=Double.parseDouble (strVlaue);
                }catch (NumberFormatException e){
                    doubleValue=defaultValue;
                }
            }
        }
        return doubleValue;
    }
    /**
     * 转为long型(
     * @param obj
     * @return
     */
    public static long castLong(Object obj){
        return castLong (obj,0);
    }
    /**
     * 转为long型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static long castLong(Object obj,long defaultValue){
        long longValue=defaultValue;
        if (obj!=null){
            String strValue=castString (obj);
            if (StringUtil.isNotEmpty (strValue)){
                try {
                    longValue=Long.parseLong (strValue);
                }catch (NumberFormatException e){
                    longValue=defaultValue;
                }
            }
        }
        return longValue;
    }
    /**
     * 转为int型
     * @param obj
     * @return
     */
    public static int castInt(Object obj){
        return castInt (obj,0);
    }
    /**
     * 转为int型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castInt(Object obj,int defaultValue){
        int intValue=defaultValue;
        if (obj!=null){
            String strValue=castString (obj);
            if (StringUtil.isNotEmpty (strValue)){
                try {
                    intValue=Integer.parseInt (strValue);
                }catch (NumberFormatException e){
                    intValue=defaultValue;
                }
            }
        }
        return intValue;
    }
    /**
     * 转为boolean型
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj){
        return castBoolean (obj,false);
    }
    /**
     * 转为boolean型(提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean booleanValue=defaultValue;
        if (obj!=null){
            booleanValue=Boolean.parseBoolean(castString (obj));
        }
        return booleanValue;
    }
}
