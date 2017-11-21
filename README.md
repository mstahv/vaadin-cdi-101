# Getting started with Vaadin CDI

This is a short step by step guide to convert a basic servlet based Vaadin project into a
CDI deployed Java EE 7 Web Profile project.

This is how it goes:

### 1. Create a project using archetype

There isn't a Vaadin CDI archetype available yet, but the plain servlet archetype is really easy to convert into CDI (Java EE 7) project. Start by creating a project using vaadin-archetype-application in your favourite IDE. If you need help for this, follow the part 1 in Vaadin Tutorial.

### 2. Update dependencies

Next change the servlet API into java-ee-web and add vaadin-cdi dependency. As Jetty project provides only basic servlet container, it is better also switch to for example tomee-maven-plugin, if you want to test your app via Maven (mvn package tomee:run).

[See the changes](https://github.com/mstahv/vaadin-cdi-101/commit/7a8b1490436136cac11b62ee5e3026ccca441f48)

### 3. Remove the manual servlet declaration and annotate the UI

With Vaadin CDI you don't need to manually declare the servlet. Instead, a context listener seeks to classpath for @CDIUI annotated classes and tackles deployment configuration automatically. So add the @CDIUI to the MyUI class and remove the obsolete servlet declaration.

[See the changes](https://github.com/mstahv/vaadin-cdi-101/commit/816a52a77f2c8d307c5fe4b27362f06941977b45)

### 4. Extract the "business logic" into a CDI bean

As a final step, to give an example how you'll start to integrate to your services, let's extract the "business logic", the string concatenation, into a CDI bean and use that from your the UI object.

[See the changes](https://github.com/mstahv/vaadin-cdi-101/commit/6f965b16c1f92dde9d7cccb32bbd7d14991278bd)

### 5. Run the project

You can test now the project using the tomee-maven-plugin or by deploying the project to any Java EE 7 server directly from your IDE.

    mvn package tomee:run

