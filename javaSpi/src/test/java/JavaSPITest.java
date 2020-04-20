import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.learn.Robot;
import org.junit.Test;

import java.util.ServiceLoader;


public class JavaSPITest {


    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

    @Test
    public void sayHelloDubbo() throws Exception {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
//        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        Class<URL> urlClass = URL.class;
        System.out.println(urlClass);;
//        bumblebee.sayHello();
    }
}
