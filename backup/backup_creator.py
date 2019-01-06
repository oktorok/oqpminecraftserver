import shutil

def make_backup():
	try:
		shutil.copytree("../world", "./world_backup")
		shutil.copytree("../world_nether", "./world_nether_backup")
		shutil.copytree("../world_the_end", "./world_the_end_backup")
	except shutil.Error as e:
		print("Directorio no copiad. Error: %s" % e)
	except OSError as e:
		print("Directorio no copiad. Error: %s" % e)

if __name__ == "__main__":
	make_backup()
