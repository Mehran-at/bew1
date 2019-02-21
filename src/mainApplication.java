import controller.BeanColourFilter;
import controller.BeanGenerator;
import controller.Counter;
import module.Bean;
import java.util.LinkedList;
import java.util.Queue;

public class mainApplication {

    public static void main(String[] args) {
        BeanGenerator beanGenerator = new BeanGenerator();
        Queue<Bean> finalCan = new LinkedList<>();
        System.out.println(beanGenerator.fillCanWithBeans(finalCan));
        Counter counter = new Counter();
        System.out.println("Number of black beans:"+counter.countBlackBeans(finalCan));
        System.out.println("Number of white beans:" + counter.countWhiteBeans(finalCan));
    }
}
