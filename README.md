# commons-beanutils-notes

## Prerequisites

* JDK 1.7.0_80
* commons-beanutils 1.8.3

## Usage

``` sh
$ ./mvnw clean test
```

You can see the following stacktrace.

```
java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
  at java.util.ArrayList.rangeCheck(ArrayList.java:635)
  at java.util.ArrayList.get(ArrayList.java:411)
  at org.apache.commons.beanutils.PropertyUtilsBean.getIndexedProperty(PropertyUtilsBean.java:513)
  at org.apache.commons.beanutils.PropertyUtilsBean.getIndexedProperty(PropertyUtilsBean.java:410)
  at org.apache.commons.beanutils.PropertyUtilsBean.getNestedProperty(PropertyUtilsBean.java:768)
  at org.apache.commons.beanutils.PropertyUtilsBean.getProperty(PropertyUtilsBean.java:846)
  at org.apache.commons.beanutils.BeanUtilsBean.setProperty(BeanUtilsBean.java:903)
  at org.apache.commons.beanutils.BeanUtilsBean.populate(BeanUtilsBean.java:830)
  at org.apache.commons.beanutils.BeanUtils.populate(BeanUtils.java:433)
  at beanutils.PopulateTest.ng(PopulateTest.java:37)
[...]
```