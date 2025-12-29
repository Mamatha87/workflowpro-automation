# WorkFlow Pro Automation Assessment

## Overview
This repository contains the automation assessment solution for Bynry – WorkFlow Pro SaaS platform.  
It demonstrates:

- Test Plan for the application  
- Automation framework design  
- Sample API + UI integration test using Playwright + TestNG concepts  

## Repository Structure
src/
main/java → Framework utilities
test/java → Test classes (LoginTests, ProjectIntegrationTests)
config/ → Environment and test data JSON files
docs/ → Test Plan and Framework Design documents
reports/ → Test execution reports
README.md → This file

## How to Run Tests
1. Clone the repository  
   git clone https://github.com/Mamatha87/workflowpro-automation.git  
2. Open the project in your favorite Java IDE (IntelliJ, Eclipse)  
3. Install Playwright for Java  
   mvn clean install (if using Maven)  
4. Run TestNG tests:
   - ProjectIntegrationTests.java  
   - Or any test class inside src/test/java

## Notes
- API calls are represented as placeholders since this is a sample solution.  
- BrowserStack mobile tests are represented conceptually.  
- The focus is on showing understanding of:
  - Multi-tenant testing  
  - Cross-browser testing  
  - Integration of API + UI testing  
  - Test stability and waits
