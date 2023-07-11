# TDD Workshop using Java 
[[Trello Board]](https://trello.com/b/w0fLbL3k/bdd-java-example)

[![Build Status](https://travis-ci.org/rafaelspinto/workshop-tdd-java.svg?branch=master)](https://travis-ci.org/rafaelspinto/workshop-tdd-java) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Lines](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=ncloc)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=coverage)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=code_smells)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=bugs)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java) [![Technical debt](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=sqale_index)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java)


This workshop is designed to help you start or improve your [Test Driven Development](https://en.wikipedia.org/wiki/Test-driven_development) and [Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development) skills.

The [examples](#examples) you will see in this workshop are designed to demonstrate the advantages and technicalities of TDD. The intention is to represent real-world scenarios, however sometimes that will not be possible in favour of simplicity.

## What is BDD

[Behaviour Driven Development](https://en.wikipedia.org/wiki/Behavior-driven_development) is a methodology that specifies acceptance criteria using a syntax that can be managed by business and by technology. The most well known implementation for this syntax is [Gherkin](https://github.com/cucumber/cucumber/wiki/Gherkin).

The Gherkin syntax has 3 main components that are represented by the following *keywords*:

* **Feature** - maps to a feature of the software. e.g.: Login

* **Scenario** - maps to a particular scenario of the usage of the feature.

* **Step** - a step of the scenario. A step starts with one of the following keywords:

    * **Given** - used for definition of context.
    * **And** or **When** - used for events.
    * **Then** or **But** - used for assertions.


## Table of contents

* [Quick start](#quick-start)
* [Testing Tools/Frameworks](#testing-toolsframeworks)
* [Naming conventions](#naming-conventions)
* [AAA Pattern](#aaa-pattern)
* [Mocks & Stubs](#mocks--stubs)
* [Instant Feedback Tools](#instant-feedback-tools)
* [Examples](#examples)

## Quick start

Prerequisites

* You have an IDE or a text editor (e.g.: [IntelliJ IDEA](https://www.jetbrains.com/idea/download))
* You have [Maven](https://maven.apache.org/) installed


## Testing Tools/Frameworks

We will be using a few tools/frameworks to facilitate our job.

* [JUnit](https://junit.org/junit4/) - Unit Testing Framework
* [mockito](http://site.mockito.org/) - Mocking Framework for Unit Tests
* [junit-dataprovider](https://github.com/TNG/junit-dataprovider) - Data Provider Runner for JUnit
* [Cucumber-JVM](https://cucumber.io/docs/reference/jvm) - A BDD testing framework implementation for Java


## Naming conventions

Tests serve 3 purposes:

* [Acceptance Criteria](https://en.wikipedia.org/wiki/Acceptance_testing) - Ensures developed code meets specification
* [Regression Testing](https://en.wikipedia.org/wiki/Regression_testing) - Ensures new changes don't impact previous developed code
* **Documentation** - Demonstrates how the application behaves

To achieve proper documentation, a good starting point is to create naming conventions for the tests.

You can define your own conventions keeping in mind that the test methods should clearly identify:

* What is being tested
* What is the Scenario (Input)
* What should be the outcome (Output)

Example with a BDD approach:

```gherkin
Feature: Shopping
  The calculator supports the sum operation.

  Scenario: Getting total in basket for empty basket
    Given Empty basket
    When Calculate total price
    Then Result should be 0.0
```

## Mocks & Stubs

[Mocks](https://en.wikipedia.org/wiki/Mock_object) and [Stubs](https://en.wikipedia.org/wiki/Method_stub) are used to facilitate testing by solving the problem of dependencies.

When the code you are implementing has a dependency, using this technique, you create a fake object that emulates that dependency. If you are required to define specific return values to emulate a certain scenario then you'll need to use a **stub** otherwise you'll simply use a **mock**.


Example:


* **Mock**

```java
provider = mock(PaymentProviderInterface.class);
broker = new PaymentBroker(provider);
```

* **Stub**
```java
provider = mock(PaymentProviderInterface.class);
broker = new PaymentBroker(provider);
when(provider.isAvailable()).thenReturn(false);
```

## Instant Feedback Tools

Feedback is one of the most important things in the development world, the sooner you get it the better.

Typically most of the feedback comes from the user/client of your software, but you should be getting it before you ship it.

There are plenty of tools out there that can help you with this. In this workshop we will be using the following:

* **Automation Server** - Allows you to automate the test execution ([Continuous Integration](https://www.thoughtworks.com/continuous-integration)) and other routines associated with it ([Continuous Delivery](https://martinfowler.com/bliki/ContinuousDelivery.html)/[Continuous Deployment](https://www.agilealliance.org/glossary/continuous-deployment/)). In this particular case we are using [Travis CI](https://travis-ci.org/).

    You can check the current status of the workshop project by clicking the following badge:

   [![Build Status](https://travis-ci.org/rafaelspinto/workshop-tdd-java.svg?branch=master)](https://travis-ci.org/rafaelspinto/workshop-tdd-java)

* **Static Code Analyzer** - Allows you to continuously inspect the quality of the code by detecting issues and providing suggestions to solve them. In this project we are using [SonarCloud](http://sonarcloud.io).

    You can check the current status of the workshop project by clicking the following badge:

    [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=workshop%3Atdd-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java)

* **Kanban Board** - Allows you to track your project's work with a workflow visualization tool. In this project we are using [Trello](https://trello.com/).

    You can check the current status of the workshop project by clicking the following link:

    [Trello Board](https://trello.com/b/rvbvAXFn/workshop-tdd-java)


## Examples

* [Calculator](/src/test/java/workshop/calculator) - Simple example to get you started
* [LoginManager](/src/test/java/workshop/login) - Working with exceptions
* [StringProcessor](/src/test/java/workshop/strings) - Working with data providers
* [PaymentBroker](/src/test/java/workshop/payment) - Working with dependencies, mocks and stubs
