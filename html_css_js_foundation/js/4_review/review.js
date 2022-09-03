//Ex.1

var image = new SimpleImage('../data/pop_girl.jpeg');
for (var pixel of image.values()) {
  x = pixel.getX();
  y = pixel.getY();
  if (x > y) {
    pixel.setRed(0);
    pixel.setBlue(0);
  }
}
print(image)


//Ex.2
var image = new SimpleImage(0, 0, 200, 200);

for (var pixel of image.values()) {
    if (pixel.getRed() > 250) {
      pixel.setGreen(255);
    }
  }

//Ex.3

function setBlack(pixel){
    pixel.setRed(0);
    pixel.setGreen(0);
    pixel.setBlue(0);
    return pixel;
}
//a
function addBorder(image, thickness){
  for (var px of image.values()){
    var x = px.getX();
    var y = px.getY();
    if (x < thickness){
      px = setBlack(px);
    }
    if (x >= image.getWidth()-thickness){
      px = setBlack(px);
    }
    if (y < thickness){
      px = setBlack(px);
    }
    if (y >= image.getHeight()-thickness){
      px = setBlack(px);
    }
  }
  return image;
}

var image = new SimpleImage('../data/pop_girl.jpeg')
print(addBorder(image, 5))

//b
function addBorder(image, thickness){
    for (var pixel of image.values()){
        if (pixel.getX() < thickness){
            pixel = setBlack(pixel);
        }
        if (pixel.getX() >= image.getWidth()-thickness){
            pixel = setBlack(pixel);
        }
        if (pixel.getY() < thickness){
            pixel = setBlack(pixel);
        }
        if (pixel.getY() >= image.getHeight()-thickness){
            pixel = setBlack(pixel);
        }
    }
    return image;
}

var image = new SimpleImage('../data/pop_girl.jpeg')
print(addBorder(image, 5))

//Ex.4
function pixelOnEdge(image,pixel,horizontalThick, verticalThick){
    var x = pixel.getX();
    var y = pixel.getY();
    if (x < verticalThick || x > image.getWidth() - verticalThick){
        return true;
    }
    if (y < horizontalThick || y > image.getHeight() - horizontalThick){
        return true;
    }
    return false;
}

function addBorders(image,horizontalThick, verticalThick){
    for (var px of image.values()){
        if (pixelOnEdge(image,px,horizontalThick,verticalThick)){
            px = setBlack(px);
        }
    }
    return image;
}

var img = new SimpleImage("skyline.png");
img = addBorders(img,40,20);
print(img);

//Ex.5

function compose(word, separator) {
    return word + separator + word + separator + word;
}

var phrase = compose("duck", "goose");
print(phrase);

var phrase2 = compose("meow","-");
print(phrase2);

//Ex.6
function printer(x, y){
    if (x > 10) {
        print("one");
        if (y < 10) {
            print("two");
        }
    }

    if (x < 20) {
            print("three");
            if (y > 5) {
                print("four");
            }
        }
}

//Ex.7
function RedGreenDiff(image){
    var img = new SimpleImage(image);
    var count = 0;
    for (var pxl of img.values()){
        if (pxl.getRed() > pxl.getGreen()){
            count++;
        }
    }
    return count;
}

print(RedGreenDiff('usain.jpg'))

//Ex.8
function RedBand(image){
    var img = new SimpleImage(image);
    var count = 0;
    for (var pxl of img.values()){
        if (pxl.getRed() >= 150 && pxl.getRed() <= 200){
            count++;
        }
    }
    return count;
}

print(RedBand('usain.jpg'))
