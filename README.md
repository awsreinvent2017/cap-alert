# notification-cap-alert
## Synopsis

This is a sample service

<!-- This section describes the service, providing an overview of the -->
<!-- purpose and function, as well as specific limitations or exclusions if -->
<!-- helpful (e.g. this service does not do 'x', see service 'xyz'). -->


## Code Examples

Show how to call the service as concisely as possible. Developers
should be able to figure out how the service solves their problem by
looking at the code example. Make sure the API you describe is the
obvious and main use case for the service, and that your example code
is short and concise.

``` http
http://test/test/service
```


## Dependencies & Prerequisites

List all dependencies and prerequisites for the project.


## Triggers

List specific issues that will have an impact on the roll-out of this
service. For example, if new versions of this service can only be
deployed to production during off-hours, etc.


## Manual Test Cases

List the manual tests that are required to certify this service - if
any - and link to the additional test details.


## See Also

Links to additional documentation, if any.



## Project Information
**Developers: **

Owner: blablabla

### Build
**Jenkins Job:** http://jenkinsaddres/notification-cap-alert

### Service URL's
**ICD:** http://icdaddress

**Documentation:** http://documentationaddress/docs

**Service:** http://serviceaddress/service

### Platform Resources
**JIRA:** http://bugtracckingaddress - Bug and features tracking

## Project's CLI Reference

### Service

````bash
$ java -jar ./target/{your-project-compiled}.jar
````

### Maven Tasks
Build and test
````bash
$ mvn clean install
````

Create Docker container
````bash
$ mvn docker
````
