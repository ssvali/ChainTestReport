# ChainTestReport
This repository is example of how to setup the ChainTest Report for Selenium/TestNG

In this report I have used the testng Test Framework.

Custom Logs:-
I have used ChainTestListener.log() to log in the static report.

Screenshot:-
How to Capture the screen shot and attach it to the report. Below is the code.

         byte[] imageBytes = null;
        TakesScreenshot ts = (TakesScreenshot) driver;
        imageBytes = ts.getScreenshotAs(OutputType.BYTES);
        ChainTestListener.embed(imageBytes, "image/png");
