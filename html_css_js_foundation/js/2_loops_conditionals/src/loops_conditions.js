//Ex.1
var image = new SimpleImage("../data/pop_girl.jpeg");
for (var pixel of image.values()) {
    pixel.setRed(255);
}
print(image);

//Ex.2
var image = new SimpleImage("../data/pop_girl.jpeg"));
for (var pixel of image.values()) {
    pixel.setRed(0);
}
print(image);

//Ex.3
var image = new SimpleImage("../data/pop_girl.jpeg");
for (var pixel of someImage.values()) {
    if (pixel.getRed() > 70) {
        pixel.setRed(70);
    }
}
print(image);

//Ex.4
var image = new SimpleImage("../data/pop_girl.jpeg");
var height = someImage.getHeight();
for (var pixel of someImage.values()) {
    if (pixel.getY() >= height - 10) {
        pixel.setRed(0);
        pixel.setGreen(0);
        pixel.setBlue(0);
    }
}
print(image);

//Ex.5
var image = new SimpleImage("../data/pop_girl.jpeg");
for (var pixel of image.values()) {
    if (pixel.getX() < 50) {
        if (pixel.getY() < 50) {
            pixel.setRed(0);
            pixel.setGreen(255);
            pixel.setBlue(0);
        }
    }
}
print(image);

//Ex.6
function topRightCorner(cornerWidth, cornerHeight, image, red, green, blue) {
    var width = image.getWidth();
    for (var pixel of image.values()) {
        if (pixel.getY() < cornerHeight){
            if (pixel.getX() > width - cornerWidth){
                pixel.setRed(red);
                pixel.setGreen(green);
                pixel.setBlue(blue);
            }
        }
    }
    return image;
}

var picture = new SimpleImage("chapel.png");
var result = topRightCorner(30, 60, picture, 255, 255, 0);
print(result);

//Ex.7
var picture = new SimpleImage("chapel.png");
var result = topRightCorner(30, 60, picture, 255, 255, 0);
var result2 = topRightCorner(60, 30, result, 0, 0, 255);
var result3 = topRightCorner(30, 30, result2, 0, 255, 0);
print(result3);

//Ex.8
function changeRed(width, height) {
    var picture = new SimpleImage(width, height);
    var red = 0;
    for (var pixel of picture.values()) {
        pixel.setRed(red);
        pixel.setGreen(0);
        pixel.setBlue(0);
        if (pixel.getRed() < 255) {
            red = red + 1;
        }
        if (pixel.getRed() == 255) {
            red = 0;
        }
    }
    return picture;
}

var result = changeRed(256,200);
print(result);

//Ex.9
function changeRed(width, height, blue, green) {
    var picture = new SimpleImage(width, height);
    var red = 0;
    for (var pixel of picture.values()) {
        pixel.setRed(red);
        pixel.setGreen(green);
        pixel.setBlue(blue);
        if (pixel.getRed() < 255) {
            red = red + 1;
        }
        if (pixel.getRed() == 255) {
            red = 0;
        }
    }
    return picture;
}

var result = changeRed(256,200);
print(result);

