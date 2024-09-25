class Example {
    //https://kotlinlang.org/docs/operator-overloading.html#arithmetic-operators
    data class Point(val x: Int, val y: Int) {
        operator fun plus(other: Point): Point {
            return Point(x=x+other.x, y=y+other.y);
        }
    }
    public fun example1() {
        val point1 = Point(1, 2);
        val point2 = Point(3, 4);
        val result: Point = point1 + point2;
    }
}