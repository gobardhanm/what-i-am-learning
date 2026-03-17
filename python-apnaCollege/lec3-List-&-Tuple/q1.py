movies = []

movie1 = input("Enter your first favorite movie: ")
# movies.append(movie1)
movies.insert(len(movies), movie1)

movie2 = input("Enter your second favorite movie: ")
movies.append(movie2)

movie3 = input("Enter your third favorite movie: ")
movies.append(movie3)

# We could have used a single variable "movie"
# We could have directlly appended the "movie" from input

print("Your favorite three moves are : ",movies)