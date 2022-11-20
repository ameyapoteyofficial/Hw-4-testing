Steps to run the project and generate the coverage reports:

1. open the project in Intelij
2. clean the maven project
3. build the maven project
4. Then open up the terminal and cd to the directory of the project

Then type in the following command:

```mvn cobertura:cobertura```

Once the task is done running, please check the location

```target/site/coberura/index.html```

 open the index.html file in your browser of choice and you should see the test coverage report.
