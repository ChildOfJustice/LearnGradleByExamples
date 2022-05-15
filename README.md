# In this example there are several interesting parts of the gradle build configuration:
1. There are two project: a Java app and a library for this java application
2. The library is using aws core sdk as a transitive dependency for the application
3. But  we use one version of the aws core sdk to compile (in the library project) and another version of aws core sdk in the application itself. Everything works fine even if we will include the aws core sdk dependency with our library distro, as Gradle can handle version conflict when working with transitive dependencies.
4. The library project has configuration to publish the lib distro to local maven.
5. The application configured to take the lib from the local maven repository.
6. There is a Gradle task to create a "fat jar" in the /application/build/readyJar directory

# To run the app:
1. run the `build` task of the library project
2. run the `publishToMavenLocal` task of the library project
3. run the `build` task of the root project
4. execute the `java -jar application/build/readyJar/application-1.0-SNAPSHOT-all.jar` command