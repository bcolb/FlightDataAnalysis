Flight Data Analysis
==========================================

## Description
This project is an exploratory analysis of a large data set containing flight data specific to US domestic flights between 1987 and 2014. The intent is to determine factors that contribute to flight delays.

From this analysis I hope to develop a model by which I can accurately predict with a higher degree of certainty the order of arrival of flights at a particular airport. Additionally, base probabilities will be established for delays as related to certain factors. These may be used in follow-on projects.

## Data
The data for this project was originally discovered through [Data.gov](https://explore.data.gov/Transportation/Airline-On-Time-Performance-and-Causes-of-Flight-D/ar4r-an9z). Custom data sets are available courtesy of RITA (Research and Innovative Technology Administration) and BTS (Bureau of Transportation Statics). These data sets can be [found at BTS.gov](https://explore.data.gov/Transportation/Airline-On-Time-Performance-and-Causes-of-Flight-D/ar4r-an9z).

## Dependencies
The JAMA matrix package (.jar file) is used in the file Solution.java. Specifically, Solution.java contains a linear regression algorithm that is directly dependent on the JAMA matrix package.

Check [here for information regarding JAMA](http://math.nist.gov/javanumerics/jama/).

## Compilation

In the src directory:

> javac -cp Jama-1.0.3.jar Problem.java

## Running

In the src directory after compilation:

> java Problem