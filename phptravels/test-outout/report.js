$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelsearch.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel search feature",
  "description": "",
  "id": "hotel-search-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search hotel in phptravels test",
  "description": "",
  "id": "hotel-search-feature;search-hotel-in-phptravels-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user logged in as a valid user",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters city name and selects city name",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelSearch.user_logged_in_as_valid_user()"
});
formatter.result({
  "duration": 24871802423,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.user_is_on_home_page()"
});
formatter.result({
  "duration": 5707063418,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //span[@class\u003d\u0027hidden-xs\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SUNNY\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 67.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20190529130856, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 4236, moz:profile: C:\\Users\\shivakumar\\AppData..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 291b41e2-912d-408e-9001-d70e78572f99\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027hidden-xs\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat steps.HotelSearch.user_is_on_home_page(HotelSearch.java:29)\r\n\tat ✽.Then user enters city name and selects city name(hotelsearch.feature:7)\r\n",
  "status": "failed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "login in phptravels feature",
  "description": "",
  "id": "login-in-phptravels-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login as existing user to phptravels test",
  "description": "",
  "id": "login-in-phptravels-feature;login-as-existing-user-to-phptravels-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
});