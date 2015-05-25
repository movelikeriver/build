Install sbt by using: brew install sbt
$ sbt package

The command line is: ${SPARK_HOME}/bin/spark-submit
$ spark-submit --class "SimpleApp" --master local[4] target/scala-2.10/simple-project_2.10-1.0.jar
