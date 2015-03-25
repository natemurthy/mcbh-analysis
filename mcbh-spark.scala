// replace with your local file paths
val f = sc.textFile("file:/home/nmurthy/Desktop/MCBH_SL1123040595.csv")
val g = f.distinct.sortBy(t => t.split(",")(0))
g.saveAsTextFile("file:/home/nmurthy/Desktop/MCBH_deduped")

