package beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PopulateTest {

  @Test
  public void ok() throws Exception {
    Department department = new Department();
    department.setName("aaa");

    Employee employee = new Employee();
    employee.getDepartments().add(department);

    Map<String, String> props = new HashMap<>();
    props.put("departments[0].name", "AAA");

    BeanUtils.populate(employee, props);

    assertThat(employee.getDepartments().get(0).getName()).isEqualTo("AAA");
  }

  @Test
  public void ng() throws Exception {
    Employee employee = new Employee();

    Map<String, String> props = new HashMap<>();
    props.put("departments[0].name", "AAA");

    try {
      BeanUtils.populate(employee, props);
    } catch (IndexOutOfBoundsException e) {
      assertThat(e).hasMessage("Index: 0, Size: 0");
      e.printStackTrace();
    }
  }

}
