package com.design.pattern.highsimulationproxy;

public class 总结 {

    /**
     * 手写jdk动态代理实现
     * 1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取。
     *
     * 2、JDK Proxy 类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接
     * 口。
     * 新生成的类
     *package com.design.pattern.highsimulationproxy;
     * import com.design.pattern.staticproxy.Person;
     * import java.lang.reflect.Method;
     * public class $Proxy0 implements com.design.pattern.staticproxy.Person{
     * GPInvocationHandler h;
     * public $Proxy0(GPInvocationHandler h) {
     * this.h = h;}
     * public void findLove() {
     * try{
     * Method m = com.design.pattern.staticproxy.Person.class.getMethod("findLove",new Class[]{});
     * this.h.invoke(this,m,null);
     * }catch(Throwable e){
     * e.printStackTrace();
     * }}}
     * 3、动态生成Java 代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体
     * 现）。
     *   通过反射获取接口的方法，在把该接口的实现类方法传入到，被代理类实现的GPInvocationHandler的invoke中，这时该类invoke中调用的是编写的增强的所有方法
     * 4、编译新生成的Java 代码.class。
     * 5、再重新加载到JVM 中运行。
     */
}
