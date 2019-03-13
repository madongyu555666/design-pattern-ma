package com.design.pattern.highsimulationproxy;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class GPProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandler handler){
            try{
                //1、动态生成源代码.java 文件
                String src = generateSrc(interfaces);

                //2、Java 文件输出磁盘
                String filePath=GPProxy.class.getResource("").getPath();
                System.out.println(filePath);
                File file= new File(filePath + "$Proxy0.java");
                FileWriter fw = new FileWriter(file);
                fw.write(src);
                fw.flush();
                fw.close();

                //3、把生成的.java 文件编译成.class 文件
                JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
                StandardJavaFileManager standardFileManager = systemJavaCompiler.getStandardFileManager(null, null, null);
                Iterable<? extends JavaFileObject> javaFileObjects =
                        standardFileManager.getJavaFileObjects(file);
                JavaCompiler.CompilationTask task = systemJavaCompiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
                task.call();
                standardFileManager.close();

                //4、编译生成的.class 文件加载到JVM 中来
                Class<?> $Proxy0 = classLoader.findClass("$Proxy0");
                Constructor<?> constructor = $Proxy0.getConstructor(GPInvocationHandler.class);
                file.delete();

               //5、返回字节码重组以后的新的代理对象
                return constructor.newInstance(handler);
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
    }

    /**
     * 动态生成源代码.java 文件
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb=new StringBuffer();
        sb.append("package com.design.pattern.highsimulationproxy;" + ln);
        sb.append("import com.design.pattern.staticproxy.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GPInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" +
                    ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""
                    + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }
        sb.append("}" + ln);
        return sb.toString();
    }
}
