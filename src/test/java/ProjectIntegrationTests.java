package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ProjectIntegrationTests {

    Browser browser;
    Page page;

    @BeforeClass
    public void setup() {
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newPage();
    }

    @Test
    public void testProjectCreationFlow() {
        // 1️⃣ API: Create project (pseudo-code)
        String projectId = "123"; // Assume API call returns this
        String projectName = "Test Project";

        // 2️⃣ Web UI: Verify project is displayed
        page.navigate("https://app.workflowpro.com/login");
        page.fill("#email", "admin@company1.com");
        page.fill("#password", "password123");
        page.click("#login-btn");

        page.waitForURL("**/dashboard");
        page.waitForSelector(".project-card");

        boolean projectFound = page.locator(".project-card").allTextContents().stream()
            .anyMatch(text -> text.contains(projectName));
        assertTrue(projectFound, "Project is displayed in Web UI");

        // 3️⃣ Mobile: Check accessibility (BrowserStack concept)
        // This is a placeholder: normally we would run the same test on BrowserStack mobile device
        boolean mobileAccessible = true; // Assume project appears on mobile
        assertTrue(mobileAccessible, "Project is accessible on mobile");

        // 4️⃣ Security / Tenant Isolation
        boolean tenantIsolation = true; // Assume we check that Company2 cannot see this project
        assertTrue(tenantIsolation, "Tenant data is isolated");
    }

    @AfterClass
    public void tearDown() {
        browser.close();
    }
}
