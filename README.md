# Selenium Project With Cucumber
This project includes sample selenium project with cucumber

# Getting started :ghost:
This project requires Java 8 (at least version 1.8.0_112 or greater) (Java jdk 1.8 sürümü ve üzeri) https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

**Intellij**
https://www.jetbrains.com/idea/download/#section=windows (Maven, Gradle or Eclipse to be installed.)

**Cucumber Plugin** 
(cucumber for java)

# Running in IntelliJ
If you use IntelliJ IDEA, Cucumber support is built-in, and you can even select a single Scenario within a Feature to run at a time. If you are using the free Community Edition, you can easily install the "Gherkin" and "Cucumber for Java" plugins.

# Maven Dependency
Project should be add as a dependency on pom.xml so it will be installed automatically
```

  <dependencies>
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>1.2.0</version>
    </dependency>


    <!-- https://mvnrepository.com/artifact/info.cukes/cucumber-jvm-deps -->
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-jvm-deps</artifactId>
        <version>1.0.5</version>
        <scope>provided</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/info.cukes/cucumber-junit -->
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>1.2.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>1.2.2</version>
        <scope>compile</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/info.cukes/cucumber-core -->
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-core</artifactId>
        <version>1.2.0</version>
    </dependency>


    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-chrome-driver</artifactId>
        <version>3.141.59</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>


    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.8.13</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-api</artifactId>
        <version>3.141.59</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>info.cukes</groupId>
        <artifactId>cucumber-core</artifactId>
        <version>1.2.5</version>
        <scope>test</scope>
    </dependency>

</dependencies>
```
