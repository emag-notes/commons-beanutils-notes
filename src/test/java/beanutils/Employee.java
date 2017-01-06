package beanutils;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  private List<Department> departments = new ArrayList<>();

  public List<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Employee employee = (Employee) o;

    return departments != null ? departments.equals(employee.departments) : employee.departments == null;
  }

  @Override
  public int hashCode() {
    return departments != null ? departments.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "departments=" + departments +
      '}';
  }

}
