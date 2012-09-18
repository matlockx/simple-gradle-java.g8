simple-gradle-java
==================

A [giter8][g8] template for java gradle] applications.

Includes

* findbugs
* cobertura
* checkstyle
* integration-test source set
* bdd-test source set with cucumber
* fatJar support

##Usage
Install [giter8][g8], then:

    g8 matlockx/simple-gradle-java
cd into your new project dir
    chmod +x gradlew
    ./gradlew build

##Gradle Options
###BDD with cucumber
Add features and sources to src/bdd-test/...
Then run
    ./gradle bddTest
A dummy test is already there.
###Integration tests
Add junit tests to src/integration-test/java
Then run
    ./gradle build -PuseIntegrationTest=true
###Cobertura
    ./gradlew build -PuseCodeCoverage=true
###FindBugs
    ./gradlew build -PuseFindbugs=true
###FatJar
    ./gradlew build -PcreateFatJar=true

You can also combine these switches.

[g8]: http://github.com/n8han/giter8#readme