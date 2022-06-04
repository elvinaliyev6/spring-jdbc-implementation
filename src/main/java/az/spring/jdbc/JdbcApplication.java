package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbcConfig;
import az.spring.jdbc.dao.EmployeeDao;
import az.spring.jdbc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

        List<Employee> employeeList = employeeDao.getAllEmployees();

        System.out.println("Employee list : " + employeeList);
    }

}
