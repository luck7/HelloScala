import java.io._

class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
       x = x + dx
        y = y + dy
        println ("x 的坐标点: " + x);
        println ("y 的坐标点: " + y);
    }
}

class Location(val xc: Int, val yc: Int, val zc :Int) extends Point(xc, yc){
    var z: Int = zc

    def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx
        y = y + dy
        z = z + dz
        println ("x 的坐标点 : " + x);
        println ("y 的坐标点 : " + y);
        println ("z 的坐标点 : " + z);
    }
}

object PointTest{
    def main(args:Array[String]){

        val pt=new Point(10,20)
        // 移动到一个新位置
        pt.move(10,10)

        val loc = new Location(10, 20, 15);
        // 移到一个新的位置
        loc.move(10, 10, 5);
    }
}