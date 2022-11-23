package ex06_likeIt_OBF;

public class LikeItSimple {

    public String display(String[] arrayOfNames) {
        if (arrayOfNames == null) return "";
        int arraylength = arrayOfNames.length;
        if (arraylength == 0) return "no one likes this :-(";
        int maxPersons = 3;
        int nrOfRemainingNames = arraylength - 2;
        String likeit = "";
        if (arraylength == 1) likeit = arrayOfNames[0] + " likes this";
        if (arraylength == 2) likeit = arrayOfNames[0] + " and " + arrayOfNames[1] + " like this";
        if (arraylength == maxPersons) likeit = String.format("%s, %s and %s", arrayOfNames[0], arrayOfNames[1], arrayOfNames[2]) + " like this";
        if (arraylength > maxPersons) likeit = String.format("%s, %s and %d others like this", arrayOfNames[0], arrayOfNames[1], nrOfRemainingNames);
        return likeit;
    }
}
