package guava;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Wither;

import java.util.ArrayList;
import java.util.List;

/**
 * Table
 * キーを2種類持てる Map のようなもの
 * 複数のキーで(といっても2種類)オブジェクト集合を検索するための一時的な索引として使うと便利
 * 2種類があれば3種類も、と思うが、3種類以上のキーを持てるものは、残念ながら無い
 */
public class TableTest {
    public static void main(String[] args) {
        List<TableTest.Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "あいうえお"));
        employees.add(new Employee(2, "かきくけこ"));
        Table<Integer, String, Employee> table = HashBasedTable.create();
        employees.stream().forEach(employee -> {
            table.put(employee.getNo(), employee.getName(), employee);
        });

        System.out.println(employees);
    }

    @Data
    @AllArgsConstructor
    private static class Employee {
        private int no;
        private String name;
    }
}
