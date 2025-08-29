# Manual Testing Project - Week 5

This folder contains all the artifacts created during **Week 5** of the Manual Testing Roadmap.
It covers Selenium WebDriver automation in Java, including alerts, context menu, file upload tests, headless execution, and report generation.

---

## Applications Used
- [The Internet (herokuapp)](http://the-internet.herokuapp.com/) application.  

## Features
- Alerts, Context Menu, and File Upload tests
- Headless browser execution option
- Screenshots captured on test failures
- HTML test reports generated after execution
- CI integration via GitHub Actions

---

## Prerequisites
- Java 11+
- Maven
- Chrome browser
- ChromeDriver compatible with your Chrome version

---

## How to Run Week 5 Automation Tests
**1. Navigate to the Week5 folder in your repo:**
`cd Week5/webdriver-java`

**2. Run tests normally:**  
`mvn test`

**3. Run tests headless (without browser UI):**  
`mvn test -Dheadless=true`

**4. View reports:**  
- HTML report: `reports/index.html`  
- Screenshots on failure: `resources/screenshots/`

**5. Folder Structure:**
```├── src/
Week5/
└── webdriver-java/
    ├── src/
    │   ├── main/java   -> Base classes, utilities
    │   └── test/java   -> Alerts, Context Menu, File Upload tests
    ├── resources/      -> chromedriver.exe, screenshots
    ├── reports/        -> HTML test reports
    ├── pom.xml
    └── testng.xml`
```
--- 
## Sample Reports
- **HTML report example:** [Week5/webdriver-java/reports/index.html](Week5/webdriver-java/reports/index.html)  
- **Screenshots folder:** `Week5/webdriver-java/resources/screenshots/`

---

## CI Integration
- GitHub Actions workflow automatically runs tests on push or pull request.  
- Reports are uploaded as artifacts in GitHub Actions.

---

## Notes
- All tests are independent and can be run individually via `testng.xml`.  
- Headless execution is useful for CI pipelines or running tests without opening the browser.


