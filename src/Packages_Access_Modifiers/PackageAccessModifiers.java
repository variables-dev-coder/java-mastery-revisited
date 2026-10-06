package Packages_Access_Modifiers;

public class PackageAccessModifiers {

    /*

                        The Big Picture

                             JAVA
                               │
                      ┌────────┴────────┐
                      │                 │
                   Packages       Access Modifiers
                      │                 │
                 Organize code      Control access
                      │                 │
                ┌─────┴─────┐    ┌──────┼──────────────┐
                │           │    │      │       │      │
              package     import private default protected public


            And in your real Java/Spring Boot development:

            com.munna.portfolio
            │
            ├── controller
            │     └── UserController
            │
            ├── service
            │     └── UserService
            │
            ├── repository
            │     └── UserRepository
            │
            ├── entity
            │     └── User
            │
            └── config
                  └── SecurityConfig

            Then access modifiers help you decide what should be exposed and what should remain internal.
            Your most important memory formula
            private   → same class
            default   → same package
            protected → same package + subclass
            public    → everywhere

     */
}
