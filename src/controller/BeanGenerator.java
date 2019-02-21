package controller;

import module.Bean;
import java.util.*;

public class BeanGenerator {
    public Queue<Bean> fillCanWithBeans(Queue<Bean> can) {
        Bean whiteBean = Bean.builder().colour("white").build();
        Bean blackBean = Bean.builder().colour("black").build();
        List<Bean> beans = new ArrayList<>();
        beans.add(whiteBean);
        beans.add(blackBean);
        while (can.size() <= 99) {
            Collections.shuffle(beans);
            can.offer(beans.get(0));
        }
        return can;
    }
}