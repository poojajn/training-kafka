package com.training.commons;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import static org.apache.spark.sql.functions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.commons.SparkConnection;
import com.training.sparkworks.Department;

public class SparkSQLDemo {
 public static void main(String[] args) {
 Logger.getLogger("org").setLevel(Level.ERROR);
 //optional
 Logger.getLogger("akka").setLevel(Level.ERROR);
 JavaSparkContext sparkContext = SparkConnection.getContext();
 SparkSession spSession = SparkConnection.getSession();
 Dataset<Row>  empDataFields = spSession.read().json("./data/customerData.json");
 empDataFields.show();
 empDataFields.printSchema();
 //data queries
 System.out.println("SELECT Demo");
 empDataFields.select(col("name"), col("salary")).show();
 //data queries on selection (condition)
 System.out.println("Select Demo with condition");
 empDataFields.filter(col("gender").equalTo("male")).show();

 System.out.println("Aggregate - group by gender");
 empDataFields.groupBy(col("gender")).count().show();

  //group by dept id, average salary, max age
 Dataset<Row> summaryData = empDataFields.groupBy(col("deptid")).
 agg(
 avg(empDataFields.col("salary")),
 max(empDataFields.col("age"))
 );

 summaryData.show();
//.........try with Bean classes.....................
Department dept1=new Department(100,"Development");
Department dept2=new Department(200,"Testing");
List<Department> depList=new ArrayList<Department>();
depList.add(dept1);
depList.add(dept2);
Dataset<Row> deptDataFiled=spSession.createDataFrame(depList, Department.class);
System.out.println(("Department content are......"));


deptDataFiled.show();
System.out.println(("join Employee with Dept content are......"));

Dataset<Row> empDeptJoin=empDataFields.join(deptDataFiled,col("deptid").equalTo(col("departmentId")));
empDeptJoin.show();

System.out.println(("join Employee with Aggregation (Dept and age)content are......"));

empDataFields.filter(col("age").gt(30)).join(deptDataFiled,col("deptid").equalTo(col("departmentId"))).groupBy(col("deptid")).agg(avg(empDataFields.col("salary")),max(empDataFields.col("age"))).show();
//to load the data from CSv
Dataset<Row> autoData=spSession.read().option("header", "true").csv("data/auto-data.csv");
autoData.show();

//creating object with row Object
Row row1=RowFactory.create(1,"India","Bengaluru");
Row row2=RowFactory.create(2,"USA","Reston");
Row row3=RowFactory.create(3,"UK","Steevencreek");
List<Row> rList=new ArrayList<Row>();
rList.add(row1);
rList.add(row2);
rList.add(row3);

JavaRDD<Row> rowRDD=sparkContext.parallelize(rList);
StructType schema=DataTypes.createStructType(new StructField[] {
  DataTypes.createStructField("id", DataTypes.IntegerType, false),
  DataTypes.createStructField("country", DataTypes.StringType, false),
  DataTypes.createStructField("city", DataTypes.StringType, false)});
  Dataset<Row> templateField=spSession.createDataFrame(rowRDD, schema);
  
  templateField.show();
  
  //working with csv data,with sql stmt
  //provide the data is kept in table like format
  //the persistance will be only till end of the prgm
  //meaning temporary
  autoData.createOrReplaceTempView("autos");
  System.out.println("temp Table Content : ");
  System.out.println("showing all the fields  with hp greater than 200:::: ");
  spSession.sql("select * from autos where hp>200").show();
  
  // to find make ,maxmum RPM 
  System.out.println(":::to find make,maximum RPM from autos::::: ");
  spSession.sql("select make, max(rpm) from autos "+"group by make order by 1").show();
  //convert DataFram to javaRDD
  JavaRDD<Row> autoRDD=autoData.rdd().toJavaRDD();
  //reading the data from mysql DB
  //db (exdb),table(employee)
  Map<String,String> jdbcConnectParams=new HashMap<String,String>();
  
  jdbcConnectParams.put("url", "jdbc:mysql://localhost:3306/exdb");
  jdbcConnectParams.put("driver", "com.mysql.jdbc.Driver");
  jdbcConnectParams.put("dbtable", "employee");
  jdbcConnectParams.put("user", "root");
  jdbcConnectParams.put("password", "kanchan");
  
  System.out.println("create a datafram from a DB Table (employee)");
  
  Dataset<Row> sqlDataFiled=spSession.read().format("jdbc").options(jdbcConnectParams).load();
  sqlDataFiled.show();
 }
}