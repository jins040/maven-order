package kr.re.kitri.service;

import kr.re.kitri.model.Order;
import kr.re.kitri.util.OrderConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderService {

    // Driver loading용 생성자 생성 (우클릭 generator constructor)
    public OrderService() {
        try {
            Class.forName(OrderConstants.DRIVER_POSTGRES);
            System.out.println("Driver loading ok..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getOrderList() {

        List<Order> list = new ArrayList<>();

        Connection conn = this.getConnection();

        if (conn != null) {
            System.out.println("Connection ok..");

            try {
                PreparedStatement psmt = conn.prepareStatement(OrderConstants.QUERY);

                ResultSet rs = psmt.executeQuery();

                TranslateToList(rs, list);

                conn.close();
                System.out.println("Connection terminated..");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Connection error..");
        }

        return list;
    }

    private void TranslateToList(ResultSet rs, List<Order> list) throws SQLException {

        while (rs.next()) {

            list.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6)));
        }
    }

    private Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(
                    OrderConstants.DB_URL, OrderConstants.USERNAME, OrderConstants.PASSWORD
            );

            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
