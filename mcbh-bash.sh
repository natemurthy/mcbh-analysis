#!/bin/bash

tail -n +2 MCBH_SL1123040595_all.csv > MCBH_SL1123040595_headless.csv  # remove header
head -n 1 MCBH_SL1123040595_all.csv | cat - part-0000 > part-0000.csv  # put header back in
