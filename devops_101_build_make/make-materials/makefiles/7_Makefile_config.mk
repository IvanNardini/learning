#This is how include a config file
include config.mk

# Generate summary table.
results.txt : $(ZIPF_SRC) isles.dat abyss.dat last.dat 
	$(ZIPF_EXE) *.dat > $@

# Count words.
.PHONY : dats
dats : isles.dat abyss.dat last.dat
# Target ---> Dependency
# Create a pattern rule with % wildcard and stem $*
%.dat : books/%.txt $(COUNT_SRC)
		$(COUNT_EXE) $< $*.dat

# In order to build a file named [something].dat (the target) 
# find a file named books/[that same something].txt (the dependency) 
# and run countwords.py [the dependency] [the target]

.PHONY : clean
clean :
	rm -f *.dat
	rm -f results.txt
	rm -f -r __pycache__
	
	