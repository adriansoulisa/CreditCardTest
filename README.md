# CreditCardTest

## Clone Repository

clone repository to local computer `git clone`. Url
repository able to see in this repository

```
git clone <url repository> <folder tujuan>
```

<p>After clone the repository then open project katalon</p>

<h2>Step running the project:</h2>

<h3>1. Open Test Suites in Tests Explorer</h3>
<img src="images/Screen Shot 2021-02-06 at 02.50.03.png" width="200" height="250">
<h3>2. Install the plugin for make a report after running test case in katalon</h3>
<img src="images/Screen Shot 2021-02-06 at 03.33.11.png">
<img src="images/Screen Shot 2021-02-06 at 03.33.25.png" width="300" height="250" >
<p>Install the plugin in katalon store and search 'reports'</p>
<img src="images/Screen Shot 2021-02-06 at 03.34.05.png" width="150" height="150">
<p>after install the plugin then reload the plugin</p>
<img src="images/Screen Shot 2021-02-06 at 03.34.24.png" width="200" height="90">

<h4>finally..plugin has been installed</h4>

<h3>3. Change Profile from 'Default' to 'Data'</h3>
<img src="images/Screen Shot 2021-02-06 at 02.55.08.png" width="300" height="100">
<p>Before run test suites,change the profile become to 'Data' then </p>
<h3>4. Running the test suites</h3>
<img src="images/Screen Shot 2021-02-06 at 02.55.27.png" width="400" height="100">
<p>When scenario test has been success</p>
<img src="images/Screen Shot 2021-02-06 at 03.35.37.png" width="550" height="100">
<p>Check on 'Report' Folder in test explorer</p>
<img src="images/Screen Shot 2021-02-06 at 02.58.47.png" width="300" height="150">

<h3>Running using KRE</h3>

```
./katalonc -noSplash -runMode=console -projectPath="/Users/adrian.soulisa/Music/CreditCardTest/testing.prj" -retry=0 -testSuitePath="Test Suites/CreditCard/CreditCardTestSuite" -executionProfile="Data" -browserType="Chrome" -apiKey="fe1b8469-e0f2-4bf2-a192-9d835691c193" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true

```

```
./katalonc -noSplash -runMode=console -projectPath="/Users/adrian.soulisa/Music/CreditCardTest/testing.prj" -retry=0 -testSuitePath="Test Suites/CreditCard/CreditCardTestSuite" -executionProfile="Data" -browserType="Firefox" -apiKey="fe1b8469-e0f2-4bf2-a192-9d835691c193" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true

```



<h3>Thank you</h3>
