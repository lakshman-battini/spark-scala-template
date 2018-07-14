# Spark-scala-template
===============

This project is a Template project on Apache Spark using Scala build with SBT. It includes the simple Word Count example using DataFrame API.

It includes the eclipse plugin, so that you can import the project in Eclipse.


Use SBT in a Terminal
===

Using [SBT](https://www.scala-sbt.org/) in a terminal is a good approach if you prefer to use a code editor like Emacs, Vim, or SublimeText. You'll need to [install SBT](https://www.scala-sbt.org/download.html). The dependencies will be resolved when you build the software.

Navigate to the project home folder and Start the `sbt` console, then build the code. Running `compile` compiles the code, while `package` creates a jar file of the compiled code and configuration files:

```shell
$ sbt
...
sbt:spark-scala-template> compile
...
sbt:spark-scala-template> package
...
sbt:spark-scala-template>
```

Spark Submit
===

Submit the Spark application using below command:

`cd $SPARK_HOME; ./bin/spark-submit --class com.lbattini.spark.Spark_wordCount --master yarn target/spark-scala-template_2.11-1.0.jar` 

Final Thoughts
===

Thank you for going through this project. Feedback and pull requests are welcome.

