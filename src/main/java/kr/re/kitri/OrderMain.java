package kr.re.kitri;

import kr.re.kitri.model.Order;
import kr.re.kitri.service.OrderService;

import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderMain {

    public static void main(String[] args) {

        // 드라이버 로딩은 OrderService 생성자에 포함시켜도 된다.
        OrderService service = new OrderService();

        List<Order> list = service.getOrderList();

        if (list.size() > 0) {
            for (Order e : list) {
                System.out.println(e);
            }
        } else {
            System.out.println("No Data..");
        }

    }
}
