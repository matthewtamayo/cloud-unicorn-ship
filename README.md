# shipping

This is a Spring Boot application that implements a shipping service which can be used to:
- retrieve country codes
- retrieve cities by country code
- calculate shipping distance and cost

## Building from Source

You need Java 17 and a bash-like shell.

### Building

Invoke the build at the root of the project:

```
$ ./mvnw clean install
```

Format source code according to "Spring" style:

```
$ ./mvnw spring-javaformat:apply
```

### Testing

Run unit tests using the Surefire Plugin:

```
$ ./mvnw test
```

Run integration tests using the Failsafe Plugin:

```
$ ./mvnw verify
```

### Running the app locally

As long as you've built the project beforehand, you can easily start the app as any other Spring Boot app:

```
$ ./mvnw spring-boot:run
```
