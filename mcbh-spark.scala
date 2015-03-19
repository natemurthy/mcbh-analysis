sc.textFile("file:/home/nate/Desktop/MCBH_SL1123040595.csv")
res0.distinct.sortBy(t => t.split(",")(0))
res1.saveAsTextFile("file:/home/nate/Desktop/MCBH_deduped")

