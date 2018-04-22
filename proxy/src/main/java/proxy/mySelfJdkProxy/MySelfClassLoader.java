package proxy.mySelfJdkProxy;

import java.io.*;

public class MySelfClassLoader extends ClassLoader{
    private File classPathFile;

    public MySelfClassLoader(){
        String classPath =MySelfClassLoader.class.getResource("").getPath();
        this.classPathFile=new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = MySelfClassLoader.class.getPackage().getName()+"."+name;

        if(classPathFile!=null){
            File classFile =new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream in=null;
                ByteArrayOutputStream out=null;
                try{
                    in=new FileInputStream(classFile);
                    out=new ByteArrayOutputStream();
                    byte [] buff=new byte[1024];
                    int len;
                    while((len = in.read(buff))!= -1){
                        out.write(buff,0,len);
                    }
                    return  defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if(null!=in){
                        try {
                            in.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    if(out != null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }





        }


        return null;
    }


}
