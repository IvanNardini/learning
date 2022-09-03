
// Ex.1
function phrase3words(value1, value2, value3) {
    var answer = value1 + " " + value2 + " " + value3;
    return answer;
    }

var result1 = phrase3words("smile","at","everyone");
print(result1);
var result2 = phrase3words("everyone","wave", "back");
print(result2);
var result3 = phrase3words("coding","is", "fun");
print(result3);

// Ex.2
function reformatName(first, last) {
    return last + ", " + first;
    }

var result = reformatName("Susan", "Rodger");
print(result);
result = reformatName("Robert", "Duvall");
print(result);

// Ex.3
function numberPixels(namefile) {
    var someImg = new SimpleImage(namefile);
    var height = someImg.getHeight();
    var width = someImg.getWidth();
    return height * width
    }
var result = numberPixels("chapel.png");
print(result);
result = numberPixels("dinos.png");
print(result);

// Ex.4
function perimeter(imageName) {
    var someImg = new SimpleImage(imageName);
    var height = someImg.getHeight();
    var width = someImg.getWidth();
    return (height + width) * 2;
    }
print(perimeter("rodger.png"));

//Ex.5
function printPixel(nameImage, xpos, ypos) {
    var someImage = new SimpleImage(nameImage) ;
    print("red is " + someImage.getRed(xpos,ypos));
    print("green is " + someImage.getGreen(xpos,ypos));
    print("blue is " + someImage.getBlue(xpos,ypos));
}

printPixel("drewgreen.png",10, 10);
printPixel("drewgreen.png",250, 500);

// Ex.6
function sumPixel(nameOfImage, xpos, ypos) {
    var theImage = new SimpleImage(nameOfImage) ;
    var redNumber = theImage.getRed(xpos,ypos);
    var blueNumber = theImage.getBlue(xpos,ypos);
    var greenNumber = theImage.getGreen(xpos,ypos);
    return redNumber + blueNumber + greenNumber;
}

var answer = sumPixel("drewgreen.png", 250, 500);
print(answer);
answer = sumPixel("drewgreen.png",10, 10);
print(answer);

