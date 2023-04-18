package Inheritance;

public enum Direction {

    NORTH(0), EAST(90), SOUTH(180), WEST(270); // Konstanten mit jeweiligem Winkelwert

    private int angle; // Winkelwert

    private Direction(int angle) {
        this.angle = angle;
    }

    // Methode zur Berechnung des Drehwinkels von einer Richtung zur anderen
    public int getRotationAngle(Direction other) {
        int rotationAngle = other.angle - this.angle; // Differenz der Winkelwerte
        if (rotationAngle < 0) { // Wenn die Differenz negativ ist, muss 360 Grad addiert werden
            rotationAngle += 360;
        }
        return rotationAngle;
    }

    // Methode zur Ausgabe der Drehrichtung
    public String getTurnDirection(Direction other) {
        int rotationAngle = getRotationAngle(other); // Drehwinkel berechnen
        if (rotationAngle == 0) { // Wenn kein Drehwinkel vorhanden ist, bleibt man in dieselbe Richtung
            return "Stay in the same direction!";
        } else if (rotationAngle == 180) { // Wenn der Drehwinkel 180 Grad beträgt, muss man sich umdrehen
            return "Turn around to face " + other.toString() + "!";
        } else if (rotationAngle < 180) { // Wenn der Drehwinkel kleiner als 180 Grad ist, muss man sich zur rechten Seite drehen
            return "Turn to your right!";
        } else { // Wenn der Drehwinkel größer als 180 Grad ist, muss man sich zur linken Seite drehen
            return "Turn to your left!";
        }
    }
}