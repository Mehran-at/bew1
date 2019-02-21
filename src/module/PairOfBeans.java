package module;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PairOfBeans {
    private List<Bean> pair;
}
