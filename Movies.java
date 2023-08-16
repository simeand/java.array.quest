class Movies {
    public static void main(String[] args) {

        String[][] moviesAndActors = {
                {
                        "Indiana Jones and the Last Crusade",
                        "Harrison Ford",
                        "Denholm Elliott",
                        "Alison Doody"
                },
                {
                        "Indiana Jones and the Dial of Destiny",
                        "Harrison Ford",
                        "Phoebe Waller-Bridge",
                        "Mads Mikkelsen"
                },
                {
                        "Indiana Jones and the Kingdom of the Crystal Skull",
                        "Harrison Ford",
                        "Cate Blanchett",
                        "Karen Allen"
                }
        };

        for (int i = 0; i < moviesAndActors.length; i++) {
            String movieTitle = moviesAndActors[i][0];
            String mainActors = "";

            for (int k = 1; k < moviesAndActors[i].length; k++) {
                mainActors += moviesAndActors[i][k];
                if (k < moviesAndActors[i].length - 1) {
                    mainActors += ", ";
                }
            }

            System.out.println("In the movie " + movieTitle + ", the main actors are: " + mainActors);
        }
    }
}


// TERMINAL OUTPUT
// PS C:\Users\A200236711\Documents\JavaProjects\Movies> javac Movies.java
// PS C:\Users\A200236711\Documents\JavaProjects\Movies> java Movies
// In the movie Indiana Jones and the Last Crusade, the main actors are: Harrison Ford, Denholm Elliott, Alison Doody
// In the movie Indiana Jones and the Dial of Destiny, the main actors are: Harrison Ford, Phoebe Waller-Bridge, Mads Mikkelsen
// In the movie Indiana Jones and the Kingdom of the Crystal Skull, the main actors are: Harrison Ford, Cate Blanchett, Karen Allen
// PS C:\Users\A200236711\Documents\JavaProjects\Movies>

