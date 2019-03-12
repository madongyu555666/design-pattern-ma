package com.design.pattern;


import java.io.*;

/**
 * 深度克隆
 */
public class DeepSeafoodCommodity extends Good  implements Cloneable, Serializable {
      public  Good  good;

      public  DeepSeafoodCommodity(){
          this.good=new Good();
      }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /*为了防止破坏单例，不进行深克隆，直接返回对象就可以
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new DeepSeafoodCommodity();
    }*/

    private Object deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            DeepSeafoodCommodity copy = (DeepSeafoodCommodity)ois.readObject();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 浅克隆
     * @param target
     * @return
     */
    public DeepSeafoodCommodity shallowClone(DeepSeafoodCommodity target){
        DeepSeafoodCommodity deepSeafoodCommodity = new DeepSeafoodCommodity();
        deepSeafoodCommodity.good=target.good;
        deepSeafoodCommodity.name=target.name;
        deepSeafoodCommodity.number=target.number;
        deepSeafoodCommodity.unitPrice=target.unitPrice;
        deepSeafoodCommodity.weight=target.weight;
        return deepSeafoodCommodity;
    }


}
