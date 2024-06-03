Spring Container
-> Spring container is a core part of the spring framework.
-> It helps to manage the creation, configuration and life cycle of objects.
IQ-> What are the primary function of Spring container.
	a. Create and manange objects.		[Inversion of Control]
	b. Inject the object dependencies.  [Dependency Injection]

Inversion of Control
-> To give the responsiblity of object creation and dependencies manangement to the spring container.
-> So the we can say, our program is loosely coupled.

Dependency Injection
-> Dependency Injection is a core feature that is mananged by the IOC/spring container.

IQ. How to inject Dependencies?
	1. By contructor injection
	2. By setter injection 

@Component: 
-> It marks the class as a spring bean.
-> It is a normal class that is managed by Spring container.
-> It also makes the bean available for dependency injection.

@Autowired
-> It tells the spring container to inject a dependency.

@Qualifier
-> If we have multiple bean class then which bean object inject.
-> tell the container to inject the object of specfic bean.
-> the bean id for the Qualifier annotation is "first letter should be small".

@Primary
-> It is used to set the preference of particular bean, when multiple bean of same type for autowiring.

Lazy Initialization
1. If We can specify @Lazy annotation, Spring container will not create object implicitly for all beans.
2. A bean will only initialized in the following cases:
	a. It is needed for DI.
	b. It is explicitly requested.
3. Add @Lazy annotation to the bean class only.
4. How to set all bean are lazy?
	spring.main.lazy-initialization=true

How to inject Multiple Depedencies
Singleton Scope
----------------
-> By default, SC create only one object of the bean.
-> All dependecy injection will reference to the same bean.
-> @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

Prototype Scope
---------------
-> SC create multiple objects of the bean depend upon the DI.
-> All dependecy injection will reference to the different intance of the bean.
-> new object instance for each injection.
-> @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

Component Scanning
-> By default, SB starts component scanning from same package by the help of @SpringBootApplication.
-> It also scan sub-packages.



Extra:
1. How to hide the springboot banner
spring.main.banner-mode=off

2. How to hide log files
logging.level.root=warn

3. How to update the port no. of the server
server.port=8085

