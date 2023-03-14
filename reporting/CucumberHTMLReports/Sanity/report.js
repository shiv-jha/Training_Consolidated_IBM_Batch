$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/module1/blog.feature");
formatter.feature({
  "name": "blog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate blog entering functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user is in Blog page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters data in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.enterProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.verifyProduct()"
});
formatter.result({
  "status": "passed"
});
});