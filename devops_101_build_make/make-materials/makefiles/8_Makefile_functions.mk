#This is how include a config file
include config.mk

#Wildcard is an example of function
TXT_FILES=$(wildcard books/*.txt)
#patsubst (‘pattern substitution’) takes a pattern
#a replacement string and a list of names in that order;
# each name in the list that matches the pattern is replaced by the replacement string
DAT_FILES=$(patsubst books/%.txt, %.dat, $(TXT_FILES))

# Generate summary table.
results.txt : $(ZIPF_SRC) $(DAT_FILES)
	$(ZIPF_EXE) $(DAT_FILES) > $@

# Count words.
.PHONY : dats
dats : $(DAT_FILES)
# Target ---> Dependency
# Create a pattern rule with % wildcard and stem $*
%.dat : books/%.txt $(COUNT_SRC)
		$(COUNT_EXE) $< $@

# In order to build a file named [something].dat (the target) 
# find a file named books/[that same something].txt (the dependency) 
# and run countwords.py [the dependency] [the target]

.PHONY: variables
variables:
	@echo TXT_FILES: $(TXT_FILES)
	@echo DAT_FILES: $(DAT_FILES)

.PHONY : clean
clean :
	rm -f $(DAT_FILES)
	rm -f results.txt
	rm -f -r __pycache__
	
	