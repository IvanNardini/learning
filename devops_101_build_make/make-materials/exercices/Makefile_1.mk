# Count words.
.PHONY : clean
setup:
	rm -f -r __pycache__
	rm -f *.dat
	rm -f results.txt

.PHONY: isles.dat abyss.dat last.dat
# Target ---> Dependency
# This is an example of rule: the target, dependencies, and actions
isles.dat : books/isles.txt
		# Action
		python countwords.py books/isles.txt isles.dat

abyss.dat: books/abyss.txt
		#Action
		python countwords.py books/abyss.txt abyss.dat

last.dat : books/last.txt
		#Action
		python countwords.py books/last.txt last.dat

# Generate summary table.
results.txt : isles.dat abyss.dat last.dat
	python testzipf.py abyss.dat isles.dat last.dat > results.txt
	
	