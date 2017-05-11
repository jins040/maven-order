package kr.re.kitri.util;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public interface OrderConstants {

    String DRIVER_POSTGRES = "org.postgresql.Driver";
    String DB_URL = "jdbc:postgresql://localhost:5432/shoppingmall";
    String USERNAME = "postgres";
    String PASSWORD = "0409";

    String QUERY =
            "select a.cust_id, a.username, a.address, a.email, b.order_date, b.prod_name " +
            "from   customer a, orders b " +
            "where  a.cust_id = b.cust_id;";
//    String QUERY =
//        "select customer.cust_id, customer.username, customer.address, " +
//                "customer.email, orders.order_date, orders.prod_name " +
//                "from  customer, orders " +
//                "where  customer.cust_id = orders.cust_id;";
}
