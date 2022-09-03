//Ex.1
function ImageStriper(image){
    var img = new SimpleImage(image)
    w = img.getWidth();
    for (var pixel of img.values()) {
        x = pixel.getX();
        if (x < w/3) {
            pixel.setRed(255);
        }
        if (x >= w/3 && x < 2*w/3) {
            pixel.setGreen(255);
        }
        if (x >= 2*w/3 && x <= w) {
            pixel.setBlue(255);
        }
    }
    return img
}

function ImageStriper(image){
    var img = new SimpleImage(image)
    w = img.getWidth();
    for (var pixel of img.values()) {
        x = pixel.getX();
        if (x < w/3) {
            pixel.setRed(255);
        }
        else if (x < 2*w/3) {
            pixel.setGreen(255);
        }
        else {
            pixel.setBlue(255);
        }
    }
    return img
}

//Ex.2
function swapRedGreen(pixel) {	
    var newGreen = pixel.getRed();	
    var newRed = pixel.getGreen();	
    pixel.setGreen(newGreen);	
    pixel.setRed(newRed);	
    return pixel;
}

function ImageSwapper(image){
    var img = new SimpleImage(image);
    for (var pxl of img.values()){
        pxl = swapRedGreen(pxl)
    }
    return img
}

//Ex.2
function swapBlueYellow(pixel){
    var newRed = 255;
    var newGreen = 255;
    var newBlue = 0;
    pixel.setRed(newRed);
    pixel.setGreen(newGreen);
    pixel.setBlue(newBlue)
    return pixel;
}

function DevilSwapper(image){
    var img = new SimpleImage(image);
    for(var pxl of img.values()){
        if (pxl.getRed()<255){
            pxl = swapBlueYellow(pxl)
        }
    }
    return img

}


