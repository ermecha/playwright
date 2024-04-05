package org.example;

import com.microsoft.playwright.*;

public class App {
    public static void main(String[] args) {
           Playwright playwright = Playwright.create();
           Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
           BrowserContext browserContext= browser.newContext();
           Page page1= browserContext.newPage();
           page1.navigate("https://practice.cydeo.com/");
           page1.close();
        }
    }

