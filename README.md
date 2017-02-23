# cdi
Simple J2EE project to test CDI capabilities on a non JEE environment

1. The following example initializes the Application class in the CDI context.

```java
public static void main(String[] args) {
    CdiContext context = CdiContext.INSTANCE;

    Application application = context.getBean(Application.class);

    application.run();
}
```
2. After the initialization, the Application class can use the CDI injectors to create instances of other objects and use other CDI capabilities, like qualification and other stuff
```java
@Singleton
public class Application {

	@Inject @Type(GreetingType.FORMAL)
	Greeting greeting;
	
	public void run() {
		System.out.println(greeting.greet());
	}
}
```
