# Count words.
.PHONY : clean
clean:
	rm -f -r __pycache__
	rm -f *.dat
	rm -f results.txt

.PHONY: isles.dat abyss.dat last.dat
# Target ---> Dependency
# This is an example of rule: the target, dependencies, and actions
isles.dat : books/isles.txt
		#Action
		python countwords.py $< $@

abyss.dat: books/abyss.txt
		#Action
		python countwords.py $< $@

last.dat : books/last.txt
		#Action
		python countwords.py $< $@

# Generate summary table.
results.txt : isles.dat abyss.dat last.dat
	python testzipf.py $^ > $@
	
	