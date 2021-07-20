# compareMethodsWithBenchmark

## Preferred Usage: Command Line
### Step 1. Setting up the benchmarking project. The following command will generate the new JMH-driven project in test folder:
```
$ mvn archetype:generate \
  -DinteractiveMode=false \
  -DarchetypeGroupId=org.openjdk.jmh \
  -DarchetypeArtifactId=jmh-java-benchmark-archetype \
  -DgroupId=org.sample \
  -DartifactId=test \
  -Dversion=1.0
 ```
If you want to benchmark an alternative JVM language, use another archetype artifact ID from the list of existing ones, it usually amounts to replacing java to another language in the artifact ID given above. Using alternative archetypes may require additional changes in the build configuration, see the pom.xml in the generated project.

### Step 2. Building the benchmarks. After the project is generated, you can build it with the following Maven command:

```
$ cd test/
$ mvn clean verify
```

### Step 3. Running the benchmarks. After the build is done, you will get the self-contained executable JAR, which holds your benchmark, and all essential JMH infrastructure code:
```
$ java -jar target/benchmarks.jar
```
Run with -h to see the command line options available.

When dealing with large projects, it is customary to keep the benchmarks in a separate sub-project, which then depends on the tested modules via the usual build dependencies.

