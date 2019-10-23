package mybatis.java.mapper;

import mybatis.java.model.Customers;

public interface CustomersMapper {

    Customers selectCustomers(int customers_id);
}
