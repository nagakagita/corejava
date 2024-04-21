import java.util.List;
import java.util.Map;

public class Order {
    Map<Item,Integer> orderMap;

    public Map<Item, Integer> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<Item, Integer> orderMap) {
        this.orderMap = orderMap;
    }
}
