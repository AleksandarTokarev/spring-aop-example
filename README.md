# Spring Aspects
###TLDR: @within works on class and interface level, @annotation works on method level.

https://stackoverflow.com/questions/10549992/targeting-aspects-based-annotation-on-a-class-with-spring-and-aspectj  
https://stackoverflow.com/questions/38477278/difference-between-target-and-annotation  
https://stackoverflow.com/questions/65199924/error-is-prompted-when-i-use-target-in-spring-aop  
https://stackoverflow.com/questions/10549992/targeting-aspects-based-annotation-on-a-class-with-spring-and-aspectj  
Works both on class and method level  
https://stackoverflow.com/questions/58628621/aop-supporting-annotation-and-within-in-one-pointcut  
Good explanations  
https://stackoverflow.com/questions/51807140/what-is-the-difference-between-within-and-annotation-in-aop - annotation
method, within - type (class)  
https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-pointcuts-designators  
https://stackoverflow.com/questions/54290855/spring-aop-cant-double-bind-annotation  - probably best example  
Java annotations are not inherited by default !!  
https://stackoverflow.com/questions/21409338/inherit-annotations-from-abstract-class  
Java annotations are not inherited by interface implementations !! - because you can implement multiple interfaces that have same name methods
https://stackoverflow.com/questions/4745798/why-java-classes-do-not-inherit-annotations-from-implemented-interfaces


### Endpoints
```
http://localhost:5000/api/v1/test/service
http://localhost:5000/api/v1/test/interface
```