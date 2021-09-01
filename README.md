# Project for reproducing TypeNotPresentExceptionProxy

This project showcases `@ConditionalOnClass` not working for `@Bean` methods.

The project is consisted of 3 parts:

* api - Demo logic
* autoconfigure - Demo auto configuration using `@ConditionalOnClass`
* app - The demo Spring Boot application

Running `./mvnw verify` works on Java 11, but fails on Java 8.
