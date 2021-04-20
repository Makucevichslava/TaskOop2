package by.htp.task02.logic;

import by.htp.task02.entity.Customer;
import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

    public int compare(Customer c1, Customer c2) {
        return c1.getName().compareTo(c2.getName());
    }

}
