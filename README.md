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


