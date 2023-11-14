package com.sparta.ak;

public class FilmClassifications {

    public static String getClassification(int ageOfViewer)
    {
        String classification;
        if (ageOfViewer < 12)
        {
            classification = "U & PG films are available.";
        }
        else if (ageOfViewer < 15)
        {
            classification = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 18)
        {
            classification = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            classification = "All films are available.";
        }
        return classification;
    }
}
