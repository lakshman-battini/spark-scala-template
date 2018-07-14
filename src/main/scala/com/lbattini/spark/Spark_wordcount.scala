package com.lbattini.spark;

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.explode
import org.apache.spark.sql.functions.split

object Spark_wordCount{
	def main(args: Array[String]) {
                
				val spark = SparkSession
                        .builder
                        .appName("Spark word count application")
                        .getOrCreate()
 
				// Path of the file to be loaded - use file:/// to load from Local file system.
				val PATH_OF_FILE = "lines.txt"
				// Load text file as dataframe
                val linesDF = spark.read.text(PATH_OF_FILE)
				// Split the line into words
                val wordsDF = linesDF.select(explode(split(linesDF("value"), " ")).as("word"))
				 // WordCount dataframe
				val wordCountDF = wordsDF.groupBy("word").count()
				wordCountDF.show()
			}
}