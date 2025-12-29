# Automation Framework Design – WorkFlow Pro

## 1. Framework Goals
The main goal of this framework is to support:
- Web and mobile automation
- Multiple companies (tenants)
- Different user roles
- API and UI testing together
- Cross-browser testing using BrowserStack
- CI/CD execution

---

## 2. Folder Structure
workflowpro-automation/
│
├── src
│ ├── main/java
│ │ ├── framework
│ │ │ ├── BrowserFactory.java
│ │ │ ├── BasePage.java
│ │ │ ├── ApiClient.java
│ │ │ └── ConfigLoader.java
│ │
│ └── test/java
│ ├── tests
│ │ ├── LoginTests.java
│ │ └── ProjectIntegrationTests.java
│
├── config
│ ├── environments.json
│ └── testdata.json
│
├── docs
│ └── framework_design.md
│
├── reports
│ └── test_report.html
│
└── README.md


---

## 3. Key Components

### BrowserFactory
Creates browser sessions for Chrome, Firefox, Safari and BrowserStack.

### BasePage
Contains common functions like click, type, wait, and screenshot.

### ApiClient
Handles all API requests.

### ConfigLoader
Loads environment, browser, and test data from config files.

---

## 4. Configuration Management

- All environments and URLs are stored in environments.json
- All test data is stored in testdata.json
- Browser and platform selection is controlled by config
- Sensitive data is stored as environment variables

---

## 5. CI/CD Integration

- Tests run automatically on every commit
- Results are saved in the reports folder
- Supports parallel execution for faster feedback

---

## 6. Missing Requirements / Open Questions

- How is test data created and cleaned?
- How many parallel executions are allowed?
- What reporting format is expected?
- How should secrets be managed?
- How often should regression tests run?
