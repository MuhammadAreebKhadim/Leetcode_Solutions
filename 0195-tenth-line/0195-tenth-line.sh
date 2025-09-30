# Read from the file file.txt and output the tenth line to stdout.
# sed -n '10p' file.txt
awk 'NR == 10' file.txt

# If the file contains less than 10 lines, then we use this:
# head -n 10 file.txt | tail -n 1