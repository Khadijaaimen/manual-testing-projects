# Manual Testing Projects Portfolio

Welcome to my **Software Quality Assurance (SQA) Portfolio**. This repository documents a structured **6‑week roadmap** from manual testing fundamentals to light test automation and API testing. It includes real deliverables (test cases, bug reports, reports, and code) produced on popular demo apps.

---

## Repository Structure
Each week folder contains notes, templates, and deliverables aligned to the roadmap.

- **[Week1](./Week1) – Manual Testing Fundamentals**
  - SDLC vs STLC 1‑pager
  - Intro test cases (login) using a clean template
  - First bug reports with severity/priority (Jira style)
  - Practice: EP/BVA applied to simple features
- **[Week2](./Week2) – Exploratory, Bugs & Regression**
  - Exploratory testing guide + session reports (OrangeHRM)
  - Enhanced bug reports (clear repro steps, observed vs expected, evidence)
  - Master **Test Case Template** and **Regression Checklist**
- **[Week3](./Week3) – ISTQB FL Preparation**
  - Syllabus notes (techniques, management, estimation)
  - Practice exercises (EP, BVA, decision tables)
  - Mock questions + full‑length mock exam & results
  - Reflection and targeted study plan
- **[Week4](./Week4) – Non‑Functional, Test Tools & Reporting**
  - Notes on performance, usability, security, reliability
  - Test case management: **TestRail** (runs, reports)
  - QA metrics sample report (defect density, pass rate, trend)
  - Draft CI pipeline design for automation
- **[Week5](./Week5) – UI Test Automation (Selenium + TestNG)**
  - Java + Selenium + TestNG project scaffold
  - Tests for The‑Internet (Herokuapp) & DemoQA (POM, waits, assertions)
  - HTML/extent‑style reports
  - **CI**: GitHub Actions workflow to run headless
  - Polished README + run instructions
- **[Week6](./Week6) – API Testing & Portfolio Polish**
  - Postman collections for **Reqres** / **Swagger Petstore** (+ Newman or REST‑assured)
  - OWASP Juice Shop: security‑focused exploratory notes
  - Extra mini projects (SauceDemo / TodoMVC)
  - Final portfolio folder: links, highlights, and screenshots

---

## 🗺6‑Week Roadmap (from the workbook)
**Week 1 – Foundations**
- Manual testing fundamentals, SDLC vs STLC
- Test case writing basics (login feature)
- First defect reports (with severity/priority)
- Techniques: **EP**/**BVA** → updated cases
- **Deliverables:** SDLC/STLC 1‑pager, 5+ test cases, 2+ bug reports, Week1 folder committed

**Week 2 – Exploratory & Regression**
- Exploratory testing primer + hands‑on sessions (OrangeHRM, DemoQA)
- Bug investigation & prioritisation; write 5+ detailed reports
- Create **Master Test Case Template** and **Regression Checklist**
- **Deliverables:** Session report, 5+ bugs, templates, Week2 folder committed

**Week 3 – ISTQB Focus**
- Read ISTQB FL syllabus; techniques & management topics
- Attempt sample Qs; identify weak areas
- Sit a full‑length timed mock; write reflections & study plan
- **Deliverables:** Syllabus notes, practice answers, mock exam report, study plan

**Week 4 – Tools, Metrics & CI**
- Finish remaining ISTQB topics and more sample tests
- TestRail/TestLink exploration (test runs & reports)
- Build a light **QA Metrics** report and an automation **project plan**
- Draft **CI** basics (GitHub Actions) for Week5 automation
- **Deliverables:** TestRail screenshots/exports, metrics sample, CI draft, project plan

**Week 5 – UI Automation (Selenium + TestNG)**
- Project scaffold; implement POM, waits, assertions
- Automate core flows for The‑Internet / DemoQA
- Add HTML reports and **GitHub Actions** (headless)
- **Deliverables:** Java project, tests, reports, CI workflow, polished repo

**Week 6 – API, Security & Finalisation**
- Postman collections for Reqres & Petstore; Newman/REST‑assured runs
- OWASP Juice Shop: quick security learning log
- Extra mini‑projects (SauceDemo / TodoMVC)
- Consolidate artefacts, update CV/LinkedIn, final screenshots
- **Deliverables:** Postman collections, API test results, security notes, final portfolio folder

> **Status:** The workbook marks all planned tasks as *Completed*. Any items still in progress will be updated in their respective week folders.

---

## Projects Tested (practice/demo apps)
- **OrangeHRM Demo:** https://opensource-demo.orangehrmlive.com/
- **DemoQA:** https://demoqa.com/
- **The Internet (Herokuapp):** https://the-internet.herokuapp.com/
- **Sauce Demo:** https://www.saucedemo.com/
- **Reqres API:** https://reqres.in/
- **OWASP Juice Shop:** https://owasp-juice.shop/

> ⚠️ *These are educational/demo systems. Some credentials or sample data may be visible for learning purposes only.*

---

## Skills & Tools Demonstrated
- **Manual QA:** test design (EP/BVA/decision tables), exploratory testing, defect reporting
- **Documentation:** master templates, regression checklists, QA metrics & reports
- **Test Management:** TestRail/TestLink (runs, evidence, reporting)
- **Automation (UI):** Java, **Selenium WebDriver**, **TestNG**, Page Object Model, waits & assertions
- **Automation (API):** Postman, basic REST‑assured (Java)
- **CI/CD:** GitHub Actions – headless UI/API test runs
- **Version Control:** Git & GitHub hygiene for portfolio

---

## How to Run the Automation (Week5)
Inside `Week5/webdriver-java` (or your automation project folder):

```bash
# 1) Run tests normally
mvn test

# 2) Run tests headless
mvn test -Dheadless=true

# 3) View reports
#   • TestNG/HTML report → check project’s reports folder (e.g., target/surefire-reports or custom /reports)
#   • Exported screenshots/logs are inside the project under /reports or /target (see project README)
```

**CI (GitHub Actions):** a minimal workflow is included under `.github/workflows/ci.yml` to run tests on push/PR using headless browsers.

---

## QA Metrics (sample)
- Test case pass rate by run
- Defect trend (opened/closed per cycle)
- Defect severity distribution
- Execution time & flaky‑test observations

> See Week4 for example charts/tables and a lightweight project plan.

---

## Suggested Folder Structure
```
manual-testing-projects/
├─ Week1/
├─ Week2/
├─ Week3/
├─ Week4/
├─ Week5/
├─ Week6/
├─ docs/                       
│  └─ Manual_Testing_6_Week_Roadmap.xlsx
└─ README.md            # this file
```

---

## Key Learning Resources
- Selenium WebDriver with Java (TAU)
- Foundations of Test Automation (Angie Jones, TAU)
- Exploratory Testing (TAU)
- Postman API Testing (TAU)
- Great Learning – Software Testing Fundamentals
- QSpiders Manual Testing playlist (YouTube)
- Jira bug tracking tutorials
- ISTQB Foundation Level (official)

(Links are referenced in the week folders and resource notes.)

---

## Purpose & How Recruiters Can Review
This repo shows structured growth from **manual → automation** with real artefacts:
- Start with clean documentation (test cases, bugs, checklists)
- Add metrics, management, and CI thinking
- Deliver working **UI** and **API** tests with reports

**Quick review path:** open `Week5` (automation), then skim Week1/2 (manual), Week4 (metrics/CI), and Week6 (API).

---

## Acknowledgements
Thanks to the maintainers of the demo applications and the authors of the courses and tutorials referenced here.
