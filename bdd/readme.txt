Directory structure
===================
src
│
├── main
│   └── java
│       └── com.bdd
│            └── Application.java
│
├── test
│   ├── java
│   │   └── com.bdd.stepdefinitions
│   │        └── StepDefinitions.java
│   │   └── com.bdd.runner
│   │        └── CucumberTestRunner.java
│   └── resources
│       └── features
│            └── my_feature.feature


Steps to integrate with bdd
===========================
1. Add necessary dependency-cucumber java,cucumber junit,junit, selenium java
2. create a feature folder under src/test/resource
3. Add cucumber plugin to IntelliJ
4. create a .feature file and add scenarios given,when,and,then.
5. Add step definition in src/test/java/stepDefinitions
6. Create a runner class src/test/java/runner




Smoke test
===========
A Smoke Test is a quick check to ensure that the basic functionality of an application is working as expected. It’s like a sanity check to catch major failures early.
In Cucumber, you can use tags to categorize and filter tests. By tagging a scenario with @smoke, you can run only those critical tests when needed.


src/test/java/com/bdd/bdd/runner/CucumberTestRunner.java
src/test/java/com/bdd/bdd/StepDefinition/LoginStepDef.java
src/test/resources/feature/login.feature