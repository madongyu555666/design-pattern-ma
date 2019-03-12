package com.design.pattern.simplefactory;

import com.design.pattern.common.AudiCar;
import com.design.pattern.common.CadillacCar;
import com.design.pattern.common.ICar;
import org.apache.commons.lang.StringUtils;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    /**
     * 创建实例
     * @param type
     * @return
     */
    public ICar create(String type){
      if(StringUtils.isEmpty(type)){
         return null;
      }
      if("Audi".equals(type)){
          return new AudiCar();
      }else if("Cadillac".equals(type)){
         return new CadillacCar();
      }else {
          return null;
      }
    }

    /**
     * 通过反射创建
     * @param className
     * @return
     */
    public ICar createByclazz(String className){
        try {
            if (!(null == className || "".equals(className))) {
                return (ICar) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 通过类实例化
     * @param clazz
     * @return
     */
    public ICar create(Class<? extends ICar> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }




}
