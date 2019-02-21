package controller;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;
import module.Bean;

import java.util.LinkedList;
import java.util.Queue;
@NonNull
public class Counter {

    public Integer countWhiteBeans(Queue<Bean> can) {
        Queue<Bean> copy = can;
        Integer numberOfWhiteBeans = 0;
        while (can.size() > 1) {
            Bean bean1 = copy.poll();
            Bean bean2 = copy.poll();
            if (bean1.getColour().equals("white") || bean2.getColour().equals("white")) {
                numberOfWhiteBeans += 1;
            }
        }
        return numberOfWhiteBeans;
    }

    public Integer countBlackBeans(Queue<Bean> can) {
        Queue<Bean> copy = can;
        Integer numberOfBlackBeans = 0;
        while (can.size() > 1) {
            Bean bean1 = copy.poll();
            Bean bean2 = copy.poll();
            if (bean1.getColour().equals("black") || bean2.getColour().equals("black")) {
                numberOfBlackBeans += 1;
            }
        }
        return numberOfBlackBeans;
    }
}
